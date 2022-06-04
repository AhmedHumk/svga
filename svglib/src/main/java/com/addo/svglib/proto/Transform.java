// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: svga.proto at 34:1
package com.addo.svglib.proto;

import androidx.annotation.NonNull;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class Transform extends Message<Transform, Transform.Builder> {
  public static final ProtoAdapter<Transform> ADAPTER = new ProtoAdapter_Transform();

  private static final long serialVersionUID = 0L;

  public static final Float DEFAULT_A = 0.0f;

  public static final Float DEFAULT_B = 0.0f;

  public static final Float DEFAULT_C = 0.0f;

  public static final Float DEFAULT_D = 0.0f;

  public static final Float DEFAULT_TX = 0.0f;

  public static final Float DEFAULT_TY = 0.0f;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float a;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float b;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float c;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float d;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float tx;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float ty;

  public Transform(Float a, Float b, Float c, Float d, Float tx, Float ty) {
    this(a, b, c, d, tx, ty, ByteString.EMPTY);
  }

  public Transform(Float a, Float b, Float c, Float d, Float tx, Float ty, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.tx = tx;
    this.ty = ty;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.a = a;
    builder.b = b;
    builder.c = c;
    builder.d = d;
    builder.tx = tx;
    builder.ty = ty;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Transform)) return false;
    Transform o = (Transform) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(a, o.a)
        && Internal.equals(b, o.b)
        && Internal.equals(c, o.c)
        && Internal.equals(d, o.d)
        && Internal.equals(tx, o.tx)
        && Internal.equals(ty, o.ty);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (a != null ? a.hashCode() : 0);
      result = result * 37 + (b != null ? b.hashCode() : 0);
      result = result * 37 + (c != null ? c.hashCode() : 0);
      result = result * 37 + (d != null ? d.hashCode() : 0);
      result = result * 37 + (tx != null ? tx.hashCode() : 0);
      result = result * 37 + (ty != null ? ty.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @NonNull
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (a != null) builder.append(", a=").append(a);
    if (b != null) builder.append(", b=").append(b);
    if (c != null) builder.append(", c=").append(c);
    if (d != null) builder.append(", d=").append(d);
    if (tx != null) builder.append(", tx=").append(tx);
    if (ty != null) builder.append(", ty=").append(ty);
    return builder.replace(0, 2, "Transform{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Transform, Builder> {
    public Float a;

    public Float b;

    public Float c;

    public Float d;

    public Float tx;

    public Float ty;

    public Builder() {
    }

    public Builder a(Float a) {
      this.a = a;
      return this;
    }

    public Builder b(Float b) {
      this.b = b;
      return this;
    }

    public Builder c(Float c) {
      this.c = c;
      return this;
    }

    public Builder d(Float d) {
      this.d = d;
      return this;
    }

    public Builder tx(Float tx) {
      this.tx = tx;
      return this;
    }

    public Builder ty(Float ty) {
      this.ty = ty;
      return this;
    }

    @Override
    public Transform build() {
      return new Transform(a, b, c, d, tx, ty, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Transform extends ProtoAdapter<Transform> {
    ProtoAdapter_Transform() {
      super(FieldEncoding.LENGTH_DELIMITED, Transform.class);
    }

    @Override
    public int encodedSize(Transform value) {
      return (value.a != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, value.a) : 0)
          + (value.b != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.b) : 0)
          + (value.c != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.c) : 0)
          + (value.d != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, value.d) : 0)
          + (value.tx != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(5, value.tx) : 0)
          + (value.ty != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(6, value.ty) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Transform value) throws IOException {
      if (value.a != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 1, value.a);
      if (value.b != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.b);
      if (value.c != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.c);
      if (value.d != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 4, value.d);
      if (value.tx != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 5, value.tx);
      if (value.ty != null) ProtoAdapter.FLOAT.encodeWithTag(writer, 6, value.ty);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Transform decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.a(ProtoAdapter.FLOAT.decode(reader)); break;
          case 2: builder.b(ProtoAdapter.FLOAT.decode(reader)); break;
          case 3: builder.c(ProtoAdapter.FLOAT.decode(reader)); break;
          case 4: builder.d(ProtoAdapter.FLOAT.decode(reader)); break;
          case 5: builder.tx(ProtoAdapter.FLOAT.decode(reader)); break;
          case 6: builder.ty(ProtoAdapter.FLOAT.decode(reader)); break;
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
    public Transform redact(Transform value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
