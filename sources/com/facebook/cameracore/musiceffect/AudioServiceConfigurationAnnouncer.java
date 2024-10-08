package com.facebook.cameracore.musiceffect;

import X.0dV;
import X.C392159uJ;
import X.C392169uK;
import X.C392179uL;
import X.C392879vW;
import android.os.Build;
import com.facebook.jni.HybridData;

public final class AudioServiceConfigurationAnnouncer {
    public static final C392879vW Companion = new Object();
    public HybridData mHybridData;

    private final native boolean announce(String str, String str2, String str3, String str4, long j, long j2, String str5);

    public static final native HybridData initHybrid();

    public final native float audioClipProgress();

    public final native boolean pause();

    public final native boolean resume();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vW, java.lang.Object] */
    static {
        0dV.A0C("musiceffect-native");
    }

    public final boolean announce(C392179uL r12) {
        C392169uK r1 = r12.A01;
        C392159uJ r0 = r12.A00;
        return announce((String) null, r1.A00, (String) null, r1.A01, r0.A00, 0, r0.A01);
    }

    public AudioServiceConfigurationAnnouncer() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            this.mHybridData = initHybrid();
        }
    }
}
