package com.facebook.react.bridge;

import X.0I1;
import java.lang.reflect.Method;

public class ReactCxxErrorHandler {
    public static Object A00;
    public static Method A01;

    public static void handleError(String str) {
        if (A01 != null) {
            try {
                A01.invoke(A00, new Object[]{new Exception(str)});
            } catch (Exception e) {
                0I1.A05("ReactCxxErrorHandler", "Failed to invoke error handler function", e);
            }
        }
    }

    public static void setHandleErrorFunc(Object obj, Method method) {
        A00 = obj;
        A01 = method;
    }
}
