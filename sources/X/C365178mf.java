package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.8mf  reason: invalid class name and case insensitive filesystem */
public final class C365178mf extends AnonymousClass8KT implements C365188mg, C365198mh {
    public int A00;
    public int A01;
    public long A02;
    public SurfaceTexture A03;
    public C346337v0 A04;
    public Surface A05;
    public C345557ti A06;
    public final A3N A07;
    public final C368538so A08 = new C368538so();
    public final C368938tZ A09;
    public final float[] A0A = new float[16];

    public final C365468nA BHU() {
        return null;
    }

    public final String BO5() {
        return "BurstFramesOutput";
    }

    public final int Bpb() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7sc] */
    public final C344907sc Blr() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7sc] */
    public final C344907sc Bls() {
        return new Object();
    }

    public final AnonymousClass8KV CED() {
        return AnonymousClass8KV.CAPTURE;
    }

    public final void CMW(C365228mk r8, C365248mm r9) {
        C346327uz r1 = new C346327uz("BurstFramesOutput");
        r1.A03 = 36197;
        C346337v0 r0 = new C346337v0(r1);
        this.A04 = r0;
        SurfaceTexture surfaceTexture = new SurfaceTexture(r0.A00);
        this.A03 = surfaceTexture;
        int i = this.A01;
        int i2 = this.A00;
        surfaceTexture.setDefaultBufferSize(i, i2);
        this.A05 = new Surface(this.A03);
        C368938tZ r02 = this.A09;
        C345557ti r3 = this.A06;
        r02.A00 = r3;
        A3N a3n = this.A07;
        a3n.A00.A0K.post(new C41228AqQ(r9, r3, a3n, i, i2));
        r8.EzB(this.A05, this);
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final void release() {
        Surface surface = this.A05;
        if (surface != null) {
            surface.release();
            this.A05 = null;
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        C346337v0 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
            this.A04 = null;
        }
        AJ3 aj3 = this.A07.A00;
        aj3.A0K.post(new C40740AiS(aj3));
        super.release();
        this.A09.Dpb();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r6.A0I != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void swapBuffers() {
        /*
            r18 = this;
            r8 = r18
            super.swapBuffers()
            android.graphics.SurfaceTexture r0 = r8.A03
            r0.updateTexImage()
            android.graphics.SurfaceTexture r0 = r8.A03
            float[] r13 = r8.A0A
            r0.getTransformMatrix(r13)
            X.A3N r7 = r8.A07
            long r4 = r8.A02
            X.AJ3 r6 = r7.A00
            long r0 = r6.A05
            r3 = 1
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0057
            boolean r0 = r6.A0Y
            if (r0 != 0) goto L_0x0029
            boolean r0 = r6.A0I
            r11 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r11 = 1
        L_0x002a:
            long r0 = r6.A05
            long r9 = r4 - r0
            java.util.List r0 = r6.A0T
            int r1 = r0.size()
            r0 = 35
            if (r1 > r0) goto L_0x003f
            r1 = 1800000000(0x6b49d200, double:8.893181625E-315)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
        L_0x003f:
            r6.A0I = r3
        L_0x0041:
            if (r11 == 0) goto L_0x0057
            r1 = 200000000(0xbebc200, double:9.8813129E-316)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            r6.A0Y = r3
        L_0x004c:
            android.os.Handler r3 = r6.A0K
            X.Am0 r2 = new X.Am0
            r2.<init>(r6, r4)
        L_0x0053:
            r3.post(r2)
        L_0x0056:
            return
        L_0x0057:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0V
            int r0 = r0.get()
            if (r0 != r3) goto L_0x0056
            X.7v0 r12 = r8.A04
            long r0 = r8.A02
            java.util.concurrent.atomic.AtomicBoolean r10 = r6.A0U
            boolean r2 = r10.get()
            if (r2 != 0) goto L_0x0056
            int r4 = r6.A03
            int r2 = r6.A02
            X.8tg r5 = new X.8tg
            r5.<init>(r4, r2)
            int r2 = r5.A00
            r9 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r9, r2)
            int r8 = r5.A02
            int r2 = r5.A01
            r4 = 0
            android.opengl.GLES20.glViewport(r4, r4, r8, r2)
            X.AHA r2 = r6.A0F     // Catch:{ 9bR -> 0x00a8 }
            r2.getClass()     // Catch:{ 9bR -> 0x00a8 }
            X.8so r11 = r6.A0O     // Catch:{ 9bR -> 0x00a8 }
            r14 = 0
            r15 = r14
            r16 = r0
            r11.A02(r12, r13, r14, r15, r16)     // Catch:{ 9bR -> 0x00a8 }
            r2.A04(r11)     // Catch:{ 9bR -> 0x00a8 }
            android.opengl.GLES20.glBindFramebuffer(r9, r4)
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r4)
            android.opengl.GLES20.glFlush()
            android.os.Handler r3 = r6.A0K
            X.AoY r2 = new X.AoY
            r2.<init>(r5, r7, r0)
            goto L_0x0053
        L_0x00a8:
            r6.A0Y = r3
            r10.set(r3)
            X.AJ3.A03(r6, r4)
            java.lang.String r1 = "BoomerangFramesHandlerImplOOM"
            java.lang.String r0 = "onTextureSwapped() GlOutOfMemoryException"
            X.0KC.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365178mf.swapBuffers():void");
    }

    public C365178mf(C345557ti r3, A3N a3n, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 0;
        this.A07 = a3n;
        this.A06 = r3;
        this.A09 = new C368938tZ(false);
    }

    public final void destroy() {
        release();
    }
}
