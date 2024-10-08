package com.facebook.fbreact.specs;

import X.AnonymousClass00P;
import X.QZK;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "WebSocketModule";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void close(double d, String str, double d2);

    @ReactMethod
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d);

    public abstract String getName();

    @ReactMethod
    public abstract void ping(double d);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void send(String str, double d);

    @ReactMethod
    public abstract void sendBinary(String str, double d);

    public NativeWebSocketModuleSpec(QZK qzk) {
        throw AnonymousClass00P.createAndThrow();
    }
}
