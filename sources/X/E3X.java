package X;

import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.android.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class E3X extends AnonymousClass4DH implements C61110lV, AnonymousClass4DR, G8C, G69, G68 {
    public static final String __redex_internal_original_name = "PhoneConfirmationFragment";
    public long A00;
    public AnonymousClass0aP A01;
    public FX9 A02;
    public FXA A03;
    public FXB A04;
    public FXC A05;
    public RegFlowExtras A06;
    public EEK A07;
    public SearchEditText A08;
    public String A09 = "";
    public String A0A;
    public String A0B = "";
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = false;
    public Dialog A0H;
    public C49922FEx A0I;
    public NotificationBar A0J;
    public InlineErrorMessageView A0K;
    public String A0L;
    public String A0M = "";

    public final void DaH(boolean z) {
    }

    public final boolean onBackPressed() {
        if (!this.A0E || DbT.A1a(DbV.A0d(), "has_user_confirmed_dialog")) {
            C49920FEv.A00.A01(this.A01, B6Y(), BzS().A01);
            return false;
        }
        C49038EoI.A00(this, this.A01, (G52) null, B6Y(), BzS(), (Integer) null);
        return true;
    }

    private void A02(String str, boolean z) {
        Integer num;
        EMU emu;
        String str2;
        String str3 = this.A0L;
        String str4 = null;
        if (str3 == null || !z) {
            num = null;
        } else {
            num = AnonymousClass05K.A00;
        }
        String str5 = str;
        if (this.A0C == null) {
            emu = null;
        } else {
            emu = new EMU(this, str5);
        }
        if (!(str3 == null || num == null || !z)) {
            C49944FFx fFx = C49944FFx.A00;
            AnonymousClass0aP r14 = this.A01;
            String str6 = BzS().A01;
            switch (num.intValue()) {
                case 1:
                    str2 = "authentication_flow";
                    break;
                case 2:
                    str2 = "optimistic_authentication_flow";
                    break;
                case 3:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "registration_flow";
                    break;
            }
            fFx.A04(r14, str6, "client_reg_send_reg_nonce", "send user input nonce to server for auto conf registration", str2, "ar_code_sms");
        }
        Context context = getContext();
        AnonymousClass0aP r9 = this.A01;
        String str7 = this.A0A;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str4 = "authentication_flow";
                    break;
                case 2:
                    str4 = "optimistic_authentication_flow";
                    break;
                case 3:
                    str4 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str4 = "registration_flow";
                    break;
            }
        }
        1OC A062 = FHA.A06(context, r9, str7, str5, str4, this.A0L, (String) null, (String) null);
        AnonymousClass0aP r4 = this.A01;
        FragmentActivity activity = getActivity();
        A062.A00 = new EMJ(activity, this, r4, new C50515Fdb(activity), emu, this, BzS(), AnonymousClass05K.A01, this.A0A, str5, this.A0C);
        1ES.A03(A062);
    }

    public final void APF() {
        this.A08.setEnabled(false);
        this.A08.setClearButtonEnabled(false);
    }

    public final void ARL() {
        this.A08.setEnabled(true);
        this.A08.setClearButtonEnabled(true);
    }

    public final EXD B6Y() {
        if (this.A0E) {
            return EXD.PHONE;
        }
        return null;
    }

    public final C46634DiE BzS() {
        if (this.A0E) {
            return C46634DiE.A0V;
        }
        return C46634DiE.A1K;
    }

    public final boolean Ca3() {
        SearchEditText searchEditText = this.A08;
        RectF rectF = 0nA.A01;
        0qQ.A0B(searchEditText, 0);
        return AnonymousClass7TF.A1S(searchEditText.getText().length(), 6);
    }

    public final void DUM() {
        String A0I2 = 0nA.A0I(this.A08);
        if (this.A0E) {
            FGJ.A01(getContext(), this.A01, C49958FGq.A00(this.A09, this.A0B), A0I2, true);
            return;
        }
        if (this.A0D) {
            02m.A0p.markerStart(725095506);
            02m.A0p.markerAnnotate(725095506, "flow", "prod");
            A01(A0I2, C49958FGq.A00(this.A09, this.A0B));
        } else {
            A02(A0I2, false);
        }
        C49881FBf.A00.A02(this.A01, BzS().A01);
    }

    public final void DgP(Context context, String str, String str2) {
        if (this.A0E) {
            FGJ.A01(context, this.A01, str2, str, false);
        } else if (this.A0D) {
            A01(str, str2);
        } else {
            A02(str, true);
        }
    }

    public final void EuV(String str, Integer num) {
        if (this.A0G) {
            FCQ.A00(this, this.A01, this.A06, str);
            this.A0G = false;
        } else if (AnonymousClass05K.A15 == num) {
            this.A0K.A04(str);
            this.A0J.A02();
        } else {
            C49958FGq.A08(this.A0J, str);
        }
    }

    public final String getModuleName() {
        return "phone_confirmation";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.A0D && this.A0H == null) {
            C358248ab A0V = DbW.A0V(this);
            A0V.A09(2131965624);
            A0V.A0q(DbV.A0z(this, this.A0B, 2131965623));
            A0V.A07(R.drawable.confirmation_icon);
            A0V.A06();
            Dialog A022 = A0V.A02();
            this.A0H = A022;
            AnonymousClass0fN.A00(A022);
            0xI A052 = 1Q0.A1E.A02(this.A01).A05((EXD) null, BzS());
            this.A0I.A00.putString(DbX.A0s(C48071EUp.A09), "sms");
            this.A0I.A03(A052);
            DbU.A1R(A052, this.A01);
        }
        02m.A0p.markerAnnotate(725096125, DatePickerDialogModule.ARG_MODE, "sms");
        02m.A0p.markerEnd(725096125, 2);
    }

    public static void A00(E3X e3x) {
        String string = e3x.getString(2131974065);
        NotificationBar notificationBar = e3x.A0J;
        Context context = notificationBar.getContext();
        notificationBar.A04(string, AnonymousClass7TF.A03(context, R.attr.igds_color_success), context.getColor(2Yu.A02(context)));
    }

    private void A01(String str, String str2) {
        1OC A052 = FHA.A05(getContext(), this.A01, str, str2, Dbj.A00(), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        A052.A00 = new C47932ENj(getActivity(), this.A01, this);
        1ES.A03(A052);
    }

    public final void onAppBackgrounded() {
        RegFlowExtras regFlowExtras;
        int A032 = AnonymousClass0fD.A03(1948543156);
        if (this.A0E && (regFlowExtras = this.A06) != null) {
            regFlowExtras.A0N = BzS().name();
            regFlowExtras.A03(B6Y());
            regFlowExtras.A05 = 0nA.A0I(this.A08);
            C49913FEl.A00(getContext()).A03(this.A01, this.A06);
        }
        AnonymousClass0fD.A0A(-984396273, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1052312869, AnonymousClass0fD.A03(-1206822333));
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        Integer A022;
        int A023 = AnonymousClass0fD.A02(1558969250);
        E3X.super.onCreate(bundle);
        this.A01 = 09i.A0A.A02(this.mArguments);
        this.A0I = C49922FEx.A00(this.mArguments);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("should_enable_auto_conf");
        } else {
            z = false;
        }
        this.A0F = z;
        AnonymousClass0aP r4 = this.A01;
        String str = BzS().A01;
        EXD B6Y = B6Y();
        RegFlowExtras regFlowExtras = this.A06;
        if (regFlowExtras == null) {
            A022 = null;
        } else {
            A022 = regFlowExtras.A02();
        }
        C49922FEx fEx = this.A0I;
        AnonymousClass7TG.A1N(r4, str);
        C49938FFr.A00(r4, fEx, B6Y, A022, str, (String) null);
        if (!Dba.A0Z(0Tu.A05).contains(__redex_internal_original_name)) {
            if (C49035EoF.A00().booleanValue()) {
                C49130Ept.A00().A00(requireContext(), this.A01, (B2F) null);
            }
            if (C49036EoG.A00().booleanValue()) {
                C49130Ept.A00().A01(requireContext(), this.A01, (B2F) null);
            }
        }
        AnonymousClass0fD.A09(1373456028, A023);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String replace;
        String A0E2;
        CountryCodeData countryCodeData;
        String formatNumber;
        int A022 = AnonymousClass0fD.A02(1967083849);
        LayoutInflater layoutInflater2 = layoutInflater;
        View A0C2 = DbT.A0C(layoutInflater2, viewGroup, R.layout.reg_container);
        this.A0J = Dba.A0M(A0C2);
        layoutInflater2.inflate(R.layout.phone_confirmation_fragment, Dba.A04(A0C2), true);
        this.A0E = requireArguments().getBoolean("arg_is_reg_flow");
        this.A06 = (RegFlowExtras) Dba.A03(this);
        this.A0D = requireArguments().getBoolean("arg_is_multiple_account_recovery", false);
        String string = requireArguments().getString("phone_number_key");
        String string2 = requireArguments().getString("query_key");
        String string3 = requireArguments().getString("client_message");
        String string4 = requireArguments().getString("register_start_message");
        if (!this.A0E ? string == null || string2 == null : this.A06 == null) {
            z = false;
        } else {
            z = true;
        }
        17k.A0G(z, "Must have the reg flow extra when in the reg flow, or a phone number and a lookup key when otherwise");
        this.A0A = string2;
        this.A0L = string3;
        this.A0C = string4;
        RegFlowExtras regFlowExtras = this.A06;
        String str = "";
        if (!this.A0E || regFlowExtras == null) {
            replace = string.replace("+", str);
        } else {
            replace = regFlowExtras.A0R;
        }
        this.A0B = replace;
        if (!this.A0E || (countryCodeData = regFlowExtras.A01) == null) {
            A0E2 = Dbc.A0E(replace);
        } else {
            this.A09 = countryCodeData.A00();
            String str2 = countryCodeData.A01;
            String str3 = countryCodeData.A00;
            if (str3 != null) {
                formatNumber = PhoneNumberUtils.formatNumber(replace, str3);
            } else {
                formatNumber = PhoneNumberUtils.formatNumber(replace);
            }
            A0E2 = 002.A0T(str2, formatNumber, ' ');
        }
        if (A0E2 != null) {
            str = A0E2;
        }
        this.A0M = Dbc.A0F(getContext(), str).toString();
        TextView A0G2 = DbU.A0G(A0C2, R.id.field_title);
        if (this.A0E) {
            Dbb.A0m(DbV.A05(this), A0G2, this.A0M, 2131961727);
            A0G2.setTextAppearance(R.style.igds_headline_2);
            A0G2.setAllCaps(false);
        } else {
            A0G2.setText(2131961726);
        }
        TextView A0G3 = DbU.A0G(A0C2, R.id.field_detail);
        AnonymousClass0aP r12 = this.A01;
        boolean z2 = this.A0D;
        E3X e3x = this;
        if (z2) {
            e3x = null;
        }
        C46634DiE BzS = BzS();
        FOY foy = new FOY(this, r12, this, e3x, B6Y(), BzS, this.A09, this.A0B);
        if (z2) {
            Dbb.A0m(DbV.A05(this), A0G3, this.A0M, 2131973913);
        } else if (this.A0E) {
            String string5 = getString(2131954989);
            String string6 = getString(2131972259);
            SpannableStringBuilder A0C3 = Dbb.A0C(this, string5, string6, 2131969387);
            AnonymousClass7AV.A05(A0C3, new C48040ESf(DbV.A0n(requireActivity(), 2Yu.A06(requireActivity())), this, 4), string5);
            AnonymousClass7AV.A05(A0C3, new C48041ESg((View.OnClickListener) foy, this, DbV.A0n(requireActivity(), 2Yu.A06(requireActivity()))), string6);
            DbX.A1G(A0G3, A0C3);
        } else {
            Dbb.A0m(DbV.A05(this), A0G3, this.A0M, 2131972257);
            C49948FGd.A03(A0G3, R.color.grey_5);
        }
        this.A00 = SystemClock.elapsedRealtime();
        SearchEditText searchEditText = (SearchEditText) A0C2.requireViewById(R.id.confirmation_field);
        this.A08 = searchEditText;
        C49948FGd.A04(searchEditText);
        this.A08.requestFocus();
        this.A08.setHint(2131956505);
        this.A08.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        if (this.A0E && this.A06 != null && 0nA.A0z(this.A08) && !TextUtils.isEmpty(this.A06.A05)) {
            this.A08.setText(this.A06.A05);
        }
        this.A0K = (InlineErrorMessageView) A0C2.findViewById(R.id.confirmation_field_inline_error);
        ViewGroup A0E3 = DbS.A0E(A0C2, R.id.confirmation_field_container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        C49165EqW.A00(A0E3);
        AnonymousClass0aP r6 = this.A01;
        EEK eek = new EEK(this.A08, r6, this, (ProgressButton) A0C2.findViewById(R.id.next_button));
        this.A07 = eek;
        registerLifecycleListener(eek);
        if (!this.A0D && !this.A0E) {
            AnonymousClass0fU.A00(foy, A0G3);
        }
        1xC r62 = 1xC.A01;
        FXB fxb = new FXB(this);
        this.A04 = fxb;
        r62.A02(fxb, C50255FVm.class);
        FX9 fx9 = new FX9(this);
        this.A02 = fx9;
        r62.A02(fx9, C50252FVj.class);
        FXC fxc = new FXC(this);
        this.A05 = fxc;
        r62.A02(fxc, C50263FVu.class);
        FXA fxa = new FXA(this);
        this.A03 = fxa;
        r62.A02(fxa, C50262FVt.class);
        if (this.A0E) {
            AnonymousClass0aP r0 = this.A01;
            View view = A0C2;
            AnonymousClass0aP r7 = r0;
            C49958FGq.A05(view, this, r7, B6Y(), BzS(), false);
            View findViewById = A0C2.findViewById(R.id.log_in_button);
            Context requireContext = requireContext();
            TextView[] textViewArr = {A0G3, (TextView) findViewById};
            int i = 0;
            do {
                C49948FGd.A03(textViewArr[i], 2Yu.A06(requireContext));
                i++;
            } while (i < 2);
            C49938FFr.A00.A02(this.A01, B6Y(), BzS().A01);
        } else {
            DbX.A1B(A0C2, R.id.reg_footer_container);
        }
        14i.A08.A0A(this);
        AnonymousClass0fD.A09(1319449344, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1367963899);
        super.onDestroyView();
        unregisterLifecycleListener(this.A07);
        14i.A06(this);
        1xC r2 = 1xC.A01;
        r2.A03(this.A04, C50255FVm.class);
        r2.A03(this.A02, C50252FVj.class);
        r2.A03(this.A05, C50263FVu.class);
        r2.A03(this.A03, C50262FVt.class);
        FGJ.A03.A05(getContext());
        this.A07 = null;
        this.A08 = null;
        this.A0K = null;
        this.A0J = null;
        AnonymousClass0fD.A09(-1634135274, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1143558386);
        E3X.super.onPause();
        0nA.A0N(this.A08);
        DbV.A0G(this).setSoftInputMode(0);
        AnonymousClass0fD.A09(16518198, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1752519897);
        super.onResume();
        C49958FGq.A06(this.A08);
        Dbb.A10(this);
        AnonymousClass0fD.A09(541374712, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(799897039);
        E3X.super.onStart();
        AnonymousClass0fD.A09(-912062893, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-10588112);
        E3X.super.onStop();
        Dialog dialog = this.A0H;
        if (dialog != null && dialog.isShowing()) {
            this.A0H.dismiss();
        }
        AnonymousClass0fD.A09(-1543476083, A022);
    }
}
