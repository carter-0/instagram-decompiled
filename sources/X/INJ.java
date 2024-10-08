package X;

import android.graphics.Bitmap;

public final class INJ implements AnonymousClass1MK {
    public final int A00;
    public final Object A01;

    public INJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r2 = (X.GIH) r6.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CyF(X.C226952iF r7, X.AnonymousClass3LX r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0042;
                case 1: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.AnonymousClass7TG.A1N(r7, r8)
            android.graphics.Bitmap r4 = r8.A01
            if (r4 == 0) goto L_0x0029
            java.lang.Object r3 = r7.C3s()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r2 = r6.A01
            X.GIH r2 = (X.GIH) r2
            java.util.List r1 = r2.A02
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r3)
            r1.set(r0, r4)
            r2.invalidateSelf()
        L_0x0029:
            return
        L_0x002a:
            r0 = 1
            X.0qQ.A0B(r8, r0)
            android.graphics.Bitmap r0 = r8.A01
            java.lang.Object r1 = r6.A01
            X.GIH r1 = (X.GIH) r1
            if (r0 != 0) goto L_0x003e
            X.0eM r0 = r1.A0B
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x003e:
            X.GIH.A02(r0, r1)
            return
        L_0x0042:
            X.AnonymousClass7TG.A1N(r7, r8)
            android.graphics.Bitmap r5 = r8.A01
            java.lang.Object r4 = r6.A01
            X.3gU r4 = (X.C247533gU) r4
            if (r5 == 0) goto L_0x0060
            com.instagram.common.typedurl.ImageUrl r3 = r7.BRH()
            X.0qQ.A07(r3)
            java.lang.String r2 = r8.A04
            int r1 = r8.A00
            X.3gu r0 = new X.3gu
            r0.<init>(r5, r3, r2, r1)
        L_0x005d:
            r4.A01 = r0
            return
        L_0x0060:
            X.HBB r0 = X.HBB.A00
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.INJ.CyF(X.2iF, X.3LX):void");
    }

    public final void DJx(C226952iF r3, C254673sr r4) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            GIH gih = (GIH) obj;
            GIH.A02((Bitmap) AnonymousClass7TE.A14(gih.A0B), gih);
            return;
        }
        ((C247533gU) obj).A01 = HBB.A00;
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
