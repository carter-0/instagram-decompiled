package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fur  reason: case insensitive filesystem */
public final class C51483Fur implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass3N2 A02;

    public C51483Fur(UserSession userSession, Reel reel, AnonymousClass3N2 r3) {
        this.A02 = r3;
        this.A01 = reel;
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (r7 == null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.3N2 r4 = r8.A02
            android.view.View r0 = r4.AeH()
            X.0qQ.A07(r0)
            X.F1w r1 = X.C48781Ek4.A00(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r1.A00(r0)
            com.instagram.model.reels.Reel r6 = r8.A01
            com.instagram.common.session.UserSession r5 = r8.A00
            com.instagram.api.schemas.RingSpec r7 = r6.A05(r5)
            if (r7 != 0) goto L_0x0020
            com.instagram.api.schemas.RingSpec r7 = X.AnonymousClass3NW.A00(r5, r6)
        L_0x0020:
            java.util.List r1 = r6.A0O(r5)
            X.0qQ.A07(r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0068
            java.lang.Object r3 = X.00k.A0K(r1)
            X.3uh r3 = (X.C255773uh) r3
            X.0qQ.A0A(r3)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r2 = 1
            X.3mL r1 = r3.A0e
            X.3mL r0 = X.C250963mL.OPTIMISTIC_MEDIA
            if (r1 != r0) goto L_0x004c
            X.4gK r0 = r3.A0d
            r0.getClass()
            X.3Q2 r0 = r0.A00
            com.instagram.api.schemas.RingSpecImpl r7 = r0.A0y
            if (r7 != 0) goto L_0x005a
        L_0x004c:
            boolean r0 = r3.A1D()
            if (r0 == 0) goto L_0x0077
            X.0eM r0 = X.AnonymousClass3Mk.A0D
        L_0x0054:
            java.lang.Object r7 = r0.getValue()
            com.instagram.api.schemas.RingSpec r7 = (com.instagram.api.schemas.RingSpec) r7
        L_0x005a:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r3 = r4.Bkt()
            X.IiY r2 = new X.IiY
            r2.<init>(r5, r6, r4)
            r0 = 700(0x2bc, double:3.46E-321)
            r3.postDelayed(r2, r0)
        L_0x0068:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.Bkt()
            r0.setGradientColors((com.instagram.api.schemas.RingSpec) r7)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.Bkt()
            r0.A05()
            return
        L_0x0077:
            X.3QO r1 = r3.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 == r0) goto L_0x00a4
            X.3QO r1 = r3.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            if (r1 == r0) goto L_0x00a4
            X.3QO r1 = r3.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 != r0) goto L_0x0098
            boolean r0 = X.AnonymousClass37B.A01(r5, r2)
            if (r0 == 0) goto L_0x00a1
            X.0eM r0 = X.AnonymousClass3Mk.A0G
            goto L_0x0054
        L_0x0098:
            boolean r0 = r3.A0h()
            if (r0 == 0) goto L_0x00a1
            X.0eM r0 = X.AnonymousClass3Mk.A0H
            goto L_0x0054
        L_0x00a1:
            X.0eM r0 = X.AnonymousClass3Mk.A0C
            goto L_0x0054
        L_0x00a4:
            X.0eM r0 = X.AnonymousClass3Mk.A0B
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51483Fur.run():void");
    }
}
