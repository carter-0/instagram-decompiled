package com.facebook.mediastreaming.opt.encoder.audio;

import X.0qQ;
import X.XR2;

public final class AudioEncoderConfig {
    public final int bitRate;
    public final int channels;
    public final XR2 profile;
    public final int sampleRate;
    public final boolean useAudioASC;

    public AudioEncoderConfig(int i, int i2, int i3, XR2 xr2, boolean z) {
        0qQ.A0B(xr2, 4);
        this.sampleRate = i;
        this.bitRate = i2;
        this.channels = i3;
        this.profile = xr2;
        this.useAudioASC = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioEncoderConfig(int r2, int r3, int r4, int r5, boolean r6) {
        /*
            r1 = this;
            r0 = 5
            if (r5 != r0) goto L_0x0009
            X.XR2 r5 = X.XR2.HE
        L_0x0005:
            r1.<init>((int) r2, (int) r3, (int) r4, (X.XR2) r5, (boolean) r6)
            return
        L_0x0009:
            X.XR2 r5 = X.XR2.LC
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig.<init>(int, int, int, int, boolean):void");
    }
}
