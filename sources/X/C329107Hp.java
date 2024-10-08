package X;

import android.view.ViewGroup;

/* renamed from: X.7Hp  reason: invalid class name and case insensitive filesystem */
public final class C329107Hp {
    public final /* synthetic */ C329067Hl A00;

    public C329107Hp(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void A00() {
        C329067Hl.A0m(this.A00, false, false);
    }

    public final void A01() {
        ViewGroup viewGroup;
        C329067Hl r4 = this.A00;
        AnonymousClass7L0 r5 = r4.A0U;
        C329847Kl r6 = r4.A0t;
        if (r6 != null && r5 != null && (viewGroup = r6.A02) != null && viewGroup.getVisibility() == 8) {
            ViewGroup viewGroup2 = r6.A02;
            if (viewGroup2 != null) {
                if (viewGroup2.getVisibility() == 8) {
                    ViewGroup viewGroup3 = r6.A02;
                    if (viewGroup3 != null) {
                        C294975nL A01 = C294975nL.A01(viewGroup3, 0);
                        A01.A0G();
                        C294975nL A0F = A01.A0F(true);
                        A0F.A0T((float) r6.A00, 0.0f);
                        A0F.A04 = 0;
                        A0F.A0H();
                    }
                }
                C329067Hl.A0e(r4, r5.A02);
                r4.A1B = true;
                return;
            }
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r2 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1.A02() == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r1.A00 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(boolean r8) {
        /*
            r7 = this;
            X.7Hl r5 = r7.A00
            X.7Kg r1 = r5.A0c
            r0 = 1
            if (r1 == 0) goto L_0x000e
            boolean r1 = r1.A02()
            r6 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r6 = 0
        L_0x000f:
            X.OWa r1 = r5.A0S
            if (r1 == 0) goto L_0x0018
            android.view.ViewGroup r1 = r1.A00
            r4 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            android.view.ViewGroup r3 = r5.A1V
            r2 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r1 = r3.findViewById(r2)
            if (r1 == 0) goto L_0x002f
            android.view.View r1 = r3.findViewById(r2)
            int r1 = r1.getVisibility()
            r3 = 1
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            X.7Kn r1 = r5.A0h
            if (r1 == 0) goto L_0x003b
            boolean r2 = r1.A03()
            r1 = 1
            if (r2 != 0) goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r6 == 0) goto L_0x0054
            if (r4 != 0) goto L_0x005b
            if (r3 != 0) goto L_0x005b
            if (r1 != 0) goto L_0x005b
            if (r8 == 0) goto L_0x005b
            com.instagram.common.session.UserSession r3 = r5.A1Z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314047272061310(0x81036f0002097e, double:3.028487947558552E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            return r0
        L_0x0054:
            if (r4 != 0) goto L_0x005b
            if (r3 != 0) goto L_0x005b
            if (r1 != 0) goto L_0x005b
            return r0
        L_0x005b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329107Hp.A02(boolean):boolean");
    }
}
