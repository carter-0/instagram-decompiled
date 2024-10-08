package org.pytorch;

import X.0di;

public final class PyTorchAndroid {
    public static native void nativeSetNumThreads(int i);

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0dj] */
    static {
        if (!0di.A02()) {
            0di.A00(new Object());
        }
        0di.A01("pytorch_jni_lite");
        try {
            0di.A01("torch-code-gen");
        } catch (Throwable unused) {
        }
    }
}
