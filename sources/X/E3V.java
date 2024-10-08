package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class E3V extends AnonymousClass4DH implements C61110lV, AnonymousClass4DR, G8C, G69 {
    public static final String __redex_internal_original_name = "OnePageRegistrationFragment";
    public TextView A00;
    public AnonymousClass0aP A01;
    public FX6 A02;
    public FX7 A03;
    public FX8 A04;
    public C49691F2b A05;
    public C49691F2b A06;
    public FAL A07;
    public RegFlowExtras A08;
    public EEK A09;
    public InlineErrorMessageView A0A;
    public InlineErrorMessageView A0B;
    public ProgressButton A0C;
    public SearchEditText A0D;
    public SearchEditText A0E;
    public EXD A0F;
    public boolean A0G = true;
    public boolean A0H;
    public boolean A0I = false;
    public NotificationBar A0J;
    public String A0K = "";
    public final Handler A0L = new C46672Dj1(Looper.getMainLooper(), this, 4);
    public final List A0M = AnonymousClass7TE.A1C();
    public final List A0N = AnonymousClass7TE.A1C();
    public final W7f A0O = new C48054ESy(this, 11);

    public static void A00(E3V e3v) {
        String str;
        C17959Vis vis;
        AnonymousClass0aP r8 = e3v.A01;
        String A0I2 = 0nA.A0I(e3v.A0E);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < A0I2.length()) {
                if (A0I2.charAt(i) > 127) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        EXD exd = e3v.A0F;
        C46634DiE diE = C48156EZy.A0A.A00;
        AnonymousClass7TF.A1C(r8, 0, diE);
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "valid_password");
        A0e.A7p("contains_only_ascii", Boolean.valueOf(z));
        DbZ.A1G(A0e, A012, A002);
        FH8.A06(A0e);
        DbW.A12(A0e, A002);
        DbS.A1H(A0e, diE.A01);
        DbZ.A1E(A0e);
        if (exd == null || (str = exd.A00) == null) {
            str = "null";
        }
        DbS.A1G(A0e, str);
        FH8.A04(A0e);
        FH8.A08(A0e, r8);
        RegFlowExtras regFlowExtras = e3v.A08;
        regFlowExtras.A0e = e3v.A0M;
        regFlowExtras.A0f = e3v.A0N;
        regFlowExtras.A0O = 0nA.A0I(e3v.A0D);
        C47796EHh eHh = e3v.A07.A00;
        if (eHh != null) {
            eHh.A05.A01();
            synchronized (eHh) {
                vis = eHh.A04;
            }
        } else {
            vis = new C17959Vis();
        }
        regFlowExtras.A02 = vis;
        regFlowExtras.A0h = e3v.A0G;
        regFlowExtras.A03(e3v.A0F);
        regFlowExtras.A0w = e3v.A0H;
        regFlowExtras.A0P = AnonymousClass7TF.A0f(e3v.A0E);
        if (!e3v.A0I && !e3v.requireActivity().isFinishing()) {
            DbT.A15();
            RegFlowExtras regFlowExtras2 = e3v.A08;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            DbU.A1C(A0a);
            C47937ENo eNo = new C47937ENo();
            Dbb.A12(eNo, DbU.A0I(A0a, eNo, e3v), e3v.A01);
        }
        FragmentActivity activity = e3v.getActivity();
        if (activity != null) {
            activity.getWindow().clearFlags(8192);
        }
    }

    public static void A01(E3V e3v) {
        String str = e3v.A0K;
        String A0f = AnonymousClass7TF.A0f(e3v.A0D);
        if (!str.isEmpty() || !A0f.isEmpty()) {
            AnonymousClass0aP r2 = e3v.A01;
            String A0i = DbZ.A0i(e3v);
            String A0X = Dba.A0X(e3v);
            String A022 = DbT.A0P(e3v.A01).A02(19f.A27);
            1NY A0N2 = DbU.A0N(r2);
            A0N2.A0A("accounts/username_suggestions/");
            A0N2.A9m("email", str);
            A0N2.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0f);
            DbU.A1O(A0N2, A0i);
            A0N2.A9m("guid", A0X);
            A0N2.A0G("phone_id", A022);
            DbW.A1F(A0N2);
            C47691EDa.A00(e3v, DbY.A0N(A0N2, C47348Dvi.class, C49773F6g.class), 14);
        }
    }

    public static boolean A02(E3V e3v) {
        String str;
        String A0I2 = 0nA.A0I(e3v.A0E);
        if (A0I2.length() < 6) {
            e3v.EuV(e3v.getString(2131969198), AnonymousClass05K.A0C);
            str = "password_too_short";
        } else if (SCM.A00(A0I2)) {
            e3v.EuV(e3v.getString(2131969202), AnonymousClass05K.A0C);
            str = "password_blacklisted";
        } else {
            InlineErrorMessageView inlineErrorMessageView = e3v.A0B;
            if (inlineErrorMessageView == null) {
                return false;
            }
            inlineErrorMessageView.A03();
            return false;
        }
        C49886FBm A062 = 1Q0.A1D.A02(e3v.A01).A06(e3v.A0F, C48156EZy.A0A.A00);
        A062.A04("reason", str);
        A062.A02();
        return true;
    }

    public final void APF() {
        SearchEditText searchEditText = this.A0D;
        if (searchEditText != null) {
            searchEditText.setEnabled(false);
        }
        SearchEditText searchEditText2 = this.A0E;
        if (searchEditText2 != null) {
            searchEditText2.setEnabled(false);
        }
    }

    public final void ARL() {
        SearchEditText searchEditText = this.A0D;
        if (searchEditText != null) {
            searchEditText.setEnabled(true);
        }
        SearchEditText searchEditText2 = this.A0E;
        if (searchEditText2 != null) {
            searchEditText2.setEnabled(true);
        }
    }

    public final EXD B6Y() {
        return this.A0F;
    }

    public final C46634DiE BzS() {
        return C48156EZy.A0A.A00;
    }

    public final boolean Ca3() {
        String A0I2 = 0nA.A0I(this.A0E);
        if (TextUtils.isEmpty(A0I2) || A0I2.length() < 6) {
            return false;
        }
        return true;
    }

    public final void DUM() {
        this.A0C.setShowProgressBar(true);
        if (!A02(this)) {
            FGI A022 = 1Q0.A0b.A02(this.A01);
            C46634DiE diE = C48156EZy.A0A.A00;
            0xI A052 = A022.A05((EXD) null, diE);
            A052.A09("is_ci_opt_in", Boolean.valueOf(this.A0G));
            A052.A0D("event_tag", Arrays.asList(new String[]{"REGISTRATION", "one_page_registration"}));
            DbU.A1R(A052, this.A01);
            if (!this.A0G) {
                A00(this);
                return;
            }
            AnonymousClass0aP r7 = this.A01;
            String str = diE.A01;
            0qQ.A0B(r7, 0);
            double A002 = DbV.A00(str, 1);
            double A003 = DbS.A00();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "nux_contacts_upsell_viewed");
            Dbc.A0X(A0e, A002, A003);
            DbS.A1H(A0e, str);
            DbZ.A1E(A0e);
            FH8.A04(A0e);
            FH8.A0C(A0e, r7);
            1DL.A04(getActivity(), new C50307FXm(this, 2), new String[]{"android.permission.READ_CONTACTS"});
        }
    }

    public final void DaH(boolean z) {
        TextView textView = this.A00;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public final String getModuleName() {
        return "one_page_registration";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (0nA.A0z(this.A0D) && !TextUtils.isEmpty(this.A08.A0O)) {
            this.A0D.setText(this.A08.A0O);
        }
        this.A05.A04 = true;
        super.onViewCreated(view, bundle);
    }

    public final void EuV(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView;
        int intValue = num.intValue();
        if (intValue != 5) {
            if (intValue == 2) {
                inlineErrorMessageView = this.A0B;
            }
            C49958FGq.A08(this.A0J, str);
            this.A0C.setShowProgressBar(false);
        }
        inlineErrorMessageView = this.A0A;
        if (inlineErrorMessageView != null) {
            inlineErrorMessageView.A04(str);
            this.A0C.setShowProgressBar(false);
        }
        C49958FGq.A08(this.A0J, str);
        this.A0C.setShowProgressBar(false);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(3655845);
        RegFlowExtras regFlowExtras = this.A08;
        regFlowExtras.A03(this.A0F);
        regFlowExtras.A0N = C48156EZy.A0A.A00.name();
        regFlowExtras.A0O = 0nA.A0I(this.A0D);
        C49913FEl.A00(getContext()).A03(this.A01, this.A08);
        AnonymousClass0fD.A0A(-1892074952, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-2030707857, AnonymousClass0fD.A03(90308131));
    }

    public final boolean onBackPressed() {
        if (!DbT.A1a(DbV.A0d(), "has_user_confirmed_dialog")) {
            AnonymousClass0aP r5 = this.A01;
            C46634DiE diE = C48156EZy.A0A.A00;
            C49038EoI.A00(this, r5, new C50629Ffk(this, 1), this.A0F, diE, (Integer) null);
            return true;
        }
        C49843F9i.A00();
        0nA.A0I(this.A0D);
        SearchEditText searchEditText = this.A0E;
        if (searchEditText != null) {
            searchEditText.getText().toString();
        }
        C49920FEv.A00.A01(this.A01, this.A0F, C48156EZy.A0A.A00.A01);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return false;
        }
        activity.getWindow().clearFlags(8192);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1371889512);
        E3V.super.onCreate(bundle);
        this.A01 = Dba.A0D(this);
        RegFlowExtras regFlowExtras = (RegFlowExtras) Dba.A03(this);
        this.A08 = regFlowExtras;
        regFlowExtras.getClass();
        this.A0H = true;
        if (!TextUtils.isEmpty(this.A08.A08)) {
            this.A0K = this.A08.A08;
            this.A0F = EXD.A03;
        } else {
            ArrayList A002 = C49196Er1.A00(getContext());
            if (!A002.isEmpty()) {
                this.A0K = (String) AnonymousClass7TE.A12(A002);
            }
        }
        if (!TextUtils.isEmpty(this.A08.A0Q)) {
            this.A0F = EXD.PHONE;
        }
        this.A07 = new FAL(this, this.A01);
        EXD exd = this.A0F;
        EXD exd2 = EXD.PHONE;
        RegFlowExtras regFlowExtras2 = this.A08;
        if (exd == exd2) {
            str = regFlowExtras2.A0Q;
        } else {
            str = regFlowExtras2.A08;
        }
        C49670F1c instance = C49670F1c.getInstance();
        Context context = getContext();
        if (str == null) {
            str = "unknown";
        }
        instance.startDeviceValidation(context, str);
        AnonymousClass0fD.A09(1834561928, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Class cls;
        1wn fx7;
        int A022 = AnonymousClass0fD.A02(-342513999);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.one_page_reg_triage_fragment, Dba.A04(A0C2), true);
        DbU.A0G(A0C2, R.id.field_title).setText(2131962803);
        int A032 = Dbb.A03(A0C2, R.id.field_detail);
        SearchEditText searchEditText = (SearchEditText) A0C2.requireViewById(R.id.password);
        this.A0E = searchEditText;
        searchEditText.setInputType(129);
        this.A0E.setTypeface(Typeface.DEFAULT);
        FPM.A00(this.A0E, 17, this);
        this.A0E.setAllowTextSelection(true);
        C49691F2b f2b = new C49691F2b(this.A0E, this.A01, this, AnonymousClass05K.A0N);
        this.A06 = f2b;
        f2b.A04 = true;
        CompoundButton compoundButton = (CompoundButton) A0C2.requireViewById(R.id.remember_password_checkbox);
        compoundButton.setChecked(this.A0H);
        FQO.A00(compoundButton, this, 19);
        compoundButton.setText(2131971940);
        SearchEditText searchEditText2 = (SearchEditText) A0C2.requireViewById(R.id.full_name);
        this.A0D = searchEditText2;
        FPM.A00(searchEditText2, 16, this);
        this.A0D.setFilters(new InputFilter[]{new ERT(getContext(), this), new InputFilter.LengthFilter(30)});
        this.A0D.setAllowTextSelection(true);
        FQe.A00(this.A0D, this, 12);
        this.A05 = new C49691F2b(this.A0D, this.A01, this, AnonymousClass05K.A0C);
        this.A0A = (InlineErrorMessageView) A0C2.findViewById(R.id.full_name_inline_error);
        this.A0B = (InlineErrorMessageView) A0C2.findViewById(R.id.password_inline_error);
        ViewGroup A0E2 = DbS.A0E(A0C2, R.id.one_page_input_container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        C49165EqW.A00(A0E2);
        1xC r5 = 1xC.A01;
        if (this.A0F == EXD.PHONE) {
            cls = C50263FVu.class;
            fx7 = new FX8(this);
            this.A04 = fx7;
        } else {
            cls = C50257FVo.class;
            fx7 = new FX7(this);
            this.A03 = fx7;
        }
        r5.A02(fx7, cls);
        FX6 fx6 = new FX6(this);
        this.A02 = fx6;
        r5.A02(fx6, C50261FVs.class);
        TextView A0G2 = DbU.A0G(A0C2, R.id.search_contact_explanation);
        String string = getString(2131962466);
        if (string == null) {
            string = "";
        }
        A0G2.setText(Html.fromHtml(string));
        FP0.A00(A0G2, 69, this);
        if (this.A0F == EXD.A04) {
            A0G2.setVisibility(A032);
            this.A0G = false;
        } else {
            A0G2.setVisibility(0);
            TextView A0G3 = DbU.A0G(A0C2, R.id.continue_without_ci);
            this.A00 = A0G3;
            FP0.A00(A0G3, 70, this);
            this.A00.setVisibility(0);
            this.A00.setEnabled(false);
        }
        ProgressButton A0O2 = Dba.A0O(A0C2);
        this.A0C = A0O2;
        this.A09 = new EEK(this.A0E, this.A01, this, A0O2, 2131956699);
        this.A0C.setTypeface(1);
        EEK eek = this.A09;
        eek.A00 = new FQe(this, 13);
        registerLifecycleListener(eek);
        this.A0J = Dba.A0M(A0C2);
        14i.A08.A0A(this);
        C49938FFr.A00.A02(this.A01, this.A0F, C48156EZy.A0A.A00.A01);
        AnonymousClass0fD.A09(669144924, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1514386063);
        super.onDestroyView();
        FAL fal = this.A07;
        C47796EHh eHh = fal.A00;
        if (eHh != null) {
            eHh.A05.A01();
            fal.A00 = null;
        }
        unregisterLifecycleListener(this.A09);
        this.A0D.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.A0D.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        SearchEditText searchEditText = this.A0E;
        if (searchEditText != null) {
            searchEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            this.A0E.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        }
        this.A0C.setOnClickListener((View.OnClickListener) null);
        this.A0L.removeCallbacksAndMessages((Object) null);
        this.A09 = null;
        this.A0J = null;
        this.A0D = null;
        this.A0E = null;
        this.A0C = null;
        this.A0A = null;
        this.A0B = null;
        this.A00 = null;
        FX8 fx8 = this.A04;
        if (fx8 != null) {
            1xC.A01.A03(fx8, C50263FVu.class);
            this.A04 = null;
        }
        FX7 fx7 = this.A03;
        if (fx7 != null) {
            1xC.A01.A03(fx7, C50257FVo.class);
            this.A03 = null;
        }
        FX6 fx6 = this.A02;
        if (fx6 != null) {
            1xC.A01.A03(fx6, C50261FVs.class);
            this.A02 = null;
        }
        14i.A06(this);
        AnonymousClass0fD.A09(-1197381634, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1823486273);
        E3V.super.onPause();
        this.A0I = true;
        C47796EHh eHh = this.A07.A00;
        if (eHh != null) {
            eHh.A05.A01();
        }
        this.A0J.A03();
        0nA.A0N(requireView());
        this.A0D.removeTextChangedListener(this.A0O);
        this.A0L.removeCallbacksAndMessages((Object) null);
        DbV.A0G(this).setSoftInputMode(0);
        AnonymousClass0fD.A09(-1716600127, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2010592335);
        super.onResume();
        this.A0I = false;
        FAL fal = this.A07;
        C47796EHh eHh = fal.A00;
        if (eHh == null || eHh.A00 == eHh.A01) {
            FAL.A00(fal);
        } else {
            0nY.A00().ATE(eHh);
        }
        A01(this);
        this.A0D.addTextChangedListener(this.A0O);
        Dbb.A10(this);
        AnonymousClass0fD.A09(236842767, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-720690943);
        E3V.super.onStop();
        AnonymousClass0fD.A09(-1119621760, A022);
    }
}
