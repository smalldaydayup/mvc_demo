package v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 用於管理待辦事項串列的服務
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: todo-service.proto")
public final class ToDoServiceGrpc {

  private ToDoServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ToDoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<v1.TodoService.CreateRequest,
      v1.TodoService.CreateResponse> getCreateMethod;

  public static io.grpc.MethodDescriptor<v1.TodoService.CreateRequest,
      v1.TodoService.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<v1.TodoService.CreateRequest, v1.TodoService.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ToDoServiceGrpc.getCreateMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getCreateMethod = ToDoServiceGrpc.getCreateMethod) == null) {
          ToDoServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<v1.TodoService.CreateRequest, v1.TodoService.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.CreateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.TodoService.ReadRequest,
      v1.TodoService.ReadResponse> getReadMethod;

  public static io.grpc.MethodDescriptor<v1.TodoService.ReadRequest,
      v1.TodoService.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<v1.TodoService.ReadRequest, v1.TodoService.ReadResponse> getReadMethod;
    if ((getReadMethod = ToDoServiceGrpc.getReadMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getReadMethod = ToDoServiceGrpc.getReadMethod) == null) {
          ToDoServiceGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<v1.TodoService.ReadRequest, v1.TodoService.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.ReadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.TodoService.UpdateRequest,
      v1.TodoService.UpdateResponse> getUpdateMethod;

  public static io.grpc.MethodDescriptor<v1.TodoService.UpdateRequest,
      v1.TodoService.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<v1.TodoService.UpdateRequest, v1.TodoService.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ToDoServiceGrpc.getUpdateMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getUpdateMethod = ToDoServiceGrpc.getUpdateMethod) == null) {
          ToDoServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<v1.TodoService.UpdateRequest, v1.TodoService.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.UpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.TodoService.DeleteRequest,
      v1.TodoService.DeleteResponse> getDeleteMethod;

  public static io.grpc.MethodDescriptor<v1.TodoService.DeleteRequest,
      v1.TodoService.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<v1.TodoService.DeleteRequest, v1.TodoService.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ToDoServiceGrpc.getDeleteMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getDeleteMethod = ToDoServiceGrpc.getDeleteMethod) == null) {
          ToDoServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<v1.TodoService.DeleteRequest, v1.TodoService.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<v1.TodoService.ReadAllRequest,
      v1.TodoService.ReadAllResponse> getReadAllMethod;

  public static io.grpc.MethodDescriptor<v1.TodoService.ReadAllRequest,
      v1.TodoService.ReadAllResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<v1.TodoService.ReadAllRequest, v1.TodoService.ReadAllResponse> getReadAllMethod;
    if ((getReadAllMethod = ToDoServiceGrpc.getReadAllMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getReadAllMethod = ToDoServiceGrpc.getReadAllMethod) == null) {
          ToDoServiceGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<v1.TodoService.ReadAllRequest, v1.TodoService.ReadAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ToDoService", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.ReadAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  v1.TodoService.ReadAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ToDoServiceStub newStub(io.grpc.Channel channel) {
    return new ToDoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ToDoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ToDoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ToDoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ToDoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 用於管理待辦事項串列的服務
   * </pre>
   */
  public static abstract class ToDoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 創建新的待辦事項任務
     * </pre>
     */
    public void create(v1.TodoService.CreateRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 讀取待辦事項任務
     * </pre>
     */
    public void read(v1.TodoService.ReadRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新待辦事項任務
     * </pre>
     */
    public void update(v1.TodoService.UpdateRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 刪除待辦事項任務
     * </pre>
     */
    public void delete(v1.TodoService.DeleteRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 讀取全部待辦事項任務
     * </pre>
     */
    public void readAll(v1.TodoService.ReadAllRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.ReadAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.TodoService.CreateRequest,
                v1.TodoService.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.TodoService.ReadRequest,
                v1.TodoService.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.TodoService.UpdateRequest,
                v1.TodoService.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.TodoService.DeleteRequest,
                v1.TodoService.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                v1.TodoService.ReadAllRequest,
                v1.TodoService.ReadAllResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   * 用於管理待辦事項串列的服務
   * </pre>
   */
  public static final class ToDoServiceStub extends io.grpc.stub.AbstractStub<ToDoServiceStub> {
    private ToDoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 創建新的待辦事項任務
     * </pre>
     */
    public void create(v1.TodoService.CreateRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 讀取待辦事項任務
     * </pre>
     */
    public void read(v1.TodoService.ReadRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.ReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新待辦事項任務
     * </pre>
     */
    public void update(v1.TodoService.UpdateRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.UpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 刪除待辦事項任務
     * </pre>
     */
    public void delete(v1.TodoService.DeleteRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 讀取全部待辦事項任務
     * </pre>
     */
    public void readAll(v1.TodoService.ReadAllRequest request,
        io.grpc.stub.StreamObserver<v1.TodoService.ReadAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 用於管理待辦事項串列的服務
   * </pre>
   */
  public static final class ToDoServiceBlockingStub extends io.grpc.stub.AbstractStub<ToDoServiceBlockingStub> {
    private ToDoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 創建新的待辦事項任務
     * </pre>
     */
    public v1.TodoService.CreateResponse create(v1.TodoService.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 讀取待辦事項任務
     * </pre>
     */
    public v1.TodoService.ReadResponse read(v1.TodoService.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新待辦事項任務
     * </pre>
     */
    public v1.TodoService.UpdateResponse update(v1.TodoService.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 刪除待辦事項任務
     * </pre>
     */
    public v1.TodoService.DeleteResponse delete(v1.TodoService.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 讀取全部待辦事項任務
     * </pre>
     */
    public v1.TodoService.ReadAllResponse readAll(v1.TodoService.ReadAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 用於管理待辦事項串列的服務
   * </pre>
   */
  public static final class ToDoServiceFutureStub extends io.grpc.stub.AbstractStub<ToDoServiceFutureStub> {
    private ToDoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 創建新的待辦事項任務
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.TodoService.CreateResponse> create(
        v1.TodoService.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 讀取待辦事項任務
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.TodoService.ReadResponse> read(
        v1.TodoService.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新待辦事項任務
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.TodoService.UpdateResponse> update(
        v1.TodoService.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 刪除待辦事項任務
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.TodoService.DeleteResponse> delete(
        v1.TodoService.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 讀取全部待辦事項任務
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<v1.TodoService.ReadAllResponse> readAll(
        v1.TodoService.ReadAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_READ_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ToDoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ToDoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((v1.TodoService.CreateRequest) request,
              (io.grpc.stub.StreamObserver<v1.TodoService.CreateResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((v1.TodoService.ReadRequest) request,
              (io.grpc.stub.StreamObserver<v1.TodoService.ReadResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((v1.TodoService.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<v1.TodoService.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((v1.TodoService.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<v1.TodoService.DeleteResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((v1.TodoService.ReadAllRequest) request,
              (io.grpc.stub.StreamObserver<v1.TodoService.ReadAllResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ToDoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ToDoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return v1.TodoService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ToDoService");
    }
  }

  private static final class ToDoServiceFileDescriptorSupplier
      extends ToDoServiceBaseDescriptorSupplier {
    ToDoServiceFileDescriptorSupplier() {}
  }

  private static final class ToDoServiceMethodDescriptorSupplier
      extends ToDoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ToDoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ToDoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ToDoServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getReadAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
