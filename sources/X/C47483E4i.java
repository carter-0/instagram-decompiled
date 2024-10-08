package X;

import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.android.R;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.ui.text.FreeAutoCompleteTextView;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.E4i  reason: case insensitive filesystem */
public final class C47483E4i extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, CallerContextable {
    public static final long A0R = TimeUnit.SECONDS.toMillis(10);
    public static final String __redex_internal_original_name = "LookupFragment";
    public int A00;
    public int A01;
    public Dialog A02;
    public View A03;
    public TextView A04;
    public 1wn A05;
    public 1wn A06;
    public AnonymousClass0aP A07;
    public FxSsoViewModel A08;
    public C49922FEx A09;
    public F3P A0A;
    public EEB A0B;
    public EEM A0C;
    public AnonymousClass6ST A0D;
    public FreeAutoCompleteTextView A0E;
    public InlineErrorMessageView A0F;
    public ProgressButton A0G;
    public Integer A0H;
    public String A0I = "";
    public boolean A0J = false;
    public boolean A0K = false;
    public boolean A0L;
    public final Handler A0M = new Handler();
    public final View.OnClickListener A0N = new FP3((Object) this, 6);
    public final List A0O = AnonymousClass7TE.A1C();
    public final G6P A0P = new C50958Fll(this);
    public final Runnable A0Q = new C51214FqV(this);

    public static void A04(C47483E4i e4i, FAP fap) {
        String str;
        Integer num = e4i.A0H;
        String str2 = "";
        if (num != null) {
            str = C49025Eo1.A00(num);
        } else {
            str = str2;
        }
        if (fap != null) {
            str2 = fap.A01;
        }
        AnonymousClass0aP r1 = e4i.A07;
        AnonymousClass7TF.A1C(r1, 0, str2);
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r1), "prefill_lookup_identifier");
        DbZ.A1G(A0e, A012, A002);
        FH8.A05(A0e);
        DbT.A1P(A0e);
        A0e.A7p("prefilled", true);
        DbW.A12(A0e, A002);
        DbZ.A1J(A0e, "user_lookup");
        A0e.AAJ("cp_prefill_type", str);
        DbV.A1H(A0e, str2);
    }

    public final String getModuleName() {
        return "password_lookup";
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, androidx.fragment.app.Fragment, X.E4i, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FreeAutoCompleteTextView freeAutoCompleteTextView = this.A0E;
        Resources A052 = DbV.A05(this);
        AnonymousClass7TG.A1T(freeAutoCompleteTextView, freeAutoCompleteTextView, A052);
        freeAutoCompleteTextView.addOnLayoutChangeListener(new C71415OkE(3, A052, freeAutoCompleteTextView, freeAutoCompleteTextView));
        Context requireContext = requireContext();
        F3P f3p = F3P.A04;
        if (f3p == null) {
            AnonymousClass2XD.A00(requireContext);
            f3p = new F3P();
            F3P.A04 = f3p;
        }
        this.A0A = f3p;
        f3p.A00(requireContext(), this, this.A07, DbW.A0Q(requireContext(), this), new C50599FfE(this, 0));
        String string = requireArguments().getString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING");
        Integer num = AnonymousClass05K.A0C;
        0qQ.A0B(num, 0);
        EnumSet of = EnumSet.of(EW4.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE, EW4.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY, EW4.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID);
        0qQ.A0A(of);
        EnumSet complementOf = EnumSet.complementOf(of);
        0qQ.A07(complementOf);
        ArrayList A042 = FH2.A04(requireActivity(), this.A07, C46634DiE.A1j, complementOf);
        Context requireContext2 = requireContext();
        AnonymousClass0aP r9 = this.A07;
        Context requireContext3 = requireContext();
        AnonymousClass0aP r1 = this.A07;
        0qQ.A0B(r1, 2);
        ArrayList A022 = C49898FCb.A02(requireContext3, r1, num);
        JSONArray jSONArray = new JSONArray();
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((C48254EbZ) it.next()).A00());
            } catch (JSONException unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = A042.iterator();
        while (it2.hasNext()) {
            try {
                jSONArray2.put(((C48254EbZ) it2.next()).A00());
            } catch (JSONException unused2) {
            }
        }
        List list = this.A0O;
        1NY A0N2 = DbU.A0N(r9);
        A0N2.A0A("accounts/contact_point_prefill/");
        DbW.A1A(19f.A2B, A0N2, DbW.A0I(A0N2, r9, DcV.A00(), DbT.A0u(requireContext2, A0N2, "usage", "account_recovery_usage")));
        A0N2.A9m("guid", DbT.A0s(requireContext2));
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                DbT.A1W(it3, jSONArray3);
            }
            DbW.A1G(A0N2, jSONArray3);
        }
        JSONArray jSONArray4 = new JSONArray();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                jSONArray4.put(jSONArray.getJSONObject(i));
                i++;
            } catch (JSONException unused3) {
                0wb.A03("Account recovery identifier filter", "Invalid Json");
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            jSONArray4.put(jSONArray2.getJSONObject(i2));
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty("login_page")) {
            JSONObject A11 = DbS.A11();
            A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "omnistring");
            A11.put("source", "login_page");
            A11.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, string);
            jSONArray4.put(A11);
        }
        if (jSONArray4.length() > 0) {
            A0N2.A9m("client_contact_points", jSONArray4.toString());
        }
        1OC A0N3 = DbY.A0N(A0N2, DwS.class, F8P.class);
        A0N3.A00 = new ECL(this);
        1ES.A03(A0N3);
        new Handler().postDelayed(new C51213FqU(this), 4000);
    }

    public static Integer A00(String str) {
        if (DbV.A1b(str.trim(), Patterns.EMAIL_ADDRESS)) {
            return AnonymousClass05K.A00;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '#' && charAt != '+' && charAt != ' ' && charAt != '-' && charAt != '(' && charAt != ')' && charAt != '.' && !Character.isDigit(charAt)) {
                return AnonymousClass05K.A0C;
            }
        }
        return AnonymousClass05K.A01;
    }

    public static void A02(C47483E4i e4i) {
        Bundle bundle;
        String string;
        FreeAutoCompleteTextView freeAutoCompleteTextView = e4i.A0E;
        if (freeAutoCompleteTextView != null && 0nA.A0z(freeAutoCompleteTextView) && (bundle = e4i.mArguments) != null && bundle.containsKey("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING") && (string = e4i.mArguments.getString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING")) != null) {
            freeAutoCompleteTextView.setText(string);
            e4i.A0H = A00(string);
            A04(e4i, (FAP) null);
        }
    }

    public static void A03(C47483E4i e4i) {
        String str;
        String A0I2 = 0nA.A0I(e4i.A0E);
        try {
            str = FH2.A01(e4i.requireActivity(), e4i.A07, C46634DiE.A1j, AnonymousClass05K.A0C);
        } catch (IOException unused) {
            str = null;
        }
        List list = e4i.A0O;
        if (!AnonymousClass7TE.A1b(list)) {
            list = AnonymousClass7TE.A1C();
        }
        Context requireContext = e4i.requireContext();
        AnonymousClass0aP r5 = e4i.A07;
        1NY A0N2 = DbU.A0N(r5);
        A0N2.A0A("users/lookup/");
        DbZ.A0x(requireContext, A0N2, "q", A0I2);
        DbY.A1J(A0N2, "directly_sign_in", "true");
        DbW.A19(19f.A1v, A0N2, DbT.A0P(r5));
        A0N2.A0H(Pxd.A00(235), 0oI.A0G(requireContext));
        A0N2.A0G("country_codes", str);
        A0N2.A0O(0aS.A00, EM2.class, F6A.class, false);
        A0N2.A0R = true;
        if (!list.isEmpty()) {
            A0N2.A9m("google_id_tokens", TextUtils.join(",", list));
        }
        if (SMf.A00(requireContext)) {
            A0N2.A9m("android_build_type", DbX.A0s((0lY) 0lY.A02.getValue()));
        }
        1OC A0M2 = A0N2.A0M();
        A0M2.A00 = new EDD(e4i, A0I2);
        1ES.A03(A0M2);
    }

    public final void A05() {
        C49922FEx fEx = new C49922FEx();
        Integer num = this.A0H;
        if (num != null) {
            fEx.A00.putString(DbX.A0s(C48071EUp.A04), C49025Eo1.A00(num));
        }
        Integer A002 = A00(0nA.A0I(this.A0E));
        Bundle bundle = fEx.A00;
        bundle.putString(DbX.A0s(C48071EUp.A06), C49025Eo1.A00(A002));
        bundle.putBoolean(DbX.A0s(C48071EUp.A08), this.A0I.equals(0nA.A0I(this.A0E).trim()));
        C49881FBf.A00.A00(this.A07, fEx, "user_lookup");
        this.A0G.setShowProgressBar(true);
        02m.A0p.markerStart(725096220);
        02m.A0p.markerAnnotate(725096220, "flow", "prod");
        02m.A0p.markerStart(725096125);
        02m.A0p.markerAnnotate(725096125, "flow", "prod");
        synchronized (this) {
            this.A0L = true;
            int i = this.A00;
            if (i <= 0 || i <= this.A01) {
                C49217ErM.A00(this.A07, "token_ready");
                if (A06()) {
                    A03(this);
                }
            } else {
                C49217ErM.A00(this.A07, "wait_for_time_out");
                Handler handler = this.A0M;
                Runnable runnable = this.A0Q;
                handler.postDelayed(new C51367Fsz(this, runnable), A0R);
            }
        }
    }

    public final boolean A06() {
        FragmentActivity activity;
        if (this.mView == null || (activity = getActivity()) == null || !isAdded() || this.A0E == null || this.mRemoving || this.mDetached || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public final AnonymousClass0wW getSession() {
        return this.A07;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        1KM.A01(intent, this.A07, this.A0P);
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A07, "user_lookup");
        return false;
    }

    private void A01() {
        FragmentActivity rootActivity;
        DbS.A1D(this);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            rootActivity = getActivity();
        } else if (getRootActivity() != null && getRootActivity().getWindow() != null) {
            rootActivity = getRootActivity();
        } else {
            return;
        }
        rootActivity.getWindow().setSoftInputMode(3);
    }

    public final void configureActionBar(2da r2) {
        r2.Eom(2131965622);
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1646096715);
        C47483E4i.super.onActivityCreated(bundle);
        this.A0E.requestFocus();
        AnonymousClass0fD.A09(100643909, A022);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1220661028);
        C47483E4i.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A07 = Dba.A0D(this);
        this.A09 = C49922FEx.A00(bundle2);
        FxSsoViewModel A0V = DbY.A0V(requireActivity());
        this.A08 = A0V;
        this.A0C = new EEM(this, this, this.A07, A0V, C46634DiE.A1j, (String) null);
        if (bundle2 != null) {
            this.A0J = bundle2.getBoolean("is_current_user_fb_connected", false);
        }
        AnonymousClass0aP r1 = this.A07;
        AnonymousClass7TG.A1N(r1, "user_lookup");
        C49938FFr.A01(r1, "user_lookup");
        AnonymousClass0fD.A09(-1493479769, A022);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, X.E4i, java.lang.Object, X.4DH] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1289814972);
        this.A0L = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_lookup, viewGroup, false);
        if (1AW.A06(0Tu.A05, 18301581497732951L)) {
            inflate = layoutInflater.inflate(R.layout.fragment_lookup_v2, viewGroup, false);
        }
        FreeAutoCompleteTextView freeAutoCompleteTextView = (FreeAutoCompleteTextView) inflate.requireViewById(R.id.fragment_lookup_edittext);
        this.A0E = freeAutoCompleteTextView;
        freeAutoCompleteTextView.addTextChangedListener(new C48054ESy(this, 1));
        FQe.A00(this.A0E, this, 4);
        this.A0E.addTextChangedListener(AnonymousClass4v0.A00(this.A07));
        ProgressButton A0O2 = Dba.A0O(inflate);
        this.A0G = A0O2;
        AnonymousClass0fU.A00(this.A0N, A0O2);
        this.A0F = (InlineErrorMessageView) inflate.requireViewById(R.id.inline_error);
        ViewGroup A0C2 = DbU.A0C(inflate, R.id.container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        C49165EqW.A00(A0C2);
        View requireViewById = inflate.requireViewById(R.id.need_more_help_text_view);
        2eS.A01(requireViewById);
        FP3.A00(requireViewById, 7, this);
        if (0oI.A09(inflate.getContext())) {
            View requireViewById2 = inflate.requireViewById(R.id.reg_facebook_option_layout);
            this.A04 = DbU.A0G(inflate, R.id.login_facebook);
            this.A03 = inflate.requireViewById(R.id.login_facebook_container);
            requireViewById2.setVisibility(8);
        } else {
            this.A04 = DbU.A0G(inflate, R.id.login_facebook);
            this.A03 = inflate.requireViewById(R.id.login_facebook_container);
            2eS.A01(this.A04);
            FP3.A00(this.A04, 8, this);
            2Yu.A0H(requireContext(), R.attr.igds_color_primary_button);
            this.A04.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_facebook_circle_filled_16, 0, 0, 0);
            DbT.A17(requireContext(), this.A04, 2Yu.A07(requireContext()));
            C49948FGd.A02(this.A04, 2Yu.A0B(requireContext()));
            this.A03.setBackgroundResource(R.drawable.secondary_button_selector_panavision_soft_update);
            boolean A012 = FxSsoViewModel.A01(this.A08);
            TextView textView = this.A04;
            FxSsoViewModel fxSsoViewModel = this.A08;
            if (!A012) {
                DbZ.A14(textView, Dba.A0W(fxSsoViewModel.A00));
            } else {
                DbZ.A14(textView, Dba.A0W(fxSsoViewModel.A01));
                this.A0C.A09(this.A04, this, C46634DiE.A1j);
            }
            C50139FQw.A00(this, DbT.A0H(this.A08.A00), 20);
            FXZ A002 = FXZ.A00(this, 24);
            this.A05 = A002;
            this.A06 = FXZ.A00(this, 25);
            1xC r2 = 1xC.A01;
            r2.A02(A002, C50249FVg.class);
            r2.A02(this.A06, C50250FVh.class);
            AnonymousClass0aP r5 = this.A07;
            C46634DiE diE = C46634DiE.A1j;
            EEB eeb = new EEB(r5, (C47491E4v) null, diE);
            this.A0B = eeb;
            registerLifecycleListener(eeb);
            C49886FBm.A01(1Q0.A0Z.A02(this.A07).A06(EXD.A04, diE), this.A0J);
        }
        AnonymousClass6ST A0Y = DbW.A0Y(this);
        this.A0D = A0Y;
        A0Y.A00(DbV.A05(this).getString(2131965491));
        AnonymousClass0fD.A09(1578474212, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(161679314);
        super.onDestroyView();
        this.A0M.removeCallbacksAndMessages((Object) null);
        this.A0E.removeTextChangedListener(AnonymousClass4v0.A00(this.A07));
        this.A0E = null;
        this.A0A = null;
        AnonymousClass6ST r1 = this.A0D;
        if (r1 != null && (r1.getOwnerActivity() == null || !r1.getOwnerActivity().isDestroyed())) {
            r1.cancel();
        }
        this.A0D = null;
        this.A02 = null;
        1wn r2 = this.A05;
        if (r2 != null) {
            1xC.A01.A03(r2, C50249FVg.class);
            this.A05 = null;
        }
        1wn r22 = this.A06;
        if (r22 != null) {
            1xC.A01.A03(r22, C50250FVh.class);
            this.A06 = null;
        }
        EEB eeb = this.A0B;
        if (eeb != null) {
            unregisterLifecycleListener(eeb);
            this.A0B = null;
        }
        AnonymousClass0fD.A09(1597234220, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1335210386);
        this.A0K = true;
        C47483E4i.super.onPause();
        AnonymousClass0fD.A09(-501608290, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-497958992);
        this.A0K = false;
        super.onResume();
        this.A0G.setEnabled(!Dba.A1V(this.A0E));
        A01();
        AnonymousClass0fD.A09(481709764, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(981566215);
        A01();
        Dialog dialog = this.A02;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        C47483E4i.super.onStop();
        AnonymousClass0fD.A09(1504913318, A022);
    }
}
