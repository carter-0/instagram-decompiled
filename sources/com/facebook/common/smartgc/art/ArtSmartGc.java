package com.facebook.common.smartgc.art;

import X.0dV;
import X.15O;
import X.1LJ;
import X.AnonymousClass1BA;
import X.AnonymousClass7TE;
import X.C10868RzU;
import X.C12067SmM;
import X.C13419Ta0;
import X.C13770Tgi;
import X.Pxe;
import android.content.Context;
import android.util.Log;

public class ArtSmartGc implements C13770Tgi {
    public static final boolean CAN_RUN_ON_THIS_PLATFORM;
    public static final Object LOCK = Pxe.A0p();
    public static String sDataDir;
    public static Boolean sHadErrorInitalizing;
    public static boolean sSetUpHookInited;
    public static C10868RzU sSetupSmartGcConfig;

    public static native void nativeBadTimeToDoGc(boolean z, boolean z2, boolean z3);

    public static native String nativeGetErrorMessage();

    public static native boolean nativeInitialize(String str, int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeNotAsBadTimeToDoGc();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (android.os.Build.VERSION.SDK_INT > 28) goto L_0x000b;
     */
    static {
        /*
            boolean r0 = X.AnonymousClass0Hh.A00
            if (r0 == 0) goto L_0x000b
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r0 = 1
            if (r2 <= r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            CAN_RUN_ON_THIS_PLATFORM = r0
            java.lang.Object r0 = X.Pxe.A0p()
            LOCK = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.smartgc.art.ArtSmartGc.<clinit>():void");
    }

    public static boolean validateAndInitIfIsPlatformSupported() {
        if (sHadErrorInitalizing == null) {
            synchronized (LOCK) {
                if (sHadErrorInitalizing == null) {
                    if (sDataDir != null) {
                        try {
                            0dV.A0C("artsmartgc");
                            boolean z = false;
                            int[] A00 = 15O.A00(new String[]{"(HeapTaskDaemon)", "(GCDaemon)", "(HeapTrimmerDaem)"});
                            if (!nativeInitialize(sDataDir, A00[0], A00[1], A00[2], false, false)) {
                                z = true;
                            }
                            sHadErrorInitalizing = Boolean.valueOf(z);
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("ArtSmartGc", "Cannot Init ART Smart GC", e);
                            sHadErrorInitalizing = true;
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("setupHook must be called first");
                    }
                }
            }
        }
        return !sHadErrorInitalizing.booleanValue();
    }

    public /* bridge */ /* synthetic */ void badTimeToDoGc(C13419Ta0 ta0) {
        C12067SmM smM = (C12067SmM) ta0;
        if (validateAndInitIfIsPlatformSupported()) {
            nativeBadTimeToDoGc(smM.A00, smM.A02, smM.A01);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.RzU, java.lang.Object] */
    public void setUpHook(Context context, C10868RzU rzU) {
        if (!sSetUpHookInited) {
            sDataDir = AnonymousClass1BA.A00(context).AXT((1LJ) null, 1658227862).getAbsolutePath();
            sSetupSmartGcConfig = new Object();
            sSetUpHookInited = true;
        }
    }

    public void notAsBadTimeToDoGc() {
        if (validateAndInitIfIsPlatformSupported()) {
            nativeNotAsBadTimeToDoGc();
        }
    }
}
