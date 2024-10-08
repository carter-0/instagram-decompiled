package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;

public final class DynamicNative extends HybridClassBase implements Dynamic {
    private final native ReadableType getTypeNative();

    private final native boolean isNullNative();

    public native ReadableArray asArray();

    public native boolean asBoolean();

    public native double asDouble();

    public native ReadableMap asMap();

    public native String asString();

    public void recycle() {
    }

    public int asInt() {
        return (int) asDouble();
    }

    public ReadableType getType() {
        return getTypeNative();
    }

    public boolean isNull() {
        return isNullNative();
    }
}
