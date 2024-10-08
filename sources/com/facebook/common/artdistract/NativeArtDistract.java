package com.facebook.common.artdistract;

import X.0Im;
import X.0dV;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class NativeArtDistract {
    public static final 0Im ML = 0Im.A00("NativeArtDistract");
    public static final boolean PLATFORM_SUPPORTED;

    public static Method getProxyMethodForOffset() {
        Class<IArtDistractOffsetHelper> cls = IArtDistractOffsetHelper.class;
        Class<?> proxyClass = Proxy.getProxyClass(cls.getClassLoader(), new Class[]{cls});
        new Object[1][0] = proxyClass;
        try {
            return proxyClass.getDeclaredMethod("test", new Class[0]);
        } catch (NoSuchMethodException e) {
            ML.A0C(e, "We were unable to get a proxy method for offset", new Object[0]);
            return null;
        }
    }

    public static native boolean nativeAllowCrossPackageAccess();

    public static native boolean nativeHookMethod(Method method, Object obj, Method method2, boolean z);

    public static native boolean nativeInit();

    static {
        boolean z = false;
        try {
            0dV.A0C("artdistract");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            ML.A04("Can't load ArtDistract lib", e);
        }
        PLATFORM_SUPPORTED = z;
    }

    public static final void findAccessFlagMethod1() {
        throw new UnsupportedOperationException();
    }

    private final int findAccessFlagMethod2() {
        throw new UnsupportedOperationException();
    }

    private int stubTestMethod() {
        throw new UnsupportedOperationException();
    }
}
