package X;

import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class E7B extends C273374mT implements AnonymousClass4DR, C51958G9e, AnonymousClass4DS, G5T {
    public static final String __redex_internal_original_name = "BusinessContactButtonSetupFragment";
    public View A00;
    public View A01;
    public ActionButton A02;
    public BusinessFlowAnalyticsLogger A03;
    public BusinessInfoSectionView A04;
    public BusinessInfo A05;
    public User A06;
    public String A07;
    public HashSet A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G = AnonymousClass7TF.A0D();
    public final 1wn A0H = FX1.A00(this, 1);
    public final 1wn A0I = FXZ.A00(this, 4);

    public final void Cvy() {
    }

    public final boolean DBR(int i) {
        return false;
    }

    public final void DBn() {
    }

    public final void DWs() {
    }

    public final void DWw() {
    }

    public final void DvR() {
    }

    public final void Dws() {
    }

    public final String getModuleName() {
        return "business_contact_button_setup";
    }

    public static HashMap A00(E7B e7b) {
        String str;
        0xF r6 = new 0xF();
        BusinessInfo businessInfo = e7b.A05;
        if (businessInfo != null) {
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            String str2 = null;
            if (publicPhoneContact == null) {
                str = null;
            } else {
                str = publicPhoneContact.A03;
            }
            String str3 = businessInfo.A0L;
            String str4 = businessInfo.A0B;
            Address address = businessInfo.A00;
            if (address != null) {
                str2 = address.A04;
            }
            String valueOf = String.valueOf(businessInfo.A0P);
            String valueOf2 = String.valueOf(businessInfo.A0S);
            0xF.A00(r6, str, "phone");
            0xF.A00(r6, str3, "whatsapp");
            0xF.A00(r6, str4, "email");
            0xF.A00(r6, str2, "address");
            0xF.A00(r6, valueOf, "is_profile_audio_call_enabled");
            0xF.A00(r6, valueOf2, "should_show_public_contacts");
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("phone", r6.A05("phone"));
        A1E.put("whatsapp", r6.A05("whatsapp"));
        A1E.put("email", r6.A05("email"));
        A1E.put("address", r6.A05("address"));
        A1E.put("is_profile_audio_call_enabled", r6.A05("is_profile_audio_call_enabled"));
        A1E.put("should_show_public_contacts", r6.A05("should_show_public_contacts"));
        return A1E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.A04.A09() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(boolean r4) {
        /*
            r3 = this;
            com.instagram.model.business.BusinessInfo r0 = r3.A05
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x000f
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A04
            boolean r0 = r0.A09()
            r1 = 1
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            com.instagram.model.business.BusinessInfo r0 = r3.A05
            com.instagram.model.business.BusinessInfo r0 = X.FEa.A00(r0, r1)
            r3.A05 = r0
            com.instagram.business.ui.BusinessInfoSectionView r2 = r3.A04
            boolean r1 = r3.A0D
            boolean r0 = r0.A0S
            r2.A08(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7B.A01(boolean):void");
    }

    public static boolean A02(E7B e7b, boolean z) {
        0Tu r2;
        Boolean CSB = e7b.A06.A03.CSB();
        if (CSB != null && CSB.booleanValue()) {
            UserSession session = e7b.getSession();
            0qQ.A0B(session, 0);
            if (z) {
                r2 = 0Tu.A06;
            } else {
                r2 = 0Tu.A05;
            }
            if (!182.A06(r2, session, 36322821891172823L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        if (r2 != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CuW() {
        /*
            r23 = this;
            r0 = r23
            com.instagram.model.business.BusinessInfo r1 = r0.A05
            com.instagram.model.business.Address r7 = r1.A00
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "extra_is_mv4b_verified"
            r13 = 0
            boolean r6 = r2.getBoolean(r1, r13)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r7 == 0) goto L_0x003e
            java.lang.String r2 = r7.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x003e
            java.lang.String r5 = r7.A04
            java.lang.String r4 = r7.A00
            java.lang.String r3 = r7.A01
            java.lang.String r2 = r7.A02
            java.lang.String r17 = "primary"
            r15 = 0
            com.instagram.model.business.ProfileAddressData r14 = new com.instagram.model.business.ProfileAddressData
            r16 = r15
            r20 = r3
            r21 = r2
            r22 = r15
            r19 = r4
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r1.add(r14)
        L_0x003e:
            com.instagram.model.business.BusinessInfo r2 = r0.A05
            java.util.List r2 = r2.A0M
            if (r2 == 0) goto L_0x0047
            r1.addAll(r2)
        L_0x0047:
            r11 = 1
            if (r7 == 0) goto L_0x008c
            java.lang.String r2 = r7.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x008c
            boolean r2 = A02(r0, r13)
            if (r2 == 0) goto L_0x008c
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.0qQ.A0B(r3, r11)
            java.lang.String r5 = "edit_button"
            java.lang.String r2 = r3.A06
            r9 = 0
            java.lang.String r4 = "click"
            java.lang.String r6 = "subscriber"
            java.lang.String r7 = "ig_profile_edit_contact_options_page"
            r8 = r2
            r2 = r0
            X.C49075Eot.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "address_list_key"
            r3.putParcelableArrayList(r2, r1)
            X.E3G r1 = new X.E3G
            r1.<init>()
            r1.setArguments(r3)
        L_0x0080:
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.Dbb.A12(r1, r2, r0)
            return
        L_0x008c:
            boolean r2 = A02(r0, r11)
            if (r6 == 0) goto L_0x0095
            r12 = 1
            if (r2 == 0) goto L_0x0096
        L_0x0095:
            r12 = 0
        L_0x0096:
            r8 = 0
            if (r2 == 0) goto L_0x00bd
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.0qQ.A0B(r3, r11)
            java.lang.String r17 = "add_button"
            java.lang.String r2 = r3.A06
            java.lang.String r16 = "click"
            java.lang.String r18 = "subscriber"
            java.lang.String r19 = "ig_profile_edit_contact_options_page"
            r20 = r2
            r21 = r8
            r14 = r0
            r15 = r3
            X.C49075Eot.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            com.instagram.user.model.User r3 = r0.A06
            android.content.Context r2 = r0.getContext()
            java.lang.Integer r8 = X.AnonymousClass703.A03(r2, r3, r1)
        L_0x00bd:
            X.F3v r6 = X.DbU.A0R()
            java.lang.String r9 = r0.A07
            X.0qQ.A0B(r9, r13)
            java.lang.String r10 = "primary"
            r14 = r13
            r15 = r11
            X.E4e r1 = r6.A05(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.setTargetFragment(r0, r13)
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7B.CuW():void");
    }

    public final void DBm(boolean z) {
        this.A02.setEnabled(true);
        this.A09 = true;
        A01(z);
    }

    public final void Da4(boolean z) {
        if (this.A03 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("should_show_public_contacts", String.valueOf(z));
            this.A03.Ckp(new C22030Xtl("business_contact_info", this.A07, "contact_options_profile_display_toggle", (String) null, (String) null, (Map) null, A1E, (Map) null));
        }
        if (!z || !this.A04.A09()) {
            this.A05 = FEa.A00(this.A05, z);
            this.A09 = true;
            this.A02.setEnabled(true);
            return;
        }
        BusinessInfoSectionView businessInfoSectionView = this.A04;
        C358248ab A0Y = DbS.A0Y(requireContext());
        A0Y.A09(2131968387);
        A0Y.A08(2131952288);
        C50023FJi.A01(A0Y, businessInfoSectionView, 25);
        DbT.A1V(A0Y);
    }

    public final void FKj(Address address, String str) {
        Address address2;
        if (address == null) {
            address2 = new Address("", "", "0", "", "");
        } else {
            address2 = address;
        }
        FEa fEa = new FEa(this.A05);
        fEa.A0B = this.A04.getEmail();
        fEa.A00 = address2;
        this.A05 = new BusinessInfo(fEa);
        BusinessInfoSectionView businessInfoSectionView = this.A04;
        if (businessInfoSectionView != null) {
            businessInfoSectionView.A05(address);
        }
        this.A09 = true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        C59922Jbl.A01(DbV.A05(this), obj, 2131956578);
        ActionButton A002 = C59904JbT.A00(FPB.A00(this, 21), r4, obj);
        this.A02 = A002;
        A002.setEnabled(this.A09);
        r4.setIsLoading(this.A0B);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A0F && (businessFlowAnalyticsLogger = this.A03) != null) {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("business_contact_info", this.A07, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!this.A09 || this.A0A) {
            this.A0A = false;
            return false;
        }
        C358248ab A0U = DbW.A0U(this);
        A0U.A09(2131960795);
        A0U.A08(2131960794);
        C50023FJi.A02(A0U, this, 14, 2131960793);
        DbY.A1M(A0U, 2131960792);
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C250663lr optionalTreeField;
        String optionalStringField;
        ArrayList<String> stringArrayList;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        this.A01 = view2.requireViewById(R.id.loading_spinner);
        this.A00 = view2.requireViewById(R.id.contact_info_container);
        this.A04 = (BusinessInfoSectionView) view2.findViewById(R.id.business_info_section);
        boolean A1y = this.A06.A1y();
        this.A08 = AnonymousClass7TE.A1F();
        if (A1y) {
            Bundle bundle2 = this.mArguments;
            if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("ldp_app_ids")) == null)) {
                this.A08 = new HashSet(stringArrayList);
            }
            this.A08.contains(this.A06.A03.B4N());
        }
        this.A04.setBusinessInfo(getSession(), this.A05, this, false, this.A0E, A02(this, true), true, 182.A06(0Tu.A05, getSession(), 36314609912646370L), this.A0D, false, this.A0C, this);
        if (C324536zU.A00(getSession())) {
            TextView textView = this.A04.A05;
            if (textView == null) {
                0qQ.A0F("whatsAppTextView");
                throw AnonymousClass00P.createAndThrow();
            }
            textView.setAlpha(0.3f);
        }
        A01(false);
        TextView A0G2 = DbU.A0G(view2, R.id.public_business_information_text);
        int i = 2131970961;
        if (2Ek.A00(this.A06)) {
            i = 2131970936;
        }
        A0G2.setText(i);
        BusinessInfoSectionView businessInfoSectionView = this.A04;
        if (businessInfoSectionView != null) {
            businessInfoSectionView.A04(getSession());
        }
        C43751C7v A002 = F9X.A00();
        if (!(A002 == null || (optionalTreeField = A002.getOptionalTreeField(0, AnonymousClass000.A00(2741), BpO.class, 945472526)) == null || (optionalStringField = optionalTreeField.getOptionalStringField(0, "subtext")) == null)) {
            TextView A0G3 = DbU.A0G(view2, R.id.fx_im_bci_contact_info_reminder);
            A0G3.setVisibility(0);
            A0G3.setText(optionalStringField);
            UserSession session = getSession();
            C48144EZm eZm = C48144EZm.BIZ_EDIT_GENERAL_CONTACT_INFO;
            0qQ.A0B(session, 0);
            FGS.A01(eZm, session, "reminder_shown");
        }
        View view3 = this.A01;
        if (!(view3 == null || this.A00 == null)) {
            view3.setVisibility(0);
            this.A00.setVisibility(8);
        }
        C48756Ejf.A00(C47697EDg.A00(this, 14), getSession(), this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r1.A07 == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTW() {
        /*
            r14 = this;
            X.DbU.A0R()
            com.instagram.model.business.BusinessInfo r0 = r14.A05
            boolean r7 = r0.A0P
            com.instagram.business.ui.BusinessInfoSectionView r1 = r14.A04
            android.widget.EditText r0 = r1.A00
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "emailEditView"
        L_0x000f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0054
        L_0x0023:
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0054
            android.widget.TextView r0 = r1.A01
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "addressTextView"
            goto L_0x000f
        L_0x0030:
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x003c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0054
        L_0x003c:
            android.widget.TextView r0 = r1.A05
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "whatsAppTextView"
            goto L_0x000f
        L_0x0043:
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x004f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0054
        L_0x004f:
            boolean r0 = r1.A07
            r6 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            java.lang.String r2 = r14.A07
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r5 = r14.A03
            r0 = 2
            android.os.Bundle r1 = X.DbV.A0B(r2, r0)
            java.lang.String r3 = "is_profile_audio_call_enabled"
            r1.putBoolean(r3, r7)
            java.lang.String r0 = "maybe_show_confirmation_dialog"
            r1.putBoolean(r0, r6)
            X.DbS.A1B(r1, r2)
            X.E2a r2 = new X.E2a
            r2.<init>()
            r2.A00 = r5
            r2.setArguments(r1)
            androidx.fragment.app.FragmentActivity r1 = r14.requireActivity()
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.Dbb.A12(r2, r1, r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r14.A03
            if (r0 == 0) goto L_0x00b2
            java.lang.String r6 = "business_contact_info"
            r9 = 0
            java.lang.String r7 = r14.A07
            java.lang.String r8 = "profile_native_calling"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Ckp(r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r14.A03
            java.lang.String r6 = r14.A07
            com.instagram.model.business.BusinessInfo r0 = r14.A05
            boolean r0 = r0.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.Map r10 = java.util.Collections.singletonMap(r3, r0)
            X.Xtl r4 = new X.Xtl
            r5 = r8
            r7 = r9
            r8 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.Cka(r4)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7B.DTW():void");
    }

    public final void DWt() {
        String str;
        DbU.A0v();
        PublicPhoneContact publicPhoneContact = this.A05.A01;
        Bundle A0B2 = DbV.A0B(publicPhoneContact, 0);
        A0B2.putParcelable(E7E.A09, publicPhoneContact);
        E7E e7e = new E7E();
        e7e.setArguments(A0B2);
        e7e.setTargetFragment(this, 0);
        Dbb.A12(e7e, requireActivity(), getSession());
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("business_contact_info", this.A07, "phone", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            PublicPhoneContact publicPhoneContact2 = this.A05.A01;
            if (publicPhoneContact2 == null) {
                str = null;
            } else {
                str = publicPhoneContact2.A03;
            }
            this.A03.Cka(new C22030Xtl("business_contact_info", this.A07, (String) null, (String) null, (String) null, Collections.singletonMap("phone", String.valueOf(str)), (Map) null, (Map) null));
        }
    }

    public final void E0L() {
        String str;
        if (C324536zU.A00(getSession())) {
            FFO.A02(requireContext(), getSession(), "whatsapp_linking");
            return;
        }
        getSession();
        if (!DbT.A0j(getSession()).A1d()) {
            str = AnonymousClass000.A00(46);
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        C46649DiU A042 = C46649DiU.A04(str, Dbb.A0d("ContactOptionsEntryPoint", "whatsapp_linking_in_business_contact_button_setup"));
        IgBloksScreenConfig A0N = DbS.A0N(getSession());
        DbZ.A19(this, A0N, 2131976862);
        AnonymousClass3M3 A022 = C49891FBs.A02(A0N, A042);
        C309516Yo A0G2 = Dbb.A0G(this);
        A0G2.A0A = "ContactOptionsEntryPoint";
        A0G2.A0F = true;
        A0G2.A0E(A022);
        A0G2.A04();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        String stripSeparators;
        String str;
        int A022 = AnonymousClass0fD.A02(1063088398);
        E7B.super.onCreate(bundle);
        this.A07 = DbX.A0o(this);
        Dbc.A0p(this);
        AnonymousClass1Nd.A00(getSession()).A01(this.A0I, C376029Gg.class);
        getParentFragmentManager().A0v(new C50129FQm(this, 0), this, "native_calling_page_save");
        C50129FQm fQm = new C50129FQm(this, 1);
        getParentFragmentManager().A0v(fQm, this, "update_primary_address_result_key");
        getParentFragmentManager().A0v(fQm, this, "update_additional_business_addresses_result_key");
        this.A06 = DbT.A0j(getSession());
        this.A03 = C319596qs.A00(C319586qr.EDIT_PROFILE, this, getSession(), AnonymousClass7TF.A0b());
        this.A0D = requireArguments().getBoolean("show_public_contacts_toggle", true);
        Address A023 = AnonymousClass703.A02(requireContext(), this.A06);
        if (A023 == null) {
            A023 = new Address("", "", "0", "", "");
        }
        ArrayList A062 = AnonymousClass703.A06(this.A06);
        if (this.A06.A03.BiH() == null) {
            stripSeparators = "";
        } else {
            stripSeparators = PhoneNumberUtils.stripSeparators(002.A0g(this.A06.A03.BiG(), " ", this.A06.A03.BiH()));
        }
        String BiG = this.A06.A03.BiG();
        String BiH = this.A06.A03.BiH();
        switch (this.A06.A0L().intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "CALL";
                break;
            default:
                str = "TEXT";
                break;
        }
        ? obj = new Object();
        obj.A01 = BiG;
        obj.A02 = BiH;
        obj.A03 = stripSeparators;
        obj.A00 = str;
        C267544bj B4O = this.A06.A03.B4O();
        String str2 = null;
        if (B4O != null) {
            str2 = B4O.AqF();
        }
        FEa fEa = new FEa();
        fEa.A09 = this.A06.A03.getCategory();
        fEa.A0B = this.A06.A03.BiE();
        fEa.A01 = obj;
        fEa.A00 = A023;
        fEa.A0M = A062;
        fEa.A0J = this.A06.A03.BaE();
        fEa.A0L = this.A06.A03.CGR();
        fEa.A0P = this.A06.A2M();
        fEa.A0N = this.A06.A1y();
        fEa.A05 = this.A06.A03.B4M();
        fEa.A04 = this.A06.A03.B4N();
        fEa.A06 = this.A06.A03.B4P();
        fEa.A07 = this.A06.A03.B4Q();
        fEa.A08 = str2;
        fEa.A0C = this.A06.A03.B4h();
        fEa.A0D = this.A06.A03.B4i();
        fEa.A0E = this.A06.A03.B4k();
        fEa.A0F = this.A06.A03.B4j();
        fEa.A0S = this.A06.A1g();
        this.A05 = new BusinessInfo(fEa);
        this.A0E = !2Ek.A01(this.A06);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("business_contact_info", this.A07, (String) null, (String) null, (String) null, A00(this), (Map) null, (Map) null));
        }
        AnonymousClass1Nd.A00(getSession()).A01(this.A0H, C50264FVv.class);
        AnonymousClass0fD.A09(-795239667, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(474308974);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.contact_button_setup_fragment_layout);
        AnonymousClass0fD.A09(1132664414, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(140946808);
        super.onDestroy();
        AnonymousClass1Nd.A00(getSession()).A02(this.A0H, C50264FVv.class);
        AnonymousClass1Nd.A00(getSession()).A02(this.A0I, C376029Gg.class);
        AnonymousClass0fD.A09(-513979535, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1611485396);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1651880704, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(337199959);
        E7B.super.onPause();
        this.A04.A02();
        AnonymousClass0fD.A09(1984754353, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1763591004);
        super.onResume();
        this.A04.setBusinessInfoListeners(this);
        DbS.A1D(this);
        DbV.A0G(this).setSoftInputMode(3);
        A01(false);
        AnonymousClass0fD.A09(864818697, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(249560852);
        E7B.super.onStop();
        DbS.A1D(this);
        DbV.A0G(this).setSoftInputMode(3);
        AnonymousClass0fD.A09(2128965205, A022);
    }
}
