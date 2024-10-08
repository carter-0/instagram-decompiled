package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;

public class CxxCallbackImpl extends HybridClassBase implements Callback {
    private native void nativeInvoke(NativeArray nativeArray);

    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
