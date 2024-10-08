package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.E4e  reason: case insensitive filesystem */
public final class C47479E4e extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BusinessLocationFragment";
    public EditText A00;
    public TextView A01;
    public BusinessFlowAnalyticsLogger A02;
    public G8D A03;
    public UserSession A04;
    public Address A05;
    public Integer A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public ViewGroup A0B;
    public ViewGroup A0C;
    public ViewGroup A0D;
    public TextView A0E;
    public TextView A0F;
    public ProfileAddressData A0G;
    public User A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public final String getModuleName() {
        return "business_location";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        super.onViewCreated(view, bundle);
        String str2 = this.A08;
        if (str2 != null && "profile_multiple_addresses_edit_list".equals(str2)) {
            boolean z = !this.A09;
            UserSession userSession = this.A04;
            0qQ.A0B(userSession, 1);
            if (z) {
                str = "ig_profile_edit_address_page";
            } else {
                str = "ig_profile_add_address_page";
            }
            C49075Eot.A00(this, userSession, "impression", "form", "subscriber", str, userSession.A06, (Map) null);
        }
        View requireViewById = view.requireViewById(R.id.remove_container);
        TextView A0G2 = DbU.A0G(view, R.id.remove_button);
        Address address = this.A05;
        if (address == null || TextUtils.isEmpty(address.A03)) {
            requireViewById.setVisibility(Dbb.A03(view, R.id.remove_button_bottom_divider));
        } else {
            FPB.A01(A0G2, 23, this);
            if (this.A0I || this.A0J) {
                A0G2.setEnabled(false);
                Context context = getContext();
                if (context != null) {
                    DbY.A11(A0G2, context);
                }
            }
        }
        this.A0C = DbU.A0C(view, R.id.edit_lock_header);
        this.A0F = DbU.A0G(view, R.id.edit_lock_header_text);
        this.A0D = DbU.A0C(view, R.id.primary_location_header);
        this.A00 = DbU.A0E(view, R.id.street_address);
        this.A0B = DbU.A0C(view, R.id.city_state_container);
        this.A0E = DbU.A0G(view, R.id.city_state);
        this.A01 = DbU.A0G(view, R.id.zip);
        A02(this);
        if (!this.A0I && ((num = this.A06) == null || num.intValue() != 0)) {
            FPB.A01(this.A0B, 24, this);
        }
        BusinessNavBar businessNavBar = (BusinessNavBar) view.requireViewById(R.id.navigation_bar);
        if (this.A03 != null) {
            businessNavBar.setPrimaryButtonText(2131972502);
        }
        if ((!"edit_profile".equals(this.A08)) && !this.A0I) {
            Integer num2 = this.A06;
            if (num2 == null || num2.intValue() != 0) {
                businessNavBar.setVisibility(0);
                businessNavBar.setPrimaryButtonOnclickListeners(FPB.A00(this, 25));
            }
        }
    }

    private HashMap A00() {
        String str;
        String str2;
        Address address = this.A05;
        String str3 = null;
        if (address == null) {
            str = null;
            str2 = null;
        } else {
            str = address.A04;
            str2 = address.A01;
            str3 = address.A02;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("address", str);
        A1E.put(ServerW3CShippingAddressConstants.CITY, str2);
        A1E.put("zip_code", str3);
        return A1E;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.instagram.model.business.Address} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if ("profile_multiple_addresses_edit_list".equals(r1) == false) goto L_0x0026;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C47479E4e r17) {
        /*
            r10 = r17
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r10.A02
            if (r0 == 0) goto L_0x0019
            java.lang.String r2 = "page_import_info_location"
            r5 = 0
            java.lang.String r3 = r10.A08
            java.lang.String r4 = "continue"
            X.Xtl r1 = new X.Xtl
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.Ckp(r1)
        L_0x0019:
            java.lang.String r1 = r10.A08
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = "profile_multiple_addresses_edit_list"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r1 = 1
            if (r0 == 0) goto L_0x0046
            boolean r0 = r10.A09
            r0 = r0 ^ 1
            com.instagram.common.session.UserSession r11 = r10.A04
            X.0qQ.A0B(r11, r1)
            if (r0 == 0) goto L_0x011e
            java.lang.String r15 = "ig_profile_edit_address_page"
        L_0x0037:
            java.lang.String r0 = r11.A06
            r17 = 0
            java.lang.String r12 = "click"
            java.lang.String r13 = "done_button"
            java.lang.String r14 = "subscriber"
            r16 = r0
            X.C49075Eot.A00(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0046:
            boolean r0 = r10.A0I
            if (r0 != 0) goto L_0x0122
            java.lang.Integer r0 = r10.A06
            if (r0 == 0) goto L_0x0054
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0122
        L_0x0054:
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x0070
            android.widget.EditText r0 = r10.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0070
            android.widget.TextView r0 = r10.A01
            java.lang.String r0 = X.DbV.A0x(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007c
        L_0x0070:
            com.instagram.model.business.Address r0 = r10.A05
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fd
        L_0x007c:
            X.DbS.A1D(r10)
            com.instagram.model.business.Address r0 = r10.A05
            r4 = 0
            if (r0 != 0) goto L_0x00c5
            r10.A0G = r4
            androidx.fragment.app.Fragment r2 = r10.getTargetFragment()
            r2.getClass()
            X.G5T r2 = (X.G5T) r2
        L_0x008f:
            java.lang.String r0 = r10.A07
            r2.FKj(r4, r0)
            r10.A0L = r1
            X.G8D r0 = r10.A03
            if (r0 != 0) goto L_0x00b7
            X.DbT.A1J(r10)
        L_0x009d:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r10.A02
            if (r0 == 0) goto L_0x00b6
            java.lang.String r2 = "page_import_info_location"
            r4 = 0
            java.lang.String r3 = r10.A08
            java.util.HashMap r8 = r10.A00()
            X.Xtl r1 = new X.Xtl
            r5 = r4
            r6 = r4
            r7 = r4
            r9 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.Ci7(r1)
        L_0x00b6:
            return
        L_0x00b7:
            com.instagram.model.business.Address r0 = r10.A05
            A03(r10, r0)
            X.0hq r0 = r10.mFragmentManager
            r0.getClass()
            r0.A0c()
            goto L_0x009d
        L_0x00c5:
            android.widget.EditText r0 = r10.A00
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r0)
            com.instagram.model.business.Address r0 = r10.A05
            r5 = 0
            if (r0 == 0) goto L_0x00d4
            java.lang.String r4 = r0.A01
            java.lang.String r5 = r0.A00
        L_0x00d4:
            android.widget.TextView r0 = r10.A01
            java.lang.String r6 = X.DbV.A0x(r0)
            android.content.Context r0 = r10.getContext()
            java.lang.String r7 = X.AnonymousClass703.A05(r0, r3, r6, r4)
            com.instagram.model.business.Address r2 = new com.instagram.model.business.Address
            r2.<init>(r3, r4, r5, r6, r7)
            r10.A05 = r2
            java.lang.String r0 = r10.A07
            com.instagram.model.business.ProfileAddressData r0 = X.C48991EnT.A00(r2, r0)
            r10.A0G = r0
            androidx.fragment.app.Fragment r2 = r10.getTargetFragment()
            r2.getClass()
            X.G5T r2 = (X.G5T) r2
            com.instagram.model.business.Address r4 = r10.A05
            goto L_0x008f
        L_0x00fd:
            r0 = 2131969517(0x7f1345ed, float:1.957596E38)
            java.lang.String r5 = r10.getString(r0)
            X.C59689JTv.A0G(r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r10.A02
            if (r0 == 0) goto L_0x00b6
            java.lang.String r2 = "page_import_info_location"
            r4 = 0
            java.lang.String r3 = r10.A08
            java.lang.String r6 = "NO_CITY"
            X.Xtl r1 = new X.Xtl
            r7 = r4
            r8 = r4
            r9 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.Ckh(r1)
            return
        L_0x011e:
            java.lang.String r15 = "ig_profile_add_address_page"
            goto L_0x0037
        L_0x0122:
            r10.A0L = r1
            X.G8D r0 = r10.A03
            if (r0 != 0) goto L_0x012c
            X.DbT.A1J(r10)
            return
        L_0x012c:
            X.0hq r0 = r10.mFragmentManager
            r0.getClass()
            r0.A0c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47479E4e.A01(X.E4e):void");
    }

    public static void A03(C47479E4e e4e, Address address) {
        G8D g8d = e4e.A03;
        if (g8d != null) {
            BusinessInfo businessInfo = Dba.A0C(g8d).A02;
            FRU A0C2 = Dba.A0C(e4e.A03);
            FEa fEa = new FEa(businessInfo);
            fEa.A00 = address;
            A0C2.A02 = new BusinessInfo(fEa);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        FPB A002 = FPB.A00(this, 26);
        if (this.A0A) {
            ? obj = new Object();
            C59922Jbl.A01(DbV.A05(this), obj, 2131965499);
            C59904JbT.A01(A002, r5, obj);
            return;
        }
        r5.Eom(2131965499);
        FPB.A02(DbX.A0M(), r5, this, 27);
        if (!(!"edit_profile".equals(this.A08)) && !this.A0I) {
            Integer num = this.A06;
            if (num == null || num.intValue() != 0) {
                int i = 2131960992;
                if (this.A03 == null) {
                    i = 2131972502;
                }
                String string = getString(i);
                AnonymousClass3JR A0K2 = DbS.A0K();
                A0K2.A0K = string;
                DbX.A19(A002, A0K2, r5);
            }
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        String str;
        if (this.A0L) {
            return false;
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A02;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("page_import_info_location", this.A08, (String) null, (String) null, (String) null, (Map) null, A00(), (Map) null));
        }
        String str2 = this.A08;
        if (str2 == null || !"profile_multiple_addresses_edit_list".equals(str2)) {
            return false;
        }
        boolean z = !this.A09;
        UserSession userSession = this.A04;
        0qQ.A0B(userSession, 1);
        if (z) {
            str = "ig_profile_edit_address_page";
        } else {
            str = "ig_profile_add_address_page";
        }
        C49075Eot.A00(this, userSession, "click", "cancel_button", "subscriber", str, userSession.A06, (Map) null);
        return false;
    }

    public static void A02(C47479E4e e4e) {
        Integer num;
        ProfileAddressData profileAddressData;
        Context context = e4e.getContext();
        Address address = e4e.A05;
        if (address != null) {
            e4e.A00.setText(address.A04);
            e4e.A01.setText(e4e.A05.A02);
            if (!TextUtils.isEmpty(e4e.A05.A01)) {
                e4e.A0E.setText(e4e.A05.A01);
            }
            if (context != null && TextUtils.isEmpty(e4e.A05.A01)) {
                DbY.A11(e4e.A0E, context);
            }
        }
        e4e.A0D.setVisibility(8);
        if (!e4e.A0K && (profileAddressData = e4e.A0G) != null && 0qQ.A0K(profileAddressData.A06, "primary")) {
            e4e.A0D.setVisibility(0);
        }
        e4e.A0C.setVisibility(8);
        if (e4e.A0I || ((num = e4e.A06) != null && num.intValue() == 0)) {
            e4e.A00.setEnabled(false);
            e4e.A01.setEnabled(false);
            if (context != null) {
                DbY.A11(e4e.A00, context);
                DbY.A11(e4e.A0E, context);
                DbY.A11(e4e.A01, context);
            }
            C282195Cd AZe = e4e.A0H.A03.AZe();
            Integer num2 = e4e.A06;
            if (num2 != null && num2.intValue() == 0) {
                if (AZe == null || TextUtils.isEmpty(AZe.Azw())) {
                    e4e.A0F.setText(2131966468);
                } else {
                    e4e.A0F.setText(AZe.Azw());
                }
                e4e.A0C.setVisibility(0);
            }
        }
    }

    public final void onAttach(Context context) {
        C47479E4e.super.onAttach(context);
        this.A03 = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(522683282);
        C47479E4e.super.onCreate(bundle);
        Dbc.A0p(this);
        Bundle requireArguments = requireArguments();
        this.A08 = DbS.A0l(requireArguments);
        this.A05 = (Address) requireArguments.getParcelable(C47492E4w.A0H);
        this.A07 = requireArguments.getString("BusinessLocationFragment.EXTRA_ADDITIONAL_ADDRESS_ID");
        G8D g8d = this.A03;
        if (!(g8d == null || Dba.A0C(g8d).A02 == null)) {
            this.A05 = Dba.A0C(this.A03).A02.A00;
        }
        Address address = this.A05;
        if (address != null) {
            this.A0G = C48991EnT.A00(address, this.A07);
        }
        this.A0A = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_SHOULD_SHOW_IN_MODAL");
        this.A0I = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_IS_MV4B_VERIFIED", false);
        if (requireArguments.containsKey("BusinessLocationFragment.NUM_EDITS_LEFT_BEFORE_REACHING_MULTIPLE_ADDRESSES_LIMIT")) {
            this.A06 = DbV.A0o(requireArguments, "BusinessLocationFragment.NUM_EDITS_LEFT_BEFORE_REACHING_MULTIPLE_ADDRESSES_LIMIT");
        }
        this.A0J = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_IS_REMOVE_LOCKED_FOR_MULTIPLE_ADDRESSES", false);
        this.A09 = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_IS_ADDING_NEW_ADDRESS", false);
        this.A0K = requireArguments.getBoolean("BusinessLocationFragment.EXTRA_SHOULD_HIDE_PRIMARY_LOCATION_HEADER", true);
        UserSession A0U = DbX.A0U(this);
        this.A04 = A0U;
        this.A0H = DbT.A0j(A0U);
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A03, this, this.A04);
        this.A02 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("page_import_info_location", this.A08, (String) null, (String) null, (String) null, A00(), (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(1215196383, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-267122108);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.business_location_fragment);
        AnonymousClass0fD.A09(1307725469, A022);
        return A0C2;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1443604154);
        C47479E4e.super.onPause();
        Dbc.A0o(this);
        AnonymousClass0fD.A09(-1840966242, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1717970123);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Dbb.A0h(rootActivity);
        AnonymousClass0fD.A09(1553737362, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1523405357);
        C47479E4e.super.onStop();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-2007910827, A022);
    }
}
