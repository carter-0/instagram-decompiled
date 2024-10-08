package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import android.view.Surface;
import com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class W1X {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public MediaCodec.BufferInfo A05;
    public MediaCodec A06;
    public MediaFormat A07;
    public WIT A08;
    public VideoEncoderConfig A09;
    public VideoEncoderConfig A0A;
    public X7U A0B;
    public C346057uW A0C;
    public C18078Vl7 A0D;
    public C20971X7b A0E;
    public Integer A0F = AnonymousClass05K.A00;
    public String A0G = "UNKNOWN";
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final AnonymousClass0JR A0M;
    public final AndroidPlatformVideoEncoderHybrid A0N;
    public final C18484Vsf A0O = new Object();
    public final AtomicBoolean A0P = JTQ.A0k();
    public final AtomicLong A0Q = new AtomicLong(0);
    public final AnonymousClass0eM A0R = AnonymousClass0eN.A01(new TTN(this, 36));

    public static final boolean A02(W1X w1x, Exception exc) {
        W3b.A01("mss:AndroidPlatformVideoEncoderImpl", "handleException/original", exc, new Object[0]);
        if (!(exc instanceof MediaCodec.CodecException) || !((MediaCodec.CodecException) exc).isTransient()) {
            int i = w1x.A02 + 1;
            w1x.A02 = i;
            W3b.A04("mss:AndroidPlatformVideoEncoderImpl", 002.A0O("video_enc_exception_restart_count=", i), new Object[0]);
            if (w1x.A02 <= 5) {
                try {
                    w1x.A0N.requestRestartEncoder();
                    W3b.A04("mss:AndroidPlatformVideoEncoderImpl", "video_enc_exception_restart", new Object[0]);
                    return true;
                } catch (Exception e) {
                    W3b.A01("mss:AndroidPlatformVideoEncoderImpl", "restartVideoEncoder", e, new Object[0]);
                }
            }
        } else if (w1x.A03 <= 100) {
            W3b.A04("mss:AndroidPlatformVideoEncoderImpl", "video_enc_exception_transient", new Object[0]);
            w1x.A03++;
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.util.Pair r23, X.W1X r24) {
        /*
            r5 = r24
            com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig r6 = r5.A09
            if (r6 == 0) goto L_0x0087
            com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig r9 = r5.A0A
            r4 = 0
            r3 = 1
            r7 = r23
            if (r9 != 0) goto L_0x0097
            r13 = 1
            r4 = 1
            r12 = 1
        L_0x0011:
            java.lang.Object r0 = r7.first
            X.0qQ.A06(r0)
            int r15 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r7.second
            X.0qQ.A06(r0)
            int r16 = X.AnonymousClass7TE.A0M(r0)
            int r11 = r6.bitRate
            int r10 = r6.frameRate
            X.Uwu r9 = r6.videoProfile
            X.Uwm r8 = r6.videoBitrateMode
            float r7 = r6.iFrameInterval
            boolean r2 = r6.enableAndroidEncoderLowLatencyControl
            int r1 = r6.keyLatency
            int r0 = r6.keyPriority
            com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig r14 = new com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig
            r20 = r8
            r21 = r7
            r22 = r2
            r23 = r1
            r24 = r0
            r18 = r10
            r19 = r9
            r17 = r11
            r14.<init>((int) r15, (int) r16, (int) r17, (int) r18, (X.C16547Uwu) r19, (X.C16541Uwm) r20, (float) r21, (boolean) r22, (int) r23, (int) r24)
            r5.A0A = r14
            android.media.MediaCodec r6 = r5.A06
            if (r6 == 0) goto L_0x0063
            if (r13 != 0) goto L_0x0088
            if (r4 != 0) goto L_0x0088
            if (r12 == 0) goto L_0x0063
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            int r1 = r14.bitRate
            java.lang.String r0 = "video-bitrate"
            r2.putInt(r0, r1)
            r6.setParameters(r2)
        L_0x0063:
            com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid r6 = r5.A0N
            int r7 = r14.width
            int r8 = r14.height
            int r9 = r14.bitRate
            int r10 = r14.frameRate
            X.Uwu r0 = r14.videoProfile
            int r5 = r0.A00
            X.Uwm r0 = r14.videoBitrateMode
            int r4 = r0.A00
            float r3 = r14.iFrameInterval
            boolean r2 = r14.enableAndroidEncoderLowLatencyControl
            int r1 = r14.keyLatency
            int r0 = r14.keyPriority
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r2
            r15 = r1
            r16 = r0
            r6.updateVideoEncoderConfig(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0087:
            return
        L_0x0088:
            java.lang.Integer r1 = r5.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0091
            r5.A0L = r3
            goto L_0x0063
        L_0x0091:
            com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid r0 = r5.A0N
            r0.requestRestartEncoder()
            goto L_0x0063
        L_0x0097:
            java.lang.Object r2 = r7.first
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r9.width
            java.lang.String r8 = "mss:AndroidPlatformVideoEncoderImpl"
            if (r0 == 0) goto L_0x00e3
            int r0 = r0.intValue()
            if (r0 != r11) goto L_0x00e3
            java.lang.Object r0 = r7.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r9.height
            if (r0 == 0) goto L_0x00e3
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x00e3
            r13 = 0
        L_0x00b7:
            int r2 = r6.bitRate
            int r0 = r9.bitRate
            if (r2 == r0) goto L_0x00e1
            java.lang.String r1 = r5.A0G
            java.lang.String r0 = " encoder got new bit rate "
            java.lang.String r1 = X.002.A0b(r1, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.W3b.A05(r8, r1, r0)
            r12 = 1
        L_0x00cb:
            int r2 = r6.frameRate
            int r0 = r9.frameRate
            if (r2 == r0) goto L_0x0011
            java.lang.String r1 = r5.A0G
            java.lang.String r0 = " encoder got new frame rate "
            java.lang.String r1 = X.002.A0b(r1, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.W3b.A05(r8, r1, r0)
            r4 = 1
            goto L_0x0011
        L_0x00e1:
            r12 = 0
            goto L_0x00cb
        L_0x00e3:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = r5.A0G
            r10.append(r0)
            java.lang.String r0 = " encoder got new resolution. From "
            r10.append(r0)
            r10.append(r11)
            r1 = 120(0x78, float:1.68E-43)
            r10.append(r1)
            int r0 = r9.height
            r10.append(r0)
            java.lang.String r0 = " to "
            r10.append(r0)
            r10.append(r2)
            r10.append(r1)
            java.lang.Object r0 = r7.second
            r10.append(r0)
            r0 = 46
            java.lang.String r1 = X.C51967G9n.A0r(r10, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.W3b.A05(r8, r1, r0)
            r13 = 1
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1X.A00(android.util.Pair, X.W1X):void");
    }

    public static final void A01(W1X w1x) {
        MediaCodec mediaCodec = w1x.A06;
        if (mediaCodec != null) {
            W3b.A08("Start flushing video encoder", new Object[0]);
            int i = 0;
            do {
                try {
                    mediaCodec.flush();
                    break;
                } catch (IllegalStateException e) {
                    W3b.A01("mss:VideoEncoderSetup", "failed to flush encoder, attmpts %d", e, AnonymousClass7TF.A1b(i));
                    i++;
                    if (i >= 4) {
                    }
                }
            } while (i >= 4);
            try {
                W3b.A08("Stopping video encoder", new Object[0]);
                0fX.A06(mediaCodec, -1202842253);
            } catch (Exception e2) {
                W3b.A01("mss:VideoEncoderSetup", "Failed to stop encoder", e2, new Object[0]);
            }
            try {
                W3b.A08("Releasing video encoder", new Object[0]);
                0fX.A03(mediaCodec, -992587840);
            } catch (Exception e3) {
                W3b.A01("mss:VideoEncoderSetup", "Failed to release encoder", e3, new Object[0]);
            }
            W3b.A08("Releasing video encoder finished.", new Object[0]);
        }
        w1x.A06 = null;
        w1x.A0L = false;
    }

    public final void A03() {
        Surface surface;
        W3b.A03("mss:AndroidPlatformVideoEncoderImpl", 002.A0R(this.A0G, " encoder stop"), new Object[0]);
        Integer num = this.A0F;
        Integer num2 = AnonymousClass05K.A0N;
        if (num == num2) {
            W3b.A04("mss:AndroidPlatformVideoEncoderImpl", 002.A0R(this.A0G, " encoder already stopped"), new Object[0]);
            return;
        }
        this.A04 = 0;
        WIT wit = this.A08;
        if (!(wit == null || (surface = wit.getSurface()) == null)) {
            surface.release();
        }
        this.A08 = null;
        A01(this);
        this.A01 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A0F = num2;
        this.A0P.set(false);
    }

    public final void A04(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8) {
        C16541Uwm uwm;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0G);
        sb.append(" encoder setVideoConfig:w=");
        int i9 = i;
        sb.append(i9);
        sb.append(",h=");
        int i10 = i2;
        sb.append(i10);
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        int i14 = i6;
        C13992Tns.A19(sb, i11, i12, i13, i14);
        float f2 = f;
        sb.append(f2);
        W3b.A05("mss:AndroidPlatformVideoEncoderImpl", sb.toString(), new Object[0]);
        C16547Uwu A002 = C18096VlQ.A00(i13);
        if (i14 == 1) {
            uwm = C16541Uwm.CBR;
        } else if (i14 != 2) {
            uwm = C16541Uwm.DEFAULT;
        } else {
            uwm = C16541Uwm.CQ;
        }
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig(i9, i10, i11, i12, A002, uwm, f2, z, i7, i8);
        this.A09 = videoEncoderConfig;
        int i15 = videoEncoderConfig.width;
        int i16 = videoEncoderConfig.height;
        float f3 = this.A00;
        X7U x7u = this.A0B;
        if (x7u != null) {
            Pair A003 = V61.A00(f3, i15, i16, x7u.BnR(), !this.A0H);
            if (this.A00 > 0.0f) {
                float A0M2 = (float) AnonymousClass7TE.A0M(A003.first);
                Object obj = A003.second;
                0qQ.A06(obj);
                this.A00 = A0M2 / AnonymousClass7TE.A04(obj);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adjusted ");
            sb2.append(this.A0G);
            sb2.append(" base encoder size: ");
            sb2.append(A003.first);
            sb2.append('x');
            W3b.A05("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass7TF.A0i(A003.second, sb2), new Object[0]);
            A00(A003, this);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Vsf] */
    public W1X(AnonymousClass0JR r4, AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid) {
        this.A0M = r4;
        this.A0N = androidPlatformVideoEncoderHybrid;
    }
}
