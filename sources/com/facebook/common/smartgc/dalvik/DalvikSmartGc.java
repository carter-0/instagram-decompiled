package com.facebook.common.smartgc.dalvik;

import X.0dV;
import X.AnonymousClass0Hh;
import X.AnonymousClass7TE;
import X.C10868RzU;
import X.C13419Ta0;
import X.C13770Tgi;
import android.content.Context;

public class DalvikSmartGc implements C13770Tgi {
    public static final boolean CAN_RUN_ON_THIS_PLATFORM;
    public static final boolean HAD_ERROR_INITING;

    public static native void nativeBadTimeToDoGc(boolean z, int i, boolean z2, boolean z3, boolean z4);

    public static native void nativeConcurrentGc(boolean z, int i);

    public static native String nativeGetErrorMessage();

    public static native boolean nativeInitialize();

    public static native void nativeManualGcComplete();

    public static native void nativeManualGcConcurrent();

    public static native void nativeManualGcForAlloc();

    public static native void nativeNotAsBadTimeToDoGc();

    public void setUpHook(Context context, C10868RzU rzU) {
    }

    static {
        boolean z;
        boolean z2 = !AnonymousClass0Hh.A00;
        CAN_RUN_ON_THIS_PLATFORM = z2;
        if (z2) {
            0dV.A0C("dalviksmartgc");
            z = !nativeInitialize();
        } else {
            z = false;
        }
        HAD_ERROR_INITING = z;
    }

    public /* bridge */ /* synthetic */ void badTimeToDoGc(C13419Ta0 ta0) {
        if (CAN_RUN_ON_THIS_PLATFORM) {
            throw AnonymousClass7TE.A11("disableGcConcurrent");
        }
        throw AnonymousClass7TE.A0z("This platform is not supported");
    }

    public void notAsBadTimeToDoGc() {
        if (CAN_RUN_ON_THIS_PLATFORM) {
            nativeNotAsBadTimeToDoGc();
            return;
        }
        throw AnonymousClass7TE.A0z("This platform is not supported");
    }
}
