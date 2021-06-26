package com.example.mvc_demo.todoservice;

import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import v1.ToDoServiceGrpc;
import v1.TodoService;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangkun
 */
public class ToDoClient {
    private final ManagedChannel channel;
    private final ToDoServiceGrpc.ToDoServiceBlockingStub blockingStub;
    private final ToDoServiceGrpc.ToDoServiceStub asyncStub;

    public volatile static ToDoClient toDoClient = null;

    public static ToDoClient getTodoService() {
        if (toDoClient == null) {
            synchronized (ToDoClient.class) {
                if (toDoClient == null) {
                    toDoClient = new ToDoClient("127.0.0.1", 9090);
                }
            }
        }

        return toDoClient;
    }

    public ToDoClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    public ToDoClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = ToDoServiceGrpc.newBlockingStub(channel);
        asyncStub = ToDoServiceGrpc.newStub(channel);
    }

    public void shutdown()throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public TodoService.ReadAllResponse getAll() {
        TodoService.ReadAllRequest req = TodoService.ReadAllRequest.newBuilder().setApi("v1").build();

        TodoService.ReadAllResponse res =  blockingStub.readAll(req);

        return res;
    }

    public TodoService.CreateResponse create() {
        Timestamp timestamp = Timestamp.newBuilder().setSeconds(200000L).setNanos(100).build();
        TodoService.ToDo toDo = TodoService.ToDo.newBuilder().setId(1).setTitle("pp").setDescription("sss").setReminder(timestamp).build();
        TodoService.CreateRequest req = TodoService.CreateRequest.newBuilder().setToDo(toDo).setApi("v1").build();

        TodoService.CreateResponse res =  blockingStub.create(req);
        
        return res;
    }


    public static void main(String[] args) {
        
        
        ToDoClient client = new ToDoClient("127.0.0.1" ,9090);
//        TodoService.CreateResponse res = client.create();
        
        TodoService.ReadAllResponse response = client.getAll();
        
        List<TodoService.ToDo> toDos = response.getToDosList();
    }
}
