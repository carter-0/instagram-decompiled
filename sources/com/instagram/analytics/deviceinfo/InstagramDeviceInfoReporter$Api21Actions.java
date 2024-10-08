package com.instagram.analytics.deviceinfo;

import X.0qQ;
import X.0xF;
import android.system.ErrnoException;
import android.system.Os;

public final class InstagramDeviceInfoReporter$Api21Actions {
    public static final InstagramDeviceInfoReporter$Api21Actions INSTANCE = new Object();

    public static final void addFileLastAccessTime(0xF r4, String str) {
        0qQ.A0B(r4, 0);
        try {
            0xF.A00(r4, Long.valueOf(Os.lstat(str).st_atime * 1000), "access_date");
        } catch (ErrnoException unused) {
        }
    }
}
