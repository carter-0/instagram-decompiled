package com.facebook.ffmpeg;

import X.C21536Xe7;
import X.C7235Q0h;
import X.G9t;
import X.Y9I;
import java.util.Map;

public class FFMpegMediaMuxer {
    public Map A00;
    public boolean A01;
    public final int A02;
    public final C7235Q0h A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final NativeWrapper mNativeWrapper;

    public FFMpegMediaMuxer(C7235Q0h q0h, String str, boolean z) {
        this(q0h, str, z, (String) null, -1, false, (Map) null, (String) null);
    }

    public class NativeWrapper implements Y9I {
        public volatile long mFragmentedFormatFlagsFix;
        public volatile long mNativeAudioCodec;
        public volatile long mNativeContext;
        public volatile long mNativeVideoCodec;

        private native void nativeFinalize();

        public native FFMpegAVStream nativeAddStream(FFMpegMediaFormat fFMpegMediaFormat, int i, int i2);

        public native void nativeInit(String str);

        public native void nativeStart(boolean z, String str, Map map, String str2);

        public native void nativeStop();

        public NativeWrapper(Object obj, long j) {
            this.mFragmentedFormatFlagsFix = j;
            C21536Xe7.A00(this, obj);
        }

        public void targetDestructed() {
            nativeFinalize();
        }
    }

    public final void A00() {
        this.mNativeWrapper.nativeStart(this.A07, this.A04, this.A00, this.A05);
        this.A01 = true;
    }

    public final void A01() {
        if (this.A01) {
            this.mNativeWrapper.nativeStop();
            this.A01 = false;
        }
    }

    public FFMpegMediaMuxer initialize() {
        this.A03.A00();
        this.mNativeWrapper.nativeInit(this.A06);
        return this;
    }

    public FFMpegMediaMuxer(C7235Q0h q0h, String str, boolean z, String str2, int i, boolean z2, Map map) {
        this(q0h, str, z, str2, i, z2, map, (String) null);
    }

    public FFMpegMediaMuxer(C7235Q0h q0h, String str, boolean z, String str2, int i, boolean z2, Map map, String str3) {
        this.A03 = q0h;
        this.A06 = str;
        this.A07 = z;
        this.A04 = str2;
        this.A02 = i;
        this.mNativeWrapper = new NativeWrapper(this, G9t.A0k(z2 ? 1 : 0));
        this.A00 = map;
        this.A05 = str3;
    }
}
