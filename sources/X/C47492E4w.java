package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.E4w  reason: case insensitive filesystem */
public final class C47492E4w extends AnonymousClass4DH implements AnonymousClass4DR, C51958G9e, AnonymousClass4DS, C51925G7t, C252213ok, G5T, G6B, CallerContextable {
    public static final String A0H = 002.A0R(C47492E4w.class.getName(), ".EXTRA_ADDRESS");
    public static final String __redex_internal_original_name = "EditBusinessProfileFragment";
    public View A00;
    public BusinessFlowAnalyticsLogger A01;
    public G8D A02;
    public BusinessInfoSectionView A03;
    public EEJ A04;
    public UserSession A05;
    public BusinessInfo A06;
    public User A07;
    public String A08;
    public boolean A09 = false;
    public LinearLayout A0A;
    public BusinessNavBar A0B;
    public AnonymousClass3E6 A0C;
    public boolean A0D;
    public final Handler A0E = AnonymousClass7TF.A0D();
    public final Runnable A0F = new C51175Fpl(this);
    public final 1wn A0G = FXZ.A00(this, 5);

    public static void A00(C47492E4w e4w, boolean z) {
        C47492E4w e4w2 = e4w;
        BusinessInfoSectionView businessInfoSectionView = e4w.A03;
        UserSession userSession = e4w.A05;
        BusinessInfo businessInfo = e4w.A06;
        0Tu r3 = 0Tu.A05;
        boolean z2 = z;
        businessInfoSectionView.setBusinessInfo(userSession, businessInfo, e4w2, true, true, false, DbY.A1Y(r3, userSession, 36315142488591385L), DbY.A1Y(r3, e4w.A05, 36314609912646370L), true, z2, false, e4w2);
        e4w2.A02(z2);
    }

    public final void APF() {
    }

    public final void ARL() {
    }

    public final boolean DBR(int i) {
        return false;
    }

    public final void DWs() {
        A02(true);
    }

    public final void DWt() {
    }

    public final void DvR() {
    }

    public final void Dws() {
    }

    public final String getModuleName() {
        return "edit_business_profile";
    }

    private void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("edit_contact_info", this.A08, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.A03.A09() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(boolean r4) {
        /*
            r3 = this;
            com.instagram.model.business.BusinessInfo r0 = r3.A06
            boolean r0 = r0.A0S
            r2 = 1
            if (r0 == 0) goto L_0x0010
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A03
            boolean r0 = r0.A09()
            r1 = 1
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            com.instagram.model.business.BusinessInfo r0 = r3.A06
            com.instagram.model.business.BusinessInfo r0 = X.FEa.A00(r0, r1)
            r3.A06 = r0
            com.instagram.business.ui.BusinessInfoSectionView r1 = r3.A03
            boolean r0 = r0.A0S
            r1.A08(r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47492E4w.A02(boolean):void");
    }

    public final void CuW() {
        A01("address");
        C49730F3v A0R = DbU.A0R();
        String str = this.A08;
        if (str == null) {
            str = "";
        }
        C47479E4e A052 = A0R.A05(this.A06.A00, (Integer) null, str, "primary", false, false, false, false, true);
        A052.setTargetFragment(this, 0);
        Dbb.A0o((Bundle) null, A052, requireActivity(), this.A05);
    }

    public final void Cvy() {
        A01("area_code");
    }

    public final void DBn() {
        A01("email");
    }

    public final void DMr(int i, boolean z) {
        int i2;
        BusinessNavBar businessNavBar = this.A0B;
        businessNavBar.getClass();
        int height = businessNavBar.getHeight();
        View currentFocus = requireActivity().getCurrentFocus();
        int[] iArr = new int[2];
        if (currentFocus != null) {
            currentFocus.getLocationInWindow(iArr);
        }
        if (i > 0) {
            if (currentFocus != null) {
                i2 = currentFocus.getHeight();
            } else {
                i2 = 0;
            }
            int A082 = (0nA.A08(requireContext()) - iArr[1]) - i2;
            int i3 = i + height;
            if (A082 < i3) {
                this.A00.postDelayed(new C51337FsV(this, i3 - A082), 300);
            }
        }
    }

    public final void DWw() {
        A01("phone");
    }

    public final void Da4(boolean z) {
        if (this.A01 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("should_show_public_contacts", String.valueOf(z));
            this.A01.Ckp(new C22030Xtl("edit_contact_info", this.A08, "contact_options_profile_display_toggle", (String) null, (String) null, (Map) null, A1E, (Map) null));
        }
        if (!z || !this.A03.A09()) {
            this.A06 = FEa.A00(this.A06, z);
            return;
        }
        BusinessInfoSectionView businessInfoSectionView = this.A03;
        C358248ab A0Y = DbS.A0Y(requireContext());
        A0Y.A09(2131968387);
        A0Y.A08(2131952288);
        C50023FJi.A01(A0Y, businessInfoSectionView, 25);
        DbT.A1V(A0Y);
    }

    public final void Di0() {
        A01("skip");
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.CkV(new C22030Xtl("edit_contact_info", this.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        ((BusinessConversionActivity) this.A02).A0p((Bundle) null, true);
    }

    public final void E0L() {
        String str;
        if (!DbT.A0j(this.A05).A1d()) {
            str = AnonymousClass000.A00(46);
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        C46649DiU A042 = C46649DiU.A04(str, Dbb.A0d("edit_business_profile", "whatsapp_linking_in_business_conversion_flow"));
        IgBloksScreenConfig A0N = DbS.A0N(this.A05);
        DbZ.A19(this, A0N, 2131976862);
        AnonymousClass3M3 A022 = C49891FBs.A02(A0N, A042);
        C309516Yo A0M = DbS.A0M(requireActivity(), this.A05);
        A0M.A0A = "edit_business_profile";
        A0M.A0F = true;
        A0M.A0E(A022);
        A0M.A04();
    }

    public final void ESy(CountryCodeData countryCodeData) {
        this.A03.setCountryCode(countryCodeData);
        String str = countryCodeData.A01;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("area_code", str);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("edit_contact_info", this.A08, "area_code_option", (String) null, (String) null, (Map) null, A1E, (Map) null));
        }
    }

    public final void FKj(Address address, String str) {
        if (this.A06 == null && Dba.A0C(this.A02).A02 != null) {
            this.A06 = Dba.A0C(this.A02).A02;
        }
        BusinessInfoSectionView businessInfoSectionView = this.A03;
        if (businessInfoSectionView != null) {
            FEa fEa = new FEa(this.A06);
            fEa.A0B = businessInfoSectionView.getEmail();
            fEa.A01 = this.A03.getSubmitPublicPhoneContact();
            fEa.A00 = address;
            this.A06 = new BusinessInfo(fEa);
            this.A03.A05(address);
        }
    }

    public final void configureActionBar(2da r3) {
        r3.setTitle("");
        if (this.A0D) {
            FPB.A02(DbV.A0K(), r3, this, 40);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("edit_contact_info", this.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!this.A0D) {
            return true;
        }
        Dba.A1R(this.A02);
        return true;
    }

    public final void DTW() {
        DbU.A0R();
        boolean z = this.A06.A0P;
        String str = this.A08;
        if (str == null) {
            str = "";
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        Bundle A0B2 = DbV.A0B(str, 2);
        A0B2.putBoolean("is_profile_audio_call_enabled", z);
        A0B2.putBoolean("maybe_show_confirmation_dialog", false);
        DbS.A1B(A0B2, str);
        C47430E2a e2a = new C47430E2a();
        e2a.A00 = businessFlowAnalyticsLogger;
        e2a.setArguments(A0B2);
        Dbb.A12(e2a, requireActivity(), this.A05);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = this.A01;
        if (businessFlowAnalyticsLogger2 != null) {
            businessFlowAnalyticsLogger2.Ckp(new C22030Xtl("edit_contact_info", this.A08, "profile_native_calling", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            this.A01.Cka(new C22030Xtl("profile_native_calling", this.A08, (String) null, (String) null, (String) null, Collections.singletonMap("is_profile_audio_call_enabled", String.valueOf(this.A06.A0P)), (Map) null, (Map) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DZI() {
        /*
            r11 = this;
            X.DbS.A1D(r11)
            java.lang.String r1 = "continue"
            r11.A01(r1)
            com.instagram.model.business.BusinessInfo r1 = r11.A06
            java.lang.String r3 = r1.A0B
            com.instagram.model.business.Address r5 = r1.A00
            if (r5 == 0) goto L_0x006e
            java.lang.String r2 = r5.A03
        L_0x0012:
            com.instagram.business.ui.BusinessInfoSectionView r4 = r11.A03
            java.lang.String r1 = r4.getEmail()
            int r1 = r1.length()
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r4.getEmail()
            boolean r1 = X.0mp.A0C(r1)
            if (r1 != 0) goto L_0x005a
            r1 = 2131969518(0x7f1345ee, float:1.9575961E38)
            java.lang.String r6 = r11.getString(r1)
            java.lang.String r7 = "INVALID_EMAIL"
        L_0x0031:
            java.lang.String r1 = "INVALID_EMAIL"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            android.widget.TextView r4 = r1.A03
            if (r4 != 0) goto L_0x0071
            java.lang.String r0 = "emailInlineErrorMessage"
        L_0x0041:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0049:
            java.lang.String r1 = "NO_CONTACT_INFORMATION_PROVIDED"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0075
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            android.widget.TextView r4 = r1.A02
            if (r4 != 0) goto L_0x0071
            java.lang.String r0 = "bottomInlineErrorMessage"
            goto L_0x0041
        L_0x005a:
            if (r5 == 0) goto L_0x00c0
            java.lang.String r1 = r5.A00
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00c0
            r1 = 2131969517(0x7f1345ed, float:1.957596E38)
            java.lang.String r6 = r11.getString(r1)
            java.lang.String r7 = "NO_CITY"
            goto L_0x0031
        L_0x006e:
            java.lang.String r2 = ""
            goto L_0x0012
        L_0x0071:
            r1 = 0
            r4.setVisibility(r1)
        L_0x0075:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            if (r1 == 0) goto L_0x00a5
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0088
            java.lang.String r1 = "email"
            r9.put(r1, r3)
        L_0x0088:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0093
            java.lang.String r1 = "address"
            r9.put(r1, r2)
        L_0x0093:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            java.lang.String r3 = "edit_contact_info"
            r8 = 0
            java.lang.String r4 = r11.A08
            java.lang.String r5 = "business_info_validation"
            X.Xtl r2 = new X.Xtl
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Ci6(r2)
        L_0x00a5:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            if (r1 == 0) goto L_0x00bf
            java.lang.String r3 = "edit_contact_info"
            r8 = 0
            java.lang.String r4 = r11.A08
            java.lang.String r5 = "save_info"
            com.instagram.model.business.BusinessInfo r0 = r11.A06
            java.util.HashMap r9 = X.C48728EjD.A00(r0)
            X.Xtl r2 = new X.Xtl
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Ckh(r2)
        L_0x00bf:
            return
        L_0x00c0:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            if (r1 == 0) goto L_0x00f2
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x00d3
            java.lang.String r1 = "email"
            r9.put(r1, r3)
        L_0x00d3:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x00de
            java.lang.String r1 = "address"
            r9.put(r1, r2)
        L_0x00de:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            java.lang.String r3 = "edit_contact_info"
            r6 = 0
            java.lang.String r4 = r11.A08
            java.lang.String r5 = "business_info_validation"
            X.Xtl r2 = new X.Xtl
            r7 = r6
            r8 = r6
            r10 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Ci5(r2)
        L_0x00f2:
            X.G8D r1 = r11.A02
            X.FRU r3 = X.Dba.A0C(r1)
            com.instagram.model.business.BusinessInfo r1 = r11.A06
            X.FEa r2 = new X.FEa
            r2.<init>(r1)
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            java.lang.String r1 = r1.getEmail()
            r2.A0B = r1
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            com.instagram.model.business.PublicPhoneContact r1 = r1.getSubmitPublicPhoneContact()
            r2.A01 = r1
            com.instagram.model.business.BusinessInfo r1 = r11.A06
            boolean r1 = r1.A0P
            r2.A0P = r1
            com.instagram.user.model.User r1 = r11.A07
            X.4Cl r1 = r1.A03
            java.lang.String r1 = r1.CGR()
            r2.A0L = r1
            com.instagram.model.business.BusinessInfo r1 = new com.instagram.model.business.BusinessInfo
            r1.<init>(r2)
            r3.A02 = r1
            X.EEJ r1 = r11.A04
            if (r1 == 0) goto L_0x012d
            r1.A01()
        L_0x012d:
            android.os.Handler r1 = r11.A0E
            java.lang.Runnable r0 = r11.A0F
            r1.removeCallbacks(r0)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47492E4w.DZI():void");
    }

    public final void onAttach(Context context) {
        C47492E4w.super.onAttach(context);
        G8D A012 = FG1.A01(this);
        A012.getClass();
        this.A02 = A012;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.E4w, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0074, code lost:
        if (r3.A01(r7.A05).A1g() != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -1777263224(0xffffffff96111d88, float:-1.1722325E-25)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.C47492E4w.super.onCreate(r8)
            android.os.Bundle r5 = r7.requireArguments()
            com.instagram.common.session.UserSession r2 = X.DbX.A0U(r7)
            r7.A05 = r2
            X.G8D r0 = r7.A02
            X.6qr r1 = r0.B6a()
            X.G8D r0 = r7.A02
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C319596qs.A00(r1, r7, r2, r0)
            r7.A01 = r0
            X.Dbc.A0p(r7)
            X.0hq r2 = r7.getParentFragmentManager()
            r0 = 2
            X.FQm r1 = new X.FQm
            r1.<init>(r7, r0)
            java.lang.String r0 = "native_calling_page_save"
            r2.A0v(r1, r7, r0)
            com.instagram.common.session.UserSession r0 = r7.A05
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.9Gg> r1 = X.C376029Gg.class
            X.1wn r0 = r7.A0G
            r2.A01(r0, r1)
            com.instagram.common.session.UserSession r0 = r7.A05
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r3.A01(r0)
            r7.A07 = r0
            com.instagram.model.business.BusinessInfo r1 = r7.A06
            if (r1 != 0) goto L_0x00d9
            X.G8D r0 = r7.A02
            if (r0 == 0) goto L_0x00fd
            X.FRU r0 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r2 = r0.A02
        L_0x0063:
            if (r2 == 0) goto L_0x0069
            boolean r0 = r2.A0S
            if (r0 != 0) goto L_0x0076
        L_0x0069:
            com.instagram.common.session.UserSession r0 = r7.A05
            com.instagram.user.model.User r0 = r3.A01(r0)
            boolean r1 = r0.A1g()
            r0 = 0
            if (r1 == 0) goto L_0x0077
        L_0x0076:
            r0 = 1
        L_0x0077:
            com.instagram.model.business.BusinessInfo r6 = X.FEa.A00(r2, r0)
            X.G8D r0 = r7.A02
            X.FRU r0 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r2 = r0.A03
            if (r2 == 0) goto L_0x00a6
            X.FEa r1 = new X.FEa
            r1.<init>(r6)
            java.lang.String r0 = r2.A0B
            r1.A0B = r0
            com.instagram.model.business.PublicPhoneContact r0 = r2.A01
            r1.A01 = r0
            com.instagram.model.business.Address r0 = r2.A00
            r1.A00 = r0
            r0 = 1
            r1.A0O = r0
            com.instagram.model.business.BusinessInfo r6 = new com.instagram.model.business.BusinessInfo
            r6.<init>(r1)
            X.G8D r0 = r7.A02
            X.FRU r0 = X.Dba.A0C(r0)
            r0.A02 = r6
        L_0x00a6:
            r3 = 0
            java.lang.String r2 = r6.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00b5
            boolean r0 = X.0mp.A0C(r2)
            if (r0 != 0) goto L_0x00b6
        L_0x00b5:
            r2 = r3
        L_0x00b6:
            com.instagram.model.business.Address r1 = r6.A00
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c3
            r3 = r1
        L_0x00c3:
            X.FEa r0 = new X.FEa
            r0.<init>(r6)
            r0.A0B = r2
            r0.A00 = r3
            com.instagram.model.business.BusinessInfo r1 = new com.instagram.model.business.BusinessInfo
            r1.<init>(r0)
            X.G8D r0 = r7.A02
            X.FRU r0 = X.Dba.A0C(r0)
            r0.A02 = r1
        L_0x00d9:
            r7.A06 = r1
            java.lang.String r0 = X.DbS.A0l(r5)
            r7.A08 = r0
            r0 = 0
            X.3E5 r0 = X.AnonymousClass3E4.A01(r7, r0, r0)
            r7.A0C = r0
            X.G8D r0 = r7.A02
            com.instagram.business.controller.datamodel.ConversionStep r2 = r0.E2J()
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            r0 = 0
            if (r2 == r1) goto L_0x00f4
            r0 = 1
        L_0x00f4:
            r7.A0D = r0
            r0 = 196777132(0xbba94ac, float:7.186829E-32)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x00fd:
            java.lang.String r0 = "business_info"
            android.os.Parcelable r2 = r5.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r2 = (com.instagram.model.business.BusinessInfo) r2
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47492E4w.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(108382590);
        View inflate = layoutInflater.inflate(R.layout.edit_business_profile_fragment, viewGroup, false);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.requireViewById(R.id.navigation_bar);
        this.A0B = businessNavBar;
        EEJ eej = new EEJ(businessNavBar, (C51925G7t) this, 2131968361, -1);
        this.A04 = eej;
        registerLifecycleListener(eej);
        this.A0B.setVisibility(0);
        BusinessNavBar businessNavBar2 = this.A0B;
        int i = 2131960992;
        if (this.A02.E2I() != null) {
            i = 2131968361;
        }
        businessNavBar2.setPrimaryButtonText(i);
        this.A0B.setSecondaryButtonText(2131960998);
        this.A0B.A02(true);
        this.A0C.A9Y(this);
        TextView A0G2 = DbU.A0G(inflate, R.id.public_business_information_text);
        int i2 = 2131970936;
        if (FG1.A03(this.A02)) {
            i2 = 2131970961;
        }
        A0G2.setText(i2);
        if (requireArguments().getBoolean("update_from_argument", false)) {
            FEa fEa = new FEa(this.A06);
            fEa.A0B = requireArguments().getString("android.intent.extra.EMAIL");
            fEa.A01 = (PublicPhoneContact) requireArguments().getParcelable("android.intent.extra.PHONE_NUMBER");
            this.A06 = new BusinessInfo(fEa);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("edit_contact_info", this.A08, (String) null, (String) null, (String) null, C48728EjD.A00(this.A06), (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(720538660, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1225960620);
        super.onDestroyView();
        unregisterLifecycleListener(this.A04);
        this.A0C.EEH(this);
        this.A04 = null;
        this.A0B = null;
        requireArguments().putBoolean("update_from_argument", true);
        requireArguments().putParcelable("android.intent.extra.PHONE_NUMBER", this.A03.getSubmitPublicPhoneContact());
        requireArguments().putString("android.intent.extra.EMAIL", this.A03.getEmail());
        AnonymousClass1Nd.A00(this.A05).A02(this.A0G, C376029Gg.class);
        AnonymousClass0fD.A09(-116450871, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1662578765);
        C47492E4w.super.onPause();
        this.A03.A02();
        Dbc.A0o(this);
        AnonymousClass0fD.A09(996588023, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1032223514);
        super.onResume();
        this.A03.setBusinessInfoListeners(this);
        AnonymousClass1Nd.A00(this.A05).A01(this.A0G, C376029Gg.class);
        if (this.A03 != null && DbT.A0j(this.A05).A1d()) {
            FEa fEa = new FEa(this.A06);
            fEa.A0L = this.A07.A03.CGR();
            this.A06 = new BusinessInfo(fEa);
            this.A03.A04(this.A05);
        }
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Dbb.A0h(rootActivity);
        A00(this, false);
        AnonymousClass0fD.A09(-1487981512, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1215408529);
        C47492E4w.super.onStart();
        this.A0C.DmJ((Activity) getContext());
        AnonymousClass0fD.A09(-901533121, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1480249668);
        C47492E4w.super.onStop();
        DbS.A1D(this);
        this.A0C.onStop();
        AnonymousClass0fD.A09(197524609, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        PublicPhoneContact publicPhoneContact;
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.scroll_view);
        this.A0A = (LinearLayout) view.requireViewById(R.id.scroll_container);
        BusinessNavBar businessNavBar = this.A0B;
        businessNavBar.getClass();
        businessNavBar.A01(this.A0A);
        ViewStub A0D2 = DbU.A0D(view, R.id.header_stub);
        A0D2.setLayoutResource(R.layout.business_title_card_bigger_title);
        View inflate = A0D2.inflate();
        Dba.A06(inflate).setText(2131961519);
        Dba.A05(inflate).setText(2131961442);
        this.A03 = (BusinessInfoSectionView) view.requireViewById(R.id.business_info_section);
        BusinessInfo businessInfo = this.A06;
        if (!TextUtils.isEmpty(businessInfo.A0B) || businessInfo.A00 != null || (((publicPhoneContact = businessInfo.A01) != null && !TextUtils.isEmpty(publicPhoneContact.A02)) || !TextUtils.isEmpty(businessInfo.A0L) || this.A09)) {
            A00(this, false);
        } else {
            C47697EDg.A01(this, C318486p2.A06(this.A05), 15);
        }
        String str = Dba.A0C(this.A02).A05;
        if (str != null) {
            C59689JTv.A09(getContext(), str);
        }
    }

    public final void DBm(boolean z) {
        A02(z);
    }
}
