package X;

import android.view.View;

public final class EDB extends 1P0 {
    public View A00;
    public 1P0 A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0aP A03;
    public final C46634DiE A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final /* synthetic */ LQc A08;

    public EDB(View view, AnonymousClass4DH r2, 1P0 r3, AnonymousClass0aP r4, LQc lQc, C46634DiE diE, String str, String str2, boolean z) {
        this.A08 = lQc;
        this.A03 = r4;
        this.A05 = str;
        r2.getClass();
        this.A02 = r2;
        this.A04 = diE;
        this.A06 = str2;
        this.A00 = view;
        this.A01 = r3;
        this.A07 = z;
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [X.KHI, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (android.text.TextUtils.isEmpty(r14) != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            r25 = this;
            r7 = r26
            r0 = 2114135370(0x7e03254a, float:4.358062E37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.DwY r7 = (X.DwY) r7
            r0 = 1621121557(0x60a05a15, float:9.243657E19)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.FEx r0 = new X.FEx
            r0.<init>()
            r2 = 1
            r0.A02()
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            android.os.Bundle r0 = r0.A00
            r5.putAll(r0)
            java.lang.String r15 = r7.A04
            java.lang.String r9 = r7.A02
            boolean r8 = r7.A0A
            r0 = r25
            if (r15 == 0) goto L_0x016f
            java.lang.String r4 = "registration_flow"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x00e2
            X.4DH r6 = r0.A02
            androidx.fragment.app.FragmentActivity r4 = r6.getActivity()
            if (r4 == 0) goto L_0x00d5
            boolean r4 = r6.isResumed()
            if (r4 == 0) goto L_0x00d5
            boolean r4 = r7.A08
            if (r4 == 0) goto L_0x016f
            if (r9 == 0) goto L_0x0061
            X.FFx r13 = X.C49944FFx.A00
            X.0aP r10 = r0.A03
            X.DiE r4 = r0.A04
            java.lang.String r4 = r4.A01
            X.S6k r11 = X.LQc.A07
            java.lang.String r19 = "ar_code_sms"
            java.lang.String r16 = "client_reg_reg_start_message_received"
            java.lang.String r17 = "received register start message from server"
            r18 = r15
            r14 = r10
            r15 = r4
            r13.A04(r14, r15, r16, r17, r18, r19)
        L_0x0061:
            boolean r4 = r0.A07
            if (r4 != 0) goto L_0x016f
            X.DbT.A15()
            java.lang.String r14 = r0.A06
            X.0aP r15 = r0.A03
            java.lang.String r12 = "IgSessionManager.LOGGED_OUT_TOKEN"
            java.lang.String r13 = r0.A05
            r11 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r14)
            if (r4 != 0) goto L_0x007e
            boolean r10 = android.text.TextUtils.isEmpty(r14)
            r4 = 1
            if (r10 == 0) goto L_0x007f
        L_0x007e:
            r4 = 0
        L_0x007f:
            X.17k.A0E(r4)
            android.os.Bundle r10 = X.AnonymousClass7TE.A0a()
            if (r14 == 0) goto L_0x0092
            java.lang.String r4 = "phone_number_key"
            r10.putString(r4, r14)
            java.lang.String r4 = "query_key"
            r10.putString(r4, r14)
        L_0x0092:
            if (r13 == 0) goto L_0x0099
            java.lang.String r4 = "client_message"
            r10.putString(r4, r13)
        L_0x0099:
            if (r9 == 0) goto L_0x00a0
            java.lang.String r4 = "register_start_message"
            r10.putString(r4, r9)
        L_0x00a0:
            java.lang.String r4 = "should_enable_auto_conf"
            r10.putBoolean(r4, r8)
            java.lang.String r4 = "arg_is_reg_flow"
            r10.putBoolean(r4, r11)
            X.DbS.A1A(r10, r12)
            r10.putAll(r5)
            X.E3X r5 = new X.E3X
            r5.<init>()
            androidx.fragment.app.FragmentActivity r4 = X.DbU.A0I(r10, r5, r6)
            X.6Yo r4 = X.DbV.A0N(r5, r4, r15)
            r4.A0G = r2
            r4.A04()
            X.FGJ r13 = X.FGJ.A03
            androidx.fragment.app.FragmentActivity r14 = r6.getActivity()
            java.lang.String r2 = r7.A05
            X.DiE r0 = r0.A04
            r18 = r2
            r16 = r5
            r17 = r0
            r13.A03(r14, r15, r16, r17, r18)
        L_0x00d5:
            r0 = -883015274(0xffffffffcb5e4196, float:-1.4565782E7)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -2107409633(0xffffffff82637b1f, float:-1.671266E-37)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00e2:
            java.lang.String r4 = "optimistic_authentication_flow"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x016f
            java.lang.String r14 = r7.A00
            if (r14 != 0) goto L_0x0125
            X.0aP r10 = r0.A03
            X.DiE r5 = r0.A04
            java.lang.String r12 = r5.A01
            X.LQc r4 = r0.A08
            X.S6k r6 = X.LQc.A07
            java.lang.String r16 = "ar_code_sms"
            r17 = 0
            java.lang.String r13 = "client_auth_failed_empty_auth_data"
            java.lang.String r14 = "no auth data received from server"
            java.lang.String r19 = "empty_auth_data_auth"
            boolean r2 = X.DbW.A1S(r2, r10, r12)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            r18 = r17
            r20 = r17
            X.C49944FFx.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = r0.A05
            java.lang.String r6 = r0.A06
            X.4DH r8 = r0.A02
            X.1P0 r2 = r0.A01
            boolean r0 = r0.A07
            r9 = r2
            r11 = r4
            r12 = r5
            r13 = r7
            r14 = r6
            r15 = r0
            X.LQc.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00d5
        L_0x0125:
            X.LQc r11 = r0.A08
            X.0aP r10 = r0.A03
            java.lang.String r9 = r0.A06
            X.4DH r8 = r0.A02
            X.DiE r6 = r0.A04
            android.view.View r5 = r0.A00
            X.EMS r4 = new X.EMS
            r4.<init>(r0, r2)
            java.lang.String r13 = r7.A01
            X.S6k r0 = X.LQc.A07
            X.KzR r12 = new X.KzR
            r12.<init>()
            byte[] r7 = r0.A03(r14)
            android.os.Bundle r2 = r12.A00
            java.lang.String r0 = "challenge"
            r2.putByteArray(r0, r7)
            r7 = 0
            android.os.Bundle r2 = r12.A00
            java.lang.String r0 = "useDebugKey"
            r2.putBoolean(r0, r7)
            X.KHI r14 = new X.KHI
            r17 = r8
            r18 = r10
            r19 = r4
            r20 = r11
            r21 = r6
            r22 = r9
            r23 = r15
            r24 = r13
            r15 = r5
            r16 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.1ES.A03(r14)
            goto L_0x00d5
        L_0x016f:
            X.1P0 r0 = r0.A01
            r0.onSuccess(r7)
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDB.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(697253374);
        this.A01.onFail(r3);
        AnonymousClass0fD.A0A(-989405580, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-695859316);
        this.A01.onFinish();
        AnonymousClass0fD.A0A(-122833426, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(964825274);
        this.A01.onStart();
        AnonymousClass0fD.A0A(-601067634, A032);
    }
}
