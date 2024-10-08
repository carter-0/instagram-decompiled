package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Wgx  reason: case insensitive filesystem */
public abstract class C19870Wgx implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    public int A00;
    public int A01;
    public MediaCodec A02;
    public Surface A03;
    public Surface A04;
    public C18491Vsm A05;
    public V4X A06;
    public C18577VuT A07;
    public ByteBuffer A08;
    public boolean A09;
    public double A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final MediaFormat A0M;
    public final Handler A0N;
    public final C18729Vz4 A0O;
    public final ArrayList A0P = new ArrayList();
    public final ArrayList A0Q = new ArrayList();
    public final ArrayList A0R = new ArrayList();
    public final boolean A0S;
    public final boolean A0T;
    public final Rect A0U;
    public final Rect A0V;
    public final HandlerThread A0W;
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public final float[] A0Y = new float[16];

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            V4X v4x = this.A06;
            if (v4x != null) {
                v4x.A00();
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.A0Y);
                long timestamp = surfaceTexture.getTimestamp();
                C18577VuT vuT = this.A07;
                int i = this.A00;
                int i2 = this.A0K;
                if (vuT.A01(timestamp, ((((long) ((i + i2) - 1)) * 1000000) / ((long) i2)) + 132)) {
                    A00(this);
                }
                surfaceTexture.releaseTexImage();
                this.A06.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        if (r3 > r5.A0C) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19870Wgx(android.os.Handler r18, X.C18729Vz4 r19, int r20, int r21, int r22, boolean r23) {
        /*
            r17 = this;
            r11 = r20
            r12 = r23
            r7 = 2
            r5 = r17
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A0Q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A0R = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A0P = r0
            r0 = 16
            float[] r0 = new float[r0]
            r5.A0Y = r0
            r4 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            r5.A0X = r0
            if (r20 < 0) goto L_0x01f5
            r3 = r21
            if (r21 < 0) goto L_0x01f5
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r9 = 512(0x200, float:7.175E-43)
            r5.A0D = r9
            r5.A0C = r9
            r2 = 32
            r5.A0B = r2
            r5.A0A = r0
            java.lang.String r14 = "video/hevc"
            r0 = 226(0xe2, float:3.17E-43)
            java.lang.String r6 = X.Pxd.A00(r0)
            r1 = 0
            r2 = 1
            android.media.MediaCodec r0 = android.media.MediaCodec.createEncoderByType(r6)     // Catch:{ Exception -> 0x0071 }
            r5.A02 = r0     // Catch:{ Exception -> 0x0071 }
            android.media.MediaCodecInfo r0 = r0.getCodecInfo()     // Catch:{ Exception -> 0x0071 }
            android.media.MediaCodecInfo$CodecCapabilities r16 = r0.getCapabilitiesForType(r6)     // Catch:{ Exception -> 0x0071 }
            android.media.MediaCodecInfo$VideoCapabilities r0 = r16.getVideoCapabilities()     // Catch:{ Exception -> 0x0071 }
            boolean r0 = r0.isSizeSupported(r11, r3)     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0064
            goto L_0x00d1
        L_0x0064:
            android.media.MediaCodec r0 = r5.A02     // Catch:{ Exception -> 0x0071 }
            r0.release()     // Catch:{ Exception -> 0x0071 }
            r5.A02 = r1     // Catch:{ Exception -> 0x0071 }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0071 }
            r0.<init>()     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            android.media.MediaCodecList r0 = X.U86.A00
            android.media.MediaCodecInfo[] r13 = r0.getCodecInfos()
            int r10 = r13.length
            r16 = 0
            r8 = 0
        L_0x007b:
            if (r8 >= r10) goto L_0x00a1
            r1 = r13[r8]
            boolean r0 = r1.isEncoder()
            if (r0 == 0) goto L_0x00ce
            android.media.MediaCodecInfo$CodecCapabilities r15 = r1.getCapabilitiesForType(r14)     // Catch:{ IllegalArgumentException -> 0x00ce }
            android.media.MediaCodecInfo$VideoCapabilities r0 = r15.getVideoCapabilities()
            boolean r0 = r0.isSizeSupported(r9, r9)
            if (r0 == 0) goto L_0x00ce
            android.media.MediaCodecInfo$EncoderCapabilities r0 = r15.getEncoderCapabilities()
            boolean r0 = r0.isBitrateModeSupported(r4)
            if (r0 == 0) goto L_0x00c8
            java.lang.String r16 = r1.getName()
        L_0x00a1:
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r16)
            r5.A02 = r0
            android.media.MediaCodecInfo r0 = r0.getCodecInfo()
            android.media.MediaCodecInfo$CodecCapabilities r16 = r0.getCapabilitiesForType(r14)
            int r0 = r5.A0D
            if (r11 > r0) goto L_0x00b8
            int r1 = r5.A0C
            r0 = 0
            if (r3 <= r1) goto L_0x00b9
        L_0x00b8:
            r0 = 1
        L_0x00b9:
            r12 = r23 & r0
            android.media.MediaCodecInfo$VideoCapabilities r0 = r16.getVideoCapabilities()
            boolean r0 = r0.isSizeSupported(r11, r3)
            r0 = r0 ^ 1
            r12 = r12 | r0
            r15 = 0
            goto L_0x00d2
        L_0x00c8:
            if (r16 != 0) goto L_0x00ce
            java.lang.String r16 = r1.getName()
        L_0x00ce:
            int r8 = r8 + 1
            goto L_0x007b
        L_0x00d1:
            r15 = 1
        L_0x00d2:
            r5.A0J = r7
            r0 = r19
            r5.A0O = r0
            if (r18 == 0) goto L_0x00e0
            android.os.Looper r1 = r18.getLooper()
            if (r1 != 0) goto L_0x00f1
        L_0x00e0:
            r8 = -2
            java.lang.String r1 = "HeifEncoderThread"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1, r8)
            r5.A0W = r0
            r0.start()
            android.os.Looper r1 = r0.getLooper()
        L_0x00f1:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r5.A0N = r0
            r9 = 2130708361(0x7f000789, float:1.701803E38)
            r8 = 1
            r5.A0S = r2
            r5.A0L = r11
            r5.A0I = r3
            r5.A0T = r12
            if (r12 == 0) goto L_0x01ea
            int r1 = r5.A0D
            int r13 = r5.A0C
            int r0 = r21 + r13
            int r2 = r0 + -1
            int r2 = r2 / r13
            int r0 = r20 + r1
            int r10 = r0 + -1
            int r10 = r10 / r1
        L_0x0114:
            if (r15 == 0) goto L_0x01e4
            android.media.MediaFormat r6 = android.media.MediaFormat.createVideoFormat(r6, r11, r3)
        L_0x011a:
            if (r12 == 0) goto L_0x0130
            java.lang.String r0 = "tile-width"
            r6.setInteger(r0, r1)
            java.lang.String r0 = "tile-height"
            r6.setInteger(r0, r13)
            java.lang.String r0 = "grid-cols"
            r6.setInteger(r0, r10)
            java.lang.String r0 = "grid-rows"
            r6.setInteger(r0, r2)
        L_0x0130:
            if (r15 == 0) goto L_0x01dc
            r5.A0H = r11
            r5.A0F = r3
            r10 = 1
            r5.A0G = r8
            r2 = 1
        L_0x013a:
            r5.A0E = r10
            int r2 = r2 * r10
            r5.A0K = r2
            java.lang.String r0 = "i-frame-interval"
            r6.setInteger(r0, r4)
            java.lang.String r0 = "color-format"
            r6.setInteger(r0, r9)
            java.lang.String r0 = "frame-rate"
            r6.setInteger(r0, r2)
            java.lang.String r1 = "operating-rate"
            r0 = 30
            if (r2 <= r8) goto L_0x0156
            r0 = 120(0x78, float:1.68E-43)
        L_0x0156:
            r6.setInteger(r1, r0)
            android.media.MediaCodecInfo$EncoderCapabilities r12 = r16.getEncoderCapabilities()
            boolean r0 = r12.isBitrateModeSupported(r4)
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r2 = "bitrate-mode"
            r8 = r22
            if (r0 == 0) goto L_0x01aa
            android.util.Range r7 = r12.getQualityRange()
            r6.setInteger(r2, r4)
            java.lang.Comparable r0 = r7.getLower()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            double r2 = (double) r0
            int r1 = X.Pxg.A03(r7)
            java.lang.Comparable r0 = r7.getLower()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r1 - r0
            int r1 = r1 * r22
            double r0 = (double) r1
            double r0 = r0 / r9
            double r2 = r2 + r0
            int r1 = (int) r2
            r0 = 260(0x104, float:3.64E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
        L_0x0192:
            r6.setInteger(r0, r1)
            r5.A0M = r6
            int r2 = r5.A0H
            int r1 = r5.A0F
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r4, r2, r1)
            r5.A0U = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.A0V = r0
            return
        L_0x01aa:
            r1 = 2
            boolean r0 = r12.isBitrateModeSupported(r7)
            if (r0 != 0) goto L_0x01b2
            r1 = 1
        L_0x01b2:
            r6.setInteger(r2, r1)
            android.media.MediaCodecInfo$VideoCapabilities r0 = r16.getVideoCapabilities()
            android.util.Range r7 = r0.getBitrateRange()
            int r11 = r20 * r21
            double r2 = (double) r11
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r2 = r2 * r0
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r2 = r2 * r0
            double r0 = r5.A0A
            double r2 = r2 * r0
            double r0 = (double) r8
            double r2 = r2 * r0
            double r2 = r2 / r9
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Comparable r0 = r7.clamp(r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.String r0 = "bitrate"
            goto L_0x0192
        L_0x01dc:
            r5.A0H = r1
            r5.A0F = r13
            r5.A0G = r2
            goto L_0x013a
        L_0x01e4:
            android.media.MediaFormat r6 = android.media.MediaFormat.createVideoFormat(r14, r1, r13)
            goto L_0x011a
        L_0x01ea:
            int r1 = r5.A0B
            int r0 = r20 + r1
            int r0 = r0 - r2
            int r0 = r0 / r1
            int r1 = r1 * r0
            r13 = r3
            r10 = 1
            goto L_0x0114
        L_0x01f5:
            java.lang.String r1 = "invalid encoder inputs"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19870Wgx.<init>(android.os.Handler, X.Vz4, int, int, int, boolean):void");
    }

    public static void A00(C19870Wgx wgx) {
        C19870Wgx wgx2 = wgx;
        int i = wgx2.A0H;
        int i2 = wgx2.A0F;
        GLES20.glViewport(0, 0, i, i2);
        for (int i3 = 0; i3 < wgx2.A0G; i3++) {
            int i4 = 0;
            while (i4 < wgx2.A0E) {
                int i5 = i4 * i;
                int i6 = i3 * i2;
                Rect rect = wgx2.A0V;
                rect.set(i5, i6, i + i5, i2 + i6);
                try {
                    C18491Vsm vsm = wgx2.A05;
                    int i7 = wgx2.A01;
                    float[] fArr = C18498Vst.A07;
                    float[] fArr2 = vsm.A04;
                    float f = (float) rect.left;
                    float f2 = (float) vsm.A02;
                    float f3 = f / f2;
                    fArr2[0] = f3;
                    float f4 = (float) vsm.A01;
                    float f5 = 1.0f - (((float) rect.bottom) / f4);
                    fArr2[1] = f5;
                    float f6 = ((float) rect.right) / f2;
                    fArr2[2] = f6;
                    fArr2[3] = f5;
                    fArr2[4] = f3;
                    float f7 = 1.0f - (((float) rect.top) / f4);
                    fArr2[5] = f7;
                    fArr2[6] = f6;
                    fArr2[7] = f7;
                    FloatBuffer floatBuffer = vsm.A03;
                    floatBuffer.put(fArr2);
                    floatBuffer.position(0);
                    C18498Vst vst = vsm.A00;
                    float[] fArr3 = C18498Vst.A06;
                    FloatBuffer floatBuffer2 = C18491Vsm.A05;
                    C18498Vst.A00("draw start");
                    GLES20.glUseProgram(vst.A00);
                    C18498Vst.A00("glUseProgram");
                    GLES20.glActiveTexture(33984);
                    int i8 = vst.A01;
                    GLES20.glBindTexture(i8, i7);
                    GLES20.glUniformMatrix4fv(vst.A04, 1, false, fArr3, 0);
                    C18498Vst.A00("glUniformMatrix4fv");
                    GLES20.glUniformMatrix4fv(vst.A05, 1, false, fArr, 0);
                    C18498Vst.A00("glUniformMatrix4fv");
                    int i9 = vst.A02;
                    GLES20.glEnableVertexAttribArray(i9);
                    C18498Vst.A00("glEnableVertexAttribArray");
                    GLES20.glVertexAttribPointer(i9, 2, 5126, false, 8, floatBuffer2);
                    C18498Vst.A00("glVertexAttribPointer");
                    int i10 = vst.A03;
                    GLES20.glEnableVertexAttribArray(i10);
                    C18498Vst.A00("glEnableVertexAttribArray");
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, floatBuffer);
                    C18498Vst.A00("glVertexAttribPointer");
                    GLES20.glDrawArrays(5, 0, 4);
                    C18498Vst.A00("glDrawArrays");
                    GLES20.glDisableVertexAttribArray(i9);
                    GLES20.glDisableVertexAttribArray(i10);
                    GLES20.glBindTexture(i8, 0);
                    GLES20.glUseProgram(0);
                    V4X v4x = wgx2.A06;
                    int i11 = wgx2.A00;
                    wgx2.A00 = i11 + 1;
                    EGLExt.eglPresentationTimeANDROID(v4x.A01, v4x.A02, (((((long) i11) * 1000000) / ((long) wgx2.A0K)) + 132) * 1000);
                    V4X v4x2 = wgx2.A06;
                    EGL14.eglSwapBuffers(v4x2.A01, v4x2.A02);
                    i4++;
                } catch (RuntimeException e) {
                    if (!wgx2.A0X.get()) {
                        throw e;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r12.remaining() != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019e, code lost:
        throw new java.lang.IllegalArgumentException("src or dst are not aligned!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r23 = this;
        L_0x0000:
            r2 = r23
            boolean r0 = r2.A09
            r22 = 0
            if (r0 != 0) goto L_0x0022
            java.nio.ByteBuffer r0 = r2.A08
            if (r0 != 0) goto L_0x0022
            java.util.ArrayList r1 = r2.A0R
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0018
            r0 = r22
            goto L_0x001f
        L_0x0018:
            r0 = 0
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0194 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x0194 }
        L_0x001f:
            r2.A08 = r0     // Catch:{ all -> 0x0194 }
            monitor-exit(r1)     // Catch:{ all -> 0x0194 }
        L_0x0022:
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x01aa
            java.nio.ByteBuffer r12 = r2.A08
            if (r12 == 0) goto L_0x01aa
            java.util.ArrayList r1 = r2.A0P
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01aa
            r21 = 0
            r0 = r21
            java.lang.Object r0 = r1.remove(r0)
            int r20 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r2.A00
            int r0 = r2.A0K
            r19 = r0
            int r1 = r1 % r0
            if (r1 != 0) goto L_0x004e
            int r0 = r12.remaining()
            r5 = 1
            if (r0 == 0) goto L_0x0145
        L_0x004e:
            r5 = 0
            android.media.MediaCodec r1 = r2.A02
            r0 = r20
            android.media.Image r7 = r1.getInputImage(r0)
            int r6 = r2.A0H
            int r4 = r2.A00
            int r0 = r2.A0E
            int r3 = r4 % r0
            int r3 = r3 * r6
            int r1 = r2.A0F
            int r4 = r4 / r0
            int r0 = r2.A0G
            int r4 = r4 % r0
            int r4 = r4 * r1
            android.graphics.Rect r15 = r2.A0V
            int r6 = r6 + r3
            int r1 = r1 + r4
            r15.set(r3, r4, r6, r1)
            int r14 = r2.A0L
            int r13 = r2.A0I
            android.graphics.Rect r11 = r2.A0U
            int r1 = r15.width()
            int r0 = r11.width()
            if (r1 != r0) goto L_0x019f
            int r1 = r15.height()
            int r0 = r11.height()
            if (r1 != r0) goto L_0x019f
            int r0 = r14 % 2
            if (r0 != 0) goto L_0x0197
            int r0 = r13 % 2
            if (r0 != 0) goto L_0x0197
            int r0 = r15.left
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            int r0 = r15.top
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            int r0 = r15.right
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            int r0 = r15.bottom
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            int r0 = r11.left
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            int r0 = r11.top
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            int r0 = r11.right
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            int r0 = r11.bottom
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0197
            android.media.Image$Plane[] r10 = r7.getPlanes()
            r9 = 0
        L_0x00be:
            int r0 = r10.length
            if (r9 >= r0) goto L_0x0145
            r0 = r10[r9]
            java.nio.ByteBuffer r8 = r0.getBuffer()
            r0 = r10[r9]
            int r7 = r0.getPixelStride()
            int r1 = r15.width()
            int r0 = r15.left
            int r0 = r14 - r0
            int r18 = java.lang.Math.min(r1, r0)
            int r1 = r15.height()
            int r0 = r15.top
            int r0 = r13 - r0
            int r17 = java.lang.Math.min(r1, r0)
            if (r9 <= 0) goto L_0x0141
            int r1 = r14 * r13
            int r0 = r9 + 3
            int r1 = r1 * r0
            int r6 = r1 / 4
            r16 = 2
        L_0x00f0:
            r4 = 0
        L_0x00f1:
            int r0 = r17 / r16
            if (r4 >= r0) goto L_0x013d
            int r1 = r15.top
            int r1 = r1 / r16
            int r1 = r1 + r4
            int r1 = r1 * r14
            int r1 = r1 / r16
            int r1 = r1 + r6
            int r0 = r15.left
            int r0 = r0 / r16
            int r1 = r1 + r0
            r12.position(r1)
            int r1 = r11.top
            int r1 = r1 / r16
            int r1 = r1 + r4
            r0 = r10[r9]
            int r0 = r0.getRowStride()
            int r1 = r1 * r0
            int r0 = r11.left
            int r0 = r0 * r7
            int r0 = r0 / r16
            int r1 = r1 + r0
            r8.position(r1)
            r3 = 0
        L_0x011c:
            int r0 = r18 / r16
            if (r3 >= r0) goto L_0x013a
            byte r1 = r12.get()
            r8.put(r1)
            r1 = 1
            if (r7 <= r1) goto L_0x0137
            int r0 = r0 + -1
            if (r3 == r0) goto L_0x0137
            int r0 = r8.position()
            int r0 = r0 + r7
            int r0 = r0 - r1
            r8.position(r0)
        L_0x0137:
            int r3 = r3 + 1
            goto L_0x011c
        L_0x013a:
            int r4 = r4 + 1
            goto L_0x00f1
        L_0x013d:
            int r9 = r9 + 1
            goto L_0x00be
        L_0x0141:
            r6 = 0
            r16 = 1
            goto L_0x00f0
        L_0x0145:
            android.media.MediaCodec r6 = r2.A02
            r8 = 0
            if (r5 == 0) goto L_0x0175
            r9 = 0
        L_0x014b:
            int r1 = r2.A00
            int r0 = r1 + 1
            r2.A00 = r0
            long r3 = (long) r1
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            r0 = r19
            long r0 = (long) r0
            long r3 = r3 / r0
            r0 = 132(0x84, double:6.5E-322)
            long r3 = r3 + r0
            if (r5 == 0) goto L_0x0161
            r21 = 4
        L_0x0161:
            r7 = r20
            r10 = r3
            r12 = r21
            r6.queueInputBuffer(r7, r8, r9, r10, r12)
            if (r5 != 0) goto L_0x0171
            int r0 = r2.A00
            int r0 = r0 % r19
            if (r0 != 0) goto L_0x0000
        L_0x0171:
            java.util.ArrayList r1 = r2.A0Q
            monitor-enter(r1)
            goto L_0x0180
        L_0x0175:
            r0 = r20
            java.nio.ByteBuffer r0 = r6.getInputBuffer(r0)
            int r9 = r0.capacity()
            goto L_0x014b
        L_0x0180:
            boolean r0 = r2.A09     // Catch:{ all -> 0x01a7 }
            r5 = r5 | r0
            r2.A09 = r5     // Catch:{ all -> 0x01a7 }
            java.nio.ByteBuffer r0 = r2.A08     // Catch:{ all -> 0x01a7 }
            r1.add(r0)     // Catch:{ all -> 0x01a7 }
            r1.notifyAll()     // Catch:{ all -> 0x01a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x01a7 }
            r0 = r22
            r2.A08 = r0
            goto L_0x0000
        L_0x0194:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0194 }
            throw r0
        L_0x0197:
            java.lang.String r1 = "src or dst are not aligned!"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x019f:
            java.lang.String r1 = "src and dst rect size are different!"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a7 }
            throw r0
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19870Wgx.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = (java.nio.ByteBuffer) r2.remove(0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[LOOP:0: B:20:0x002b->B:49:0x002b, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r6 = this;
            int r1 = r6.A0J
            r0 = 2
            if (r1 != r0) goto L_0x0026
            X.VuT r5 = r6.A07
            r3 = 0
            monitor-enter(r5)
            boolean r0 = r5.A06     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x001a
            long r1 = r5.A01     // Catch:{ all -> 0x0023 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            r5.A01 = r3     // Catch:{ all -> 0x0023 }
        L_0x0016:
            X.C18577VuT.A00(r5)     // Catch:{ all -> 0x0023 }
            goto L_0x0063
        L_0x001a:
            long r1 = r5.A00     // Catch:{ all -> 0x0023 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            r5.A00 = r3     // Catch:{ all -> 0x0023 }
            goto L_0x0016
        L_0x0023:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0026:
            if (r1 != 0) goto L_0x0064
            java.util.ArrayList r2 = r6.A0Q
            monitor-enter(r2)
        L_0x002b:
            boolean r0 = r6.A09     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0039
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x003b
            r2.wait()     // Catch:{ InterruptedException -> 0x002b }
            goto L_0x002b
        L_0x0039:
            r1 = 0
            goto L_0x0042
        L_0x003b:
            r0 = 0
            java.lang.Object r1 = r2.remove(r0)     // Catch:{ all -> 0x0060 }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x0060 }
        L_0x0042:
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0064
            r1.clear()
            r1.flip()
            java.util.ArrayList r0 = r6.A0R
            monitor-enter(r0)
            r0.add(r1)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            android.os.Handler r1 = r6.A0N
            X.WhZ r0 = new X.WhZ
            r0.<init>(r6)
            r1.post(r0)
            return
        L_0x005d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r1
        L_0x0060:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            throw r1
        L_0x0063:
            monitor-exit(r5)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19870Wgx.A02():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002f A[Catch:{ Exception -> 0x0062, all -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0X
            r3 = 1
            r0.set(r3)
            r2 = 0
            android.media.MediaCodec r0 = r4.A02     // Catch:{ Exception -> 0x0013, all -> 0x0074 }
            if (r0 == 0) goto L_0x0013
            r0.stop()     // Catch:{ Exception -> 0x0013, all -> 0x0074 }
            android.media.MediaCodec r0 = r4.A02     // Catch:{ Exception -> 0x0013, all -> 0x0074 }
            r0.release()     // Catch:{ Exception -> 0x0013, all -> 0x0074 }
        L_0x0013:
            r4.A02 = r2
            java.util.ArrayList r1 = r4.A0Q
            monitor-enter(r1)
            r4.A09 = r3     // Catch:{ all -> 0x0071 }
            r1.notifyAll()     // Catch:{ all -> 0x0071 }
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            monitor-enter(r4)
            X.Vsm r1 = r4.A05     // Catch:{ Exception -> 0x0029, all -> 0x006a }
            if (r1 == 0) goto L_0x0029
            X.Vst r0 = r1.A00     // Catch:{ Exception -> 0x0029, all -> 0x006a }
            if (r0 == 0) goto L_0x0029
            r1.A00 = r2     // Catch:{ Exception -> 0x0029, all -> 0x006a }
        L_0x0029:
            r4.A05 = r2     // Catch:{ all -> 0x006e }
            X.V4X r3 = r4.A06     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            if (r3 == 0) goto L_0x0062
            android.opengl.EGLDisplay r1 = r3.A01     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            boolean r0 = X.2Ob.A00(r1, r0)     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            if (r0 != 0) goto L_0x004f
            android.opengl.EGLDisplay r1 = r3.A01     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLSurface r0 = r3.A02     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLDisplay r1 = r3.A01     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLContext r0 = r3.A00     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGL14.eglDestroyContext(r1, r0)     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGL14.eglReleaseThread()     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLDisplay r0 = r3.A01     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGL14.eglTerminate(r0)     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
        L_0x004f:
            android.view.Surface r0 = r3.A03     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            r0.release()     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            r3.A01 = r0     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
            r3.A03 = r2     // Catch:{ Exception -> 0x0062, all -> 0x0066 }
        L_0x0062:
            r4.A06 = r2     // Catch:{ all -> 0x006e }
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x0066:
            r0 = move-exception
            r4.A06 = r2     // Catch:{ all -> 0x006e }
            goto L_0x006d
        L_0x006a:
            r0 = move-exception
            r4.A05 = r2     // Catch:{ all -> 0x006e }
        L_0x006d:
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            throw r0
        L_0x0074:
            r0 = move-exception
            r4.A02 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19870Wgx.A03():void");
    }

    public final void close() {
        ArrayList arrayList = this.A0Q;
        synchronized (arrayList) {
            this.A09 = true;
            arrayList.notifyAll();
        }
        this.A0N.postAtFrontOfQueue(new C19905Wha(this));
    }
}
