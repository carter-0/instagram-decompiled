package X;

import android.view.View;

/* renamed from: X.4G2  reason: invalid class name */
public abstract class AnonymousClass4G2 {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 == false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r6, X.AnonymousClass9J0 r7, com.instagram.common.session.UserSession r8, X.AnonymousClass4DU r9, X.AnonymousClass3TW r10, X.AnonymousClass4G1 r11, X.AnonymousClass3W1 r12) {
        /*
            r4 = 0
            r3 = 1
            X.0qQ.A0B(r7, r3)
            r0 = 4
            X.0qQ.A0B(r11, r0)
            X.9J0 r0 = r10.A04
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r7.A01
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            X.3W1 r1 = r10.A08
            if (r1 == 0) goto L_0x0077
            if (r1 == r12) goto L_0x0077
        L_0x0021:
            if (r0 == 0) goto L_0x0074
            if (r5 == 0) goto L_0x0047
            android.view.View r1 = r10.A03
            if (r1 == 0) goto L_0x0032
            X.2co r0 = X.C315596kB.A02
            X.5nL r0 = X.C294975nL.A01(r1, r4)
            r0.A0G()
        L_0x0032:
            java.lang.Runnable r1 = r10.A09
            if (r1 == 0) goto L_0x003b
            android.os.Handler r0 = r10.A0B
            r0.removeCallbacks(r1)
        L_0x003b:
            X.3W1 r1 = r10.A08
            if (r1 == 0) goto L_0x0041
            r1.A2Y = r4
        L_0x0041:
            if (r1 == 0) goto L_0x0047
            r0 = 0
            r1.A0M(r10, r0, r3)
        L_0x0047:
            r10.A05 = r8
            r10.A00 = r6
            r10.A06 = r9
            r10.A04 = r7
            r0 = 0
            r12.A0L(r10, r0, r3)
            X.4G3 r0 = new X.4G3
            r0.<init>(r7, r10, r11)
            r10.A01 = r0
            X.4G4 r0 = new X.4G4
            r0.<init>(r7, r10, r11)
            r10.A02 = r0
            r10.A08 = r12
            X.4G5 r0 = new X.4G5
            r0.<init>(r10)
            r10.A09 = r0
            boolean r0 = r12.A2Y
            if (r0 != 0) goto L_0x0070
            r2 = 8
        L_0x0070:
            r10.A01(r2)
            return
        L_0x0074:
            if (r5 == 0) goto L_0x0047
            goto L_0x0041
        L_0x0077:
            r5 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4G2.A00(android.app.Activity, X.9J0, com.instagram.common.session.UserSession, X.4DU, X.3TW, X.4G1, X.3W1):void");
    }

    public static final void A01(AnonymousClass3TW r3) {
        Runnable runnable = r3.A09;
        if (runnable != null) {
            r3.A0B.removeCallbacks(runnable);
        }
        View view = r3.A03;
        if (view != null) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0F = C294975nL.A01(view, 0).A0F(true);
            A0F.A0T(0.0f, r3.A0A);
            A0F.A05 = new IZP(r3);
            A0F.A0H();
        }
    }
}
