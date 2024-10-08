package com.facebook.proxygen.utils;

import X.AnonymousClass7TE;
import X.Pxe;

public final class Preconditions {
    public static Object checkNotNull(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass7TE.A11(String.valueOf(obj2));
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass7TE.A0z(String.valueOf(obj));
        }
    }

    public static Object checkNotNull(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw Pxe.A0i();
        }
    }
}
