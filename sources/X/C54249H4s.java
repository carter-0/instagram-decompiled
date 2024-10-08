package X;

import android.content.Context;

/* renamed from: X.H4s  reason: case insensitive filesystem */
public final class C54249H4s extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ F3H A03;
    public final /* synthetic */ AnonymousClass6Z5 A04;

    public C54249H4s(Context context, AnonymousClass4DH r2, 1Xj r3, F3H f3h, AnonymousClass6Z5 r5) {
        this.A03 = f3h;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(1961052799);
        C59689JTv.A0F(this.A00, "archive_story_failed", 2131953157);
        AnonymousClass0fD.A0A(362238802, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1272674204);
        this.A03.A00();
        AnonymousClass0fD.A0A(-1308602817, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-142493439);
        this.A03.A01();
        AnonymousClass0fD.A0A(566640971, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r0 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r1 == false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = -2108429913(0xffffffff8253e9a7, float:-1.5568887E-37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1715849338(0xffffffff99ba3786, float:-1.9254375E-23)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.1Xj r13 = r14.A02
            X.1sw r2 = X.1sw.A04
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.1Xy r1 = r13.A0C
            java.lang.String r0 = r2.A00
            r1.Eqi(r0)
            X.6Z5 r11 = r14.A04
            com.instagram.common.session.UserSession r1 = r11.A09
            java.lang.String r0 = "userSession"
            if (r1 == 0) goto L_0x003f
            r13.AE7(r1)
            X.4mU r5 = r11.A17
            r6 = r5
            instagram.features.stories.fragment.ReelViewerFragment r6 = (instagram.features.stories.fragment.ReelViewerFragment) r6
            X.3mM r12 = r6.A0a
            if (r12 == 0) goto L_0x0067
            X.4DH r2 = r14.A01
            android.content.Context r10 = r14.A00
            com.instagram.common.session.UserSession r1 = r11.A09
            if (r1 == 0) goto L_0x003f
            X.3BQ r0 = r11.A0G
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "reelViewerSource"
        L_0x003f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0047:
            r8 = 45
            X.IoM r7 = new X.IoM
            r7.<init>(r8, r9, r10, r11, r12, r13)
            boolean r1 = r5.Cfh()
            if (r1 == 0) goto L_0x0064
            android.view.View r6 = r2.mView
            if (r6 == 0) goto L_0x0062
            X.Iip r5 = new X.Iip
            r5.<init>(r13, r11, r0)
            r1 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r5, r1)
        L_0x0062:
            if (r0 != 0) goto L_0x0067
        L_0x0064:
            r7.invoke()
        L_0x0067:
            r0 = -779728792(0xffffffffd1864868, float:-7.2092549E10)
            goto L_0x0080
        L_0x006b:
            boolean r1 = X.AnonymousClass4EQ.A0F(r1, r12, r0)
            boolean r0 = r6.A2Q
            if (r0 == 0) goto L_0x0076
            r0 = 1
            if (r1 != 0) goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            androidx.fragment.app.FragmentActivity r9 = r2.getActivity()
            if (r9 != 0) goto L_0x0047
            r0 = -1601715332(0xffffffffa087c37c, float:-2.299925E-19)
        L_0x0080:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1744803020(0x67ff94cc, float:2.4138965E24)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54249H4s.onSuccess(java.lang.Object):void");
    }
}
