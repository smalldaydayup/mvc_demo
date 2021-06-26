package com.example.mvc_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zhangkun
 */
@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public boolean set(String key, String value) {
        return  redisTemplate.opsForSet().isMember(key, value);
    }

    public List<Boolean> sIsMemberBatch(String key, List<String> members) {
        if (CollectionUtils.isEmpty(members)) {
            return new ArrayList<>();
        }

        List<Object> redisResult = redisTemplate.executePipelined(new RedisCallback<String>() {

            /**
             * Gets called by {@link RedisTemplate} with an active Redis connection. Does not need to care about activating or
             * closing the connection or handling exceptions.
             *
             * @param connection active Redis connection
             * @return a result object or {@code null} if none
             * @throws DataAccessException
             */
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                StringRedisConnection stringRedisConnection = (StringRedisConnection)connection;
                for (String member : members) {
                    stringRedisConnection.sIsMember(key, member);
                }
                return null;
            }
        });

        List<Boolean> result = new ArrayList<>(members.size());
        redisResult.forEach(x -> result.add((Boolean)x));
        return result;

//        return redisResult.stream().map(x -> Boolean.parseBoolean(x.toString())).collect(Collectors.toList());
    }



    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        Class<?> clazz = builder.getClass();


        char[] str = new char[]{'u', 'v', 'w', 'x', 'y', 'z'};
        getComponent(str);
    }

    public static void getComponent(char[] arr) {

        int length = arr.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int curListLength = list.size();
            for (int j = 0; j < curListLength; j++) {

                String tmp = new StringBuilder(list.get(j)).append(arr[i]).toString();
                list.add(tmp);
            }
            // 加上自己
            String tmp1 = String.valueOf(arr[i]);
            list.add(tmp1);
        }

        for (String string : list) {
            System.out.println(string);
        }
    }

}
