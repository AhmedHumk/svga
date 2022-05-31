// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: svga.proto at 19:1
package com.addo.svglib.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class AudioEntity extends Message<AudioEntity, AudioEntity.Builder> {
  public static final ProtoAdapter<AudioEntity> ADAPTER = new ProtoAdapter_AudioEntity();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_AUDIOKEY = "";

  public static final Integer DEFAULT_STARTFRAME = 0;

  public static final Integer DEFAULT_ENDFRAME = 0;

  public static final Integer DEFAULT_STARTTIME = 0;

  public static final Integer DEFAULT_TOTALTIME = 0;

  /**
   * 音频文件名
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String audioKey;

  /**
   * 音频播放起始帧
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer startFrame;

  /**
   * 音频播放结束帧
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer endFrame;

  /**
   * 音频播放起始时间（相对音频长度）
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer startTime;

  /**
   * 音频总长度
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer totalTime;

  public AudioEntity(String audioKey, Integer startFrame, Integer endFrame, Integer startTime, Integer totalTime) {
    this(audioKey, startFrame, endFrame, startTime, totalTime, ByteString.EMPTY);
  }

  public AudioEntity(String audioKey, Integer startFrame, Integer endFrame, Integer startTime, Integer totalTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.audioKey = audioKey;
    this.startFrame = startFrame;
    this.endFrame = endFrame;
    this.startTime = startTime;
    this.totalTime = totalTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.audioKey = audioKey;
    builder.startFrame = startFrame;
    builder.endFrame = endFrame;
    builder.startTime = startTime;
    builder.totalTime = totalTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AudioEntity)) return false;
    AudioEntity o = (AudioEntity) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(audioKey, o.audioKey)
        && Internal.equals(startFrame, o.startFrame)
        && Internal.equals(endFrame, o.endFrame)
        && Internal.equals(startTime, o.startTime)
        && Internal.equals(totalTime, o.totalTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (audioKey != null ? audioKey.hashCode() : 0);
      result = result * 37 + (startFrame != null ? startFrame.hashCode() : 0);
      result = result * 37 + (endFrame != null ? endFrame.hashCode() : 0);
      result = result * 37 + (startTime != null ? startTime.hashCode() : 0);
      result = result * 37 + (totalTime != null ? totalTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (audioKey != null) builder.append(", audioKey=").append(audioKey);
    if (startFrame != null) builder.append(", startFrame=").append(startFrame);
    if (endFrame != null) builder.append(", endFrame=").append(endFrame);
    if (startTime != null) builder.append(", startTime=").append(startTime);
    if (totalTime != null) builder.append(", totalTime=").append(totalTime);
    return builder.replace(0, 2, "AudioEntity{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AudioEntity, Builder> {
    public String audioKey;

    public Integer startFrame;

    public Integer endFrame;

    public Integer startTime;

    public Integer totalTime;

    public Builder() {
    }

    /**
     * 音频文件名
     */
    public Builder audioKey(String audioKey) {
      this.audioKey = audioKey;
      return this;
    }

    /**
     * 音频播放起始帧
     */
    public Builder startFrame(Integer startFrame) {
      this.startFrame = startFrame;
      return this;
    }

    /**
     * 音频播放结束帧
     */
    public Builder endFrame(Integer endFrame) {
      this.endFrame = endFrame;
      return this;
    }

    /**
     * 音频播放起始时间（相对音频长度）
     */
    public Builder startTime(Integer startTime) {
      this.startTime = startTime;
      return this;
    }

    /**
     * 音频总长度
     */
    public Builder totalTime(Integer totalTime) {
      this.totalTime = totalTime;
      return this;
    }

    @Override
    public AudioEntity build() {
      return new AudioEntity(audioKey, startFrame, endFrame, startTime, totalTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AudioEntity extends ProtoAdapter<AudioEntity> {
    ProtoAdapter_AudioEntity() {
      super(FieldEncoding.LENGTH_DELIMITED, AudioEntity.class);
    }

    @Override
    public int encodedSize(AudioEntity value) {
      return (value.audioKey != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.audioKey) : 0)
          + (value.startFrame != null ? ProtoAdapter.INT32.encodedSizeWithTag(2, value.startFrame) : 0)
          + (value.endFrame != null ? ProtoAdapter.INT32.encodedSizeWithTag(3, value.endFrame) : 0)
          + (value.startTime != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, value.startTime) : 0)
          + (value.totalTime != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, value.totalTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AudioEntity value) throws IOException {
      if (value.audioKey != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.audioKey);
      if (value.startFrame != null) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.startFrame);
      if (value.endFrame != null) ProtoAdapter.INT32.encodeWithTag(writer, 3, value.endFrame);
      if (value.startTime != null) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.startTime);
      if (value.totalTime != null) ProtoAdapter.INT32.encodeWithTag(writer, 5, value.totalTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AudioEntity decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.audioKey(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.startFrame(ProtoAdapter.INT32.decode(reader)); break;
          case 3: builder.endFrame(ProtoAdapter.INT32.decode(reader)); break;
          case 4: builder.startTime(ProtoAdapter.INT32.decode(reader)); break;
          case 5: builder.totalTime(ProtoAdapter.INT32.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public AudioEntity redact(AudioEntity value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
