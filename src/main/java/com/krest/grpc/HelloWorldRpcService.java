package com.krest.grpc;

import io.grpc.stub.StreamObserver;

/**
 * @author: krest
 * @date: 2023/4/16 16:57
 * @description:
 */
public class HelloWorldRpcService extends HelloWorldGrpc.HelloWorldImplBase {

    @Override
    public void sayHello(Greeting request, StreamObserver<HelloResp> responseObserver) {
        String name = request.getName();
        HelloResp resp = HelloResp.newBuilder()
                .setReply("Hello " + name + "!")
                .build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

}
