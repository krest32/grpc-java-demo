package com.krest.grpc;

/**
 * @author: krest
 * @date: 2023/4/16 16:59
 * @description:
 */
public class HelloWorldApp {

    public static void main(String[] args) throws Exception {
        int port = 8000;
        GrpcServer server = new GrpcServer(port);
        server.start();

        HelloWorldClient client = new HelloWorldClient("localhost", port);
        String reply = client.sayHello("HanMeiMei");

        System.out.println(reply);
        server.shutdown();
    }

}
