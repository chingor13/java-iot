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

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_Device_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_Device_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_GatewayConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_GatewayConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceRegistry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_MqttConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_HttpConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_HttpConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_StateNotificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_RegistryCredential_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_RegistryCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_X509CertificateDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceCredential_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_iot_v1_DeviceState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/iot/v1/resources.proto\022\023g"
          + "oogle.cloud.iot.v1\032\034google/api/annotatio"
          + "ns.proto\032\037google/protobuf/timestamp.prot"
          + "o\032\027google/rpc/status.proto\"\273\006\n\006Device\022\n\n"
          + "\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006num_id\030\003 \001(\004\022"
          + ":\n\013credentials\030\014 \003(\0132%.google.cloud.iot."
          + "v1.DeviceCredential\0227\n\023last_heartbeat_ti"
          + "me\030\007 \001(\0132\032.google.protobuf.Timestamp\0223\n\017"
          + "last_event_time\030\010 \001(\0132\032.google.protobuf."
          + "Timestamp\0223\n\017last_state_time\030\024 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\0228\n\024last_config_ac"
          + "k_time\030\016 \001(\0132\032.google.protobuf.Timestamp"
          + "\0229\n\025last_config_send_time\030\022 \001(\0132\032.google"
          + ".protobuf.Timestamp\022\017\n\007blocked\030\023 \001(\010\0223\n\017"
          + "last_error_time\030\n \001(\0132\032.google.protobuf."
          + "Timestamp\022-\n\021last_error_status\030\013 \001(\0132\022.g"
          + "oogle.rpc.Status\0221\n\006config\030\r \001(\0132!.googl"
          + "e.cloud.iot.v1.DeviceConfig\022/\n\005state\030\020 \001"
          + "(\0132 .google.cloud.iot.v1.DeviceState\0220\n\t"
          + "log_level\030\025 \001(\0162\035.google.cloud.iot.v1.Lo"
          + "gLevel\022;\n\010metadata\030\021 \003(\0132).google.cloud."
          + "iot.v1.Device.MetadataEntry\022:\n\016gateway_c"
          + "onfig\030\030 \001(\0132\".google.cloud.iot.v1.Gatewa"
          + "yConfig\032/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"\356\001\n\rGatewayConfig\0226\n\014ga"
          + "teway_type\030\001 \001(\0162 .google.cloud.iot.v1.G"
          + "atewayType\022C\n\023gateway_auth_method\030\002 \001(\0162"
          + "&.google.cloud.iot.v1.GatewayAuthMethod\022"
          + " \n\030last_accessed_gateway_id\030\003 \001(\t\022>\n\032las"
          + "t_accessed_gateway_time\030\004 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\"\251\003\n\016DeviceRegistry\022\n\n\002"
          + "id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022P\n\032event_notifica"
          + "tion_configs\030\n \003(\0132,.google.cloud.iot.v1"
          + ".EventNotificationConfig\022O\n\031state_notifi"
          + "cation_config\030\007 \001(\0132,.google.cloud.iot.v"
          + "1.StateNotificationConfig\0224\n\013mqtt_config"
          + "\030\004 \001(\0132\037.google.cloud.iot.v1.MqttConfig\022"
          + "4\n\013http_config\030\t \001(\0132\037.google.cloud.iot."
          + "v1.HttpConfig\0220\n\tlog_level\030\013 \001(\0162\035.googl"
          + "e.cloud.iot.v1.LogLevel\022<\n\013credentials\030\010"
          + " \003(\0132\'.google.cloud.iot.v1.RegistryCrede"
          + "ntial\"H\n\nMqttConfig\022:\n\022mqtt_enabled_stat"
          + "e\030\001 \001(\0162\036.google.cloud.iot.v1.MqttState\""
          + "H\n\nHttpConfig\022:\n\022http_enabled_state\030\001 \001("
          + "\0162\036.google.cloud.iot.v1.HttpState\"O\n\027Eve"
          + "ntNotificationConfig\022\031\n\021subfolder_matche"
          + "s\030\002 \001(\t\022\031\n\021pubsub_topic_name\030\001 \001(\t\"4\n\027St"
          + "ateNotificationConfig\022\031\n\021pubsub_topic_na"
          + "me\030\001 \001(\t\"o\n\022RegistryCredential\022K\n\026public"
          + "_key_certificate\030\001 \001(\0132).google.cloud.io"
          + "t.v1.PublicKeyCertificateH\000B\014\n\ncredentia"
          + "l\"\320\001\n\026X509CertificateDetails\022\016\n\006issuer\030\001"
          + " \001(\t\022\017\n\007subject\030\002 \001(\t\022.\n\nstart_time\030\003 \001("
          + "\0132\032.google.protobuf.Timestamp\022/\n\013expiry_"
          + "time\030\004 \001(\0132\032.google.protobuf.Timestamp\022\033"
          + "\n\023signature_algorithm\030\005 \001(\t\022\027\n\017public_ke"
          + "y_type\030\006 \001(\t\"\257\001\n\024PublicKeyCertificate\022?\n"
          + "\006format\030\001 \001(\0162/.google.cloud.iot.v1.Publ"
          + "icKeyCertificateFormat\022\023\n\013certificate\030\002 "
          + "\001(\t\022A\n\014x509_details\030\003 \001(\0132+.google.cloud"
          + ".iot.v1.X509CertificateDetails\"\225\001\n\020Devic"
          + "eCredential\022>\n\npublic_key\030\002 \001(\0132(.google"
          + ".cloud.iot.v1.PublicKeyCredentialH\000\0223\n\017e"
          + "xpiration_time\030\006 \001(\0132\032.google.protobuf.T"
          + "imestampB\014\n\ncredential\"X\n\023PublicKeyCrede"
          + "ntial\0224\n\006format\030\001 \001(\0162$.google.cloud.iot"
          + ".v1.PublicKeyFormat\022\013\n\003key\030\002 \001(\t\"\240\001\n\014Dev"
          + "iceConfig\022\017\n\007version\030\001 \001(\003\0225\n\021cloud_upda"
          + "te_time\030\002 \001(\0132\032.google.protobuf.Timestam"
          + "p\0223\n\017device_ack_time\030\003 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022\023\n\013binary_data\030\004 \001(\014\"S\n\013D"
          + "eviceState\022/\n\013update_time\030\001 \001(\0132\032.google"
          + ".protobuf.Timestamp\022\023\n\013binary_data\030\002 \001(\014"
          + "*L\n\tMqttState\022\032\n\026MQTT_STATE_UNSPECIFIED\020"
          + "\000\022\020\n\014MQTT_ENABLED\020\001\022\021\n\rMQTT_DISABLED\020\002*L"
          + "\n\tHttpState\022\032\n\026HTTP_STATE_UNSPECIFIED\020\000\022"
          + "\020\n\014HTTP_ENABLED\020\001\022\021\n\rHTTP_DISABLED\020\002*O\n\010"
          + "LogLevel\022\031\n\025LOG_LEVEL_UNSPECIFIED\020\000\022\010\n\004N"
          + "ONE\020\n\022\t\n\005ERROR\020\024\022\010\n\004INFO\020\036\022\t\n\005DEBUG\020(*I\n"
          + "\013GatewayType\022\034\n\030GATEWAY_TYPE_UNSPECIFIED"
          + "\020\000\022\013\n\007GATEWAY\020\001\022\017\n\013NON_GATEWAY\020\002*\221\001\n\021Gat"
          + "ewayAuthMethod\022#\n\037GATEWAY_AUTH_METHOD_UN"
          + "SPECIFIED\020\000\022\024\n\020ASSOCIATION_ONLY\020\001\022\032\n\026DEV"
          + "ICE_AUTH_TOKEN_ONLY\020\002\022%\n!ASSOCIATION_AND"
          + "_DEVICE_AUTH_TOKEN\020\003*e\n\032PublicKeyCertifi"
          + "cateFormat\022-\n)UNSPECIFIED_PUBLIC_KEY_CER"
          + "TIFICATE_FORMAT\020\000\022\030\n\024X509_CERTIFICATE_PE"
          + "M\020\001*v\n\017PublicKeyFormat\022!\n\035UNSPECIFIED_PU"
          + "BLIC_KEY_FORMAT\020\000\022\013\n\007RSA_PEM\020\003\022\020\n\014RSA_X5"
          + "09_PEM\020\001\022\r\n\tES256_PEM\020\002\022\022\n\016ES256_X509_PE"
          + "M\020\004Bf\n\027com.google.cloud.iot.v1B\016Resource"
          + "sProtoP\001Z6google.golang.org/genproto/goo"
          + "gleapis/cloud/iot/v1;iot\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_iot_v1_Device_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_iot_v1_Device_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_Device_descriptor,
            new java.lang.String[] {
              "Id",
              "Name",
              "NumId",
              "Credentials",
              "LastHeartbeatTime",
              "LastEventTime",
              "LastStateTime",
              "LastConfigAckTime",
              "LastConfigSendTime",
              "Blocked",
              "LastErrorTime",
              "LastErrorStatus",
              "Config",
              "State",
              "LogLevel",
              "Metadata",
              "GatewayConfig",
            });
    internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor =
        internal_static_google_cloud_iot_v1_Device_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_iot_v1_Device_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_Device_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_iot_v1_GatewayConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_iot_v1_GatewayConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_GatewayConfig_descriptor,
            new java.lang.String[] {
              "GatewayType",
              "GatewayAuthMethod",
              "LastAccessedGatewayId",
              "LastAccessedGatewayTime",
            });
    internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_iot_v1_DeviceRegistry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceRegistry_descriptor,
            new java.lang.String[] {
              "Id",
              "Name",
              "EventNotificationConfigs",
              "StateNotificationConfig",
              "MqttConfig",
              "HttpConfig",
              "LogLevel",
              "Credentials",
            });
    internal_static_google_cloud_iot_v1_MqttConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_MqttConfig_descriptor,
            new java.lang.String[] {
              "MqttEnabledState",
            });
    internal_static_google_cloud_iot_v1_HttpConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_iot_v1_HttpConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_HttpConfig_descriptor,
            new java.lang.String[] {
              "HttpEnabledState",
            });
    internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor,
            new java.lang.String[] {
              "SubfolderMatches", "PubsubTopicName",
            });
    internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_iot_v1_StateNotificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_StateNotificationConfig_descriptor,
            new java.lang.String[] {
              "PubsubTopicName",
            });
    internal_static_google_cloud_iot_v1_RegistryCredential_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_iot_v1_RegistryCredential_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_RegistryCredential_descriptor,
            new java.lang.String[] {
              "PublicKeyCertificate", "Credential",
            });
    internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_iot_v1_X509CertificateDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_X509CertificateDetails_descriptor,
            new java.lang.String[] {
              "Issuer", "Subject", "StartTime", "ExpiryTime", "SignatureAlgorithm", "PublicKeyType",
            });
    internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor,
            new java.lang.String[] {
              "Format", "Certificate", "X509Details",
            });
    internal_static_google_cloud_iot_v1_DeviceCredential_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_iot_v1_DeviceCredential_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceCredential_descriptor,
            new java.lang.String[] {
              "PublicKey", "ExpirationTime", "Credential",
            });
    internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor,
            new java.lang.String[] {
              "Format", "Key",
            });
    internal_static_google_cloud_iot_v1_DeviceConfig_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_iot_v1_DeviceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceConfig_descriptor,
            new java.lang.String[] {
              "Version", "CloudUpdateTime", "DeviceAckTime", "BinaryData",
            });
    internal_static_google_cloud_iot_v1_DeviceState_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_iot_v1_DeviceState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_iot_v1_DeviceState_descriptor,
            new java.lang.String[] {
              "UpdateTime", "BinaryData",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
