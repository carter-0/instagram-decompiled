package X;

import android.os.SystemClock;

public final class JU8 implements C252203oj {
    public static final C71392co A03 = C71392co.A04(4.0d, 4.0d);
    public static final C71392co A04 = C71392co.A04(4.0d, 4.0d);
    public C59995Jd4 A00;
    public JU7 A01;
    public final 2cs A02;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r7) {
        0qQ.A0B(r7, 0);
        if (0qQ.A0K(r7.A05, A03) && r7.A09.A00 == 1.0d) {
            C59995Jd4 jd4 = this.A00;
            if (jd4 == null) {
                0qQ.A0F("gifDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
            jd4.A03 = MMK.A00(this, 21);
            if (jd4.A04) {
                jd4.A04 = false;
                jd4.A02 = SystemClock.uptimeMillis() - ((long) jd4.A00);
                jd4.invalidateSelf();
            }
        }
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r6.A0E(0.0d) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmE(X.2cs r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.JU7 r4 = r5.A01
            if (r4 == 0) goto L_0x003d
            float r3 = X.JTO.A03(r6)
            X.2co r1 = r6.A05
            X.2co r0 = A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            boolean r0 = r6.A0C()
            if (r0 == 0) goto L_0x0025
            r0 = 0
            boolean r0 = r6.A0E(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            X.2V5 r0 = r4.A01
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r0.A00(r1)
            X.2V5 r0 = r4.A02
            r0.A00(r1)
            if (r2 == 0) goto L_0x003d
            X.MTG r0 = r4.A00
            if (r0 == 0) goto L_0x003d
            r0.CvD()
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JU8.DmE(X.2cs):void");
    }

    public JU8() {
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A0A(this);
        this.A02 = A0J;
    }
}
