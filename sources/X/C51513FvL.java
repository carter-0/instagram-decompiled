package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FvL  reason: case insensitive filesystem */
public final /* synthetic */ class C51513FvL implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ EM4 A01;
    public final /* synthetic */ EI1 A02;
    public final /* synthetic */ User A03;

    public /* synthetic */ C51513FvL(UserSession userSession, EM4 em4, EI1 ei1, User user) {
        this.A02 = ei1;
        this.A01 = em4;
        this.A03 = user;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [X.KHD, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r0 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r2 = r22
            X.EI1 r4 = r2.A02
            X.EM4 r0 = r2.A01
            com.instagram.user.model.User r1 = r2.A03
            com.instagram.common.session.UserSession r10 = r2.A00
            java.lang.String r2 = r0.A06
            java.lang.Integer r7 = r0.A01
            if (r2 == 0) goto L_0x0123
            java.lang.String r0 = "autoconf_register_flow"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ea
            if (r7 == 0) goto L_0x00ea
            X.EDe r0 = r4.A01
            java.lang.String r8 = r0.A0B
            if (r8 == 0) goto L_0x00ea
            X.Ebe r3 = r0.A07
            if (r3 == 0) goto L_0x00ea
            java.lang.String r5 = r0.A0C
            if (r5 == 0) goto L_0x00ea
            X.FFx r15 = X.C49944FFx.A00
            X.DiE r6 = r0.A08
            java.lang.String r4 = ""
            if (r6 != 0) goto L_0x00c2
            r2 = r4
        L_0x0031:
            java.lang.String r20 = "registration_flow"
            java.lang.String r14 = "ar_code_sms"
            java.lang.String r18 = "client_reg_valid_login_response"
            java.lang.String r19 = "valid login response for reg flow"
            r16 = r10
            r17 = r2
            r21 = r14
            r15.A04(r16, r17, r18, r19, r20, r21)
            int r2 = r7.intValue()
            r9 = 2
            if (r2 == r9) goto L_0x00c6
            r9 = 3
            if (r2 == r9) goto L_0x00c6
            r9 = 4
            if (r2 == r9) goto L_0x00c6
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0208
            if (r6 == 0) goto L_0x005e
            java.lang.String r4 = r6.A01
        L_0x005e:
            java.lang.String r18 = "client_reg_not_show_user_consent"
            java.lang.String r19 = "reg with consent screen skipped, user already consented"
            r17 = r4
            r15.A04(r16, r17, r18, r19, r20, r21)
            boolean r0 = r3 instanceof X.EMU
            if (r0 == 0) goto L_0x00c1
            X.EMU r3 = (X.EMU) r3
            X.S6k r0 = X.LQc.A07
            X.E3X r9 = r3.A00
            android.content.Context r0 = r9.requireContext()
            X.LQc r12 = new X.LQc
            r12.<init>(r0)
            X.DiE r0 = r9.BzS()
            java.lang.String r13 = r0.A01
            androidx.fragment.app.FragmentActivity r7 = r9.requireActivity()
            java.lang.String r1 = r9.A0C
            r1.getClass()
            java.lang.String r15 = r3.A01
            androidx.fragment.app.FragmentActivity r17 = r9.requireActivity()
            X.DiE r21 = r9.BzS()
            r20 = 0
            X.ECb r11 = new X.ECb
            r16 = r11
            r18 = r9
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            X.Et7 r8 = new X.Et7
            r8.<init>()
            X.S6k r0 = X.LQc.A07
            byte[] r3 = r0.A03(r1)
            android.os.Bundle r1 = r8.A00
            java.lang.String r0 = "requestMessage"
            r1.putByteArray(r0, r3)
            android.os.Bundle r1 = r8.A00
            java.lang.String r0 = "useDebugKey"
            r1.putBoolean(r0, r2)
            X.KHD r6 = new X.KHD
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.1ES.A03(r6)
        L_0x00c1:
            return
        L_0x00c2:
            java.lang.String r2 = r6.A01
            goto L_0x0031
        L_0x00c6:
            X.DbT.A15()
            android.os.Bundle r3 = X.DbY.A09(r10)
            java.lang.String r1 = "REGISTER_START_MESSAGE"
            r3.putString(r1, r8)
            java.lang.String r1 = "NONCE"
            r3.putString(r1, r5)
            java.lang.String r1 = "SMS_FLOW_TYPE"
            r3.putString(r1, r14)
            java.lang.String r1 = "CONSENT_MODE"
            r3.putInt(r1, r2)
            X.E2O r2 = new X.E2O
            r2.<init>()
            r2.setArguments(r3)
            goto L_0x0115
        L_0x00ea:
            java.lang.String r0 = "autoconf_authenticate_flow"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0123
            X.EDe r0 = r4.A01
            X.FFx r9 = X.C49944FFx.A00
            X.DiE r1 = r0.A08
            if (r1 != 0) goto L_0x0120
            java.lang.String r11 = ""
        L_0x00fc:
            r13 = 0
            java.lang.String r14 = "optimistic_authentication_flow"
            java.lang.String r15 = "ar_code_sms"
            java.lang.String r12 = "client_auth_finished_success"
            r9.A04(r10, r11, r12, r13, r14, r15)
            X.DbT.A15()
            android.os.Bundle r1 = X.DbY.A09(r10)
            X.E2H r2 = new X.E2H
            r2.<init>()
            r2.setArguments(r1)
        L_0x0115:
            android.app.Activity r0 = r0.A01
            r0.getClass()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.Dbb.A14(r2, r0, r10)
            return
        L_0x0120:
            java.lang.String r11 = r1.A01
            goto L_0x00fc
        L_0x0123:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            X.EDe r0 = r4.A01
            java.lang.Integer r2 = r0.A09
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0215
            X.6qt r8 = X.C319606qt.A01(r10)
            java.lang.String r3 = r10.A06
            X.0tS r5 = X.0tS.A00()
            X.0s0 r4 = r5.A05
            X.0YZ[] r6 = X.0tS.A4G
            r2 = 235(0xeb, float:3.3E-43)
            r2 = r6[r2]
            java.lang.Object r2 = r4.CDM(r5, r2)
            java.util.Set r2 = (java.util.Set) r2
            boolean r7 = r2.contains(r3)
            X.0tS r5 = X.0tS.A00()
            X.0s0 r4 = r5.A0D
            r2 = 234(0xea, float:3.28E-43)
            boolean r2 = X.AnonymousClass7TG.A1a(r5, r4, r6, r2)
            if (r7 == 0) goto L_0x015d
            if (r2 == 0) goto L_0x015d
            goto L_0x0215
        L_0x015d:
            boolean r2 = r8.A0K(r3)
            if (r2 != 0) goto L_0x0215
            boolean r2 = r8.A0I()
            if (r2 == 0) goto L_0x0215
            X.0tS r2 = X.0tS.A00()
            java.util.Set r2 = r2.A0A()
            boolean r2 = r2.contains(r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0215
            java.util.LinkedHashSet r5 = X.DbS.A0y()
            X.0tS r2 = X.0tS.A00()
            java.util.Set r2 = r2.A0A()
            r5.addAll(r2)
            r5.add(r3)
            X.0tS r4 = X.0tS.A00()
            X.0s0 r3 = r4.A06
            r2 = 230(0xe6, float:3.22E-43)
            X.DbS.A1a(r4, r5, r3, r6, r2)
            java.lang.String r2 = "login_password_saving_eligible"
            java.lang.String r13 = "login_spi"
            java.lang.String r14 = "spi"
            java.lang.String r15 = "home_page"
            X.C319616qu.A01(r10, r2, r13, r14, r15)
            X.FFt r2 = X.C49940FFt.A00()
            X.DfZ r5 = r2.A03()
            X.F1e r4 = new X.F1e
            r4.<init>(r10)
            java.lang.String r7 = "com.bloks.www.caa.login.save-credentials"
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = r4.A00
            r6.A0R = r7
            r3 = 1
            X.E7h r2 = new X.E7h
            r2.<init>(r3, r0, r10, r1)
            r6.A03 = r2
            r4.A00(r5)
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            X.0jh r3 = X.DbT.A0P(r10)
            X.19f r2 = X.19f.A1w
            java.lang.String r3 = r3.A02(r2)
            java.lang.String r2 = "family_device_id"
            r5.put(r2, r3)
            java.lang.String r3 = "offline_experiment_group"
            java.lang.String r2 = "caa_iteration_v3_perf_ig_4"
            r5.put(r3, r2)
            X.0qv r2 = X.0qv.A02
            android.app.Activity r4 = r0.A01
            r4.getClass()
            java.lang.String r3 = r2.A05(r4)
            java.lang.String r2 = "qe_device_id"
            r5.put(r2, r3)
            java.lang.String r2 = "login_password_saving_open_spi_attempt"
            X.C319616qu.A01(r10, r2, r13, r14, r15)     // Catch:{ Exception -> 0x01f6 }
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ Exception -> 0x01f6 }
            X.C46649DiU.A08(r4, r6, r7, r5, r2)     // Catch:{ Exception -> 0x01f6 }
            return
        L_0x01f6:
            r2 = move-exception
            java.lang.String r16 = r2.getMessage()
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            java.lang.String r12 = "login_password_saving_opening_failed"
            r17 = 0
            X.C319616qu.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A03(r10, r1)
            return
        L_0x0208:
            if (r6 == 0) goto L_0x020c
            java.lang.String r4 = r6.A01
        L_0x020c:
            java.lang.String r18 = "client_reg_not_show_user_consent"
            java.lang.String r19 = "consent screen not shown and abort reg"
            r17 = r4
            r15.A04(r16, r17, r18, r19, r20, r21)
        L_0x0215:
            r0.A03(r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51513FvL.run():void");
    }
}
