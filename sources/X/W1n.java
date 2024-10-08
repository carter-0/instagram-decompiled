package X;

import android.graphics.RectF;
import android.opengl.Matrix;

public final class W1n {
    public int A00;
    public int A01 = 0;
    public int A02;
    public RectF A03;
    public X93 A04;
    public C365378n0 A05;
    public C365408n3 A06;
    public C368538so A07;
    public boolean A08;
    public boolean A09;
    public C18493Vso A0A;
    public final C344227rW A0B;
    public final X7Q A0C;
    public final C17988VjQ A0D;
    public final C17849Vh2 A0E;
    public final float[] A0F = new float[16];
    public final C18493Vso A0G;
    public final C17904Vhv A0H;
    public final V5Z A0I;
    public final VLG A0J;

    public static C18493Vso A00(W1n w1n, boolean z) {
        if (w1n.A0E.A02.A00() != AnonymousClass05K.A00 || !z) {
            return w1n.A0G;
        }
        C18493Vso vso = w1n.A0A;
        if (vso != null) {
            return vso;
        }
        C18493Vso vso2 = new C18493Vso(new WG6(w1n));
        w1n.A0A = vso2;
        return vso2;
    }

    public static void A01(W1n w1n) {
        int i;
        float[] fArr = w1n.A0F;
        int i2 = w1n.A01;
        if (i2 == 1) {
            i = 90;
        } else if (i2 != 2) {
            i = 270;
            if (i2 != 3) {
                i = 0;
            }
        } else {
            i = 180;
        }
        Matrix.setIdentityM(fArr, 0);
        C365268mo.A02(fArr, (float) ((360 - i) % 360));
        C365268mo.A01(fArr);
        RectF rectF = w1n.A03;
        Matrix.translateM(fArr, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr, 0, rectF.width(), rectF.height(), 1.0f);
        C365268mo.A01(fArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r1 = r4.A0J.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r4 != r1.A07) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        X.C18812W3v.A07(r1, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0007, code lost:
        if (r6 <= 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.W1n r4, int r5, int r6) {
        /*
            X.VjQ r3 = r4.A0D
            monitor-enter(r3)
            r2 = 0
            if (r5 <= 0) goto L_0x0009
            r1 = 1
            if (r6 > 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            java.lang.String r0 = "Non zero width and height required"
            X.0JA.A08(r1, r0)     // Catch:{ all -> 0x0030 }
            int r0 = r3.A02     // Catch:{ all -> 0x0030 }
            if (r5 != r0) goto L_0x0018
            int r0 = r3.A00     // Catch:{ all -> 0x0030 }
            if (r6 != r0) goto L_0x0018
            goto L_0x002e
        L_0x0018:
            r3.A00()     // Catch:{ all -> 0x0030 }
            r3.A02 = r5     // Catch:{ all -> 0x0030 }
            r3.A00 = r6     // Catch:{ all -> 0x0030 }
            r3.A01 = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)
            X.VLG r0 = r4.A0J
            X.W3v r1 = r0.A00
            X.W1n r0 = r1.A07
            if (r4 != r0) goto L_0x002f
            X.C18812W3v.A07(r1, r5, r6)
            return
        L_0x002e:
            monitor-exit(r3)
        L_0x002f:
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1n.A02(X.W1n, int, int):void");
    }

    public final void A03() {
        C365408n3 r0 = this.A06;
        if (r0 != null) {
            r0.destroy();
            this.A06 = null;
        }
        this.A0D.A00();
        this.A08 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r4.A0E.A00(r4.A06.Bnc(), r4.A02, r4.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r4 = this;
            X.7rW r0 = r4.A0B
            X.7r6 r1 = r0.A00
            r0 = 80
            boolean r0 = r1.CTO(r0)
            if (r0 == 0) goto L_0x0027
            X.Vh2 r3 = r4.A0E
            int r2 = r4.A02
            int r1 = r4.A00
            X.8n3 r0 = r4.A06
            X.8nA r0 = r0.Bnc()
            X.8qr r0 = r3.A00(r0, r2, r1)
            int r1 = r0.A01
            if (r1 == 0) goto L_0x0027
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            A02(r4, r1, r0)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1n.A04():void");
    }

    public final void A05(WG9 wg9, C365438n7 r4) {
        if (!this.A08) {
            this.A06.CMV(r4);
            if (!this.A0B.A00.CTO(80) && this.A06.BHc() > 0 && this.A06.BHR() > 0) {
                A02(this, this.A06.BHc(), this.A06.BHR());
            }
            Matrix.setIdentityM(this.A0F, 0);
            A01(this);
            X93 x93 = this.A04;
            if (x93 != null) {
                x93.EwI(wg9);
            }
            this.A08 = true;
            C345907uH.A02("RenderManager::initInput", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ce, code lost:
        if (r2.CKW() == false) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.W1n r16) {
        /*
            r15 = this;
            X.8so r0 = r15.A07
            if (r0 == 0) goto L_0x00ea
            X.8n0 r1 = r15.A05
            X.8n0 r0 = X.C365378n0.DISABLE
            if (r1 == r0) goto L_0x00ea
            X.8n0 r0 = X.C365378n0.CAPTURE
            if (r1 != r0) goto L_0x004d
            r0 = 16
            float[] r6 = new float[r0]
            r1 = r16
            X.8n3 r0 = r1.A06
            r0.C9S(r6)
            X.Vhv r5 = r15.A0H
            X.8n3 r0 = r1.A06
            int r4 = r0.BfA()
            X.8n3 r0 = r1.A06
            int r3 = r0.Bez()
            java.util.List r0 = r5.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x002d:
            boolean r0 = r1.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r1.next()
            X.X9O r0 = (X.X9O) r0
            r0.EZY(r2)
            r0.setSize(r4, r3)
            goto L_0x002d
        L_0x0041:
            float[] r0 = r5.A05
            r1 = 0
            android.opengl.Matrix.invertM(r0, r1, r6, r1)
            float[] r0 = r5.A04
            android.opengl.Matrix.setIdentityM(r0, r1)
            goto L_0x0087
        L_0x004d:
            X.8n0 r0 = X.C365378n0.ENABLE
            if (r1 != r0) goto L_0x0089
            X.Vhv r5 = r15.A0H
            X.8n3 r0 = r15.A06
            int r4 = r0.BHc()
            X.8n3 r0 = r15.A06
            int r3 = r0.BHR()
            java.util.List r0 = r5.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x0065:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r2.next()
            X.X9O r1 = (X.X9O) r1
            r0 = 0
            r1.EZY(r0)
            r1.setSize(r4, r3)
            goto L_0x0065
        L_0x0079:
            float[] r3 = r5.A04
            r2 = 0
            android.opengl.Matrix.setIdentityM(r3, r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.opengl.Matrix.scaleM(r3, r2, r1, r0, r1)
            r2 = 1
        L_0x0087:
            r5.A00 = r2
        L_0x0089:
            X.Vhv r4 = r15.A0H
            X.8so r0 = r15.A07
            X.7v0 r9 = r0.A00()
            float[] r10 = r0.A04
            X.8n3 r0 = r15.A06
            boolean r3 = r0.EFH()
            long r13 = r0.Beq()
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00ea
            java.util.List r0 = r4.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x00a7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r2 = r7.next()
            X.X9O r2 = (X.X9O) r2
            boolean r0 = r2.CKW()
            r5 = 0
            if (r0 == 0) goto L_0x00a7
            X.8so r8 = r4.A01
            float[] r11 = r4.A05
            float[] r12 = r4.A04
            r8.A02(r9, r10, r11, r12, r13)
            boolean r0 = r2.E4b(r8, r3)
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r2.CKW()
            r6 = 1
            if (r0 != 0) goto L_0x00d1
        L_0x00d0:
            r6 = 0
        L_0x00d1:
            java.lang.String r1 = "FrameProcessorHelper::processFrames - "
            X.8tU r0 = r2.B7P()
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.C345907uH.A02(r1, r0)
            if (r6 == 0) goto L_0x00a7
            r2.ELj()
            goto L_0x00a7
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1n.A06(X.W1n):void");
    }

    public W1n(C344227rW r4, C17904Vhv vhv, V5Z v5z, VLG vlg, C17849Vh2 vh2, C365408n3 r9) {
        this.A0B = r4;
        this.A06 = r9;
        this.A0H = vhv;
        this.A0I = v5z;
        this.A0J = vlg;
        this.A0E = vh2;
        this.A03 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.A02 = r9.BHc();
        this.A00 = r9.BHR();
        this.A09 = r4.A00.CTO(80);
        this.A05 = C365378n0.DISABLE;
        this.A0D = new C17988VjQ();
        WG5 wg5 = new WG5(this);
        this.A0C = wg5;
        this.A0G = new C18493Vso(wg5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r10 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[] A07(X.C365468nA r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            X.Vso r6 = A00(r9, r14)
            X.C18493Vso.A00(r6)
            boolean r0 = r6.A01
            if (r0 == r14) goto L_0x0012
            android.util.SparseArray r0 = r6.A04
            r0.clear()
            r6.A01 = r14
        L_0x0012:
            if (r10 != 0) goto L_0x0083
            X.X7Q r0 = r6.A00
            X.8nA r10 = r0.Avy()
            r0 = 1
            if (r10 != 0) goto L_0x0083
        L_0x001d:
            int r0 = r0 * 31
            int r0 = r0 + r11
            int r0 = r0 * 31
            int r0 = r0 + r12
            int r5 = r0 * 31
            int r5 = r5 + r13
            android.util.SparseArray r4 = r6.A04
            java.lang.Object r3 = r4.get(r5)
            float[] r3 = (float[]) r3
            if (r3 != 0) goto L_0x007e
            r8 = 16
            float[] r3 = new float[r8]
            r2 = 0
            android.opengl.Matrix.setIdentityM(r3, r2)
            r7 = r13 & 4
            r0 = 4
            r1 = 1
            if (r7 != r0) goto L_0x0044
            r0 = 1119092736(0x42b40000, float:90.0)
            X.C365268mo.A02(r3, r0)
            r2 = 1
        L_0x0044:
            r7 = r13 & 8
            r0 = 8
            if (r7 != r0) goto L_0x004f
            r0 = 1127481344(0x43340000, float:180.0)
            X.C365268mo.A02(r3, r0)
        L_0x004f:
            r0 = r13 & 16
            if (r0 != r8) goto L_0x0059
            r0 = 1132920832(0x43870000, float:270.0)
            X.C365268mo.A02(r3, r0)
            r2 = 1
        L_0x0059:
            r0 = r13 & 1
            if (r0 != r1) goto L_0x0060
            X.C365268mo.A01(r3)
        L_0x0060:
            r1 = 2
            r0 = r13 & 2
            if (r0 != r1) goto L_0x0068
            X.C365268mo.A00(r3)
        L_0x0068:
            X.8nA r0 = X.C365468nA.CROP
            if (r10 != r0) goto L_0x007b
            X.X7Q r0 = r6.A00
            int r1 = r0.Asw()
            int r0 = r0.Asq()
            if (r2 == 0) goto L_0x007f
            X.V6T.A00(r3, r12, r11, r1, r0)
        L_0x007b:
            r4.put(r5, r3)
        L_0x007e:
            return r3
        L_0x007f:
            X.V6T.A00(r3, r1, r0, r11, r12)
            goto L_0x007b
        L_0x0083:
            int r0 = r10.hashCode()
            int r0 = r0 + 31
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1n.A07(X.8nA, int, int, int, boolean):float[]");
    }
}
