package X;

import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;

public final class E3W extends AnonymousClass4DH implements C61110lV, AnonymousClass4DR, G8C, G69, G67, CallerContextable {
    public static final String __redex_internal_original_name = "UsernameSuggestionSignUpFragment";
    public AnonymousClass0aP A00;
    public RegFlowExtras A01;
    public String A02;
    public String A03;
    public FXH A04;
    public FXI A05;
    public FXJ A06;
    public NotificationBar A07;
    public EEK A08;
    public final Handler A09 = new Handler();
    public final 1wn A0A = FXZ.A00(this, 47);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final boolean Ca3() {
        return true;
    }

    public final void DaH(boolean z) {
    }

    public final void Et4(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass0aP r4 = this.A00;
            C49028Eo4.A00(activity, this.A09, this, r4, this, this.A01, this.A08, C48156EZy.A07.A00, str, str2, this.A03);
        }
    }

    public final EXD B6Y() {
        return this.A01.A01();
    }

    public final C46634DiE BzS() {
        return C48156EZy.A07.A00;
    }

    public final void DUM() {
        String str;
        if (!TextUtils.isEmpty(this.A02)) {
            AnonymousClass0aP r4 = this.A00;
            C46634DiE diE = C48156EZy.A07.A00;
            String str2 = this.A02;
            RegFlowExtras regFlowExtras = this.A01;
            if (regFlowExtras.A01() != null) {
                str = regFlowExtras.A01().A00;
            } else {
                str = "";
            }
            C49229ErY.A00(r4, diE, str2, str);
        }
        G8D activity = getActivity();
        if (activity instanceof G8D) {
            FRU A0C = Dba.A0C(activity);
            AnonymousClass0aP r6 = this.A00;
            String str3 = this.A03;
            RegFlowExtras regFlowExtras2 = this.A01;
            Handler handler = this.A09;
            EXD A012 = regFlowExtras2.A01();
            String str4 = A0C.A09;
            BusinessInfo businessInfo = A0C.A02;
            String A042 = AnonymousClass703.A04(getActivity());
            CallerContext callerContext = FRR.A00;
            if (A012 != EXD.A04) {
                handler.post(new C51554Fw0(handler, this, r6, businessInfo, this, regFlowExtras2, A012, str3, str4, A042));
                return;
            }
            return;
        }
        02m.A0p.markerStart(4197923);
        AnonymousClass0aP r7 = this.A00;
        String str5 = this.A03;
        C50144FRb.A02(this.A09, this, this, r7, this, this, this.A01, this.A08, C48156EZy.A07.A00, str5, str5, false);
    }

    public final String getModuleName() {
        return "username_sign_up";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void EuV(String str, Integer num) {
        if (isVisible()) {
            C49958FGq.A08(this.A07, str);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-2108922303);
        RegFlowExtras regFlowExtras = this.A01;
        if (regFlowExtras.A01() != EXD.A04) {
            C49913FEl.A01(this, C48156EZy.A07, regFlowExtras).A03(this.A00, this.A01);
        }
        AnonymousClass0fD.A0A(888421431, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1580729831, AnonymousClass0fD.A03(1652542070));
    }

    public final boolean onBackPressed() {
        if (!DbT.A1a(DbV.A0d(), "has_user_confirmed_dialog")) {
            AnonymousClass0aP r5 = this.A00;
            C46634DiE diE = C48156EZy.A07.A00;
            C49038EoI.A00(this, r5, new C50629Ffk(this, 4), this.A01.A01(), diE, (Integer) null);
            return true;
        }
        C49920FEv.A00.A01(this.A00, this.A01.A01(), C48156EZy.A07.A00.A01);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -1771236737(0xffffffff966d127f, float:-1.9150544E-25)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.E3W.super.onCreate(r13)
            X.0aP r0 = X.Dba.A0D(r12)
            r12.A00 = r0
            android.os.Parcelable r0 = X.Dba.A03(r12)
            com.instagram.registration.model.RegFlowExtras r0 = (com.instagram.registration.model.RegFlowExtras) r0
            r12.A01 = r0
            r0.getClass()
            com.instagram.registration.model.RegFlowExtras r1 = r12.A01
            X.EXD r0 = X.EXD.A04
            r1.A03(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            com.instagram.registration.model.RegFlowExtras r1 = r12.A01
            if (r0 == 0) goto L_0x00ee
            X.EXD r0 = X.EXD.A03
        L_0x0030:
            r1.A03(r0)
        L_0x0033:
            android.content.Context r1 = r12.getContext()
            X.0aP r0 = r12.A00
            X.C48934EmY.A00(r1, r0)
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            java.lang.String r0 = r0.A0Z
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            if (r1 != 0) goto L_0x00b7
            java.lang.String r0 = r0.A0Z
            r12.A03 = r0
            r12.A02 = r4
        L_0x004f:
            r12.B6Y()
            X.1WU r3 = X.AnonymousClass35B.A00()
            android.content.Context r4 = r12.getContext()
            X.0aP r5 = r12.A00
            r7 = 0
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            X.EXD r6 = r0.A01()
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r3.A02(r4, r5, r6, r7, r8, r9, r10, r11)
            X.1xC r3 = X.1xC.A01
            java.lang.Class<X.FVq> r1 = X.C50259FVq.class
            X.1wn r0 = r12.A0A
            r3.A02(r0, r1)
            X.0Tu r0 = X.0Tu.A05
            java.lang.String r1 = X.Dba.A0Z(r0)
            java.lang.String r0 = "UsernameSuggestionSignUpFragment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00b0
            java.lang.Boolean r0 = X.C49035EoF.A00()
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 == 0) goto L_0x0099
            X.1pg r3 = X.C49130Ept.A00()
            android.content.Context r1 = r12.requireContext()
            X.0aP r0 = r12.A00
            r3.A00(r1, r0, r4)
        L_0x0099:
            java.lang.Boolean r0 = X.C49036EoG.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b0
            X.1pg r3 = X.C49130Ept.A00()
            android.content.Context r1 = r12.requireContext()
            X.0aP r0 = r12.A00
            r3.A01(r1, r0, r4)
        L_0x00b0:
            r0 = 55181176(0x349ff78, float:5.9361855E-37)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x00b7:
            java.util.List r1 = X.Dbb.A0g(r0)
            r3 = 0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00d8
            java.lang.Object r0 = r1.get(r3)
            X.Ewr r0 = (X.C49512Ewr) r0
            java.lang.String r0 = r0.A01
            r12.A03 = r0
            java.lang.Object r0 = r1.get(r3)
            X.Ewr r0 = (X.C49512Ewr) r0
            java.lang.String r0 = r0.A00
            r12.A02 = r0
            goto L_0x004f
        L_0x00d8:
            r12.A02 = r4
            com.instagram.registration.model.RegFlowExtras r0 = r12.A01
            java.util.List r1 = r0.A0e
            if (r1 == 0) goto L_0x00ea
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ea
            java.lang.String r4 = X.DbU.A0t(r1, r3)
        L_0x00ea:
            r12.A03 = r4
            goto L_0x004f
        L_0x00ee:
            java.lang.String r0 = r1.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0033
            com.instagram.registration.model.RegFlowExtras r1 = r12.A01
            X.EXD r0 = X.EXD.PHONE
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3W.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            r22 = this;
            r0 = 1222669996(0x48e076ac, float:459701.38)
            int r6 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r2 = r23
            r1 = r24
            android.view.View r4 = X.DbT.A0C(r2, r1, r0)
            android.view.ViewGroup r1 = X.Dba.A04(r4)
            r0 = 2131628006(0x7f0e0fe6, float:1.8883292E38)
            r15 = 1
            r2.inflate(r0, r1, r15)
            r0 = 2131432828(0x7f0b157c, float:1.8487424E38)
            android.widget.TextView r3 = X.DbU.A0G(r4, r0)
            r14 = 0
            r3.setAllCaps(r14)
            r5 = r22
            java.lang.String r0 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0179
            X.0aP r2 = r5.A00
            com.instagram.registration.model.RegFlowExtras r0 = r5.A01
            X.EXD r1 = r0.A01()
            X.EZy r0 = X.C48156EZy.A07
            X.DiE r11 = r0.A00
            java.lang.String r0 = r5.A03
            X.C49226ErV.A00(r2, r1, r11, r0)
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131974728(0x7f135a48, float:1.9586528E38)
            java.lang.String r0 = r5.A03
            X.Dbb.A0m(r2, r3, r0, r1)
            java.lang.String r0 = r5.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0097
            X.0aP r10 = r5.A00
            java.lang.String r9 = r5.A02
            com.instagram.registration.model.RegFlowExtras r1 = r5.A01
            X.EXD r0 = r1.A01()
            if (r0 == 0) goto L_0x0175
            X.EXD r0 = r1.A01()
            java.lang.String r12 = r0.A00
        L_0x0069:
            X.0qQ.A0B(r10, r14)
            X.DbZ.A0t(r15, r11, r9, r12)
            double r2 = X.DbS.A01()
            double r0 = X.DbS.A00()
            X.0wc r8 = X.AnonymousClass0kN.A02(r10)
            java.lang.String r7 = "usename_suggestion_prototype_used"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r8, r7)
            X.DbZ.A1G(r7, r2, r0)
            X.DbS.A1G(r7, r12)
            X.DbT.A1O(r7)
            java.lang.String r2 = "prototype"
            X.DbY.A1I(r7, r2, r9, r0)
            java.lang.String r0 = r11.A01
            X.DbZ.A1J(r7, r0)
            X.FH8.A08(r7, r10)
        L_0x0097:
            r0 = 2131432824(0x7f0b1578, float:1.8487416E38)
            android.widget.TextView r1 = X.DbU.A0G(r4, r0)
            r0 = 2131968310(0x7f134136, float:1.957351E38)
            r1.setText(r0)
            r0 = 2131429816(0x7f0b09b8, float:1.8481315E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.2eS.A01(r1)
            r0 = 23
            X.FPD.A00(r1, r0, r5)
            r0 = 2131437126(0x7f0b2646, float:1.8496142E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.registration.ui.NotificationBar r0 = (com.instagram.registration.ui.NotificationBar) r0
            r5.A07 = r0
            com.instagram.ui.widget.progressbutton.ProgressButton r20 = X.Dba.A0O(r4)
            X.0aP r1 = r5.A00
            r21 = 2131973890(0x7f135702, float:1.9584829E38)
            r12 = 0
            X.EEK r0 = new X.EEK
            r17 = r12
            r18 = r1
            r19 = r5
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r5.A08 = r0
            r5.registerLifecycleListener(r0)
            com.instagram.registration.model.RegFlowExtras r2 = r5.A01
            X.EXD r1 = r2.A01()
            X.EXD r0 = X.EXD.PHONE
            if (r1 != r0) goto L_0x0160
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.FVu> r1 = X.C50263FVu.class
            X.FXJ r0 = new X.FXJ
            r0.<init>(r5)
            r5.A06 = r0
        L_0x00ef:
            r2.A02(r0, r1)
        L_0x00f2:
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.FVs> r1 = X.C50261FVs.class
            X.FXH r0 = new X.FXH
            r0.<init>(r5)
            r5.A04 = r0
            r2.A02(r0, r1)
            com.instagram.registration.model.RegFlowExtras r0 = r5.A01
            java.lang.String r0 = r0.A0X
            java.lang.String r3 = "kr"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x011c
            r0 = 2131430667(0x7f0b0d0b, float:1.8483041E38)
            android.widget.TextView r2 = X.DbU.A0G(r4, r0)
            android.content.Context r1 = r5.requireContext()
            X.0aP r0 = r5.A00
            X.C49958FGq.A02(r1, r2, r0)
        L_0x011c:
            r0 = 2131438228(0x7f0b2a94, float:1.8498377E38)
            android.view.View r8 = r4.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            com.instagram.registration.model.RegFlowExtras r0 = r5.A01
            java.lang.String r0 = r0.A0X
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0141
            android.content.Context r7 = r5.getContext()
            X.0aP r9 = r5.A00
            com.instagram.registration.model.RegFlowExtras r0 = r5.A01
            java.lang.String r11 = r0.A0X
            X.EXD r10 = r0.A01()
            r13 = r12
            X.C49958FGq.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0141:
            X.14i r0 = X.14i.A08
            r0.A0A(r5)
            X.FFr r3 = X.C49938FFr.A00
            X.0aP r2 = r5.A00
            X.EZy r0 = X.C48156EZy.A07
            X.DiE r0 = r0.A00
            java.lang.String r1 = r0.A01
            com.instagram.registration.model.RegFlowExtras r0 = r5.A01
            X.EXD r0 = r0.A01()
            r3.A02(r2, r0, r1)
            r0 = -747825756(0xffffffffd36d15a4, float:-1.01827032E12)
            X.AnonymousClass0fD.A09(r0, r6)
            return r4
        L_0x0160:
            X.EXD r1 = r2.A01()
            X.EXD r0 = X.EXD.A03
            if (r1 != r0) goto L_0x00f2
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.FVo> r1 = X.C50257FVo.class
            X.FXI r0 = new X.FXI
            r0.<init>(r5)
            r5.A05 = r0
            goto L_0x00ef
        L_0x0175:
            java.lang.String r12 = ""
            goto L_0x0069
        L_0x0179:
            r0 = 2131974727(0x7f135a47, float:1.9586526E38)
            r3.setText(r0)
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3W.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(375350777);
        super.onDestroy();
        1xC.A01.A03(this.A0A, C50259FVq.class);
        AnonymousClass0fD.A09(-375544439, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-997909093);
        super.onDestroyView();
        unregisterLifecycleListener(this.A08);
        14i.A06(this);
        this.A07 = null;
        this.A08 = null;
        FXJ fxj = this.A06;
        if (fxj != null) {
            1xC.A01.A03(fxj, C50263FVu.class);
            this.A06 = null;
        }
        FXI fxi = this.A05;
        if (fxi != null) {
            1xC.A01.A03(fxi, C50257FVo.class);
            this.A05 = null;
        }
        FXH fxh = this.A04;
        if (fxh != null) {
            1xC.A01.A03(fxh, C50261FVs.class);
            this.A04 = null;
        }
        AnonymousClass0fD.A09(597330094, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(666761793);
        E3W.super.onPause();
        this.A07.A03();
        this.A09.removeCallbacksAndMessages((Object) null);
        DbV.A0G(this).setSoftInputMode(0);
        AnonymousClass0fD.A09(160462824, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1569541694);
        super.onResume();
        Dbb.A10(this);
        AnonymousClass0fD.A09(197739478, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(632021633);
        E3W.super.onStart();
        AnonymousClass0fD.A09(-1970576078, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1949040369);
        E3W.super.onStop();
        AnonymousClass0fD.A09(-1795609670, A022);
    }
}
