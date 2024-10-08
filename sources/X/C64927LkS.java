package X;

import com.instagram.creation.photo.crop.LayoutImageView;

/* renamed from: X.LkS  reason: case insensitive filesystem */
public final class C64927LkS implements X96 {
    public final int A00;
    public final Object A01;

    public C64927LkS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DHm(float f, float f2) {
        if (this.A00 != 0) {
            LayoutImageView layoutImageView = (LayoutImageView) this.A01;
            C66512MUq mUq = layoutImageView.A00;
            if (mUq != null) {
                mUq.DHl();
            }
            layoutImageView.A0I(0.0f, 0.0f);
            return;
        }
        ((C66512MUq) this.A01).DHl();
    }

    public final void DHq() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r8 != 0.0f) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DSf(float r5, float r6, float r7, float r8, float r9, float r10) {
        /*
            r4 = this;
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0038
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x000e
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r1 = 1
        L_0x000f:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r4.A01
            X.JVz r2 = (X.C59741JVz) r2
            r1 = r1 ^ 1
            android.graphics.PointF r0 = r2.A03
            if (r0 != 0) goto L_0x0039
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r5, r6)
            r2.A03 = r0
        L_0x0026:
            android.graphics.Matrix r0 = r2.A08
            r0.postScale(r9, r9, r5, r6)
            if (r1 == 0) goto L_0x0030
            X.C59741JVz.A01(r2)
        L_0x0030:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
        L_0x0038:
            return
        L_0x0039:
            r0.set(r5, r6)
            goto L_0x0026
        L_0x003d:
            java.lang.Object r1 = r4.A01
            X.JVz r1 = (X.C59741JVz) r1
            android.graphics.Matrix r0 = r1.A08
            r0.postTranslate(r7, r8)
            X.C59741JVz.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64927LkS.DSf(float, float, float, float, float, float):void");
    }

    public final void DsP(boolean z) {
    }

    public final void Dl2(float f, float f2) {
    }

    public final void DlH(float f, float f2, float f3, float f4) {
    }
}
