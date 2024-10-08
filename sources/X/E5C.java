package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.EnumSet;

public final class E5C extends AnonymousClass4DH implements AnonymousClass4DR, G86, AnonymousClass4DS, G68, C267674c0, G6B {
    public static final EnumSet A0L = EnumSet.of(EVZ.ARGUMENT_EDIT_PROFILE_FLOW, EVZ.ARGUMENT_ADD_PHONE_NUMBER_FLOW);
    public static final String __redex_internal_original_name = "PhoneNumberEntryFragment";
    public View A00;
    public TextView A01;
    public UserSession A02;
    public IgTextView A03;
    public IgdsSwitch A04;
    public EVZ A05;
    public FBX A06;
    public EditPhoneNumberView A07;
    public ProgressButton A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;
    public AnonymousClass07i A0D;
    public ActionButton A0E;
    public String A0F;
    public boolean A0G;
    public final Handler A0H = new Handler();
    public final 1P0 A0I = new C47699EDi(this, 11);
    public final 1P0 A0J = new C47699EDi(this, 10);
    public final Runnable A0K = new C51219Fqa(this);

    public final void Cvy() {
    }

    public final boolean DBR(int i) {
        if (i != 2) {
            return false;
        }
        if (!this.A0E.isEnabled()) {
            return true;
        }
        A02(this);
        return true;
    }

    public final void DWw() {
    }

    public final String getModuleName() {
        return "phone_number_entry";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3.A07.getPhoneNumber().equalsIgnoreCase(r3.A09) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0032
            com.instagram.actionbar.ActionButton r0 = r3.A0E
            if (r0 == 0) goto L_0x0032
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x001b
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r3.A07
            java.lang.String r1 = r0.getPhoneNumber()
            java.lang.String r0 = r3.A09
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A08
            if (r1 == 0) goto L_0x0025
            r0 = r2 ^ 1
            r1.setEnabled(r0)
        L_0x0025:
            android.view.View r0 = r3.A00
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0032
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A04
            r0.setEnabled(r2)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5C.A00():void");
    }

    public static void A01(FBN fbn, E5C e5c, boolean z) {
        EVZ evz;
        boolean A1W = AnonymousClass7TF.A1W(e5c.A05, EVZ.ARGUMENT_TWOFAC_FLOW);
        boolean z2 = !A1W;
        String phoneNumber = e5c.A07.getPhoneNumber();
        String countryCodeWithoutPlus = e5c.A07.A04.getCountryCodeWithoutPlus();
        String A0f = AnonymousClass7TF.A0f(e5c.A07.A01);
        Bundle A002 = FBN.A00(fbn);
        Dbc.A0L(A002, countryCodeWithoutPlus, A0f, phoneNumber, false);
        if (A1W) {
            evz = EVZ.ARGUMENT_TWOFAC_FLOW;
        } else {
            evz = EVZ.ARGUMENT_EDIT_PROFILE_FLOW;
        }
        C48975EnD.A00(A002, evz);
        A002.putBoolean("HAS_SMS_CONSENT", z2);
        A002.putBoolean("AUTO_CONFIRM_SMS", z);
        C309516Yo A0J2 = DbY.A0J(e5c.requireActivity(), e5c.A02);
        A0J2.A0B(A002, new C47448E2u());
        A0J2.A0F(e5c, 0);
        A0J2.A0G = true;
        A0J2.A07();
    }

    public static void A02(E5C e5c) {
        1OC r1;
        1P0 r0;
        String str;
        E5C e5c2 = e5c;
        if (A0L.contains(e5c.A05)) {
            if (TextUtils.isEmpty(AnonymousClass7TF.A0f(e5c.A07.A01))) {
                DbT.A1J(e5c);
                1Ng A002 = AnonymousClass1Nd.A00(e5c.A02);
                UserSession userSession = e5c.A02;
                if (userSession == null) {
                    str = null;
                } else {
                    str = userSession.A06;
                }
                A002.A00(new FWX(str, ""));
                return;
            }
            e5c.A06.A02("contact_point", "add_contact_point");
            FGJ.A03.A03(e5c.getActivity(), e5c.A02, e5c2, C46634DiE.A1E, e5c.A07.getPhoneNumber());
            String phoneNumber = e5c2.A07.getPhoneNumber();
            r1 = C318486p2.A02(e5c2.getRootActivity().getApplicationContext(), e5c2.A02, AnonymousClass05K.A0C, phoneNumber);
            r0 = e5c2.A0I;
        } else if (e5c.A05 != EVZ.ARGUMENT_TWOFAC_FLOW) {
            return;
        } else {
            if (TextUtils.isEmpty(e5c.A07.getPhoneNumber())) {
                C59689JTv.A03(e5c.getActivity(), e5c.getString(2131969398), (String) null, 0);
                return;
            }
            r1 = FFP.A02(e5c.getContext(), e5c.A02, e5c.A07.getPhoneNumber());
            r0 = e5c.A0J;
        }
        r1.A00 = r0;
        e5c2.schedule(r1);
    }

    public final boolean CIy() {
        String str;
        EVZ evz = this.A05;
        EVZ evz2 = EVZ.ARGUMENT_TWOFAC_FLOW;
        0hq r1 = this.mFragmentManager;
        if (evz == evz2) {
            r1.A0y((String) null, 1);
            DbT.A15();
            Bundle A092 = DbY.A09(this.A02);
            ESN esn = new ESN();
            Dbb.A12(esn, DbU.A0I(A092, esn, this), this.A02);
            return true;
        }
        r1.A0y(AnonymousClass000.A00(116), 1);
        1Ng A002 = AnonymousClass1Nd.A00(this.A02);
        UserSession userSession = this.A02;
        if (userSession == null) {
            str = null;
        } else {
            str = userSession.A06;
        }
        A002.A00(new FWX(str, this.A0A));
        return true;
    }

    public final void DgP(Context context, String str, String str2) {
        AnonymousClass07i r2 = this.A0D;
        1OC A052 = C318486p2.A05(this.A02, str2, str, true);
        A052.A00 = new C47687ECw(str2, str);
        1ES.A00(context, r2, A052);
    }

    public final void DvR() {
        if (this.A0G) {
            Dbb.A0u(this);
        }
    }

    public final void ESy(CountryCodeData countryCodeData) {
        this.A07.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final void Dws() {
        A00();
    }

    public final void afterOnResume() {
        super.afterOnResume();
        if ("personal_information".equals(this.A0F)) {
            C48001EQk.A00(getParentFragmentManager(), this, FFP.A01(getContext(), this.A02), 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r3.A07.getPhoneNumber().equalsIgnoreCase(r3.A09) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            r2 = 2131969389(0x7f13456d, float:1.95757E38)
            r1 = 12
            X.FP3 r0 = new X.FP3
            r0.<init>((java.lang.Object) r3, (int) r1)
            com.instagram.actionbar.ActionButton r2 = r4.ErL(r0, r2)
            r3.A0E = r2
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0024
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r3.A07
            java.lang.String r1 = r0.getPhoneNumber()
            java.lang.String r0 = r3.A09
            boolean r1 = r1.equalsIgnoreCase(r0)
            r0 = 8
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r2.setVisibility(r0)
            r3.A00()
            r0 = 1
            r3.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5C.configureActionBar(X.2da):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1196399909);
        E5C.super.onCreate(bundle);
        this.A05 = EVZ.values()[requireArguments().getInt("flow_key")];
        this.A02 = DbX.A0U(this);
        this.A0F = requireArguments().getString("ENTRYPOINT");
        this.A06 = new FBX(this.A02);
        AnonymousClass0fD.A09(-596575268, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.G86} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r0 = 2112595722(0x7deba70a, float:3.9154487E37)
            int r6 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131625727(0x7f0e06ff, float:1.887867E38)
            r8 = 0
            r2 = r17
            r1 = r18
            android.view.View r5 = r2.inflate(r0, r1, r8)
            r0 = 2131437636(0x7f0b2844, float:1.8497176E38)
            android.view.View r1 = r5.requireViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = (com.instagram.ui.widget.progressbutton.ProgressButton) r1
            r9 = r16
            r9.A08 = r1
            r0 = 11
            X.FP3.A00(r1, r0, r9)
            r0 = 2131437635(0x7f0b2843, float:1.8497174E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = (com.instagram.ui.widget.editphonenumber.EditPhoneNumberView) r0
            r9.A07 = r0
            r0 = 2131443330(0x7f0b3e82, float:1.8508725E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r5, r0)
            r9.A01 = r0
            r0 = 2131437629(0x7f0b283d, float:1.8497162E38)
            android.view.View r0 = r5.requireViewById(r0)
            r9.A00 = r0
            r0 = 2131437627(0x7f0b283b, float:1.8497158E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r5, r0)
            r9.A03 = r0
            r0 = 2131437630(0x7f0b283e, float:1.8497164E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            r9.A04 = r0
            android.os.Bundle r1 = r9.mArguments
            if (r1 == 0) goto L_0x008f
            java.lang.String r0 = "PHONE_NUMBER"
            java.lang.String r0 = r1.getString(r0)
            r9.A09 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00cf
            android.os.Bundle r1 = r9.mArguments
            java.lang.String r0 = "NATIONAL_NUMBER"
            java.lang.String r3 = r1.getString(r0)
            android.os.Bundle r1 = r9.mArguments
            java.lang.String r0 = "COUNTRY_CODE"
            java.lang.String r2 = r1.getString(r0)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r9.A07
            android.content.Context r0 = r9.getContext()
            com.instagram.phonenumber.model.CountryCodeData r0 = X.C3270479e.A01(r0, r2)
            r1.setupEditPhoneNumberView((com.instagram.phonenumber.model.CountryCodeData) r0, (java.lang.String) r3)
        L_0x0085:
            android.os.Bundle r1 = r9.mArguments
            java.lang.String r0 = "IS_PHONE_CONFIRMED"
            boolean r0 = r1.getBoolean(r0)
            r9.A0B = r0
        L_0x008f:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r15 = r9.A07
            com.instagram.common.session.UserSession r11 = r9.A02
            X.EVZ r12 = r9.A05
            r10 = 0
            r13 = r10
            r14 = r9
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView.A01(r9, r10, r11, r12, r13, r14, r15)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r9.A07
            r0.requestFocus()
            java.util.EnumSet r1 = A0L
            X.EVZ r0 = r9.A05
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00b7
            r0 = 2131434847(0x7f0b1d5f, float:1.849152E38)
            android.widget.TextView r1 = X.DbU.A0G(r5, r0)
            r0 = 2131974066(0x7f1357b2, float:1.9585186E38)
            r1.setText(r0)
        L_0x00b7:
            X.0gy r0 = X.AnonymousClass07i.A00(r9)
            r9.A0D = r0
            X.FBX r0 = r9.A06
            X.02m r2 = r0.A00
            r1 = 857808781(0x33211f8d, float:3.751443E-8)
            r0 = 2
            r2.markerEnd(r1, r0)
            r0 = -1828716266(0xffffffff93000116, float:-1.6156407E-27)
            X.AnonymousClass0fD.A09(r0, r6)
            return r5
        L_0x00cf:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            androidx.fragment.app.FragmentActivity r3 = r9.getActivity()
            com.instagram.common.session.UserSession r2 = r9.A02
            X.DiE r1 = X.C46634DiE.A1E
            X.AnonymousClass7TG.A1U(r3, r2, r1)
            java.util.EnumSet r0 = X.FH2.A05(r0)
            java.util.ArrayList r1 = X.FH2.A04(r3, r2, r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0085
            java.lang.Object r0 = r1.get(r8)
            X.EbZ r0 = (X.C48254EbZ) r0
            if (r0 == 0) goto L_0x0085
            java.lang.String r2 = r0.A02
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()     // Catch:{ 2sh -> 0x0085 }
            com.instagram.phonenumber.model.CountryCodeData r0 = X.C3270479e.A00(r0)     // Catch:{ 2sh -> 0x0085 }
            java.lang.String r1 = r0.A00     // Catch:{ 2sh -> 0x0085 }
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()     // Catch:{ 2sh -> 0x0085 }
            com.facebook.phonenumbers.PhoneNumberUtil r0 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r0)     // Catch:{ 2sh -> 0x0085 }
            X.74u r7 = r0.A0F(r2, r1)     // Catch:{ 2sh -> 0x0085 }
            java.lang.String r2 = "%d"
            long r0 = r7.A02     // Catch:{ 2sh -> 0x0085 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 2sh -> 0x0085 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ 2sh -> 0x0085 }
            java.lang.String r4 = X.0mp.A06(r2, r0)     // Catch:{ 2sh -> 0x0085 }
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r3 = r9.A07     // Catch:{ 2sh -> 0x0085 }
            android.content.Context r0 = r9.getContext()     // Catch:{ 2sh -> 0x0085 }
            int r2 = r7.A00     // Catch:{ 2sh -> 0x0085 }
            X.0qQ.A0B(r0, r8)     // Catch:{ 2sh -> 0x0085 }
            com.facebook.phonenumbers.PhoneNumberUtil r0 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r0)     // Catch:{ 2sh -> 0x0085 }
            X.79y r0 = r0.A00     // Catch:{ 2sh -> 0x0085 }
            java.lang.String r1 = r0.A01(r2)     // Catch:{ 2sh -> 0x0085 }
            X.0qQ.A07(r1)     // Catch:{ 2sh -> 0x0085 }
            com.instagram.phonenumber.model.CountryCodeData r0 = new com.instagram.phonenumber.model.CountryCodeData     // Catch:{ 2sh -> 0x0085 }
            r0.<init>(r2, r1)     // Catch:{ 2sh -> 0x0085 }
            r3.setupEditPhoneNumberView((com.instagram.phonenumber.model.CountryCodeData) r0, (java.lang.String) r4)     // Catch:{ 2sh -> 0x0085 }
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E5C.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1321708138);
        super.onDestroy();
        FGJ.A03.A05(getContext());
        AnonymousClass0fD.A09(-894334433, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(583932428);
        super.onDestroyView();
        this.A07 = null;
        this.A08 = null;
        this.A04 = null;
        this.A00 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(1318306072, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-451001097);
        E5C.super.onPause();
        this.A0H.removeCallbacks(this.A0K);
        AnonymousClass0fD.A09(-1404588560, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1659353686);
        super.onResume();
        if (DbT.A1X(requireArguments(), "push_to_next")) {
            this.A0H.post(this.A0K);
        } else {
            EditPhoneNumberView editPhoneNumberView = this.A07;
            editPhoneNumberView.A01.postDelayed(editPhoneNumberView.A0A, 200);
        }
        AnonymousClass0fD.A09(-1567584986, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1384329771);
        E5C.super.onStart();
        EVZ evz = this.A05;
        if (evz == EVZ.ARGUMENT_EDIT_PROFILE_FLOW || evz == EVZ.ARGUMENT_TWOFAC_FLOW) {
            DbZ.A1P(this, 8);
            FGJ.A03.A05(getContext());
        }
        AnonymousClass0fD.A09(-647072891, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1481032813);
        EVZ evz = this.A05;
        if (evz == EVZ.ARGUMENT_EDIT_PROFILE_FLOW || evz == EVZ.ARGUMENT_TWOFAC_FLOW) {
            DbZ.A1P(this, 0);
        }
        DbS.A1D(this);
        DbV.A0G(this).setSoftInputMode(3);
        E5C.super.onStop();
        AnonymousClass0fD.A09(-526455746, A022);
    }
}
