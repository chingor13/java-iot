/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public interface GatewayConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.GatewayConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates whether the device is a gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   */
  int getGatewayTypeValue();
  /**
   *
   *
   * <pre>
   * Indicates whether the device is a gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   */
  com.google.cloud.iot.v1.GatewayType getGatewayType();

  /**
   *
   *
   * <pre>
   * Indicates how to authorize and/or authenticate devices to access the
   * gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
   */
  int getGatewayAuthMethodValue();
  /**
   *
   *
   * <pre>
   * Indicates how to authorize and/or authenticate devices to access the
   * gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
   */
  com.google.cloud.iot.v1.GatewayAuthMethod getGatewayAuthMethod();

  /**
   *
   *
   * <pre>
   * [Output only] The ID of the gateway the device accessed most recently.
   * </pre>
   *
   * <code>string last_accessed_gateway_id = 3;</code>
   */
  java.lang.String getLastAccessedGatewayId();
  /**
   *
   *
   * <pre>
   * [Output only] The ID of the gateway the device accessed most recently.
   * </pre>
   *
   * <code>string last_accessed_gateway_id = 3;</code>
   */
  com.google.protobuf.ByteString getLastAccessedGatewayIdBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The most recent time at which the device accessed the gateway
   * specified in `last_accessed_gateway`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
   */
  boolean hasLastAccessedGatewayTime();
  /**
   *
   *
   * <pre>
   * [Output only] The most recent time at which the device accessed the gateway
   * specified in `last_accessed_gateway`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
   */
  com.google.protobuf.Timestamp getLastAccessedGatewayTime();
  /**
   *
   *
   * <pre>
   * [Output only] The most recent time at which the device accessed the gateway
   * specified in `last_accessed_gateway`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastAccessedGatewayTimeOrBuilder();
}
