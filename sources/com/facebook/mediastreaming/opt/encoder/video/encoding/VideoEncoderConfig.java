package com.facebook.mediastreaming.opt.encoder.video.encoding;

import X.AnonymousClass7TG;
import X.C16541Uwm;
import X.C16547Uwu;

public final class VideoEncoderConfig {
    public final int bitRate;
    public final boolean enableAndroidEncoderLowLatencyControl;
    public final int frameRate;
    public final int height;
    public final float iFrameInterval;
    public final int keyLatency;
    public final int keyPriority;
    public final C16541Uwm videoBitrateMode;
    public final C16547Uwu videoProfile;
    public final int width;

    public VideoEncoderConfig(int i, int i2, int i3, int i4, C16547Uwu uwu, C16541Uwm uwm, float f, boolean z, int i5, int i6) {
        AnonymousClass7TG.A1S(uwu, uwm);
        this.width = i;
        this.height = i2;
        this.bitRate = i3;
        this.frameRate = i4;
        this.videoProfile = uwu;
        this.videoBitrateMode = uwm;
        this.iFrameInterval = f;
        this.enableAndroidEncoderLowLatencyControl = z;
        this.keyLatency = i5;
        this.keyPriority = i6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoEncoderConfig(int r2, int r3, int r4, int r5, int r6, int r7, float r8, boolean r9, int r10, int r11) {
        /*
            r1 = this;
            X.Uwu r6 = X.C18096VlQ.A00(r6)
            r0 = 1
            if (r7 == r0) goto L_0x0013
            r0 = 2
            if (r7 == r0) goto L_0x0010
            X.Uwm r7 = X.C16541Uwm.DEFAULT
        L_0x000c:
            r1.<init>((int) r2, (int) r3, (int) r4, (int) r5, (X.C16547Uwu) r6, (X.C16541Uwm) r7, (float) r8, (boolean) r9, (int) r10, (int) r11)
            return
        L_0x0010:
            X.Uwm r7 = X.C16541Uwm.CQ
            goto L_0x000c
        L_0x0013:
            X.Uwm r7 = X.C16541Uwm.CBR
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig.<init>(int, int, int, int, int, int, float, boolean, int, int):void");
    }
}
