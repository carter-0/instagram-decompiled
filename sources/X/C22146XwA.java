package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.XwA  reason: case insensitive filesystem */
public abstract class C22146XwA implements B3W {
    public MediaCodec.BufferInfo A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public final Handler A03;
    public final C343507qK A04;
    public final C343967r6 A05;
    public final A9N A06;
    public final XZ8 A07;
    public volatile Integer A08 = AnonymousClass05K.A00;

    public final /* synthetic */ void AvX(Map map) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r6 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(android.media.MediaCodec r6, int r7) {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A08
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r0 != r1) goto L_0x000d
            android.media.MediaCodec r0 = r5.A01
            if (r0 != r6) goto L_0x000d
            r0 = 1
            if (r6 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r4 = 1
            if (r0 == 0) goto L_0x0035
            boolean r0 = r5 instanceof X.XIK
            if (r0 == 0) goto L_0x001f
            java.nio.ByteBuffer[] r0 = r6.getInputBuffers()
            r0 = r0[r7]
            r0.clear()
            goto L_0x0036
        L_0x001f:
            java.nio.ByteBuffer r0 = r6.getInputBuffer(r7)
            if (r0 != 0) goto L_0x0036
            X.A9N r3 = r5.A06
            r2 = 0
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r7)
            java.lang.String r0 = "encoderInputBuffer : %d was null"
            java.io.IOException r0 = X.C21053XCe.A0V(r0, r2, r1)
            r3.A01(r0)
        L_0x0035:
            return r4
        L_0x0036:
            X.Y1G r2 = new X.Y1G     // Catch:{ Exception -> 0x005d }
            r2.<init>(r6, r0, r7)     // Catch:{ Exception -> 0x005d }
            java.lang.Integer r0 = r5.A08     // Catch:{ all -> 0x0053 }
            if (r0 != r1) goto L_0x004f
            X.XZ8 r0 = r5.A07     // Catch:{ all -> 0x0053 }
            X.7nS r0 = r0.A00     // Catch:{ all -> 0x0053 }
            X.7n0 r0 = r0.A00     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            int r0 = r0.DKo(r2)     // Catch:{ all -> 0x0053 }
            r2.close()     // Catch:{ Exception -> 0x005d }
            return r0
        L_0x004f:
            r2.close()     // Catch:{ Exception -> 0x005d }
            return r4
        L_0x0053:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ Exception -> 0x005d }
        L_0x005c:
            throw r1     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            r1 = move-exception
            X.A9N r0 = r5.A06
            r0.A01(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22146XwA.A01(android.media.MediaCodec, int):int");
    }

    public final void A02(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer outputBuffer;
        if (this.A08 == AnonymousClass05K.A0C && this.A01 == mediaCodec && mediaCodec != null) {
            if (this instanceof XIK) {
                outputBuffer = mediaCodec.getOutputBuffers()[i];
            } else {
                outputBuffer = mediaCodec.getOutputBuffer(i);
            }
            if (outputBuffer != null) {
                try {
                    outputBuffer.position(bufferInfo.offset).limit(bufferInfo.size);
                    this.A06.A00(bufferInfo, outputBuffer);
                } finally {
                    mediaCodec.releaseOutputBuffer(i, false);
                }
            } else {
                this.A06.A01(C21053XCe.A0V("encoderOutputBuffer : %d was null", (Locale) null, AnonymousClass7TF.A1b(i)));
            }
        }
    }

    public final void E3t(Handler handler, C341737nR r4) {
        this.A00 = new MediaCodec.BufferInfo();
        this.A03.post(new Y33(handler, this, r4));
    }

    public final void EwW(Handler handler, C341737nR r4) {
        this.A03.post(new Y34(handler, this, r4));
    }

    public final void Ey7(Handler handler, C341737nR r4) {
        this.A03.post(new Y35(handler, this, r4));
    }

    public C22146XwA(Handler handler, C343507qK r3, C343967r6 r4, XZ8 xz8, A9N a9n) {
        this.A04 = r3;
        this.A06 = a9n;
        this.A03 = handler;
        this.A05 = r4;
        this.A07 = xz8;
    }

    public final MediaFormat BZV() {
        return this.A02;
    }

    public final void CNN(Y1G y1g, int i, long j) {
        if (Looper.myLooper() != this.A03.getLooper()) {
            throw AnonymousClass7TE.A0z("inputData must be invoked on the same thread as the other methods");
        } else if (this.A08 == AnonymousClass05K.A0C) {
            try {
                y1g.A00 = i;
                y1g.A01 = j;
                y1g.A00();
            } catch (Exception e) {
                this.A06.A01(e);
            }
        }
    }

    public final void CNO(byte[] bArr, int i, long j) {
        throw C66580MXl.A11();
    }
}
