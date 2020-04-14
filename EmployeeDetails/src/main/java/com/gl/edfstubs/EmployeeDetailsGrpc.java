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
    comments = "Source: Employee.proto")
public class EmployeeDetailsGrpc {

  private EmployeeDetailsGrpc() {}

  public static final String SERVICE_NAME = "EmployeeDetails";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gl.edfstubs.EmployeeOuterClass.Empty,
      com.gl.edfstubs.EmployeeOuterClass.Employees> METHOD_ALLEMPLOYEES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "EmployeeDetails", "allemployees"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Employees.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gl.edfstubs.EmployeeOuterClass.Employee,
      com.gl.edfstubs.EmployeeOuterClass.Response> METHOD_EDITEMPLOYEE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "EmployeeDetails", "editemployee"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Employee.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gl.edfstubs.EmployeeOuterClass.Employee,
      com.gl.edfstubs.EmployeeOuterClass.Response> METHOD_ADDEMPLOYEE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "EmployeeDetails", "addemployee"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Employee.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.gl.edfstubs.EmployeeOuterClass.Response.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeDetailsStub newStub(io.grpc.Channel channel) {
    return new EmployeeDetailsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeDetailsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeDetailsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeDetailsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeDetailsFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeDetailsImplBase implements io.grpc.BindableService {

    /**
     */
    public void allemployees(com.gl.edfstubs.EmployeeOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Employees> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ALLEMPLOYEES, responseObserver);
    }

    /**
     */
    public void editemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EDITEMPLOYEE, responseObserver);
    }

    /**
     */
    public void addemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADDEMPLOYEE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ALLEMPLOYEES,
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.edfstubs.EmployeeOuterClass.Empty,
                com.gl.edfstubs.EmployeeOuterClass.Employees>(
                  this, METHODID_ALLEMPLOYEES)))
          .addMethod(
            METHOD_EDITEMPLOYEE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.edfstubs.EmployeeOuterClass.Employee,
                com.gl.edfstubs.EmployeeOuterClass.Response>(
                  this, METHODID_EDITEMPLOYEE)))
          .addMethod(
            METHOD_ADDEMPLOYEE,
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.edfstubs.EmployeeOuterClass.Employee,
                com.gl.edfstubs.EmployeeOuterClass.Response>(
                  this, METHODID_ADDEMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeDetailsStub extends io.grpc.stub.AbstractStub<EmployeeDetailsStub> {
    private EmployeeDetailsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeDetailsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeDetailsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeDetailsStub(channel, callOptions);
    }

    /**
     */
    public void allemployees(com.gl.edfstubs.EmployeeOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Employees> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ALLEMPLOYEES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EDITEMPLOYEE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request,
        io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADDEMPLOYEE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeDetailsBlockingStub extends io.grpc.stub.AbstractStub<EmployeeDetailsBlockingStub> {
    private EmployeeDetailsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeDetailsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeDetailsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeDetailsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gl.edfstubs.EmployeeOuterClass.Employees allemployees(com.gl.edfstubs.EmployeeOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ALLEMPLOYEES, getCallOptions(), request);
    }

    /**
     */
    public com.gl.edfstubs.EmployeeOuterClass.Response editemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EDITEMPLOYEE, getCallOptions(), request);
    }

    /**
     */
    public com.gl.edfstubs.EmployeeOuterClass.Response addemployee(com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADDEMPLOYEE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeDetailsFutureStub extends io.grpc.stub.AbstractStub<EmployeeDetailsFutureStub> {
    private EmployeeDetailsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeDetailsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeDetailsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeDetailsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.EmployeeOuterClass.Employees> allemployees(
        com.gl.edfstubs.EmployeeOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ALLEMPLOYEES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.EmployeeOuterClass.Response> editemployee(
        com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EDITEMPLOYEE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.edfstubs.EmployeeOuterClass.Response> addemployee(
        com.gl.edfstubs.EmployeeOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADDEMPLOYEE, getCallOptions()), request);
    }
  }

  private static final int METHODID_ALLEMPLOYEES = 0;
  private static final int METHODID_EDITEMPLOYEE = 1;
  private static final int METHODID_ADDEMPLOYEE = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeDetailsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(EmployeeDetailsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALLEMPLOYEES:
          serviceImpl.allemployees((com.gl.edfstubs.EmployeeOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Employees>) responseObserver);
          break;
        case METHODID_EDITEMPLOYEE:
          serviceImpl.editemployee((com.gl.edfstubs.EmployeeOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Response>) responseObserver);
          break;
        case METHODID_ADDEMPLOYEE:
          serviceImpl.addemployee((com.gl.edfstubs.EmployeeOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<com.gl.edfstubs.EmployeeOuterClass.Response>) responseObserver);
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
        METHOD_ADDEMPLOYEE);
  }

}