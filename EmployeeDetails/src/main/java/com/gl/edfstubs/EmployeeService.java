// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmployeeService.proto

package com.gl.edfstubs;

public final class EmployeeService {
  private EmployeeService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025EmployeeService.proto\022\ncom.gl.edf\032\016Emp" +
      "loyee.proto\032\016Response.proto\032\034google/api/" +
      "annotations.proto\032\025google/api/http.proto" +
      "\032\033google/protobuf/empty.proto2\257\003\n\017Employ" +
      "eeDetails\022V\n\014allemployees\022\026.google.proto" +
      "buf.Empty\032\025.com.gl.edf.Employees\"\027\202\323\344\223\002\021" +
      "\022\017/v1/allepmloyee\022:\n\014editemployee\022\024.com." +
      "gl.edf.Employee\032\024.com.gl.edf.Response\022\\\n" +
      "\013addemployee\022\024.com.gl.edf.Employee\032\024.com" +
      ".gl.edf.Response\"!\202\323\344\223\002\033\"\017/v1/addemploye" +
      "e:\010Employee\022b\n\016deleteemployee\022\024.com.gl.e" +
      "df.Employee\032\024.com.gl.edf.Response\"$\202\323\344\223\002" +
      "\036\"\022/v1/deleteemployee:\010Employee\022F\n\004test\022" +
      "\026.google.protobuf.Empty\032\024.com.gl.edf.Res" +
      "ponse\"\020\202\323\344\223\002\n\022\010/v1/testB\021\n\017com.gl.edfstu" +
      "bsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gl.edfstubs.EmployeeOuterClass.getDescriptor(),
          com.gl.edfstubs.ResponseOuterClass.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.HttpProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gl.edfstubs.EmployeeOuterClass.getDescriptor();
    com.gl.edfstubs.ResponseOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.HttpProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
