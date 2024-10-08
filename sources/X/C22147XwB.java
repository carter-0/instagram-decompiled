package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.XwB  reason: case insensitive filesystem */
public final class C22147XwB implements B3W {
    public MediaCodec.BufferInfo A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public final Handler A03;
    public final C341467mw A04;
    public final C343507qK A05;
    public final C343967r6 A06;
    public final XZ8 A07;
    public final A9N A08;
    public final Runnable A09 = new C22373Y1b(this);
    public final boolean A0A;
    public volatile Integer A0B;

    /* JADX WARNING: CFG modification limit reached, blocks count: 160 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r12 == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r1 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r4 >= r11.A05.A06) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r6 != -2) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r3.A01("pcoAEgof");
        r11.A02 = r11.A01.getOutputFormat();
        r3.A01("pcoAEgofs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r6 >= 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        if ((r1.flags & 2) == 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r11.A0A == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        r8 = r9[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r8 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r3.A01("pcoAEe2");
        r3 = r11.A08;
        r0 = X.C21053XCe.A0V("encoderOutputBuffer : %d was null", (java.util.Locale) null, new java.lang.Object[]{java.lang.Integer.valueOf(r6)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        r8.position(r1.offset).limit(r11.A00.size);
        r11.A08.A00(r11.A00, r8);
        r3.A01("pcoAErob1");
        r11.A01.releaseOutputBuffer(r6, false);
        r3.A01("pcoAErob1s");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        if ((r11.A00.flags & 4) == 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r3.A01("pcoAEeos2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r3.A01("pcoAErob");
        r11.A01.releaseOutputBuffer(r6, false);
        r3.A01("pcoAErobs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r3.A01("pcoAEe1");
        r3 = r11.A08;
        r0 = X.C21053XCe.A0V(X.Pxd.A00(283), (java.util.Locale) null, new java.lang.Object[]{java.lang.Integer.valueOf(r6)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fe, code lost:
        r3.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0112, code lost:
        if (r10 == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        r3.A01("pcoAEe4");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        throw X.AnonymousClass7TE.A0z("Codec not in End-Of-Stream stage when stopping");
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C22147XwB r11, boolean r12) {
        /*
            r10 = 1
            r2 = 0
            X.7mw r3 = r11.A04     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "pcoAEgob"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec r0 = r11.A01     // Catch:{ Exception -> 0x0102 }
            java.nio.ByteBuffer[] r9 = r0.getOutputBuffers()     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "pcoAEgobs"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            if (r12 == 0) goto L_0x001b
            X.7qK r0 = r11.A05     // Catch:{ Exception -> 0x0102 }
            int r5 = r0.A05     // Catch:{ Exception -> 0x0102 }
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            r4 = 0
            goto L_0x002e
        L_0x001e:
            java.lang.String r0 = "pcoAEgob1"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec r0 = r11.A01     // Catch:{ Exception -> 0x0102 }
            java.nio.ByteBuffer[] r9 = r0.getOutputBuffers()     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "pcoAEgob1s"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
        L_0x002e:
            java.lang.String r0 = "pcoAEdqb"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec r7 = r11.A01     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec$BufferInfo r6 = r11.A00     // Catch:{ Exception -> 0x0102 }
            long r0 = (long) r5     // Catch:{ Exception -> 0x0102 }
            int r6 = r7.dequeueOutputBuffer(r6, r0)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "pcoAEdqbs"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec$BufferInfo r1 = r11.A00     // Catch:{ Exception -> 0x0102 }
            int r0 = r1.size     // Catch:{ Exception -> 0x0102 }
            if (r0 > 0) goto L_0x004f
            int r0 = r1.flags     // Catch:{ Exception -> 0x0102 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x004f
            goto L_0x00d2
        L_0x004f:
            r0 = -1
            if (r6 != r0) goto L_0x005e
            if (r12 == 0) goto L_0x0114
            int r1 = r4 + 1
            X.7qK r0 = r11.A05     // Catch:{ Exception -> 0x0102 }
            int r0 = r0.A06     // Catch:{ Exception -> 0x0102 }
            if (r4 >= r0) goto L_0x0115
            r4 = r1
            goto L_0x002e
        L_0x005e:
            r0 = -3
            if (r6 != r0) goto L_0x0062
            goto L_0x001e
        L_0x0062:
            r0 = -2
            if (r6 != r0) goto L_0x0078
            java.lang.String r0 = "pcoAEgof"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec r0 = r11.A01     // Catch:{ Exception -> 0x0102 }
            android.media.MediaFormat r0 = r0.getOutputFormat()     // Catch:{ Exception -> 0x0102 }
            r11.A02 = r0     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "pcoAEgofs"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            goto L_0x002e
        L_0x0078:
            r7 = 0
            if (r6 >= 0) goto L_0x007c
            goto L_0x00e5
        L_0x007c:
            int r0 = r1.flags     // Catch:{ Exception -> 0x0102 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0087
            boolean r0 = r11.A0A     // Catch:{ Exception -> 0x0102 }
            if (r0 == 0) goto L_0x0087
            goto L_0x002e
        L_0x0087:
            r8 = r9[r6]     // Catch:{ Exception -> 0x0102 }
            if (r8 != 0) goto L_0x00a1
            java.lang.String r0 = "pcoAEe2"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            X.A9N r3 = r11.A08     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = "encoderOutputBuffer : %d was null"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0102 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x0102 }
            java.io.IOException r0 = X.C21053XCe.A0V(r1, r7, r0)     // Catch:{ Exception -> 0x0102 }
            goto L_0x00fe
        L_0x00a1:
            int r0 = r1.offset     // Catch:{ Exception -> 0x0102 }
            java.nio.Buffer r1 = r8.position(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec$BufferInfo r0 = r11.A00     // Catch:{ Exception -> 0x0102 }
            int r0 = r0.size     // Catch:{ Exception -> 0x0102 }
            r1.limit(r0)     // Catch:{ Exception -> 0x0102 }
            X.A9N r1 = r11.A08     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec$BufferInfo r0 = r11.A00     // Catch:{ Exception -> 0x0102 }
            r1.A00(r0, r8)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "pcoAErob1"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec r0 = r11.A01     // Catch:{ Exception -> 0x0102 }
            r0.releaseOutputBuffer(r6, r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "pcoAErob1s"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec$BufferInfo r0 = r11.A00     // Catch:{ Exception -> 0x0102 }
            int r0 = r0.flags     // Catch:{ Exception -> 0x0102 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "pcoAEeos2"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0110
        L_0x00d2:
            java.lang.String r0 = "pcoAErob"
            r3.A01(r0)     // Catch:{ Exception -> 0x00e2 }
            android.media.MediaCodec r0 = r11.A01     // Catch:{ Exception -> 0x00e2 }
            r0.releaseOutputBuffer(r6, r2)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r0 = "pcoAErobs"
            r3.A01(r0)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x0110
        L_0x00e2:
            r1 = move-exception
            r2 = 1
            goto L_0x0103
        L_0x00e5:
            java.lang.String r0 = "pcoAEe1"
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            X.A9N r3 = r11.A08     // Catch:{ Exception -> 0x0102 }
            r0 = 283(0x11b, float:3.97E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x0102 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0102 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ Exception -> 0x0102 }
            java.io.IOException r0 = X.C21053XCe.A0V(r0, r7, r1)     // Catch:{ Exception -> 0x0102 }
        L_0x00fe:
            r3.A01(r0)     // Catch:{ Exception -> 0x0102 }
            return
        L_0x0102:
            r1 = move-exception
        L_0x0103:
            X.7mw r3 = r11.A04
            java.lang.String r0 = "pcoAEe3"
            r3.A01(r0)
            X.A9N r0 = r11.A08
            r0.A01(r1)
            r10 = r2
        L_0x0110:
            if (r12 == 0) goto L_0x0114
            if (r10 == 0) goto L_0x0115
        L_0x0114:
            return
        L_0x0115:
            java.lang.String r0 = "pcoAEe4"
            r3.A01(r0)
            java.lang.String r0 = "Codec not in End-Of-Stream stage when stopping"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22147XwB.A00(X.XwB, boolean):void");
    }

    public final void CNO(byte[] bArr, int i, long j) {
        C341467mw r4;
        int i2 = i;
        if (Looper.myLooper() != this.A03.getLooper()) {
            this.A04.A01("idAEe1");
            throw AnonymousClass7TE.A0z("inputData must be invoked on the same thread as the other methods");
        } else if (this.A0B == AnonymousClass05K.A0C) {
            try {
                r4 = this.A04;
                r4.A01("idAE");
                e = null;
                if (i < 0) {
                    e = C21053XCe.A0V("Failure to read input data, bytesRead=%d", (Locale) null, new Object[]{Integer.valueOf(i)});
                    i2 = 0;
                }
                ByteBuffer[] inputBuffers = this.A01.getInputBuffers();
                r4.A01("idAEdqb");
                int dequeueInputBuffer = this.A01.dequeueInputBuffer((long) this.A05.A04);
                r4.A01("idAEdqbs");
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                    byteBuffer.clear();
                    byteBuffer.put(bArr, 0, i2);
                    r4.A01("idAEqb");
                    this.A01.queueInputBuffer(dequeueInputBuffer, 0, i2, j, 0);
                    r4.A01("idAEqbs");
                }
                A00(this, false);
                r4.A01("idAEs");
                if (e == null) {
                    return;
                }
            } catch (Exception e) {
                e = e;
                r4 = this.A04;
                r4.A01("idAEs");
            } catch (Throwable th) {
                this.A04.A01("idAEs");
                throw th;
            }
            r4.A01("idAEe2");
            this.A08.A01(e);
        }
    }

    public final void AvX(Map map) {
        String A002 = this.A04.A00();
        if (A002 != null) {
            map.put("recording_audio_encoder_calls", A002);
        }
    }

    public final void E3t(Handler handler, C341737nR r4) {
        this.A04.A01("pAE");
        this.A00 = new MediaCodec.BufferInfo();
        this.A03.post(new Y36(handler, this, r4));
    }

    public final void EwW(Handler handler, C341737nR r4) {
        this.A04.A01("stAE");
        this.A03.post(new Y37(handler, this, r4));
    }

    public final void Ey7(Handler handler, C341737nR r4) {
        this.A04.A01("sAE");
        this.A03.post(new Y38(handler, this, r4));
    }

    public C22147XwB(Handler handler, C343507qK r4, C343967r6 r5, XZ8 xz8, A9N a9n, boolean z) {
        C341467mw r1 = new C341467mw();
        this.A04 = r1;
        this.A05 = r4;
        this.A08 = a9n;
        this.A03 = handler;
        this.A06 = r5;
        this.A0B = AnonymousClass05K.A00;
        this.A07 = xz8;
        this.A0A = z;
        r1.A01("c");
    }

    public final MediaFormat BZV() {
        return this.A02;
    }

    public final void CNN(Y1G y1g, int i, long j) {
        if (Looper.myLooper() != this.A03.getLooper()) {
            this.A04.A01("idAEe1");
            throw AnonymousClass7TE.A0z("inputData must be invoked on the same thread as the other methods");
        } else if (this.A0B == AnonymousClass05K.A0C) {
            try {
                y1g.A00 = i;
                y1g.A01 = j;
                y1g.A00();
                A00(this, false);
            } catch (Exception e) {
                this.A04.A01("idAEe2");
                this.A08.A01(e);
            }
        }
    }
}
