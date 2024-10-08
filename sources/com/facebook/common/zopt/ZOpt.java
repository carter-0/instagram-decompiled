package com.facebook.common.zopt;

import X.0dV;
import android.content.Context;

public final class ZOpt {
    public static final ZOpt $redex_init_class = null;

    public static native void truncate_zip_at_path(String str);

    public static native int zopt(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, boolean z, boolean z2);

    static {
        0dV.A0C("zopt-jni");
    }

    public static void notePostColdStart(Context context, Boolean bool) {
    }
}
