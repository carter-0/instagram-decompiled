package com.facebook.mediastreaming.opt.encoder.video;

import X.002;
import X.0KC;
import X.0dV;
import X.0fX;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C13988Tno;
import X.C13992Tns;
import X.C16541Uwm;
import X.C16547Uwu;
import X.C16709V2s;
import X.C18078Vl7;
import X.C18096VlQ;
import X.C18406Vr8;
import X.C20971X7b;
import X.C62985Kpb;
import X.DbY;
import X.ULY;
import X.V60;
import X.V61;
import X.W1X;
import X.W3b;
import X.X7U;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.nio.ByteBuffer;

public final class AndroidPlatformVideoEncoderHybrid extends StreamingHybridClassBase {
    public static final V60 Companion = new Object();
    public final W1X impl;

    public native void onEncoded(ByteBuffer byteBuffer, int i, int i2, long j, long j2, int i3, MediaFormat mediaFormat, boolean z, int i4, int i5, int i6);

    public final void prepare(String str, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8, boolean z2, boolean z3, boolean z4) {
        Object obj;
        float f2;
        String str2 = str;
        0qQ.A0B(str2, 0);
        W1X w1x = this.impl;
        w1x.A0G = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("prepare ");
        sb.append(str2);
        sb.append(" encoder:w=");
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
        float f3 = f;
        sb.append(f3);
        sb.append(",enforceColorInfo=");
        boolean z5 = z4;
        sb.append(z5);
        W3b.A03("mss:AndroidPlatformVideoEncoderImpl", sb.toString(), new Object[0]);
        Integer num = w1x.A0F;
        if (num != AnonymousClass05K.A00) {
            W3b.A04("mss:AndroidPlatformVideoEncoderImpl", 002.A0u("Calling prepare when ", w1x.A0G, " encoder is already initialized ", C62985Kpb.A00(num)), new Object[0]);
            return;
        }
        w1x.A0H = z2;
        w1x.A0J = z3;
        w1x.A0I = z5;
        if (!z2) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        w1x.A0B = (X7U) obj;
        w1x.A0Q.set(0);
        w1x.A07 = null;
        w1x.A01 = 0;
        w1x.A03 = 0;
        w1x.A02 = 0;
        if (w1x.A00 == 0.0f) {
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = ((float) i9) / ((float) i10);
            }
            w1x.A00 = f2;
        }
        w1x.A04(i9, i10, i11, i12, i13, i14, f3, z, i7, i8);
        w1x.A0F = AnonymousClass05K.A01;
        C18078Vl7 vl7 = C16709V2s.A00;
        if (vl7 != null) {
            if (vl7.A0L) {
                w1x.A0E = vl7.A0E;
                C20971X7b x7b = (C20971X7b) w1x.A0R.getValue();
                0qQ.A0B(x7b, 0);
                vl7.A0E = x7b;
                vl7.A0B.EqB(x7b);
            }
            w1x.A0D = vl7;
        }
        w1x.A0P.set(false);
    }

    public native void requestRestartEncoder();

    public native void updateVideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V60, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017a, code lost:
        if (r8.A0L != false) goto L_0x017c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drain() {
        /*
            r38 = this;
            r0 = r38
            X.W1X r8 = r0.impl
            X.Vl7 r0 = r8.A0D
            java.lang.String r13 = "mss:AndroidPlatformVideoEncoderImpl"
            r7 = 0
            if (r0 == 0) goto L_0x0031
            X.XBm r0 = r0.A0B
            boolean r0 = r0.isStreaming()
            if (r0 != 0) goto L_0x0031
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A0P
            r0 = 1
            boolean r0 = r1.compareAndSet(r0, r7)
            if (r0 == 0) goto L_0x0031
            X.7uW r0 = r8.A0C
            if (r0 == 0) goto L_0x0023
            r0 = 0
            r8.A0C = r0
        L_0x0023:
            com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid r0 = r8.A0N     // Catch:{ Exception -> 0x0029 }
            r0.requestRestartEncoder()     // Catch:{ Exception -> 0x0029 }
            goto L_0x0031
        L_0x0029:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "restartVideoEncoder"
            X.W3b.A01(r13, r0, r2, r1)
        L_0x0031:
            java.lang.Integer r3 = r8.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 == r0) goto L_0x0049
            java.lang.String r2 = r8.A0G
            java.lang.String r1 = " encoder cannot be drained when it's "
            java.lang.String r0 = X.C62985Kpb.A00(r3)
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.W3b.A04(r13, r1, r0)
        L_0x0048:
            return
        L_0x0049:
            android.media.MediaCodec r0 = r8.A06     // Catch:{ Exception -> 0x01ff }
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x01f3
            java.nio.ByteBuffer[] r12 = r0.getOutputBuffers()     // Catch:{ Exception -> 0x01ff }
            X.0qQ.A07(r12)     // Catch:{ Exception -> 0x01ff }
            com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig r10 = r8.A0A     // Catch:{ Exception -> 0x01ff }
            if (r10 == 0) goto L_0x01ed
            android.media.MediaCodec r6 = r8.A06     // Catch:{ Exception -> 0x01ff }
            if (r6 == 0) goto L_0x01e7
            android.media.MediaCodec$BufferInfo r5 = r8.A05     // Catch:{ Exception -> 0x01ff }
            if (r5 == 0) goto L_0x01e1
            float r0 = r10.iFrameInterval     // Catch:{ Exception -> 0x01ff }
            r23 = r0
            r22 = 0
        L_0x0068:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r4 = r6.dequeueOutputBuffer(r5, r0)     // Catch:{ Exception -> 0x01ff }
            r2 = -1
            if (r4 == r2) goto L_0x00f3
            r2 = -3
            if (r4 != r2) goto L_0x0079
            java.nio.ByteBuffer[] r12 = r6.getOutputBuffers()     // Catch:{ Exception -> 0x01ff }
            goto L_0x0068
        L_0x0079:
            r2 = -2
            if (r4 != r2) goto L_0x0083
            android.media.MediaFormat r0 = r6.getOutputFormat()     // Catch:{ Exception -> 0x01ff }
            r8.A07 = r0     // Catch:{ Exception -> 0x01ff }
            goto L_0x0068
        L_0x0083:
            r11 = 1
            if (r4 < 0) goto L_0x0159
            int r2 = r5.size     // Catch:{ Exception -> 0x01ff }
            if (r2 < 0) goto L_0x0156
            int r2 = r5.offset     // Catch:{ Exception -> 0x01ff }
            if (r2 < 0) goto L_0x0156
            long r15 = r5.presentationTimeUs     // Catch:{ Exception -> 0x01ff }
            long r15 = r15 / r0
            int r0 = r5.flags     // Catch:{ Exception -> 0x01ff }
            r21 = 2
            r0 = r0 & 2
            if (r0 != 0) goto L_0x00b3
            float r1 = r10.iFrameInterval     // Catch:{ Exception -> 0x01ff }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r8.A0J     // Catch:{ Exception -> 0x01ff }
            if (r0 == 0) goto L_0x00b3
            X.0JR r0 = r8.A0M     // Catch:{ Exception -> 0x01ff }
            long r2 = r0.now()     // Catch:{ Exception -> 0x01ff }
            int r0 = r5.flags     // Catch:{ Exception -> 0x01ff }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0141
            r8.A04 = r2     // Catch:{ Exception -> 0x01ff }
        L_0x00b3:
            int r0 = r12.length     // Catch:{ Exception -> 0x01ff }
            if (r4 >= r0) goto L_0x0197
            r0 = r12[r4]     // Catch:{ Exception -> 0x01ff }
            if (r0 == 0) goto L_0x0187
            int r1 = r5.offset     // Catch:{ Exception -> 0x01ff }
            java.nio.Buffer r3 = r0.position(r1)     // Catch:{ Exception -> 0x01ff }
            int r2 = r5.offset     // Catch:{ Exception -> 0x01ff }
            int r1 = r5.size     // Catch:{ Exception -> 0x01ff }
            int r2 = r2 + r1
            r3.limit(r2)     // Catch:{ Exception -> 0x01ff }
            int r1 = r5.flags     // Catch:{ Exception -> 0x01ff }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00da
            r1 = r21
            r5.flags = r1     // Catch:{ Exception -> 0x01ff }
            X.X7U r1 = r8.A0B     // Catch:{ Exception -> 0x01ff }
            if (r1 == 0) goto L_0x01f9
            java.nio.ByteBuffer r0 = r1.CIi(r0)     // Catch:{ Exception -> 0x01ff }
        L_0x00da:
            X.Vl7 r2 = r8.A0D     // Catch:{ Exception -> 0x01ff }
            if (r2 == 0) goto L_0x00f8
            X.XBm r1 = r2.A0B     // Catch:{ Exception -> 0x01ff }
            boolean r1 = r1.Cea()     // Catch:{ Exception -> 0x01ff }
            if (r1 != r11) goto L_0x00f8
            boolean r1 = r2.A0L     // Catch:{ Exception -> 0x01ff }
            if (r1 != r11) goto L_0x00f8
        L_0x00ea:
            r6.releaseOutputBuffer(r4, r7)     // Catch:{ Exception -> 0x01ff }
            int r0 = r5.flags     // Catch:{ Exception -> 0x01ff }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0068
        L_0x00f3:
            boolean r0 = r8.A0J     // Catch:{ Exception -> 0x01ff }
            if (r0 == 0) goto L_0x0178
            goto L_0x0164
        L_0x00f8:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A0P     // Catch:{ Exception -> 0x01ff }
            boolean r1 = r1.get()     // Catch:{ Exception -> 0x01ff }
            if (r1 != 0) goto L_0x00ea
            X.Vl7 r1 = r8.A0D     // Catch:{ Exception -> 0x01ff }
            if (r1 == 0) goto L_0x013b
            X.XBm r2 = r1.A0B     // Catch:{ Exception -> 0x01ff }
            boolean r2 = r2.Cea()     // Catch:{ Exception -> 0x01ff }
            if (r2 != r11) goto L_0x013b
            r34 = 1
            int r11 = r1.A01     // Catch:{ Exception -> 0x01ff }
            int r3 = r1.A03     // Catch:{ Exception -> 0x01ff }
            int r2 = r1.A02     // Catch:{ Exception -> 0x01ff }
        L_0x0114:
            com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid r1 = r8.A0N     // Catch:{ Exception -> 0x01ff }
            r17 = r1
            int r26 = r0.position()     // Catch:{ Exception -> 0x01ff }
            int r27 = r0.remaining()     // Catch:{ Exception -> 0x01ff }
            int r1 = r5.flags     // Catch:{ Exception -> 0x01ff }
            r14 = r1
            android.media.MediaFormat r1 = r8.A07     // Catch:{ Exception -> 0x01ff }
            r24 = r17
            r25 = r0
            r28 = r15
            r30 = r15
            r32 = r14
            r33 = r1
            r35 = r11
            r36 = r3
            r37 = r2
            r24.onEncoded(r25, r26, r27, r28, r30, r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x01ff }
            goto L_0x00ea
        L_0x013b:
            r34 = 0
            r11 = 0
            r3 = 0
            r2 = 0
            goto L_0x0114
        L_0x0141:
            long r0 = r8.A04     // Catch:{ Exception -> 0x01ff }
            long r17 = r2 - r0
            r0 = r17
            float r14 = (float) r0     // Catch:{ Exception -> 0x01ff }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r23
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b3
            r8.A04 = r2     // Catch:{ Exception -> 0x01ff }
            r22 = 1
            goto L_0x00b3
        L_0x0156:
            r6.releaseOutputBuffer(r4, r7)     // Catch:{ Exception -> 0x01ff }
        L_0x0159:
            int r0 = r8.A01     // Catch:{ Exception -> 0x01ff }
            int r2 = r0 + 1
            r8.A01 = r2     // Catch:{ Exception -> 0x01ff }
            r0 = 100
            if (r2 <= r0) goto L_0x0068
            goto L_0x01a5
        L_0x0164:
            if (r22 == 0) goto L_0x0183
            boolean r0 = r8.A0L     // Catch:{ Exception -> 0x01ff }
            if (r0 != 0) goto L_0x017c
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x01ff }
            r1.<init>()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = "request-sync"
            r1.putInt(r0, r7)     // Catch:{ Exception -> 0x01ff }
            r6.setParameters(r1)     // Catch:{ Exception -> 0x01ff }
            goto L_0x0183
        L_0x0178:
            boolean r0 = r8.A0L     // Catch:{ Exception -> 0x01ff }
            if (r0 == 0) goto L_0x0183
        L_0x017c:
            r8.A0L = r7     // Catch:{ Exception -> 0x01ff }
            com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid r0 = r8.A0N     // Catch:{ Exception -> 0x01ff }
            r0.requestRestartEncoder()     // Catch:{ Exception -> 0x01ff }
        L_0x0183:
            r8.A03 = r7     // Catch:{ Exception -> 0x01ff }
            goto L_0x021f
        L_0x0187:
            java.lang.String r2 = r8.A0G     // Catch:{ Exception -> 0x01ff }
            java.lang.String r1 = " encoderOutputBuffer was null "
            java.lang.String r0 = " was null"
            java.lang.String r0 = X.002.A06(r4, r2, r1, r0)     // Catch:{ Exception -> 0x01ff }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01ff }
            goto L_0x01fe
        L_0x0197:
            java.lang.String r1 = r8.A0G     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = " encoder index out of bounds: "
            java.lang.String r0 = X.002.A0b(r1, r0, r4)     // Catch:{ Exception -> 0x01ff }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01ff }
            goto L_0x01fe
        L_0x01a5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ff }
            r3.<init>()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = r8.A0G     // Catch:{ Exception -> 0x01ff }
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = " video encoder bad parameters ret="
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            r3.append(r4)     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = " offs="
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            int r0 = r5.offset     // Catch:{ Exception -> 0x01ff }
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = " sz="
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            int r0 = r5.size     // Catch:{ Exception -> 0x01ff }
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = " pts="
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            long r0 = r5.presentationTimeUs     // Catch:{ Exception -> 0x01ff }
            r3.append(r0)     // Catch:{ Exception -> 0x01ff }
            java.lang.String r0 = " cnt="
            java.lang.String r0 = X.Pxg.A0t(r0, r3, r2)     // Catch:{ Exception -> 0x01ff }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01ff }
            goto L_0x01fe
        L_0x01e1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01ff }
            goto L_0x01fe
        L_0x01e7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01ff }
            goto L_0x01fe
        L_0x01ed:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01ff }
            goto L_0x01fe
        L_0x01f3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01ff }
            goto L_0x01fe
        L_0x01f9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01ff }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01ff }
        L_0x01fe:
            throw r1     // Catch:{ Exception -> 0x01ff }
        L_0x01ff:
            r3 = move-exception
            boolean r0 = X.W1X.A02(r8, r3)
            if (r0 != 0) goto L_0x0048
            java.lang.String r2 = "Failed to drain "
            java.lang.String r1 = r8.A0G
            java.lang.String r0 = " video encoder"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.W3b.A01(r13, r1, r3, r0)
            com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid r2 = r8.A0N
            X.Uxl r1 = X.C16591Uxl.VideoEncoderError
            java.lang.String r0 = "Failed to drain video encoder"
            r2.fireError(r1, r0, r3)
            return
        L_0x021f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid.drain():void");
    }

    public final String getEncoderBitrateMode() {
        return DbY.A0j(String.valueOf(this.impl.A0O.A00));
    }

    public final String getEncoderProfile() {
        return DbY.A0j(String.valueOf(this.impl.A0O.A01));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1 A[Catch:{ Exception -> 0x00e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.mediastreaming.opt.common.SurfaceHolder prepareEncoder() {
        /*
            r20 = this;
            r0 = r20
            X.W1X r3 = r0.impl
            java.lang.String r2 = "prepare "
            java.lang.String r1 = r3.A0G     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = " encoder"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)     // Catch:{ Exception -> 0x00e9 }
            r5 = 0
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = "mss:AndroidPlatformVideoEncoderImpl"
            X.W3b.A03(r4, r1, r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Integer r1 = r3.A0F     // Catch:{ Exception -> 0x00e9 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x00e9 }
            if (r1 != r0) goto L_0x002d
            java.lang.String r2 = "Cannot prepare "
            java.lang.String r1 = r3.A0G     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = " encoder when uninitialized!"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00e9 }
            X.W3b.A04(r4, r1, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x010b
        L_0x002d:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C     // Catch:{ Exception -> 0x00e9 }
            if (r1 != r6) goto L_0x0034
            X.W1X.A01(r3)     // Catch:{ Exception -> 0x00e9 }
        L_0x0034:
            com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig r1 = r3.A0A     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x00dd
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x00e9 }
            r0.<init>()     // Catch:{ Exception -> 0x00e9 }
            r3.A05 = r0     // Catch:{ Exception -> 0x00e9 }
            X.X7U r0 = r3.A0B     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00d7
            com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig r0 = r0.CJQ(r1)     // Catch:{ Exception -> 0x00e9 }
            X.Vsf r8 = r3.A0O     // Catch:{ Exception -> 0x00e9 }
            boolean r5 = r3.A0J     // Catch:{ Exception -> 0x00e9 }
            boolean r7 = r3.A0I     // Catch:{ Exception -> 0x00e9 }
            X.Uwu r10 = r0.videoProfile     // Catch:{ Exception -> 0x00e9 }
            r8.A01 = r10     // Catch:{ Exception -> 0x00e9 }
            boolean r4 = r8.A02     // Catch:{ Exception -> 0x00e9 }
            if (r4 == 0) goto L_0x0067
            X.Uwu r10 = X.C16547Uwu.BASELINE     // Catch:{ Exception -> 0x00e9 }
        L_0x0059:
            r8.A01 = r10     // Catch:{ Exception -> 0x00e9 }
        L_0x005b:
            boolean r4 = r8.A03     // Catch:{ Exception -> 0x00e9 }
            if (r4 == 0) goto L_0x0064
            X.Uwm r9 = X.C16541Uwm.DEFAULT     // Catch:{ Exception -> 0x00e9 }
        L_0x0061:
            r8.A00 = r9     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0072
        L_0x0064:
            X.Uwm r9 = r0.videoBitrateMode     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0061
        L_0x0067:
            boolean r4 = r8.A04     // Catch:{ Exception -> 0x00e9 }
            if (r4 == 0) goto L_0x005b
            X.Uwu r4 = X.C16547Uwu.HIGH31     // Catch:{ Exception -> 0x00e9 }
            if (r10 != r4) goto L_0x005b
            X.Uwu r10 = X.C16547Uwu.HIGH     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0059
        L_0x0072:
            if (r5 == 0) goto L_0x007b
            r11 = 1114636288(0x42700000, float:60.0)
        L_0x0076:
            if (r10 == 0) goto L_0x00d1
            if (r9 == 0) goto L_0x00e3
            goto L_0x0086
        L_0x007b:
            float r5 = r0.iFrameInterval     // Catch:{ Exception -> 0x00e9 }
            r4 = 0
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L_0x0076
            r11 = r5
            goto L_0x0076
        L_0x0086:
            int r12 = r0.width     // Catch:{ Exception -> 0x00e9 }
            int r13 = r0.height     // Catch:{ Exception -> 0x00e9 }
            int r14 = r0.bitRate     // Catch:{ Exception -> 0x00e9 }
            int r15 = r0.frameRate     // Catch:{ Exception -> 0x00e9 }
            boolean r5 = r0.enableAndroidEncoderLowLatencyControl     // Catch:{ Exception -> 0x00e9 }
            int r4 = r0.keyLatency     // Catch:{ Exception -> 0x00e9 }
            int r0 = r0.keyPriority     // Catch:{ Exception -> 0x00e9 }
            r17 = r0
            r18 = r7
            r19 = r5
            r16 = r4
            android.media.MediaCodec r0 = X.C18484Vsf.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00cb
            r3.A06 = r0     // Catch:{ Exception -> 0x00e9 }
            android.view.Surface r5 = r0.createInputSurface()     // Catch:{ Exception -> 0x00e9 }
            int r4 = r1.width     // Catch:{ Exception -> 0x00e9 }
            int r1 = r1.height     // Catch:{ Exception -> 0x00e9 }
            X.WIT r0 = new X.WIT     // Catch:{ Exception -> 0x00e9 }
            r0.<init>(r5, r4, r1)     // Catch:{ Exception -> 0x00e9 }
            r3.A08 = r0     // Catch:{ Exception -> 0x00e9 }
            java.lang.Integer r0 = r3.A0F     // Catch:{ Exception -> 0x00e9 }
            if (r0 != r6) goto L_0x00c1
            android.media.MediaCodec r1 = r3.A06     // Catch:{ Exception -> 0x00e9 }
            if (r1 == 0) goto L_0x00c1
            r0 = 1634244797(0x616898bd, float:2.6816566E20)
            X.0fX.A05(r1, r0)     // Catch:{ Exception -> 0x00e9 }
        L_0x00c1:
            X.WIT r0 = r3.A08     // Catch:{ Exception -> 0x00e9 }
            if (r0 != 0) goto L_0x010c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e9 }
        L_0x00e8:
            throw r0     // Catch:{ Exception -> 0x00e9 }
        L_0x00e9:
            r4 = move-exception
            boolean r0 = X.W1X.A02(r3, r4)
            if (r0 != 0) goto L_0x010b
            java.lang.String r2 = "Failed to prepare "
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = " encoder"
            java.lang.String r2 = X.002.A0g(r2, r1, r0)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "mss:AndroidPlatformVideoEncoderImpl"
            X.W3b.A01(r0, r2, r4, r1)
            com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid r2 = r3.A0N
            X.Uxl r1 = X.C16591Uxl.VideoEncoderError
            java.lang.String r0 = "Failed to prepare encoder"
            r2.fireError(r1, r0, r4)
        L_0x010b:
            r0 = 0
        L_0x010c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid.prepareEncoder():com.facebook.mediastreaming.opt.common.SurfaceHolder");
    }

    public final void release() {
        W1X w1x = this.impl;
        W3b.A03("mss:AndroidPlatformVideoEncoderImpl", 002.A0R(w1x.A0G, " encoder release"), new Object[0]);
        w1x.A03();
        if (w1x.A0C != null) {
            w1x.A0C = null;
        }
        C18078Vl7 vl7 = w1x.A0D;
        if (vl7 != null) {
            C20971X7b x7b = w1x.A0E;
            if (x7b != null) {
                vl7.A0E = x7b;
                vl7.A0B.EqB(x7b);
            }
            w1x.A0K = false;
            w1x.A0D = null;
        }
    }

    public final void setABRVideoConfig(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8) {
        C16541Uwm uwm;
        W1X w1x = this.impl;
        StringBuilder sb = new StringBuilder();
        sb.append(w1x.A0G);
        sb.append(" encoder setABRVideoConfig:w=");
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
        X7U x7u = w1x.A0B;
        if (x7u != null) {
            int BnR = x7u.BnR();
            if (i % BnR == 0 && i2 % BnR == 0 && w1x.A00 >= 0.0f) {
                VideoEncoderConfig videoEncoderConfig = w1x.A09;
                if (videoEncoderConfig != null) {
                    int i15 = videoEncoderConfig.width;
                    int i16 = videoEncoderConfig.height;
                    C16547Uwu A00 = C18096VlQ.A00(i13);
                    if (i14 == 1) {
                        uwm = C16541Uwm.CBR;
                    } else if (i14 != 2) {
                        uwm = C16541Uwm.DEFAULT;
                    } else {
                        uwm = C16541Uwm.CQ;
                    }
                    w1x.A09 = new VideoEncoderConfig(i15, i16, i11, i12, A00, uwm, f2, z, i7, i8);
                    Pair create = Pair.create(Integer.valueOf(i9), Integer.valueOf(i10));
                    0qQ.A07(create);
                    W1X.A00(create, w1x);
                    C18078Vl7 vl7 = w1x.A0D;
                    if (vl7 != null) {
                        int i17 = i11;
                        vl7.A0B.CI4(new ULY(C18406Vr8.A01.A06, i9, i10, i12, (int) f2, i17, 0), true);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            StringBuilder sb2 = new StringBuilder();
            C13988Tno.A1Q("Invalid size from ABR: w=", ",h=", sb2, i9);
            sb2.append(i10);
            sb2.append(",ar=");
            sb2.append(w1x.A00);
            W3b.A04("mss:AndroidPlatformVideoEncoderImpl", sb2.toString(), new Object[0]);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void setAspectRatio(float f) {
        W1X w1x = this.impl;
        StringBuilder sb = new StringBuilder();
        sb.append(w1x.A0G);
        sb.append(" encoder setAspectRatio: ");
        sb.append(f);
        W3b.A03("mss:AndroidPlatformVideoEncoderImpl", sb.toString(), new Object[0]);
        Integer num = w1x.A0F;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
            W3b.A04("mss:AndroidPlatformVideoEncoderImpl", 002.A0u(w1x.A0G, " encoder setAspectRatio is not supported ", C62985Kpb.A00(num), " once a stream has started "), new Object[0]);
            return;
        }
        float f2 = w1x.A00;
        if (f2 == 0.0f || f != f2) {
            w1x.A00 = f;
            if (num != AnonymousClass05K.A00) {
                VideoEncoderConfig videoEncoderConfig = w1x.A09;
                if (videoEncoderConfig == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (w1x.A0A != null) {
                    int i = videoEncoderConfig.width;
                    int i2 = videoEncoderConfig.height;
                    X7U x7u = w1x.A0B;
                    if (x7u != null) {
                        Pair A00 = V61.A00(f, i, i2, x7u.BnR(), !w1x.A0H);
                        if (w1x.A00 > 0.0f) {
                            float A0M = (float) AnonymousClass7TE.A0M(A00.first);
                            Object obj = A00.second;
                            0qQ.A06(obj);
                            w1x.A00 = A0M / AnonymousClass7TE.A04(obj);
                        }
                        W1X.A00(A00, w1x);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    public final void setBaseVideoConfig(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8) {
        this.impl.A04(i, i2, i3, i4, i5, i6, f, z, i7, i8);
    }

    public final void start() {
        ByteBuffer byteBuffer;
        W1X w1x = this.impl;
        W3b.A03("mss:AndroidPlatformVideoEncoderImpl", 002.A0R(w1x.A0G, " encoder start"), new Object[0]);
        Integer num = w1x.A0F;
        if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0N) {
            MediaCodec mediaCodec = w1x.A06;
            if (mediaCodec != null) {
                0fX.A05(mediaCodec, 1634244797);
            }
            w1x.A0F = AnonymousClass05K.A0C;
            C18078Vl7 vl7 = w1x.A0D;
            if (vl7 != null && (byteBuffer = vl7.A0I) != null) {
                vl7.A0E.D4I(byteBuffer);
                return;
            }
            return;
        }
        0KC.A0C("mss:AndroidPlatformVideoEncoderImpl", 002.A0g(w1x.A0G, " encoder cannot be started when it's ", C62985Kpb.A00(num)));
    }

    public final void stop() {
        this.impl.A03();
    }

    public AndroidPlatformVideoEncoderHybrid(HybridData hybridData) {
        super(hybridData);
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.impl = new W1X(awakeTimeSinceBootClock, this);
    }
}
