package X;

/* renamed from: X.5dT  reason: invalid class name and case insensitive filesystem */
public abstract class C289365dT {
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0128, code lost:
        if ((!r0.A0A(r6)) != false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass5Q3 r17, androidx.compose.ui.graphics.layer.GraphicsLayer r18) {
        /*
            X.5QD r1 = r17.Ayw()
            X.5QC r1 = (X.AnonymousClass5QC) r1
            X.5Q5 r0 = r1.A02
            X.5QB r0 = r0.A02
            X.5QA r5 = r0.A01
            androidx.compose.ui.graphics.layer.GraphicsLayer r7 = r1.A00
            r6 = r18
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x0169
            X.5dE r8 = r6.A0J
            boolean r0 = r8.BAw()
            if (r0 != 0) goto L_0x001f
            androidx.compose.ui.graphics.layer.GraphicsLayer.A02(r6)     // Catch:{ all -> 0x001f }
        L_0x001f:
            androidx.compose.ui.graphics.layer.GraphicsLayer.A00(r6)
            float r1 = r8.Bt8()
            r0 = 0
            r4 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r12 = 0
            if (r0 <= 0) goto L_0x0031
            r12 = 1
            r5.ARm()
        L_0x0031:
            android.graphics.Canvas r13 = X.AnonymousClass5R4.A00(r5)
            boolean r0 = r13.isHardwareAccelerated()
            r11 = r0 ^ 1
            if (r11 == 0) goto L_0x0084
            r13.save()
            long r2 = r6.A06
            r10 = 32
            long r0 = r2 >> r10
            int r9 = (int) r0
            float r14 = (float) r9
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r0 = (int) r2
            float r15 = (float) r0
            long r2 = r6.A05
            long r0 = r2 >> r10
            int r9 = (int) r0
            float r0 = (float) r9
            float r16 = r14 + r0
            int r0 = X.C289005cr.A00(r2)
            float r0 = (float) r0
            float r17 = r15 + r0
            float r3 = r8.AbF()
            X.5bW r2 = r8.Ap0()
            int r1 = r8.Ag3()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00f7
            int r0 = r8.Apj()
            if (r0 == r4) goto L_0x00f7
            r13.save()
        L_0x007a:
            r13.translate(r14, r15)
            android.graphics.Matrix r0 = r8.AF2()
            r13.concat(r0)
        L_0x0084:
            boolean r0 = r6.A0G
            if (r0 != 0) goto L_0x0090
            if (r11 == 0) goto L_0x00f5
            boolean r0 = r8.Ank()
            if (r0 == 0) goto L_0x00f5
        L_0x0090:
            r5.EJt()
            X.5dO r1 = r6.A04()
            boolean r0 = r1 instanceof X.C289305dN
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r1 instanceof X.C3018460h
            if (r0 == 0) goto L_0x00c3
            X.60h r1 = (X.C3018460h) r1
            X.6GT r0 = r1.A00
            float r9 = r0.A01
            float r3 = r0.A03
            float r2 = r0.A02
            float r1 = r0.A00
            X.5VN r0 = new X.5VN
            r0.<init>(r9, r3, r2, r1)
        L_0x00b0:
            r5.AHy(r0, r4)
        L_0x00b3:
            if (r7 == 0) goto L_0x0130
            X.5dJ r3 = r7.A0I
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0116
            java.lang.String r1 = "Only add dependencies during a tracking"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            X.5dN r1 = (X.C289305dN) r1
            X.5VN r0 = r1.A00
            goto L_0x00b0
        L_0x00c8:
            boolean r0 = r1 instanceof X.C3018460h
            if (r0 == 0) goto L_0x00ec
            X.60d r2 = r6.A0A
            if (r2 == 0) goto L_0x00e5
            r0 = r2
            X.60e r0 = (X.C3018160e) r0
            android.graphics.Path r0 = r0.A03
            r0.rewind()
        L_0x00d8:
            X.60h r1 = (X.C3018460h) r1
            X.6GT r1 = r1.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.AAA(r1, r0)
        L_0x00e1:
            r5.AHw(r2, r4)
            goto L_0x00b3
        L_0x00e5:
            X.60e r2 = X.C3026864w.A00()
            r6.A0A = r2
            goto L_0x00d8
        L_0x00ec:
            boolean r0 = r1 instanceof X.C289335dQ
            if (r0 == 0) goto L_0x00b3
            X.5dQ r1 = (X.C289335dQ) r1
            X.60d r2 = r1.A00
            goto L_0x00e1
        L_0x00f5:
            r4 = 0
            goto L_0x00b3
        L_0x00f7:
            X.5S9 r0 = r6.A08
            if (r0 != 0) goto L_0x0102
            X.5S8 r0 = new X.5S8
            r0.<init>()
            r6.A08 = r0
        L_0x0102:
            r0.EOX(r3)
            r0.EPk(r1)
            r0.ESH(r2)
            X.5S8 r0 = (X.AnonymousClass5S8) r0
            android.graphics.Paint r0 = r0.A01
            r18 = r0
            r13.saveLayer(r14, r15, r16, r17, r18)
            goto L_0x007a
        L_0x0116:
            X.0vq r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L_0x014a
            r0.A09(r6)
        L_0x011e:
            X.0vq r0 = r3.A01
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.A0A(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0130
        L_0x012a:
            int r0 = r6.A01
            int r0 = r0 + 1
            r6.A01 = r0
        L_0x0130:
            r8.AQL(r5)
            if (r4 == 0) goto L_0x0138
            r5.EIm()
        L_0x0138:
            if (r12 == 0) goto L_0x013d
            r5.APQ()
        L_0x013d:
            if (r11 == 0) goto L_0x0169
            r13.restore()
            return
        L_0x0143:
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r3.A03
            if (r0 != r6) goto L_0x012a
            r3.A03 = r2
            goto L_0x0130
        L_0x014a:
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r3.A02
            if (r0 == 0) goto L_0x0166
            X.0vq r0 = X.AnonymousClass01q.A00
            r0 = 6
            X.0vq r1 = new X.0vq
            r1.<init>(r0)
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r3.A02
            X.0qQ.A0A(r0)
            r1.A09(r0)
            r1.A09(r6)
            r3.A00 = r1
            r3.A02 = r2
            goto L_0x011e
        L_0x0166:
            r3.A02 = r6
            goto L_0x011e
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289365dT.A00(X.5Q3, androidx.compose.ui.graphics.layer.GraphicsLayer):void");
    }
}
