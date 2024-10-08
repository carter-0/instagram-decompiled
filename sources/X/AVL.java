package X;

import android.os.Handler;

public final class AVL implements C252203oj {
    public static final C71392co A05 = C71392co.A04(30.0d, 5.0d);
    public float A00;
    public final Handler A01;
    public final 2cs A02;
    public final Runnable A03 = new C40888Akw(this);
    public final C357918a4 A04;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r3.A0e != X.AnonymousClass05K.A00) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmE(X.2cs r8) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.2ct r0 = r8.A09
            double r0 = r0.A00
            float r4 = (float) r0
            r7.A00 = r4
            X.8a4 r3 = r7.A04
            X.ADl r6 = r3.A0U
            if (r6 == 0) goto L_0x003e
            android.widget.TextView r2 = r6.A01
            r2.setAlpha(r4)
            r5 = 0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x001e
            r0 = 4
        L_0x001e:
            r2.setVisibility(r0)
            X.3oV r2 = r6.A02
            int r1 = r2.CFV()
            r0 = 8
            if (r1 == r0) goto L_0x003e
            android.view.View r2 = r2.getView()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 - r4
            r2.setAlpha(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
            r5 = 4
        L_0x003b:
            r2.setVisibility(r5)
        L_0x003e:
            X.AGr r5 = r3.A0X
            if (r5 == 0) goto L_0x0062
            boolean r0 = r3.A15
            if (r0 == 0) goto L_0x004d
            java.lang.Integer r2 = r3.A0e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 1
            if (r2 == r0) goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0062
            float r0 = r5.A00
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            r5.A00 = r4
            if (r1 != 0) goto L_0x005f
            X.AGr.A00(r5, r4)
        L_0x005f:
            X.AGr.A01(r5, r4)
        L_0x0062:
            X.Wam r0 = r3.A0Y
            if (r0 == 0) goto L_0x007a
            X.VzK r0 = r0.A02
            if (r0 == 0) goto L_0x007a
            X.U17 r2 = r0.A07
            r2.A01 = r4
            r1 = 1
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            r1 = 3
        L_0x0075:
            r2.A0B = r1
            r2.invalidateSelf()
        L_0x007a:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            X.AJ9 r1 = r3.A0Z
            if (r0 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x008a
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x008a
            X.AJ9.A07(r1)
        L_0x008a:
            return
        L_0x008b:
            if (r1 == 0) goto L_0x008a
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x008a
            X.AJ9.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVL.DmE(X.2cs):void");
    }

    public AVL(C357918a4 r3) {
        this.A04 = r3;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(A05);
        A0J.A06 = true;
        A0J.A0A(this);
        this.A02 = A0J;
        this.A01 = AnonymousClass7TF.A0D();
    }
}
