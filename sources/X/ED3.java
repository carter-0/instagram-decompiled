package X;

import android.os.SystemClock;

public final class ED3 extends 1P0 {
    public long A00;
    public final String A01 = "phone_id";
    public final /* synthetic */ E3s A02;

    public ED3(E3s e3s) {
        this.A02 = e3s;
    }

    public final void onFail(C268654dm r9) {
        int A03 = AnonymousClass0fD.A03(1831560887);
        ED3.super.onFail(r9);
        AnonymousClass0aP r6 = this.A02.A05;
        double A002 = Dbb.A00(r6);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "show_continue_as_failed");
        DbZ.A1G(A0e, A002, A003);
        DbT.A1O(A0e);
        DbZ.A1F(A0e, A003);
        DbS.A1H(A0e, "landing");
        FH8.A08(A0e, r6);
        AnonymousClass0fD.A0A(1451830526, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1185498701);
        AnonymousClass0aP r2 = this.A02.A05;
        0qQ.A0B(r2, 0);
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r2), "show_continue_as_finished");
        Dbc.A0X(A0e, A012, A002);
        DbS.A1H(A0e, "landing");
        A0e.A9F("ts", Long.valueOf(SystemClock.elapsedRealtime() - this.A00));
        FH8.A0E(A0e, "waterfall_id", 1Q0.A01());
        A0e.AAJ("release_channel", (String) null);
        DbS.A1L(A0e, (String) null);
        DbT.A1P(A0e);
        A0e.Cgf();
        AnonymousClass0fD.A0A(-1283061582, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-141495388);
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass0fD.A0A(-806559348, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d3, code lost:
        r9 = !android.text.TextUtils.isEmpty(r12.A03);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2083097532(0x7c298bbc, float:3.5213293E36)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.Dw8 r12 = (X.Dw8) r12
            r0 = -1588751818(0xffffffffa14d9236, float:-6.965021E-19)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.E3s r8 = r11.A02
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = r11.A01
            java.lang.String r0 = "phone_id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0057
            X.1Q0 r1 = X.1Q0.A0H
            X.0aP r0 = r8.A05
            X.FGI r2 = r1.A02(r0)
            X.DiE r1 = X.C46634DiE.A0r
            r0 = 0
            X.FBm r1 = r2.A06(r0, r1)
            X.Et6 r0 = X.C49886FBm.A00(r1)
            monitor-enter(r0)
            monitor-exit(r0)
            X.Et6 r0 = X.C49886FBm.A00(r1)
            monitor-enter(r0)
            monitor-exit(r0)
            X.Et6 r0 = X.C49886FBm.A00(r1)
            monitor-enter(r0)
            monitor-exit(r0)
            X.Et6 r0 = X.C49886FBm.A00(r1)
            monitor-enter(r0)
            monitor-exit(r0)
            r1.A02()
            r0 = -1473518509(0xffffffffa82be453, float:-9.541917E-15)
        L_0x004d:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 394506618(0x1783b17a, float:8.510478E-25)
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x0057:
            boolean r0 = r12.A04
            if (r0 != 0) goto L_0x0091
            X.0aP r10 = r8.A05
            java.lang.String r9 = "landing"
            java.lang.String r8 = r11.A01
            X.DbY.A1S(r10, r8)
            double r2 = X.DbS.A01()
            double r0 = X.DbS.A00()
            X.0wc r5 = X.AnonymousClass0kN.A02(r10)
            java.lang.String r4 = "show_continue_as_user_not_found"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r5, r4)
            X.Dbc.A0X(r4, r2, r0)
            X.DbW.A11(r4)
            X.DbS.A1H(r4, r9)
            X.FH8.A04(r4)
            X.FH8.A09(r4, r10)
            java.lang.String r0 = "origin"
            r4.AAJ(r0, r8)
            r4.Cgf()
            r0 = -1586535647(0xffffffffa16f6321, float:-8.1107546E-19)
            goto L_0x004d
        L_0x0091:
            r3 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r2 = r12.A02
            java.lang.String r1 = r12.A00
            r0 = 0
            X.0qQ.A0B(r3, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            X.C48215Eaw.A00 = r0
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r2)
            X.C48215Eaw.A01 = r0
        L_0x00ae:
            android.widget.TextSwitcher r0 = r8.A02
            android.view.View r0 = r0.getCurrentView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = X.DbV.A0x(r0)
            r1 = 2131956700(0x7f1313dc, float:1.9549963E38)
            java.lang.String r0 = r12.A01
            r9 = 0
            java.lang.String r1 = X.DbV.A0z(r8, r0, r1)
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x00cf
            android.widget.TextSwitcher r0 = r8.A02
            r0.setText(r1)
        L_0x00cf:
            android.widget.TextView r0 = r8.A03
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r12.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = r0 ^ 1
            if (r9 == 0) goto L_0x0103
            android.content.res.Resources r1 = X.DbV.A05(r8)
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r3 = r1.getInteger(r0)
            android.widget.TextView r1 = r8.A03
            r0 = 0
            r1.setAlpha(r0)
            android.widget.TextView r1 = r8.A03
            java.lang.String r0 = r12.A03
            r1.setText(r0)
            android.widget.TextView r0 = r8.A03
            android.view.ViewPropertyAnimator r2 = X.DbY.A0G(r0)
            long r0 = (long) r3
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
        L_0x0103:
            X.0aP r5 = r8.A05
            X.DiE r4 = X.C46634DiE.A0r
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r8.A00
            long r2 = r2 - r0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.C49225ErU.A00(r5, r4, r1, r2)
            r0 = 784446352(0x2ec1b390, float:8.8085206E-11)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ED3.onSuccess(java.lang.Object):void");
    }
}
