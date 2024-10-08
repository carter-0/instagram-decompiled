package com.instagram.nux.activity;

import X.1wn;
import X.1xC;
import X.AnonymousClass08W;
import X.AnonymousClass0aP;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass1UZ;
import X.AnonymousClass2Rc;
import X.AnonymousClass2Yr;
import X.AnonymousClass3K7;
import X.AnonymousClass6ST;
import X.C50249FVg;
import X.C62250sA;
import X.DbS;
import X.FAB;
import X.FBY;
import X.FBZ;
import X.FGJ;
import X.FV8;
import X.FXZ;
import X.G53;
import X.G7B;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;

public class SignedOutFragmentActivity extends BaseFragmentActivity implements AnonymousClass0iw, G7B, AnonymousClass2Yr, G53, AnonymousClass08W {
    public AnonymousClass0iw A00;
    public AnonymousClass0aP A01;
    public FBZ A02;
    public FxSsoViewModel A03;
    public FAB A04;
    public AnonymousClass6ST A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public AymhViewModel A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public final 1wn A0G = FXZ.A00(this, 33);
    public final 1wn A0H = FXZ.A00(this, 32);

    public final String getModuleName() {
        return "signed_out_fragment_activity";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j(android.os.Bundle r22) {
        /*
            r21 = this;
            r12 = r21
            android.os.Bundle r3 = X.DbU.A06(r12)
            if (r3 != 0) goto L_0x000c
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
        L_0x000c:
            java.lang.String r0 = "SHOULD_START_AT_SAC_REG_FLOW"
            boolean r0 = X.DbT.A1X(r3, r0)
            r12.A0C = r0
            java.lang.String r1 = "IS_ADD_ACCOUNT_FLOW"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r3.getBoolean(r1)
            r12.A0F = r0
        L_0x0022:
            boolean r0 = r12.A0F
            r3.putBoolean(r1, r0)
            X.DbU.A1C(r3)
            java.lang.String r1 = "last_accessed_user_id"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r3.getString(r1)
            r12.A06 = r0
        L_0x0038:
            boolean r0 = X.AnonymousClass2Rc.A00
            if (r0 == 0) goto L_0x0045
            r1 = 2130772079(0x7f01006f, float:1.7147266E38)
            r0 = 2130772077(0x7f01006d, float:1.7147262E38)
            r12.overridePendingTransition(r1, r0)
        L_0x0045:
            java.lang.String r11 = "uid"
            boolean r0 = r3.containsKey(r11)
            java.lang.String r5 = "token"
            if (r0 == 0) goto L_0x00db
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x00db
            java.lang.String r10 = "source"
            boolean r0 = r3.containsKey(r10)
            if (r0 == 0) goto L_0x00db
            r8 = 1
            java.lang.String r0 = "IS_ONE_CLICK_LOGIN"
            r3.putBoolean(r0, r8)
            java.lang.String r1 = X.DbU.A0l(r3, r10)
            java.lang.String r0 = "stop_deletions_email_login"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "stop_deletions_sms_login"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "account_deactivation_email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0182
            android.net.Uri r14 = X.FHB.A00(r3)
            java.lang.String r9 = r3.getString(r11)
            java.lang.String r1 = r3.getString(r5)
            java.lang.String r7 = r3.getString(r10)
            r9.getClass()
            r1.getClass()
            r7.getClass()
            X.0aP r0 = r12.A01
            java.lang.String r6 = "reminder"
            java.lang.String r4 = r3.getString(r6)
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "accounts/account_deactivation_login/"
            r2.A0A(r0)
            r2.A9m(r11, r9)
            r2.A9m(r5, r1)
            java.lang.String r1 = X.DbT.A0u(r12, r2, r10, r7)
            java.lang.String r0 = X.Dbj.A01()
            X.DbZ.A0y(r12, r2, r0, r1)
            r2.A0G(r6, r4)
            X.DbW.A1D(r2)
            X.1OC r4 = X.DbT.A0U(r2, r8)
        L_0x00c4:
            X.0aP r1 = r12.A01
            X.0iw r0 = r12.A00
            X.ED9 r13 = new X.ED9
            r15 = r12
            r16 = r0
            r17 = r1
            r18 = r9
            r19 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x00d6:
            r4.A00 = r13
            r12.schedule(r4)
        L_0x00db:
            java.lang.String r1 = "smsrecovery"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0120
            boolean r0 = r3.getBoolean(r1)
            if (r0 == 0) goto L_0x0120
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x0120
            X.6ST r2 = X.DbV.A0h(r12)
            r12.A05 = r2
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A00(r0)
            X.0aP r13 = r12.A01
            java.lang.String r14 = X.DbU.A0l(r3, r5)
            r15 = 0
            java.lang.String r16 = X.Dbj.A00()
            java.lang.String r17 = "link"
            X.1OC r2 = X.FHA.A05(r12, r13, r14, r15, r16, r17)
            X.0aP r1 = r12.A01
            X.ENi r0 = new X.ENi
            r0.<init>(r12, r1, r12)
            r2.A00 = r0
            r12.schedule(r2)
        L_0x0120:
            X.2YN r1 = new X.2YN
            r1.<init>(r12)
            java.lang.Class<com.instagram.nux.aymh.viewmodel.AymhViewModel> r0 = com.instagram.nux.aymh.viewmodel.AymhViewModel.class
            X.2YL r0 = r1.A00(r0)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r0 = (com.instagram.nux.aymh.viewmodel.AymhViewModel) r0
            r12.A0D = r0
            X.0hq r1 = r12.getSupportFragmentManager()
            java.lang.String r0 = "android.nux.AymhLoginLandingFragment"
            androidx.fragment.app.Fragment r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x013f
            A00(r12)
        L_0x013e:
            return
        L_0x013f:
            androidx.fragment.app.Fragment r0 = X.DbY.A0H(r12)
            if (r0 != 0) goto L_0x013e
            com.instagram.nux.aymh.viewmodel.AymhViewModel r13 = r12.A0D
            X.0aP r11 = r12.A01
            X.EwY r4 = new X.EwY
            r4.<init>(r3, r12)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            X.12T r2 = X.AnonymousClass12T.A00
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r1 = 0
            r13.A00 = r1
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            X.EXE r0 = X.EXE.CACHEABLE
            java.util.Set r0 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r0)
            X.FfM r15 = new X.FfM
            r15.<init>(r0)
            X.6oS r0 = X.C318116oQ.A00(r13)
            r19 = 10
            X.JVZ r10 = new X.JVZ
            r17 = r2
            r18 = r1
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.AnonymousClass7TE.A1Z(r10, r0)
            return
        L_0x0182:
            r12.A0B = r8
            java.lang.String r0 = "bypass"
            boolean r0 = r3.getBoolean(r0)
            r12.A09 = r0
            android.net.Uri r14 = X.FHB.A00(r3)
            java.lang.String r6 = r3.getString(r11)
            X.0aP r7 = r12.A01
            r6.getClass()
            java.lang.String r9 = X.DbU.A0l(r3, r5)
            java.lang.String r1 = X.DbU.A0l(r3, r10)
            java.lang.String r4 = "auto_send"
            java.lang.String r2 = r3.getString(r4)
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x01fb
            java.lang.String r0 = "accounts/one_click_login_bypass/"
        L_0x01ad:
            X.1NY r7 = X.DbU.A0N(r7)
            r7.A0E = r0
            r7.A9m(r11, r6)
            r7.A9m(r5, r9)
            java.lang.String r1 = X.DbT.A0u(r12, r7, r10, r1)
            java.lang.String r0 = X.Dbj.A01()
            X.DbZ.A0y(r12, r7, r0, r1)
            java.lang.String r1 = X.FHA.A0H()
            java.lang.String r0 = "adid"
            r7.A9m(r0, r1)
            r7.A0G(r4, r2)
            java.lang.Class<X.EM0> r4 = X.EM0.class
            java.lang.Class<X.F6B> r2 = X.F6B.class
            X.0aS r1 = X.0aS.A00
            r0 = 0
            r7.A0O(r1, r4, r2, r0)
            X.1OC r4 = X.DbT.A0U(r7, r8)
            r14.getClass()
            X.0aP r2 = r12.A01
            X.0iw r1 = r12.A00
            boolean r0 = r12.A09
            X.3M8 r18 = r12.Bx5()
            X.ED8 r13 = new X.ED8
            r15 = r12
            r16 = r1
            r17 = r2
            r19 = r6
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00d6
        L_0x01fb:
            java.lang.String r0 = "accounts/one_click_login/"
            goto L_0x01ad
        L_0x01fe:
            android.net.Uri r14 = X.FHB.A00(r3)
            java.lang.String r9 = r3.getString(r11)
            X.0aP r0 = r12.A01
            r9.getClass()
            java.lang.String r7 = X.DbU.A0l(r3, r5)
            java.lang.String r1 = X.DbU.A0l(r3, r10)
            java.lang.String r6 = "reminder"
            java.lang.String r4 = r3.getString(r6)
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "accounts/stop_account_deletion_login/"
            r2.A0A(r0)
            r2.A9m(r11, r9)
            r2.A9m(r5, r7)
            java.lang.String r1 = X.DbT.A0u(r12, r2, r10, r1)
            java.lang.String r0 = X.Dbj.A01()
            X.DbZ.A0y(r12, r2, r0, r1)
            r2.A0G(r6, r4)
            X.DbW.A1D(r2)
            X.1OC r4 = X.DbT.A0U(r2, r8)
            java.lang.String r7 = X.DbU.A0l(r3, r10)
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.activity.SignedOutFragmentActivity.A0j(android.os.Bundle):void");
    }

    public final String BKa() {
        return this.A06;
    }

    public final boolean COM() {
        return this.A0F;
    }

    public final void onBackPressed() {
        if (this.A07) {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, android.content.Context, com.instagram.nux.activity.SignedOutFragmentActivity, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.instagram.nux.activity.SignedOutFragmentActivity r4) {
        /*
            X.6ST r1 = X.DbV.A0h(r4)
            r0 = 22
            X.FQw r3 = new X.FQw
            r3.<init>(r4, r0)
            r0 = 2
            X.WEC r2 = new X.WEC
            r2.<init>(r0, r1, r4)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r1 = r4.A0D
            if (r1 == 0) goto L_0x0027
            X.0eM r0 = r1.A09
            X.2Fk r0 = X.DbT.A0H(r0)
            r0.A06(r4, r3)
            X.0eM r0 = r1.A0A
            X.2Fk r0 = X.DbT.A0H(r0)
            r0.A06(r4, r2)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.activity.SignedOutFragmentActivity.A00(com.instagram.nux.activity.SignedOutFragmentActivity):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.nux.activity.SignedOutFragmentActivity, android.app.Activity] */
    public final void finish() {
        SignedOutFragmentActivity.super.finish();
        if (AnonymousClass2Rc.A00) {
            overridePendingTransition(R.anim.modal_empty_animation, R.anim.modal_slide_down_exit);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.onActivityResult(r10, r11, r12)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r5 = r9.A0D
            if (r5 == 0) goto L_0x0051
            X.0aP r4 = r9.A01
            r0 = 3
            X.0qQ.A0B(r4, r0)
            r0 = 64206(0xface, float:8.9972E-41)
            if (r10 != r0) goto L_0x0051
            r7 = 0
            if (r12 == 0) goto L_0x0052
            java.lang.String r0 = "com.google.android.gms.credentials.Credential"
            android.os.Parcelable r6 = r12.getParcelableExtra(r0)
            com.google.android.gms.auth.api.credentials.Credential r6 = (com.google.android.gms.auth.api.credentials.Credential) r6
            if (r6 == 0) goto L_0x0053
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "aymh"
            X.C49956FGl.A02(r4, r0)
        L_0x0028:
            r0 = -1
            if (r11 != r0) goto L_0x0051
            if (r6 == 0) goto L_0x0051
            X.0eM r0 = r5.A0A
            X.2Fk r3 = X.DbT.A0H(r0)
            r2 = 1
            r0 = 2131973893(0x7f135705, float:1.9584835E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.VT2 r0 = new X.VT2
            r0.<init>(r1, r2)
            r3.A0B(r0)
            X.6oS r0 = X.C318116oQ.A00(r5)
            r8 = 13
            X.MHL r3 = new X.MHL
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r3, r0)
        L_0x0051:
            return
        L_0x0052:
            r6 = r7
        L_0x0053:
            java.lang.String r0 = "aymh"
            if (r11 != 0) goto L_0x005b
            X.C49956FGl.A01(r4, r0)
            return
        L_0x005b:
            X.C49956FGl.A03(r4, r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.activity.SignedOutFragmentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.activity.ComponentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r0 = -2128268932(0xffffffff8125317c, float:-3.0341217E-38)
            int r1 = X.AnonymousClass0fD.A00(r0)
            android.os.Bundle r3 = X.C66588MXu.A00(r28)
            r7 = r27
            android.app.Application r0 = r7.getApplication()
            X.AnonymousClass2XD.A00(r0)
            android.os.Bundle r5 = X.DbU.A06(r7)
            if (r5 == 0) goto L_0x0038
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r0 = r5.getString(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r0 = r5.getBoolean(r0)
            if (r0 == 0) goto L_0x0038
            X.0wW r2 = X.DbT.A0W(r5)
            if (r2 == 0) goto L_0x0038
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0038
            X.0aP r2 = (X.AnonymousClass0aP) r2
            r7.A01 = r2
        L_0x0038:
            X.0aP r2 = r7.A01
            if (r2 != 0) goto L_0x0044
            X.08y r0 = X.09i.A0A
            X.0aP r2 = r0.A03(r7)
            r7.A01 = r2
        L_0x0044:
            X.FAB r0 = new X.FAB
            r0.<init>(r7)
            r7.A04 = r0
            r4 = 1
            X.FBZ r0 = new X.FBZ
            r0.<init>(r7, r2, r4)
            r7.A02 = r0
            com.instagram.fx.access.sso.FxSsoViewModel r0 = X.DbY.A0V(r7)
            r7.A03 = r0
            super.onCreate(r3)
            X.AnonymousClass1Q2.A04()
            X.0aP r6 = r7.A01
            X.19f r3 = X.19f.A1q
            X.0qQ.A0B(r6, r4)
            X.0nO r2 = X.0nY.A00()
            X.RAO r0 = new X.RAO
            r0.<init>(r7, r3, r6)
            r2.ATE(r0)
            android.content.Context r0 = r7.getApplicationContext()
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x0091
            boolean r0 = X.FGv.A05()
            if (r0 != 0) goto L_0x0091
            boolean r0 = X.FGv.A06()
            if (r0 != 0) goto L_0x0091
            X.14i r2 = X.14i.A08
            X.FXl r0 = X.C50306FXl.A00(r7)
            r2.A0A(r0)
        L_0x0091:
            X.1xC r3 = X.1xC.A01
            java.lang.Class<X.0sA> r2 = X.C62250sA.class
            X.1wn r0 = r7.A0H
            r3.A02(r0, r2)
            java.lang.Class<X.FVg> r2 = X.C50249FVg.class
            X.1wn r0 = r7.A0G
            r3.A02(r0, r2)
            X.ExG r0 = X.C49534ExG.A02
            if (r0 != 0) goto L_0x00ac
            X.ExG r0 = new X.ExG
            r0.<init>()
            X.C49534ExG.A02 = r0
        L_0x00ac:
            java.lang.Object r2 = r0.A01
            monitor-enter(r2)
            r11 = 0
            r0.A00 = r11     // Catch:{ all -> 0x018b }
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            X.0aP r0 = r7.A01
            X.9BF r0 = X.AnonymousClass9BE.A00(r0)
            r0.A02()
            X.FBY r0 = X.FBY.A00()
            r0.A01()
            if (r5 == 0) goto L_0x0183
            java.lang.String r5 = X.DbS.A0m(r5)
        L_0x00c9:
            X.0aP r10 = r7.A01
            X.0iw r9 = r7.A00
            r3 = 0
            X.0qQ.A0B(r10, r3)
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "ig.e2e.e2e_method"
            java.lang.String r2 = com.facebook.endtoend.EndToEnd.A00(r0, r4, r3)
            if (r2 == 0) goto L_0x00fa
            java.lang.String r0 = "AUTH"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0101
            X.09i r0 = X.08y.A00()
            com.instagram.common.session.UserSession r0 = r0.A00()
            if (r0 == 0) goto L_0x0186
            if (r5 == 0) goto L_0x00f7
            android.net.Uri r11 = X.0cp.A03(r5)
        L_0x00f7:
            X.C46413Dea.A06(r7, r11, r9, r0)
        L_0x00fa:
            r0 = 1293936791(0x4d1fe897, float:1.67676272E8)
            X.AnonymousClass0fD.A07(r0, r1)
            return
        L_0x0101:
            java.lang.String r0 = "LOGIN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "ig.e2e.e2e_username"
            java.lang.String r15 = com.facebook.endtoend.EndToEnd.A00(r0, r4, r3)
            java.lang.String r0 = "ig.e2e.e2e_password"
            java.lang.String r3 = com.facebook.endtoend.EndToEnd.A00(r0, r4, r3)
            if (r15 == 0) goto L_0x00fa
            int r0 = r15.length()
            if (r0 == 0) goto L_0x00fa
            if (r3 == 0) goto L_0x00fa
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00fa
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r3}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "Using headless E2E login, user: %s, password: %s"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            X.0qQ.A07(r2)
            r0 = 4344(0x10f8, float:6.087E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.util.Log.w(r0, r2)
            java.lang.String r18 = X.0qv.A00(r7)
            X.0qQ.A07(r18)
            java.lang.String r21 = X.DbT.A0s(r7)
            X.0qQ.A07(r21)
            int r26 = X.FGv.A00()
            r16 = r10
            r17 = r11
            r19 = r11
            r20 = r11
            r22 = r3
            r23 = r11
            r24 = r15
            r25 = r11
            X.1OC r0 = X.FHA.A0D(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.DiE r13 = X.C46634DiE.A0t
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            if (r5 == 0) goto L_0x0181
            android.net.Uri r8 = X.0cp.A03(r5)
        L_0x0170:
            X.EDe r6 = new X.EDe
            r12 = r11
            r16 = r11
            r18 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A00 = r6
            r7.schedule(r0)
            goto L_0x00fa
        L_0x0181:
            r8 = r11
            goto L_0x0170
        L_0x0183:
            r5 = 0
            goto L_0x00c9
        L_0x0186:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x018b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.activity.SignedOutFragmentActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.nux.activity.SignedOutFragmentActivity] */
    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(1429927205);
        super.onDestroy();
        FV8.A00().A01 = null;
        FBY.A00().A02();
        FGJ.A03.A05(this);
        1xC r2 = 1xC.A01;
        r2.A03(this.A0H, C62250sA.class);
        r2.A03(this.A0G, C50249FVg.class);
        AnonymousClass0fD.A07(2075760122, A002);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A07 = bundle.getBoolean("allow_back", true);
        this.A0A = bundle.getBoolean("is_nux_flow", false);
        this.A0E = bundle.getBoolean("has_followed", false);
        this.A0B = bundle.getBoolean("is_one_click_login", false);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.nux.activity.SignedOutFragmentActivity, android.app.Activity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(164377301);
        super.onResume();
        AnonymousClass3K7.A00(this.A01).A00(DbS.A0O("ig_app_auth"));
        setRequestedOrientation(1);
        AnonymousClass1UZ.A00(this).A00("logged_out_bloks_playground_toggle");
        AnonymousClass0fD.A07(-923890750, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("allow_back", this.A07);
        bundle.putBoolean("is_nux_flow", this.A0A);
        bundle.putBoolean("has_followed", this.A0E);
        bundle.putBoolean("is_one_click_login", this.A0B);
    }
}
