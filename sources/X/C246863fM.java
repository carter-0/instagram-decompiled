package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.3fM  reason: invalid class name and case insensitive filesystem */
public final class C246863fM implements C246873fN {
    public final Fragment A00;
    public final AnonymousClass2xS A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        if ((!r2.isEmpty()) != true) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQq(X.C61079JwH r19) {
        /*
            r18 = this;
            r0 = r18
            androidx.fragment.app.Fragment r4 = r0.A00
            X.2xS r0 = r0.A01
            X.2uK r0 = r0.A0G
            r1 = 0
            X.1Xj r10 = r0.A0G()
            if (r10 == 0) goto L_0x010c
            X.2uT r2 = r0.A0L
            X.4DU r8 = r2.A00
            com.instagram.common.session.UserSession r9 = r0.A0K
            X.GKd r7 = X.C52236GKd.A0R
            X.1Xy r2 = r10.A0C
            java.lang.String r2 = r2.CER()
            java.lang.String r11 = X.AnonymousClass3WP.A01(r2)
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x0191
            java.lang.String r12 = X.AnonymousClass3WP.A00(r9, r10)
        L_0x0029:
            boolean r13 = r0.A09
            X.0qQ.A0B(r9, r1)
            boolean r14 = X.AnonymousClass3WS.A06(r9)
            boolean r15 = X.AnonymousClass3WP.A07(r9)
            X.C52086GEg.A0B(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0Tu r5 = X.0Tu.A05
            r2 = 36322920674437800(0x810b8100012aa8, double:3.0340995229517677E-306)
            boolean r2 = X.182.A06(r5, r9, r2)
            if (r2 == 0) goto L_0x010d
            boolean r2 = X.AnonymousClass3WP.A05(r9)
            if (r2 != 0) goto L_0x010d
            r2 = -2
            android.widget.PopupWindow r4 = new android.widget.PopupWindow
            r4.<init>(r2, r2)
            r3 = 1
            r4.setFocusable(r3)
            android.content.Context r5 = r0.A0H
            X.1Xy r2 = r10.A0C
            java.util.List r2 = r2.C9Z()
            if (r2 == 0) goto L_0x0069
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            r14 = 1
            if (r2 == r3) goto L_0x006a
        L_0x0069:
            r14 = 0
        L_0x006a:
            boolean r15 = r0.A09
            r2 = 42
            X.PqU r12 = new X.PqU
            r12.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r10, (java.lang.Object) r0)
            X.Inp r11 = new X.Inp
            r11.<init>(r1, r4, r0)
            r2 = 40
            X.J6S r13 = new X.J6S
            r13.<init>(r2, r10, r0)
            X.1Xy r2 = r10.A0C
            java.lang.String r6 = r2.CER()
            X.1Xy r2 = r10.A0C
            java.lang.String r2 = r2.CER()
            java.lang.String r2 = X.AnonymousClass3WS.A00(r9, r2)
            boolean r2 = X.0qQ.A0K(r6, r2)
            r16 = r2 ^ 1
            X.Gw5 r10 = new X.Gw5
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            com.facebook.litho.LithoView r2 = com.facebook.litho.LithoView.A00(r5, r10)
            r4.setContentView(r2)
            r2 = 16973826(0x1030002, float:2.4060906E-38)
            r4.setAnimationStyle(r2)
            android.view.View r2 = r4.getContentView()
            r2.measure(r1, r1)
            X.4Ne r0 = r0.A02
            if (r0 == 0) goto L_0x00f8
            X.3V3 r0 = r0.A08
            if (r0 == 0) goto L_0x00f8
            X.3fz r0 = r0.BQv()
            if (r0 == 0) goto L_0x00f8
            android.widget.TextView r8 = r0.C2f()
            if (r8 == 0) goto L_0x00f8
            r7 = 2
            int[] r6 = new int[r7]
            r8.getLocationOnScreen(r6)
            r5 = r6[r1]
            int r2 = r8.getMeasuredWidth()
            android.view.View r0 = r4.getContentView()
            int r0 = r0.getMeasuredWidth()
            int r2 = r2 - r0
            int r2 = r2 / r7
            int r5 = r5 + r2
            r3 = r6[r3]
            android.view.View r0 = r4.getContentView()
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 - r0
            android.content.res.Resources r2 = r8.getResources()
            X.0qQ.A07(r2)
            r0 = 2131165377(0x7f0700c1, float:1.794497E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r3 = r3 - r0
            r4.showAtLocation(r8, r1, r5, r3)
        L_0x00f8:
            boolean r0 = r4.isShowing()
            if (r0 == 0) goto L_0x010c
            android.view.View r3 = r4.getContentView()
            X.IfX r2 = new X.IfX
            r2.<init>(r4)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.postDelayed(r2, r0)
        L_0x010c:
            return
        L_0x010d:
            java.lang.String r2 = "fragment_paused"
            r0.A0T(r2)
            android.content.Context r8 = r0.A0H
            X.2R8.A02(r9, r10)
            r5 = 0
            X.I9C r2 = new X.I9C
            r2.<init>(r10, r0)
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r10 = X.C273654mx.A00(r0)
            X.0qQ.A0B(r8, r1)
            r13 = 1
            boolean r0 = X.AnonymousClass3WP.A05(r9)
            r7 = 0
            if (r0 == 0) goto L_0x0186
            X.E2R r6 = X.C48763Ejm.A00(r1)
        L_0x0132:
            boolean r0 = X.AnonymousClass3WS.A04(r9)
            if (r0 != 0) goto L_0x013e
            boolean r0 = X.AnonymousClass3WS.A02(r9)
            if (r0 == 0) goto L_0x013f
        L_0x013e:
            r7 = 1
        L_0x013f:
            X.7Pr r3 = new X.7Pr
            r3.<init>(r9)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131954758(0x7f130c46, float:1.9546024E38)
            if (r7 == 0) goto L_0x0150
            r0 = 2131954760(0x7f130c48, float:1.9546028E38)
        L_0x0150:
            java.lang.String r0 = r1.getString(r0)
            r3.A0d = r0
            X.7Pu r3 = r3.A00()
            r0 = 198(0xc6, float:2.77E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 56
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FCT.A01(r5, r9, r1, r0, r5)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x010c
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            r3.A02(r1, r6)
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r1 = r0.A01(r1)
            if (r1 == 0) goto L_0x010c
            X.IZx r0 = new X.IZx
            r0.<init>(r2)
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0H = r0
            return
        L_0x0186:
            r11 = r5
            r12 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            X.ES1 r6 = X.C48762Ejl.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0132
        L_0x0191:
            java.lang.String r12 = ""
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246863fM.DQq(X.JwH):void");
    }

    public C246863fM(Fragment fragment, AnonymousClass2xS r2) {
        this.A00 = fragment;
        this.A01 = r2;
    }
}
