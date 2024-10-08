package X;

import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SVf  reason: case insensitive filesystem */
public final class C11443SVf implements SurfaceTexture.OnFrameAvailableListener {
    public float A00;
    public float A01;
    public SurfaceTexture A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public C344587s6 A06;
    public C345937uK A07;
    public C345937uK A08;
    public C345937uK A09;
    public C346337v0 A0A;
    public AnonymousClass8HJ A0B;
    public AnonymousClass8HW A0C;
    public AHA A0D;
    public SSS A0E;
    public String A0F;
    public boolean A0G;
    public final int A0H;
    public final int A0I;
    public final C345557ti A0J;
    public final C368538so A0K;
    public final Object A0L = Pxe.A0p();
    public final List A0M;
    public final List A0N;
    public final AtomicInteger A0O;
    public final 0sI A0P;
    public final float[] A0Q;

    public C11443SVf(Resources resources, AnonymousClass8HW r5, String str, 0sI r7, int i, int i2) {
        0qQ.A0B(resources, 4);
        AnonymousClass7TG.A1S(r5, r7);
        this.A0I = i;
        this.A0H = i2;
        this.A0F = str;
        this.A0C = r5;
        this.A0P = r7;
        this.A0J = new C345557ti(resources);
        this.A0N = AnonymousClass7TE.A1C();
        this.A0K = new C368538so();
        this.A0O = new AtomicInteger(0);
        this.A0M = AnonymousClass7TE.A1C();
        this.A01 = -1.0f;
        this.A00 = -1.0f;
        this.A0B = AnonymousClass8HJ.NORMAL;
        float[] fArr = new float[16];
        this.A0Q = fArr;
        Matrix.setIdentityM(fArr, 0);
        C346327uz r1 = new C346327uz("BurstFramesOutput");
        r1.A03 = 36197;
        C346337v0 r0 = new C346337v0(r1);
        this.A0A = r0;
        SurfaceTexture surfaceTexture = new SurfaceTexture(r0.A00);
        this.A02 = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.A0I, this.A0H);
        this.A02.setOnFrameAvailableListener(this);
        this.A03 = new Surface(this.A02);
        this.A0D = new AHA(this.A0J);
        C344587s6 r2 = new C344587s6((Object) null, 3);
        this.A06 = r2;
        r2.A09(EGL14.EGL_NO_CONTEXT, 1);
        A00();
    }

    private final void A00() {
        Throwable th;
        SSS sss = new SSS();
        sss.A04 = new C12161SoC(this);
        this.A0E = sss;
        int i = this.A0I;
        int i2 = this.A0H;
        if (sss.A05(i, i2, (int) (((double) (i * i2)) * (1.0E9d / 3.3E7d) * 4.0d * 0.07d), 0)) {
            SSS sss2 = this.A0E;
            String str = "boomerangEncoder";
            if (sss2 != null) {
                Surface surface = sss2.A03;
                if (surface != null && surface.isValid()) {
                    try {
                        C344587s6 r1 = this.A06;
                        if (r1 == null) {
                            str = "selfEGLCore";
                        } else {
                            SSS sss3 = this.A0E;
                            if (sss3 != null) {
                                Surface surface2 = sss3.A03;
                                if (surface2 != null) {
                                    C345937uK AMY = r1.AMY(surface2);
                                    this.A07 = AMY;
                                    AMY.A05();
                                    SSS sss4 = this.A0E;
                                    if (sss4 != null) {
                                        sss4.A04(this.A0F);
                                        AtomicInteger atomicInteger = this.A0O;
                                        if (atomicInteger.get() == 4) {
                                            A02(this, this.A01, this.A00);
                                            return;
                                        } else {
                                            atomicInteger.set(1);
                                            return;
                                        }
                                    }
                                } else {
                                    th = AnonymousClass7TE.A0y();
                                    throw th;
                                }
                            }
                        }
                        0qQ.A0F(str);
                        th = AnonymousClass00P.createAndThrow();
                        throw th;
                    } catch (Exception unused) {
                        0KC.A0C("DecoderOutputSurfaceHandler", "Failure when creating the encoder surface - abort capture.");
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A01(AnonymousClass8HJ r3, AnonymousClass8HW r4, C11443SVf sVf, String str, float f, float f2) {
        AtomicInteger atomicInteger = sVf.A0O;
        if (atomicInteger.get() != 0) {
            0KC.A0C("DecoderOutputSurfaceHandler", 002.A0O("Trying to update when not in finished state, state:", atomicInteger.get()));
            0sI r1 = sVf.A0P;
            Boolean A0u = AnonymousClass7TE.A0u();
            if (r3 == null) {
                r3 = sVf.A0B;
            }
            Float valueOf = Float.valueOf(-1.0f);
            r1.invoke(A0u, r3, (Object) null, valueOf, valueOf);
            return;
        }
        sVf.A0C = r4;
        sVf.A0F = str;
        if (r3 != null) {
            sVf.A0B = r3;
        }
        sVf.A01 = f;
        sVf.A00 = f2;
        atomicInteger.set(4);
        sVf.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0140, code lost:
        r3.A0C.DaW(1.0f);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C11443SVf r22, float r23, float r24) {
        /*
            r13 = 1106247680(0x41f00000, float:30.0)
            r16 = 1
            r3 = r22
            X.8HJ r0 = r3.A0B     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.8HL[] r6 = r0.A01     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.0qQ.A06(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            int r5 = r6.length     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r4 = 0
            r9 = 0
        L_0x0010:
            if (r4 >= r5) goto L_0x0028
            r2 = r6[r4]     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            float r1 = r2.A00     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            float r1 = r2.A00     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
        L_0x0023:
            int r9 = r9 + 1
        L_0x0025:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0028:
            int[] r8 = new int[r9]     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.8HJ r0 = r3.A0B     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.8HL[] r0 = r0.A01     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.0qQ.A06(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            java.util.List r10 = r3.A0N     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r14 = r23
            r15 = r24
            r11 = r8
            r12 = r0
            java.util.ArrayList r10 = X.AHI.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            java.util.List r7 = r3.A0M     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r7.clear()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.7uK r0 = r3.A07     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "boomerangOutputSurface"
            X.0qQ.A0F(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
        L_0x004b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
        L_0x0050:
            r0.A05()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            int r1 = r3.A0I     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            int r0 = r3.A0H     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r6 = 0
            android.opengl.GLES20.glViewport(r6, r6, r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r4 = 0
            r11 = 0
            r2 = 0
        L_0x005f:
            r22 = r8[r6]     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.8HJ r0 = r3.A0B     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            int r13 = r0.ordinal()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r0 = 4
            java.lang.String r1 = "boomerangFramesGLRenderer"
            if (r13 == r0) goto L_0x0089
            r0 = 5
            X.AHA r12 = r3.A0D     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            if (r13 == r0) goto L_0x0086
            if (r12 == 0) goto L_0x00ca
            X.8so r13 = r3.A0K     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            java.lang.Object r0 = r10.get(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.8tg r0 = (X.C369008tg) r0     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.7v0 r1 = r0.A03     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            float[] r0 = r3.A0Q     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r13.A01(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r12.A04(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            goto L_0x00b4
        L_0x0086:
            if (r12 == 0) goto L_0x00ca
            goto L_0x00a1
        L_0x0089:
            X.AHA r12 = r3.A0D     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            if (r12 == 0) goto L_0x00ca
            X.8so r1 = r3.A0K     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            float[] r0 = r3.A0Q     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r17 = r12
            r18 = r1
            r19 = r10
            r20 = r0
            r21 = r11
            r22 = r4
            X.AHI.A03(r17, r18, r19, r20, r21, r22)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            goto L_0x00b4
        L_0x00a1:
            X.8so r1 = r3.A0K     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            float[] r0 = r3.A0Q     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r21 = r11
            r23 = r4
            r17 = r12
            r18 = r1
            r19 = r10
            r20 = r0
            X.AHI.A02(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
        L_0x00b4:
            X.7uK r0 = r3.A07     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            java.lang.String r1 = "boomerangOutputSurface"
            if (r0 == 0) goto L_0x00ca
            r0.A04(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.7uK r0 = r3.A07     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            if (r0 == 0) goto L_0x00ca
            r0.A03()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.SSS r0 = r3.A0E     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            if (r0 != 0) goto L_0x00cf
            java.lang.String r1 = "boomerangEncoder"
        L_0x00ca:
            X.0qQ.A0F(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            goto L_0x004b
        L_0x00cf:
            X.Q7n r1 = r0.A05     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            if (r1 != 0) goto L_0x0119
            java.lang.String r1 = "BoomerangEncoder"
            java.lang.String r0 = "no handler available"
            X.0KC.A0C(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
        L_0x00db:
            int r0 = r7.size()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            int r0 = r0 % r9
            r12 = r8[r0]     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            if (r11 != r12) goto L_0x00ed
            long r0 = r4 / r0
            int r12 = (int) r0     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.G9w.A0x(r12, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
        L_0x00ed:
            r0 = 33000000(0x1f78a40, double:1.63041663E-316)
            long r4 = r4 + r0
            int r13 = r10.size()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            float r12 = (float) r2     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r0 = 1077936128(0x40400000, float:3.0)
            float r12 = r12 / r0
            float r1 = (float) r11     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            float r0 = (float) r13     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            float r1 = r1 / r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            float r12 = r12 + r1
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            float r12 = r12 + r0
            r13 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            X.8HW r0 = r3.A0C     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r0.DaW(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            int r0 = r10.size()     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            int r0 = r0 - r16
            if (r11 < r0) goto L_0x013c
            goto L_0x011e
        L_0x0119:
            r0 = 2
            r1.sendEmptyMessage(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            goto L_0x00db
        L_0x011e:
            int r2 = r2 + 1
            r11 = 3000000000(0xb2d05e00, double:1.4821969375E-314)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x012c
            r0 = 3
            if (r2 >= r0) goto L_0x0140
        L_0x012c:
            long r0 = (long) r2     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            long r14 = r4 / r0
            long r14 = r14 + r4
            r11 = 15000000000(0x37e11d600, double:7.4109846876E-314)
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0140
            r11 = 0
            goto L_0x005f
        L_0x013c:
            int r11 = r11 + 1
            goto L_0x005f
        L_0x0140:
            X.8HW r0 = r3.A0C     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            r0.DaW(r13)     // Catch:{ IndexOutOfBoundsException -> 0x0146 }
            goto L_0x014e
        L_0x0146:
            r2 = move-exception
            java.lang.String r1 = "DecoderOutputSurfaceHandler"
            java.lang.String r0 = "Invalid index access while encoding Boomerang video"
            X.0KC.A0F(r1, r0, r2)
        L_0x014e:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.A0O
            r1 = 3
            r2.set(r1)
            X.SSS r0 = r3.A0E
            if (r0 == 0) goto L_0x018c
            X.Q7n r0 = r0.A05
            if (r0 != 0) goto L_0x0188
            java.lang.String r1 = "BoomerangEncoder"
            java.lang.String r0 = "no handler available"
            X.0KC.A0C(r1, r0)
        L_0x0164:
            int r0 = r2.get()
            if (r0 == 0) goto L_0x018f
            X.7uK r0 = r3.A07
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "boomerangOutputSurface"
        L_0x0170:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0178:
            r0.A02()
            X.SSS r0 = r3.A0E
            if (r0 == 0) goto L_0x018c
            X.Q7n r1 = r0.A05
            if (r1 == 0) goto L_0x018f
            r0 = 4
            r1.sendEmptyMessage(r0)
            return
        L_0x0188:
            r0.sendEmptyMessage(r1)
            goto L_0x0164
        L_0x018c:
            java.lang.String r0 = "boomerangEncoder"
            goto L_0x0170
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11443SVf.A02(X.SVf, float, float):void");
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A0L;
        synchronized (obj) {
            if (!this.A0G) {
                this.A0G = true;
                obj.notifyAll();
            } else {
                throw AnonymousClass7TE.A15("mFrameAvailable already set, frame could be dropped");
            }
        }
    }
}
