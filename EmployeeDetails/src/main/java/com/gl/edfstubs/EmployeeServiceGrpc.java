package com.gl.edfstubs;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: EmployeeService.proto")
public class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gl.edf.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.gl.edfstubs.EmployeeOuterClass.Employees> METHOD_ALLEMPLOYEES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gl.edf.EmployeeService", "allemployees"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Employees.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gl.edfstubs.EmployeeOuterClass.Employee,
      com.gl.edfstubs.ResponseOuterClass.Response> METHOD_EDITEMPLOYEE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gl.edf.EmployeeService", "editemployee"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Employee.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.ResponseOuterClass.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gl.edfstubs.EmployeeOuterClass.Employee,
      com.gl.edfstubs.ResponseOuterClass.Response> METHOD_ADDEMPLOYEE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gl.edf.EmployeeService", "addemployee"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Employee.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.ResponseOuterClass.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gl.edfstubs.EmployeeOuterClass.Employee,
      com.gl.edfstubs.ResponseOuterClass.Response> METHOD_DELETEEMPLOYEE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gl.edf.EmployeeService", "deleteemployee"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Employee.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.ResponseOuterClass.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.gl.edfstubs.ResponseOuterClass.Response> METHOD_TEST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.gl.edf.EmployeeService", "test"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.ResponseOuterClass.Response.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allemployees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Employees> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ALLEMPLOYEES, responseObserver);
    }

    /**
     */
    public void editemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EDITEMPLOYEE, responseObserver);
    }

    /**
     */
    public void addemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADDEMPLOYEE, responseObserver);
    }

    /**
     */
    public void deleteemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETEEMPLOYEE, responseObserver);
    }

    /**
     */
    public void test(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TEST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ALLEMPLOYEES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.gl.edfstubs.EmployeeOuterClass.Employees>(
                  this, METHODID_ALLEMPLOYEES)))
          .addMethod(
            METHOD_EDITEMPLOYEE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.edfstubs.EmployeeOuterClass.Employee,
                com.gl.edfstubs.ResponseOuterClass.Response>(
                  this, METHODID_EDITEMPLOYEE)))
          .addMethod(
            METHOD_ADDEMPLOYEE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.edfstubs.EmployeeOuterClass.Employee,
                com.gl.edfstubs.ResponseOuterClass.Response>(
                  this, METHODID_ADDEMPLOYEE)))
          .addMethod(
            METHOD_DELETEEMPLOYEE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.edfstubs.EmployeeOuterClass.Employee,
                com.gl.edfstubs.ResponseOuterClass.Response>(
                  this, METHODID_DELETEEMPLOYEE)))
          .addMethod(
            METHOD_TEST,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.gl.edfstubs.ResponseOuterClass.Response>(
                  this, METHODID_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void allemployees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Employees> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ALLEMPLOYEES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EDITEMPLOYEE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADDEMPLOYEE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETEEMPLOYEE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void test(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TEST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gl.edfstubs.EmployeeOuterClass.Employees allemployees(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ALLEMPLOYEES, getCallOptions(), request);
    }

    /**
     */
    public com.gl.edfstubs.ResponseOuterClass.Response editemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EDITEMPLOYEE, getCallOptions(), request);
    }

    /**
     */
    public com.gl.edfstubs.ResponseOuterClass.Response addemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADDEMPLOYEE, getCallOptions(), request);
    }

    /**
     */
    public com.gl.edfstubs.ResponseOuterClass.Response deleteemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETEEMPLOYEE, getCallOptions(), request);
    }

    /**
     */
    public com.gl.edfstubs.ResponseOuterClass.Response test(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TEST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.EmployeeOuterClass.Employees> allemployees(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ALLEMPLOYEES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.ResponseOuterClass.Response> editemployee(
        com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EDITEMPLOYEE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.ResponseOuterClass.Response> addemployee(
        com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADDEMPLOYEE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.ResponseOuterClass.Response> deleteemployee(
        com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETEEMPLOYEE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.ResponseOuterClass.Response> test(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TEST, getCallOptions()), request);
    }
  }

  private static final int METHODID_ALLEMPLOYEES = 0;
  private static final int METHODID_EDITEMPLOYEE = 1;
  private static final int METHODID_ADDEMPLOYEE = 2;
  private static final int METHODID_DELETEEMPLOYEE = 3;
  private static final int METHODID_TEST = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALLEMPLOYEES:
          serviceImpl.allemployees((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Employees>) responseObserver);
          break;
        case METHODID_EDITEMPLOYEE:
          serviceImpl.editemployee((com.gl.edfstubs.EmployeeOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response>) responseObserver);
          break;
        case METHODID_ADDEMPLOYEE:
          serviceImpl.addemployee((com.gl.edfstubs.EmployeeOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response>) responseObserver);
          break;
        case METHODID_DELETEEMPLOYEE:
          serviceImpl.deleteemployee((com.gl.edfstubs.EmployeeOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response>) responseObserver);
          break;
        case METHODID_TEST:
          serviceImpl.test((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_ALLEMPLOYEES,
        METHOD_EDITEMPLOYEE,
        METHOD_ADDEMPLOYEE,
        METHOD_DELETEEMPLOYEE,
        METHOD_TEST);
  }

}
