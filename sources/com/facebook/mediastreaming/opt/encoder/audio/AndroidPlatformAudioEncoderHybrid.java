package com.facebook.mediastreaming.opt.encoder.audio;

import X.0dV;
import X.0fX;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C16709V2s;
import X.C16791V5y;
import X.C16792V5z;
import X.C18078Vl7;
import X.C18759Vzu;
import X.C19085WKs;
import X.C20971X7b;
import X.C363058j1;
import X.UL4;
import X.W3b;
import X.XBm;
import X.XR2;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.nio.ByteBuffer;

public final class AndroidPlatformAudioEncoderHybrid extends StreamingHybridClassBase {
    public static final C16791V5y Companion = new Object();
    public final C18759Vzu impl = new C18759Vzu(this);

    /* JADX WARNING: Can't wrap try/catch for region: R(6:74|75|(5:77|78|83|84|85)|86|87|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        if (r1.B14() != false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0119, code lost:
        r4.A02 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ef, code lost:
        r1 = X.C16792V5z.A00(r0);
        r4.A04 = r1;
        X.0fX.A05(r1, -1195257477);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fb, code lost:
        X.W3b.A04("mss:AndroidPlatformAudioEncoderImpl", "audio_enc_exception_restart", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0204, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0209, code lost:
        throw X.AnonymousClass7TE.A0y();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01eb */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ef A[Catch:{ Exception -> 0x0189, Exception -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0205 A[SYNTHETIC, Splitter:B:92:0x0205] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drain(java.nio.ByteBuffer r29, int r30, boolean r31, long r32) {
        /*
            r28 = this;
            r5 = 0
            r15 = r29
            X.0qQ.A0B(r15, r5)
            r0 = r28
            X.Vzu r4 = r0.impl
        L_0x000a:
            android.media.MediaCodec$BufferInfo r3 = r4.A03     // Catch:{ Exception -> 0x0189 }
            java.lang.String r12 = "Required value was null."
            if (r3 == 0) goto L_0x017d
            android.media.MediaCodec r2 = r4.A04     // Catch:{ Exception -> 0x0189 }
            if (r2 == 0) goto L_0x0177
            java.nio.ByteBuffer[] r6 = r2.getInputBuffers()     // Catch:{ Exception -> 0x0189 }
            X.0qQ.A07(r6)     // Catch:{ Exception -> 0x0189 }
            java.nio.ByteBuffer[] r16 = r2.getOutputBuffers()     // Catch:{ Exception -> 0x0189 }
            X.0qQ.A07(r16)     // Catch:{ Exception -> 0x0189 }
            r0 = -1
            int r18 = r2.dequeueInputBuffer(r0)     // Catch:{ Exception -> 0x0189 }
            r9 = 0
            if (r18 < 0) goto L_0x0052
            r1 = r6[r18]     // Catch:{ Exception -> 0x0189 }
            r1.clear()     // Catch:{ Exception -> 0x0189 }
            java.nio.ByteBuffer r0 = r15.asReadOnlyBuffer()     // Catch:{ Exception -> 0x0189 }
            r1.put(r0)     // Catch:{ Exception -> 0x0189 }
            int r0 = (r32 > r9 ? 1 : (r32 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            r0 = r32
            goto L_0x0043
        L_0x003f:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0189 }
        L_0x0043:
            r21 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r0
            r20 = r30
            r17 = r2
            r19 = r5
            r23 = r5
            r17.queueInputBuffer(r18, r19, r20, r21, r23)     // Catch:{ Exception -> 0x0189 }
        L_0x0052:
            if (r31 == 0) goto L_0x0057
            r2.signalEndOfInputStream()     // Catch:{ Exception -> 0x0189 }
        L_0x0057:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r8 = r2.dequeueOutputBuffer(r3, r0)     // Catch:{ Exception -> 0x0189 }
            r6 = -1
            if (r8 != r6) goto L_0x0064
            if (r31 != 0) goto L_0x0057
            goto L_0x0119
        L_0x0064:
            r6 = -3
            if (r8 != r6) goto L_0x006c
            java.nio.ByteBuffer[] r16 = r2.getOutputBuffers()     // Catch:{ Exception -> 0x0189 }
            goto L_0x0057
        L_0x006c:
            r6 = -2
            if (r8 != r6) goto L_0x00ad
            android.media.MediaFormat r6 = r2.getOutputFormat()     // Catch:{ Exception -> 0x0189 }
            r4.A05 = r6     // Catch:{ Exception -> 0x0189 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0189 }
            r1.<init>()     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = "Audio format for configured profile("
            r1.append(r0)     // Catch:{ Exception -> 0x0189 }
            com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig r0 = r4.A06     // Catch:{ Exception -> 0x0189 }
            if (r0 == 0) goto L_0x0183
            X.XR2 r0 = r0.profile     // Catch:{ Exception -> 0x0189 }
            int r0 = r0.A00     // Catch:{ Exception -> 0x0189 }
            r1.append(r0)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = "): "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r6, r0, r1)     // Catch:{ Exception -> 0x0189 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0189 }
            java.lang.String r6 = "mss:AndroidPlatformAudioEncoderImpl"
            X.W3b.A03(r6, r1, r0)     // Catch:{ Exception -> 0x0189 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0189 }
            r1.<init>()     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = "Audio format changed "
            r1.append(r0)     // Catch:{ Exception -> 0x0189 }
            android.media.MediaFormat r0 = r4.A05     // Catch:{ Exception -> 0x0189 }
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ Exception -> 0x0189 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0189 }
            X.W3b.A05(r6, r1, r0)     // Catch:{ Exception -> 0x0189 }
            goto L_0x0057
        L_0x00ad:
            r11 = 1
            if (r8 < 0) goto L_0x0123
            int r7 = r3.offset     // Catch:{ Exception -> 0x0189 }
            if (r7 < 0) goto L_0x0120
            int r6 = r3.size     // Catch:{ Exception -> 0x0189 }
            if (r6 < 0) goto L_0x0120
            r14 = r16[r8]     // Catch:{ Exception -> 0x0189 }
            if (r14 == 0) goto L_0x012e
            int r6 = r3.flags     // Catch:{ Exception -> 0x0189 }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x00c4
            r3.presentationTimeUs = r9     // Catch:{ Exception -> 0x0189 }
        L_0x00c4:
            java.nio.Buffer r13 = r14.position(r7)     // Catch:{ Exception -> 0x0189 }
            int r7 = r3.offset     // Catch:{ Exception -> 0x0189 }
            int r6 = r3.size     // Catch:{ Exception -> 0x0189 }
            int r7 = r7 + r6
            r13.limit(r7)     // Catch:{ Exception -> 0x0189 }
            long r6 = r3.presentationTimeUs     // Catch:{ Exception -> 0x0189 }
            long r6 = r6 / r0
            com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig r0 = r4.A06     // Catch:{ Exception -> 0x0189 }
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.useAudioASC     // Catch:{ Exception -> 0x0189 }
            if (r0 != r11) goto L_0x011d
            android.media.MediaFormat r0 = r4.A05     // Catch:{ Exception -> 0x0189 }
            java.nio.ByteBuffer r27 = X.C18759Vzu.A00(r0, r4)     // Catch:{ Exception -> 0x0189 }
        L_0x00e1:
            X.Vl7 r0 = r4.A07     // Catch:{ Exception -> 0x0189 }
            if (r0 == 0) goto L_0x00f3
            X.XBm r1 = r0.A0B     // Catch:{ Exception -> 0x0189 }
            boolean r0 = r1.Cea()     // Catch:{ Exception -> 0x0189 }
            if (r0 != r11) goto L_0x00f3
            boolean r0 = r1.B14()     // Catch:{ Exception -> 0x0189 }
            if (r0 != 0) goto L_0x0110
        L_0x00f3:
            com.facebook.mediastreaming.opt.encoder.audio.AndroidPlatformAudioEncoderHybrid r11 = r4.A0B     // Catch:{ Exception -> 0x0189 }
            int r19 = r14.position()     // Catch:{ Exception -> 0x0189 }
            int r20 = r14.remaining()     // Catch:{ Exception -> 0x0189 }
            int r1 = r3.flags     // Catch:{ Exception -> 0x0189 }
            android.media.MediaFormat r0 = r4.A05     // Catch:{ Exception -> 0x0189 }
            r21 = r6
            r23 = r6
            r25 = r1
            r26 = r0
            r17 = r11
            r18 = r14
            r17.onEncoded(r18, r19, r20, r21, r23, r25, r26, r27)     // Catch:{ Exception -> 0x0189 }
        L_0x0110:
            r2.releaseOutputBuffer(r8, r5)     // Catch:{ Exception -> 0x0189 }
            int r0 = r3.flags     // Catch:{ Exception -> 0x0189 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0057
        L_0x0119:
            r4.A02 = r5     // Catch:{ Exception -> 0x0189 }
            goto L_0x0204
        L_0x011d:
            r27 = 0
            goto L_0x00e1
        L_0x0120:
            r2.releaseOutputBuffer(r8, r5)     // Catch:{ Exception -> 0x0189 }
        L_0x0123:
            int r0 = r4.A00     // Catch:{ Exception -> 0x0189 }
            int r6 = r0 + 1
            r4.A00 = r6     // Catch:{ Exception -> 0x0189 }
            r0 = 100
            if (r6 <= r0) goto L_0x0057
            goto L_0x0140
        L_0x012e:
            r0 = 708(0x2c4, float:9.92E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r1 = " was null"
            java.lang.String r0 = X.002.A0c(r0, r1, r8)     // Catch:{ Exception -> 0x0189 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0189 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0189 }
            goto L_0x0188
        L_0x0140:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0189 }
            r2.<init>()     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = "Audio encoder bad parameters ret="
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            r2.append(r8)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = " offs="
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            int r0 = r3.offset     // Catch:{ Exception -> 0x0189 }
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = " sz="
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            int r0 = r3.size     // Catch:{ Exception -> 0x0189 }
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = " pts="
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            long r0 = r3.presentationTimeUs     // Catch:{ Exception -> 0x0189 }
            r2.append(r0)     // Catch:{ Exception -> 0x0189 }
            java.lang.String r0 = " cnt="
            java.lang.String r0 = X.Pxg.A0t(r0, r2, r6)     // Catch:{ Exception -> 0x0189 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0189 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0189 }
            goto L_0x0188
        L_0x0177:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0189 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x0189 }
            goto L_0x0188
        L_0x017d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0189 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x0189 }
            goto L_0x0188
        L_0x0183:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0189 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x0189 }
        L_0x0188:
            throw r1     // Catch:{ Exception -> 0x0189 }
        L_0x0189:
            r3 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r2 = "mss:AndroidPlatformAudioEncoderImpl"
            java.lang.String r0 = "handleAudioException/original"
            X.W3b.A04(r2, r0, r1)
            boolean r0 = r3 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x01b7
            r0 = r3
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            boolean r0 = r0.isTransient()
            if (r0 == 0) goto L_0x01b7
            int r1 = r4.A02
            r0 = 100
            if (r1 > r0) goto L_0x0214
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "audio_enc_exception_transient"
            X.W3b.A04(r2, r0, r1)
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
            goto L_0x000a
        L_0x01b7:
            int r0 = r4.A01
            int r1 = r0 + 1
            r4.A01 = r1
            java.lang.String r0 = "audio_enc_exception_restart_count="
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.W3b.A04(r2, r1, r0)
            int r1 = r4.A01
            r0 = 5
            if (r1 > r0) goto L_0x0214
            android.media.MediaCodec r6 = r4.A04     // Catch:{ Exception -> 0x020a }
            if (r6 == 0) goto L_0x01eb
            r6.flush()     // Catch:{ Exception -> 0x01d5 }
            goto L_0x01df
        L_0x01d5:
            r0 = move-exception
            java.lang.String r1 = "restartAudioEncoderOnError/flush"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x020a }
            X.W3b.A04(r2, r1, r0)     // Catch:{ Exception -> 0x020a }
        L_0x01df:
            r0 = 89656251(0x5580bbb, float:1.0158426E-35)
            X.0fX.A06(r6, r0)     // Catch:{ Exception -> 0x01eb }
            r0 = -149246662(0xfffffffff71aad3a, float:-3.1372155E33)
            X.0fX.A03(r6, r0)     // Catch:{ Exception -> 0x01eb }
        L_0x01eb:
            com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig r0 = r4.A06     // Catch:{ Exception -> 0x020a }
            if (r0 == 0) goto L_0x0205
            android.media.MediaCodec r1 = X.C16792V5z.A00(r0)     // Catch:{ Exception -> 0x020a }
            r4.A04 = r1     // Catch:{ Exception -> 0x020a }
            r0 = -1195257477(0xffffffffb8c1d17b, float:-9.241976E-5)
            X.0fX.A05(r1, r0)     // Catch:{ Exception -> 0x020a }
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "audio_enc_exception_restart"
            X.W3b.A04(r2, r0, r1)
            goto L_0x000a
        L_0x0204:
            return
        L_0x0205:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x020a }
            throw r0     // Catch:{ Exception -> 0x020a }
        L_0x020a:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "restartAudioEncoderOnError"
            X.W3b.A04(r2, r0, r1)
        L_0x0214:
            com.facebook.mediastreaming.opt.encoder.audio.AndroidPlatformAudioEncoderHybrid r2 = r4.A0B
            X.Uxl r1 = X.C16591Uxl.AudioEncoderError
            java.lang.String r0 = "Failed to drain audio encoder"
            r2.fireError(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.audio.AndroidPlatformAudioEncoderHybrid.drain(java.nio.ByteBuffer, int, boolean, long):void");
    }

    public native void onEncoded(ByteBuffer byteBuffer, int i, int i2, long j, long j2, int i3, MediaFormat mediaFormat, ByteBuffer byteBuffer2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V5y] */
    static {
        0dV.A0C("mediastreaming");
    }

    public final void prepare(int i, int i2, int i3, int i4, boolean z) {
        XR2 xr2;
        String str;
        Integer num;
        C18759Vzu vzu = this.impl;
        if (i4 == 5) {
            xr2 = XR2.HE;
        } else {
            xr2 = XR2.LC;
        }
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = z;
        vzu.A06 = new AudioEncoderConfig(i5, i6, i7, xr2, z2);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioEncoderConfig: sampleRate:");
        sb.append(i5);
        sb.append(", bitRate:");
        sb.append(i6);
        sb.append(", channels:");
        sb.append(i7);
        sb.append(", profile:");
        sb.append(xr2);
        sb.append(", useASC:");
        sb.append(z2);
        W3b.A03("mss:AndroidPlatformAudioEncoderImpl", sb.toString(), new Object[0]);
        vzu.A05 = null;
        vzu.A00 = 0;
        vzu.A02 = 0;
        vzu.A01 = 0;
        C18078Vl7 vl7 = C16709V2s.A00;
        if (vl7 != null && vl7.A0K) {
            vzu.A08 = vl7.A0C;
            C20971X7b x7b = (C20971X7b) vzu.A0C.getValue();
            0qQ.A0B(x7b, 0);
            vl7.A0D = x7b;
            vl7.A0C = x7b;
            XBm xBm = vl7.A0B;
            xBm.EPA(new C19085WKs(vl7, x7b));
            if (xr2.ordinal() != 0) {
                str = "AAC_HE";
            } else {
                str = "AAC_LC";
            }
            if (str.equals("AAC_LC")) {
                num = AnonymousClass05K.A00;
            } else if (str.equals("AAC_HE")) {
                num = AnonymousClass05K.A01;
            } else {
                C363058j1.A02.A04("sup:LiveMediaStreamController", "handleAudioConfigUpdate invalid AudioCodecProfile", (Throwable) null);
                vzu.A07 = vl7;
            }
            xBm.CID(new UL4(AnonymousClass05K.A00, num, i5, i6, i7));
            vzu.A07 = vl7;
        }
    }

    public final void release() {
        C18759Vzu vzu = this.impl;
        W3b.A03("mss:AndroidPlatformAudioEncoderImpl", "AndroidPlatformAudioEncoderImpl.release", new Object[0]);
        vzu.A02();
        C18078Vl7 vl7 = vzu.A07;
        if (vl7 != null) {
            C20971X7b x7b = vzu.A08;
            if (x7b != null) {
                vl7.A0D = x7b;
                vl7.A0C = x7b;
                vl7.A0B.EPA(new C19085WKs(vl7, x7b));
            }
            vzu.A09 = false;
            vzu.A07 = null;
        }
    }

    public final void start() {
        ByteBuffer byteBuffer;
        C18759Vzu vzu = this.impl;
        W3b.A03("mss:AndroidPlatformAudioEncoderImpl", "AndroidPlatformAudioEncoderImpl.start", new Object[0]);
        vzu.A03 = new MediaCodec.BufferInfo();
        AudioEncoderConfig audioEncoderConfig = vzu.A06;
        if (audioEncoderConfig != null) {
            MediaCodec A00 = C16792V5z.A00(audioEncoderConfig);
            vzu.A04 = A00;
            0fX.A05(A00, 300646517);
            C18078Vl7 vl7 = vzu.A07;
            if (vl7 != null && (byteBuffer = vl7.A0H) != null) {
                vl7.A0C.D4I(byteBuffer);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void stop() {
        this.impl.A02();
    }

    public AndroidPlatformAudioEncoderHybrid(HybridData hybridData) {
        super(hybridData);
    }
}
