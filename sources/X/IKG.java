package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class IKG implements AnonymousClass2WK {
    public final Drawable A00;
    public final ImageView.ScaleType A01;
    public final boolean A02;

    public IKG(Drawable drawable, ImageView.ScaleType scaleType, boolean z) {
        0qQ.A0B(scaleType, 2);
        this.A00 = drawable;
        this.A01 = scaleType;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r13 > 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r3.getIntrinsicHeight() > 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2WL Cfk(X.2WI r17, long r18) {
        /*
            r16 = this;
            r4 = 0
            r0 = r17
            X.0qQ.A0B(r0, r4)
            X.3cP r10 = X.C245143cO.A01
            r14 = r18
            long r0 = X.C245333ch.A01(r14)
            r5 = r16
            android.graphics.drawable.Drawable r3 = r5.A00
            r2 = 0
            if (r3 == 0) goto L_0x0029
            long r7 = X.C245143cO.A00
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r7 = 0
            if (r6 != 0) goto L_0x0038
            r7 = 1
            int r6 = r3.getIntrinsicWidth()
            if (r6 <= 0) goto L_0x0029
            int r6 = r3.getIntrinsicHeight()
            if (r6 > 0) goto L_0x0038
        L_0x0029:
            long r0 = X.C51971G9r.A0J()
            X.Hly r3 = new X.Hly
            r3.<init>(r2, r4, r4)
        L_0x0032:
            X.2WL r2 = new X.2WL
            r2.<init>(r0, r3)
            return r2
        L_0x0038:
            int r12 = r3.getIntrinsicWidth()
            int r13 = r3.getIntrinsicHeight()
            if (r7 == 0) goto L_0x0052
            boolean r0 = X.C245073cH.A06(r14)
            if (r0 != 0) goto L_0x0093
            boolean r0 = X.C245073cH.A05(r14)
            if (r0 != 0) goto L_0x0093
            long r0 = X.C245133cN.A00(r12, r13)
        L_0x0052:
            int r6 = X.C245143cO.A00(r0)
            int r7 = java.lang.Math.max(r4, r6)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r10
            int r6 = (int) r0
            int r0 = java.lang.Math.max(r4, r6)
            long r0 = X.C245133cN.A00(r7, r0)
            android.widget.ImageView$ScaleType r9 = r5.A01
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.FIT_XY
            if (r9 == r8) goto L_0x0086
            if (r12 <= 0) goto L_0x0080
            if (r13 <= 0) goto L_0x0080
            X.3gR r7 = X.AnonymousClass2VX.A01
            int r6 = X.C245143cO.A00(r0)
            long r4 = r0 & r10
            int r2 = (int) r4
            X.2VX r2 = r7.A00(r3, r9, r6, r2)
        L_0x0080:
            if (r8 == r9) goto L_0x0086
            if (r12 <= 0) goto L_0x0086
            if (r13 > 0) goto L_0x008d
        L_0x0086:
            int r12 = X.C245143cO.A00(r0)
            long r3 = r0 & r10
            int r13 = (int) r3
        L_0x008d:
            X.Hly r3 = new X.Hly
            r3.<init>(r2, r12, r13)
            goto L_0x0032
        L_0x0093:
            float r11 = (float) r12
            float r0 = (float) r13
            float r11 = r11 / r0
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x009f
            long r0 = X.C245333ch.A03(r10, r11, r12, r13, r14)
            goto L_0x0052
        L_0x009f:
            long r0 = X.C245333ch.A00(r11, r14)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IKG.Cfk(X.2WI, long):X.2WL");
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
