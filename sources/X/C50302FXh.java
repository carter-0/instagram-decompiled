package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FXh  reason: case insensitive filesystem */
public final class C50302FXh implements C252243on {
    public 2dZ A00;
    public 27S A01;
    public UserSession A02;
    public C18624VvH A03;
    public User A04;
    public String A05;
    public String A06;
    public final C307786Rm A07;
    public final C276544tV A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C58707IwG((Object) this, 44));
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new C58707IwG((Object) this, 45));

    public final void A02(UserSession userSession, C323536xe r17) {
        C276544tV r3 = this.A08;
        if (r3.A0R(42, false) || A03()) {
            boolean A1Z = AnonymousClass7TF.A1Z(this.A0A);
            C18624VvH vvH = this.A03;
            if (vvH == null) {
                String str = this.A05;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String str3 = this.A06;
                C307786Rm r2 = this.A07;
                String moduleName = C308206Td.A07(r2).getModuleName();
                String A0E = r3.A0E();
                if (A0E != null) {
                    str2 = A0E;
                }
                AnonymousClass4DH A002 = C308206Td.A00(r2);
                0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                AnonymousClass4DH r4 = A002;
                C50966Flt flt = new C50966Flt(this);
                String A11 = DbV.A11(r3, (String) null, 62);
                AnonymousClass7TF.A1E(moduleName, 3, r4);
                vvH = new C18624VvH(r4.requireContext(), r4, r4, userSession, flt, r17, str, str3, moduleName, str2, A11, A1Z);
                this.A03 = vvH;
            }
            vvH.A02(A01());
            return;
        }
        SpannableStringBuilder A0C = DbS.A0C(this.A06);
        User user = this.A04;
        if (user != null && user.isVerified()) {
            C244273av.A08(C308206Td.A03(this.A07), A0C, true);
        }
        A01().Eon(A0C);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r0 == false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C50302FXh r23) {
        /*
            r1 = r23
            com.instagram.common.session.UserSession r8 = r1.A02
            if (r8 != 0) goto L_0x0020
            X.6Rm r0 = r1.A07
            X.0lg r8 = X.C308206Td.A0A(r0)
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x001e
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
        L_0x0012:
            r1.A02 = r8
            if (r8 != 0) goto L_0x0020
            java.lang.String r1 = "NavbarExtensionController"
            java.lang.String r0 = "Got a null user session while configuring navbar"
            X.1Kn.A02(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            r8 = 0
            goto L_0x0012
        L_0x0020:
            X.6Rm r3 = r1.A07
            androidx.fragment.app.FragmentActivity r7 = X.C308206Td.A03(r3)
            X.2dZ r2 = r1.A01()
            r0 = 1
            r2.Eu4(r0)
            androidx.fragment.app.Fragment r0 = X.C308206Td.A00(r3)
            androidx.fragment.app.Fragment r0 = r0.mParentFragment
            boolean r0 = r0 instanceof X.C15336Ual
            if (r0 == 0) goto L_0x0048
            X.2dZ r3 = r1.A01()
            X.3JR r2 = X.DbX.A0M()
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2)
            r3.ErG(r0)
        L_0x0048:
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x00b2
            X.4tV r3 = r1.A08
            r2 = 49
            X.4tV r0 = r3.A07(r2)
            if (r0 == 0) goto L_0x00b2
            X.4tV r0 = r3.A07(r2)
            if (r0 == 0) goto L_0x00b2
            X.4uI r6 = r0.A09()
            if (r6 == 0) goto L_0x00b2
            X.2dZ r5 = r1.A01()
            X.3JR r4 = X.DbS.A0K()
            java.lang.String r2 = "NAV_NAVICON"
            r0 = 61
            java.lang.String r3 = X.DbV.A11(r3, r2, r0)
            int r2 = r3.hashCode()
            r0 = 1572713947(0x5dbdb5db, float:1.70875913E18)
            if (r2 != r0) goto L_0x0088
            java.lang.String r0 = "NAV_DOTS_3_VERTICAL"
            boolean r0 = r3.equals(r0)
            r2 = 2131238568(0x7f081ea8, float:1.8093418E38)
            if (r0 != 0) goto L_0x008b
        L_0x0088:
            r2 = 2131238541(0x7f081e8d, float:1.8093364E38)
        L_0x008b:
            r4.A06 = r2
            r0 = 2131966551(0x7f133a57, float:1.9569943E38)
            r4.A05 = r0
            r2 = 7
            X.FPE r0 = new X.FPE
            r0.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r1)
            r4.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r4)
            android.view.View r2 = r5.AA3(r0)
            X.0eM r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            android.content.Context r0 = (android.content.Context) r0
            int r0 = X.AnonymousClass7TH.A01(r0)
            X.0nA.A0b(r2, r0)
        L_0x00b2:
            X.4tV r3 = r1.A08
            java.lang.String r17 = r3.A0D()
            r2 = 63
            r0 = -1
            int r4 = r3.A03(r2, r0)
            X.3kF r6 = X.C249713kF.A00
            java.lang.String r13 = ""
            r11 = r13
            java.lang.String r0 = r3.A0E()
            if (r0 == 0) goto L_0x00cb
            r11 = r0
        L_0x00cb:
            r0 = 45
            java.lang.String r12 = X.DbV.A11(r3, r13, r0)
            java.lang.String r0 = r3.A0H()
            if (r0 == 0) goto L_0x00d8
            r13 = r0
        L_0x00d8:
            r9 = 0
            X.1QP r2 = X.AnonymousClass1QO.A00(r8)
            r0 = 383984041(0x16e321a9, float:3.669507E-25)
            long r22 = r2.generateFlowId(r0, r4)
            X.Uxa r20 = X.C16580Uxa.Bloks
            X.MSu r21 = X.C18265Vof.A01(r8)
            X.VhM r10 = new X.VhM
            r18 = r10
            r19 = r2
            r18.<init>(r19, r20, r21, r22)
            r14 = r9
            r15 = r9
            r16 = r9
            X.6xe r5 = r6.A0Q(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r17 == 0) goto L_0x0145
            com.instagram.user.model.User r0 = r1.A04
            if (r0 == 0) goto L_0x01b0
            com.instagram.user.model.FollowStatus r2 = r0.B6o()
        L_0x0105:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A08
            if (r2 != r0) goto L_0x0119
            com.instagram.user.model.User r4 = r1.A04
            if (r4 == 0) goto L_0x0119
            com.instagram.common.session.UserSession r0 = r1.A02
            if (r0 == 0) goto L_0x0119
            X.5mt r2 = X.C294695ms.A00(r0)
            r0 = 0
            r2.A0G(r4, r0)
        L_0x0119:
            r1.A02(r8, r5)
            com.instagram.user.model.User r0 = r1.A04
            if (r0 == 0) goto L_0x0128
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 != 0) goto L_0x0145
        L_0x0128:
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x0145
            X.441 r0 = X.AnonymousClass441.A02
            r0.A02(r8, r9, r2)
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r8)
            java.lang.Class<X.FWT> r2 = X.FWT.class
            X.27S r0 = r1.A01
            if (r0 != 0) goto L_0x0140
            X.FX0 r0 = new X.FX0
            r0.<init>(r1, r8, r5)
        L_0x0140:
            r1.A01 = r0
            r4.A01(r0, r2)
        L_0x0145:
            r7 = 0
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0191
            r0 = 43
            boolean r0 = r3.A0R(r0, r7)
            if (r0 == 0) goto L_0x0191
            java.lang.String r2 = r8.A06
            java.lang.String r0 = r1.A05
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0191
            X.4Cl r0 = X.DbX.A0m(r8)
            com.instagram.api.schemas.ShopManagementAccessState r2 = r0.Bti()
            if (r2 != 0) goto L_0x016a
            com.instagram.api.schemas.ShopManagementAccessState r2 = com.instagram.api.schemas.ShopManagementAccessState.A07
        L_0x016a:
            com.instagram.api.schemas.ShopManagementAccessState r0 = com.instagram.api.schemas.ShopManagementAccessState.A07
            if (r2 == r0) goto L_0x0191
            X.2dZ r6 = r1.A01()
            X.3JR r4 = X.DbS.A0K()
            r0 = 2131238771(0x7f081f73, float:1.809383E38)
            r4.A06 = r0
            r0 = 2131973737(0x7f135669, float:1.9584518E38)
            r4.A05 = r0
            r2 = 8
            X.FPE r0 = new X.FPE
            r0.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r1)
            r4.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r4)
            r6.AA3(r0)
        L_0x0191:
            r0 = 36
            boolean r0 = r3.A0R(r0, r7)
            if (r0 == 0) goto L_0x001d
            com.instagram.common.session.UserSession r4 = r1.A02
            X.0Tu r0 = X.0Tu.A05
            r2 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r0 = X.DbY.A1Y(r0, r4, r2)
            if (r0 == 0) goto L_0x001d
            X.2dZ r0 = r1.A01()
            r5.A01(r0)
            return
        L_0x01b0:
            r2 = 0
            goto L_0x0105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50302FXh.A00(X.FXh):void");
    }

    public final 2dZ A01() {
        2dZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("actionBarService");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A03() {
        C276544tV r3 = this.A08;
        C277014uI A0A2 = r3.A0A(50);
        if (A0A2 == null) {
            return false;
        }
        return Q0A.A01(C307886Rw.A03(this.A07, r3, AnonymousClass6Tm.A01, A0A2));
    }

    public C50302FXh(C307786Rm r4, C276544tV r5, UserSession userSession) {
        User user;
        this.A07 = r4;
        this.A08 = r5;
        this.A02 = userSession;
        this.A05 = r5.A0D();
        UserSession userSession2 = this.A02;
        if (userSession2 != null) {
            user = 17h.A00(userSession2).A02(this.A05);
        } else {
            user = null;
        }
        this.A04 = user;
        this.A06 = DbV.A11(r5, (String) null, 59);
    }

    public final void onResume() {
        A01().A0T();
        A00(this);
    }
}
