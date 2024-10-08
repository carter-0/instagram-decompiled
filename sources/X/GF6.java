package X;

import android.view.MotionEvent;
import com.instagram.common.session.UserSession;

public final class GF6 implements C59626JQu {
    public 0sP A00;
    public 0sP A01;
    public 0sP A02;
    public final UserSession A03;

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Djm(android.view.View r11, X.C267324bN r12, X.C52058GDe r13, boolean r14, boolean r15) {
        /*
            r10 = this;
            r6 = r12
            r7 = r13
            X.AnonymousClass7TG.A1N(r12, r13)
            X.Jw6 r4 = new X.Jw6
            r5 = r11
            r8 = r14
            r9 = r15
            r4.<init>((android.view.View) r5, (X.C267324bN) r6, (X.C52058GDe) r7, (boolean) r8, (boolean) r9)
            if (r15 == 0) goto L_0x0026
            com.instagram.common.session.UserSession r3 = r10.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320652933866198(0x810971002222d6, double:3.032665394682828E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0026
            X.0sP r0 = r10.A00
        L_0x0020:
            if (r0 == 0) goto L_0x0025
            r0.invoke(r4)
        L_0x0025:
            return
        L_0x0026:
            X.0sP r0 = r10.A01
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GF6.Djm(android.view.View, X.4bN, X.GDe, boolean, boolean):void");
    }

    public final void Djq(MotionEvent motionEvent, C267324bN r4, C52058GDe gDe) {
        String id;
        0qQ.A0B(r4, 1);
        1Xj r0 = r4.A02;
        if (r0 != null && (id = r0.getId()) != null) {
            C61076JwE jwE = new C61076JwE(motionEvent, id);
            0sP r02 = this.A02;
            if (r02 != null) {
                r02.invoke(jwE);
            }
        }
    }

    public GF6(UserSession userSession) {
        this.A03 = userSession;
    }

    public final void EbF(0sP r1) {
        this.A00 = r1;
    }

    public final void Ebf(0sP r1) {
        this.A01 = r1;
    }

    public final void EkC(0sP r1) {
        this.A02 = r1;
    }
}
