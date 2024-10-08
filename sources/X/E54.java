package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.android.R;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class E54 extends AnonymousClass4DH implements AnonymousClass4DR, G8H {
    public static final String A0X = 002.A0R("com.instagram.android", "login.fragment.ARGUMENT_OMNISTRING");
    public static final String __redex_internal_original_name = "LoginLandingFragment";
    public View A00;
    public View A01;
    public View A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public AnonymousClass0aP A06;
    public FxSsoViewModel A07;
    public C49495Ewa A08;
    public F3M A09;
    public EEM A0A;
    public F23 A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public Handler A0M;
    public TextView A0N;
    public TextInputLayout A0O;
    public C49634Ezr A0P;
    public ProgressButton A0Q;
    public String A0R;
    public final 1wn A0S = FXZ.A00(this, 42);
    public final TextWatcher A0T = new FKk(this, 14);
    public final 1wn A0U = FXZ.A00(this, 39);
    public final 1wn A0V = FXZ.A00(this, 40);
    public final 1wn A0W = FXZ.A00(this, 41);

    public final void DPh(F2Z f2z) {
        G8G g8g;
        boolean z;
        String trim = 0nA.A0I(this.A05).trim();
        Iterator it = this.A08.A01.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                g8g = null;
                break;
            }
            g8g = (G8G) it.next();
            if (trim.equals(g8g.getUsername())) {
                break;
            }
        }
        AnonymousClass0aP r5 = this.A06;
        if (g8g == null || FGv.A00() < 1) {
            z = false;
        } else {
            int i = 2131953590;
            int i2 = 2131953587;
            if (g8g instanceof ENP) {
                i = 2131953585;
                i2 = 2131953588;
            } else if (g8g instanceof ENO) {
                i = 2131953586;
                i2 = 2131953589;
            }
            C49938FFr.A00(r5, (C49922FEx) null, (EXD) null, (Integer) null, "access_dialog", g8g.AXz());
            C358248ab A0I2 = Dba.A0I(this);
            A0I2.A05 = DbV.A0z(this, g8g.getUsername(), 2131953591);
            DbU.A1J(this, A0I2, i);
            C50025FJk.A02(A0I2, g8g, r5, 37, 2131953592);
            A0I2.A0c(new C50024FJj(10, (Object) g8g, (Object) r5, (Object) this, (Object) this), getString(i2));
            DbT.A1V(A0I2);
            z = true;
        }
        f2z.A00(z);
    }

    public final String getModuleName() {
        return "login_landing";
    }

    static {
        String str = 0oI.A02;
    }

    public static void A00(E54 e54) {
        boolean z = e54.A0J;
        TextView textView = e54.A05;
        if (z) {
            textView.setEnabled(false);
            e54.A03.setEnabled(false);
            e54.A0Q.setShowProgressBar(true);
        } else {
            textView.setEnabled(true);
            e54.A03.setEnabled(true);
            e54.A0Q.setShowProgressBar(false);
            if (!Dba.A1V(e54.A05) && !Dba.A1V(e54.A03) && !e54.A0G) {
                e54.A0Q.setEnabled(true);
                return;
            }
        }
        e54.A0Q.setEnabled(false);
    }

    public static void A01(E54 e54, String str) {
        if (e54.A04 != null && e54.A01 != null && e54.getContext() != null) {
            e54.A04.setText(str);
            DbT.A17(e54.getContext(), e54.A04, R.color.design_dark_default_color_on_background);
            e54.A01.setBackgroundResource(R.drawable.blue_button_background);
            e54.A01.jumpDrawablesToCurrentState();
            C49948FGd.A02(e54.A04, R.color.design_dark_default_color_on_background);
        }
    }

    public static void A02(E54 e54, boolean z) {
        String str;
        if (new Date().getTime() < 1347336060000L) {
            DbZ.A0s(2131976906);
            return;
        }
        02m r3 = 02m.A0p;
        r3.markerStart(2293785);
        r3.markerAnnotate(2293785, "login_flow", "prod");
        E54 e542 = e54;
        String A0I2 = 0nA.A0I(e542.A05);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e542.A06), "log_in_attempt");
        double A012 = DbS.A01();
        DbZ.A1H(A0e, A012, DbS.A00());
        C46634DiE diE = C46634DiE.A0t;
        DbS.A1H(A0e, "login");
        DbW.A13(A0e, A012);
        0qv r2 = 0qv.A02;
        A0e.AAJ("guid", r2.A04(C60960kU.A00));
        A0e.AAJ("log_in_token", A0I2);
        A0e.A7p("keyboard", Boolean.valueOf(z));
        A0e.Cgf();
        String A0i = DbZ.A0i(e542);
        String A052 = r2.A05(e542.getContext());
        String A0I3 = 0nA.A0I(e542.A03);
        try {
            str = FH2.A01(e542.getActivity(), e542.A06, diE, AnonymousClass05K.A01);
        } catch (IOException unused) {
            str = null;
        }
        AnonymousClass0aP r22 = e542.A06;
        int A002 = FGv.A00();
        List list = e542.A0F;
        1OC A0D2 = FHA.A0D(r22, str, A0i, e542.A0D, e542.A0E, A052, A0I3, (String) null, A0I2, list, A002);
        A0D2.A00 = new EMG(e542, e542, e542.A06, e542, e542, A0I2, A0I3);
        e542.schedule(A0D2);
    }

    public final void Cta(String str, String str2) {
        String str3;
        String A0I2 = 0nA.A0I(this.A05);
        String A0i = DbZ.A0i(this);
        String A0X2 = Dba.A0X(this);
        String A0I3 = 0nA.A0I(this.A03);
        try {
            str3 = FH2.A01(getActivity(), this.A06, C46634DiE.A0t, AnonymousClass05K.A01);
        } catch (IOException unused) {
            str3 = null;
        }
        AnonymousClass0aP r2 = this.A06;
        int A002 = FGv.A00();
        List list = this.A0F;
        1OC A0D2 = FHA.A0D(r2, str3, A0i, this.A0D, this.A0E, A0X2, A0I3, str2, A0I2, list, A002);
        A0D2.A00 = new EMG(this, this, this.A06, this, this, A0I2, A0I3);
        schedule(A0D2);
    }

    public final void DTb() {
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A04 = this.A0R;
        DbW.A0X();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        DbS.A1A(A0a, "IgSessionManager.LOGGED_OUT_TOKEN");
        E3Y e3y = new E3Y();
        e3y.setArguments(A0a);
        C49958FGq.A07(e3y, this.mFragmentManager, "android.nux.ContactPointTriageFragment");
    }

    public final void DjC() {
        AnonymousClass0aP r2 = this.A06;
        String A0I2 = 0nA.A0I(this.A05);
        String A0i = DbZ.A0i(this);
        String A0X2 = Dba.A0X(this);
        1NY A0N2 = DbU.A0N(r2);
        A0N2.A0A("accounts/send_password_reset/");
        Dbb.A1L(A0N2, DcV.A01(), A0I2, A0i, A0X2);
        1OC A0N3 = DbY.A0N(A0N2, DwE.class, F6D.class);
        A0N3.A00 = new EDF(getContext());
        schedule(A0N3);
    }

    public final void DmU(C49708F2t f2t) {
        this.A0B.A00(f2t, 0nA.A0I(this.A05));
    }

    public final void Dmd(AnonymousClass0aP r3, C47361Dvv dvv) {
        this.A0M.post(new C51472Fug(r3, dvv, this));
    }

    public final void Dme() {
        1OC A012 = FHA.A01(requireContext(), this.A06, AnonymousClass05K.A0Y, 0nA.A0I(this.A05));
        A012.A00 = new EQR(this, this.A06);
        schedule(A012);
    }

    public final AnonymousClass0wW getSession() {
        return this.A06;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A0A.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A06, "login");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        window.getClass();
        window.clearFlags(8192);
        return false;
    }

    public final void DOw() {
        String str;
        String str2;
        if (FV8.A00().A04(this.A06, "ig_android_growth_FX_access_fbig_create_cp_claiming", __redex_internal_original_name)) {
            this.A0A.A0B(this.A06, FV8.A00().A01(this.A06, "ig_android_growth_FX_access_fbig_create_cp_claiming", __redex_internal_original_name), FV8.A00().A02(this.A06, "ig_android_growth_FX_access_fbig_create_cp_claiming", __redex_internal_original_name), true);
        } else if (C50305FXk.A03.A00(this.A06, __redex_internal_original_name)) {
            if (Dbc.A12(this.A06, __redex_internal_original_name)) {
                str = null;
            } else {
                str = C50305FXk.A00;
            }
            if (Dbc.A12(this.A06, __redex_internal_original_name)) {
                str2 = null;
            } else {
                str2 = C50305FXk.A02;
            }
            if (str != null && str2 != null) {
                this.A0A.A0B(this.A06, str, str2, true);
            }
        } else {
            this.A0A.A07();
        }
    }

    public final void DjB() {
        1OC A022 = FHA.A02(getContext(), this.A06, 0nA.A0I(this.A05));
        A022.A00 = new EDF(getContext());
        schedule(A022);
    }

    public final void DjD() {
        schedule(FHA.A00(getContext(), this.A06, (Boolean) null, (Boolean) null, 0nA.A0I(this.A05), (String) null, false, false));
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.R9k, X.11X] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1983981610);
        E54.super.onCreate(bundle);
        this.A0M = AnonymousClass7TF.A0D();
        this.A06 = 09i.A0A.A02(this.mArguments);
        this.A07 = DbY.A0V(requireActivity());
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getString(AnonymousClass000.A00(3167), "").equalsIgnoreCase(AnonymousClass000.A00(1372))) {
            AnonymousClass0aP r4 = this.A06;
            C48973EnB.A00(getActivity(), this.mArguments, AnonymousClass07i.A00(this), this, r4);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                bundle3.remove("original_url");
            }
        }
        this.A0G = false;
        if (bundle != null && bundle.containsKey("LoginLandingFragment.LOGIN_FAILED")) {
            this.A0G = bundle.getBoolean("LoginLandingFragment.LOGIN_FAILED");
        }
        SignedOutFragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            this.A0R = activity.A06;
        }
        AnonymousClass0aP r8 = this.A06;
        C46634DiE diE = C46634DiE.A0t;
        this.A0A = new EEM(this, this, r8, this.A07, diE, this.A0R);
        C227622jd r5 = new C227622jd();
        r5.A0E(new EEE(getActivity(), this, this.A06, diE));
        r5.A0E(this.A0A);
        registerLifecycleListenerSet(r5);
        F3M f3m = new F3M(this, this.A06);
        this.A09 = f3m;
        f3m.A00();
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            this.A0H = bundle4.getBoolean("IS_ADD_ACCOUNT_FLOW", false);
            this.A0I = bundle4.getBoolean("is_current_user_fb_connected", false);
            this.A0C = bundle4.getString("current_username");
            this.A0K = bundle4.getBoolean("multiple_accounts_logged_in", false);
            if (bundle4.getBoolean("should_show_youth_regulation_block", false)) {
                C49290EsZ.A00.A00(getRootActivity());
                bundle4.remove("should_show_youth_regulation_block");
            }
        }
        AnonymousClass0aP r1 = this.A06;
        AnonymousClass7TG.A1N(r1, "login");
        C49938FFr.A01(r1, "login");
        schedule(new C8783R9k(this, 2));
        AnonymousClass0fD.A09(-1450087778, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r0 = 1301732880(0x4d96de10, float:3.16391936E8)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r4 = 0
            r6 = r21
            r1 = r22
            android.view.View r3 = r6.inflate(r0, r1, r4)
            android.view.ViewGroup r1 = X.Dba.A04(r3)
            r0 = 2131627680(0x7f0e0ea0, float:1.8882631E38)
            r2 = 1
            android.view.View r1 = r6.inflate(r0, r1, r2)
            r0 = 2131435720(0x7f0b20c8, float:1.849329E38)
            android.widget.ImageView r7 = X.DbU.A0F(r3, r0)
            r12 = r20
            android.content.Context r6 = r12.requireContext()
            r0 = 0
            X.C49958FGq.A01(r6, r0, r7)
            android.content.Context r0 = r12.requireContext()
            X.Dba.A0p(r0, r7)
            r0 = 2131435722(0x7f0b20ca, float:1.8493294E38)
            android.view.View r0 = r1.findViewById(r0)
            r12.A00 = r0
            r0 = 2131435724(0x7f0b20cc, float:1.8493298E38)
            android.widget.TextView r0 = X.DbU.A0G(r3, r0)
            r12.A05 = r0
            android.content.Context r6 = r12.requireContext()
            X.Ewa r0 = new X.Ewa
            r0.<init>(r6)
            r12.A08 = r0
            android.widget.TextView r6 = r12.A05
            X.0aP r13 = r12.A06
            boolean r7 = r6 instanceof android.widget.AutoCompleteTextView
            if (r7 == 0) goto L_0x00b2
            android.content.Context r10 = r12.getContext()
            r10.getClass()
            r11 = r6
            android.widget.AutoCompleteTextView r11 = (android.widget.AutoCompleteTextView) r11
            X.DiE r16 = X.C46634DiE.A1e
            android.content.res.Resources r8 = X.DbV.A05(r12)
            r7 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r17 = r8.getDimensionPixelOffset(r7)
            X.FfD r7 = new X.FfD
            r7.<init>(r0)
            X.EuU r14 = new X.EuU
            r14.<init>(r7)
            X.FfH r15 = new X.FfH
            r15.<init>(r13, r12, r0)
            X.Ezp r9 = new X.Ezp
            r18 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A00 = r9
            android.content.res.Resources r9 = X.DbV.A05(r12)
            X.AnonymousClass7TG.A1T(r11, r6, r9)
            r8 = 3
            X.OkE r7 = new X.OkE
            r7.<init>(r8, r9, r6, r11)
            r11.addOnLayoutChangeListener(r7)
            X.F3P r8 = r0.A01
            X.2lw r18 = X.DbW.A0Q(r10, r12)
            r7 = 2
            X.FfE r6 = new X.FfE
            r6.<init>(r0, r7)
            r14 = r8
            r15 = r10
            r16 = r12
            r17 = r13
            r19 = r6
            r14.A00(r15, r16, r17, r18, r19)
        L_0x00b2:
            r0 = 2131437477(0x7f0b27a5, float:1.8496854E38)
            android.widget.EditText r6 = X.DbU.A0E(r3, r0)
            r12.A03 = r6
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r6.setTypeface(r0)
            android.widget.EditText r0 = r12.A03
            X.Dba.A10(r0)
            android.widget.EditText r6 = r12.A03
            r0 = 6
            r6.setImeOptions(r0)
            android.widget.EditText r6 = r12.A03
            r0 = 524416(0x80080, float:7.34863E-40)
            r6.setInputType(r0)
            android.widget.EditText r6 = r12.A03
            r0 = 11
            X.FQe.A00(r6, r12, r0)
            r0 = 2131437482(0x7f0b27aa, float:1.8496864E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            r12.A0O = r0
            android.content.Context r6 = r12.requireContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            if (r0 == 0) goto L_0x026f
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x026f
            com.google.android.material.textfield.TextInputLayout r0 = r12.A0O
            r0.setPasswordVisibilityToggleEnabled(r4)
        L_0x00fe:
            com.instagram.ui.widget.progressbutton.ProgressButton r7 = X.Dba.A0O(r3)
            r12.A0Q = r7
            r6 = 65
            X.FP0 r0 = new X.FP0
            r0.<init>((X.E54) r12, (int) r6)
            X.AnonymousClass0fU.A00(r0, r7)
            com.instagram.ui.widget.progressbutton.ProgressButton r7 = r12.A0Q
            r0 = 2131440747(0x7f0b346b, float:1.8503486E38)
            android.view.View r6 = r3.findViewById(r0)
            android.widget.ScrollView r6 = (android.widget.ScrollView) r6
            X.Ezr r0 = new X.Ezr
            r0.<init>(r7, r6, r4)
            r12.A0P = r0
            X.0aP r4 = r12.A06
            X.F23 r0 = new X.F23
            r0.<init>(r12, r4)
            r12.A0B = r0
            r0 = 2131435716(0x7f0b20c4, float:1.8493282E38)
            android.view.View r0 = r3.requireViewById(r0)
            r12.A01 = r0
            r0 = 2131435715(0x7f0b20c3, float:1.849328E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r3, r0)
            r12.A04 = r0
            if (r0 == 0) goto L_0x0148
            X.2eS.A01(r0)
            android.widget.TextView r4 = r12.A04
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            X.C49948FGd.A02(r4, r0)
        L_0x0148:
            android.view.View r6 = r12.A01
            r4 = 64
            X.FP0 r0 = new X.FP0
            r0.<init>((X.E54) r12, (int) r4)
            X.AnonymousClass0fU.A00(r0, r6)
            r0 = 2131435717(0x7f0b20c5, float:1.8493284E38)
            android.widget.TextView r0 = X.DbU.A0G(r3, r0)
            r12.A0N = r0
            X.2eS.A01(r0)
            android.widget.TextView r6 = r12.A0N
            android.content.res.Resources r4 = X.DbV.A05(r12)
            r0 = 2131976228(0x7f136024, float:1.958957E38)
            X.Dbb.A0l(r4, r6, r0)
            android.content.Context r4 = r12.requireContext()
            android.widget.TextView r0 = r12.A0N
            X.FCK.A00(r0, r4)
            android.widget.TextView r6 = r12.A0N
            r4 = 66
            X.FP0 r0 = new X.FP0
            r0.<init>((X.E54) r12, (int) r4)
            X.AnonymousClass0fU.A00(r0, r6)
            android.widget.TextView r0 = r12.A04
            if (r0 == 0) goto L_0x0264
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r12.A07
            boolean r0 = com.instagram.fx.access.sso.FxSsoViewModel.A01(r0)
            if (r0 != 0) goto L_0x0264
            android.widget.TextView r4 = r12.A04
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r12.A07
            X.0eM r0 = r0.A00
            java.lang.Object r0 = X.Dba.A0W(r0)
            X.DbZ.A14(r4, r0)
        L_0x019a:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r12.A07
            X.0eM r0 = r0.A00
            X.2Fk r4 = X.DbT.A0H(r0)
            r0 = 30
            X.C50139FQw.A00(r12, r4, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r12.A07
            X.0eM r0 = r0.A02
            X.2Fk r4 = X.DbT.A0H(r0)
            r0 = 29
            X.C50139FQw.A00(r12, r4, r0)
            android.content.Context r4 = r12.getContext()
            r0 = 2130970750(0x7f04087e, float:1.7550219E38)
            boolean r2 = X.2Yu.A0L(r4, r0, r2)
            r6 = 8
            r0 = 2131435701(0x7f0b20b5, float:1.8493252E38)
            android.view.View r4 = r3.requireViewById(r0)
            if (r2 == 0) goto L_0x0257
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.2eS.A01(r4)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            r0 = 2131976349(0x7f13609d, float:1.9589816E38)
            X.Dbb.A0l(r2, r4, r0)
            android.content.Context r0 = r12.requireContext()
            X.FCK.A00(r4, r0)
            r2 = 63
            X.FP0 r0 = new X.FP0
            r0.<init>((X.E54) r12, (int) r2)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x01ea:
            X.0aP r0 = r12.A06
            X.4v0 r2 = X.AnonymousClass4v0.A00(r0)
            android.widget.TextView r0 = r12.A05
            r0.addTextChangedListener(r2)
            X.0aP r0 = r12.A06
            X.4v0 r2 = X.AnonymousClass4v0.A00(r0)
            android.widget.EditText r0 = r12.A03
            r0.addTextChangedListener(r2)
            android.widget.TextView r2 = r12.A05
            r0 = 14
            X.FPM.A00(r2, r0, r12)
            android.widget.EditText r2 = r12.A03
            r0 = 15
            X.FPM.A00(r2, r0, r12)
            A00(r12)
            r0 = 2131436914(0x7f0b2572, float:1.8495712E38)
            android.view.View r2 = r1.requireViewById(r0)
            com.instagram.nux.ui.NetzDgTermsTextView r2 = (com.instagram.nux.ui.NetzDgTermsTextView) r2
            X.0aP r0 = r12.A06
            r2.A00(r0)
            android.widget.TextView r0 = r12.A04
            if (r0 == 0) goto L_0x0238
            X.1Q0 r2 = X.1Q0.A0Z
            X.0aP r0 = r12.A06
            X.FGI r4 = r2.A02(r0)
            X.DiE r2 = X.C46634DiE.A0t
            X.EXD r0 = X.EXD.A04
            X.FBm r2 = r4.A06(r0, r2)
            boolean r0 = r12.A0I
            X.C49886FBm.A01(r2, r0)
        L_0x0238:
            r0 = 2131443257(0x7f0b3e39, float:1.8508577E38)
            android.view.View r0 = r1.requireViewById(r0)
            r12.A02 = r0
            r0.setVisibility(r6)
            android.view.View r2 = r12.A02
            r1 = 62
            X.FP0 r0 = new X.FP0
            r0.<init>((X.E54) r12, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r0 = 1895926441(0x71018aa9, float:6.414591E29)
            X.AnonymousClass0fD.A09(r0, r5)
            return r3
        L_0x0257:
            r4.setVisibility(r6)
            android.content.Context r2 = r12.requireContext()
            android.widget.TextView r0 = r12.A0N
            X.FCK.A00(r0, r2)
            goto L_0x01ea
        L_0x0264:
            X.EEM r6 = r12.A0A
            X.DiE r4 = X.C46634DiE.A0t
            android.widget.TextView r0 = r12.A04
            r6.A09(r0, r12, r4)
            goto L_0x019a
        L_0x026f:
            com.google.android.material.textfield.TextInputLayout r0 = r12.A0O
            r0.setPasswordVisibilityToggleEnabled(r2)
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E54.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-221206744);
        super.onDestroyView();
        this.A05.removeTextChangedListener(AnonymousClass4v0.A00(this.A06));
        this.A03.removeTextChangedListener(AnonymousClass4v0.A00(this.A06));
        1xC r2 = 1xC.A01;
        r2.A03(this.A0V, C50249FVg.class);
        r2.A03(this.A0S, C50248FVf.class);
        r2.A03(this.A0U, C50261FVs.class);
        r2.A03(this.A0W, C50250FVh.class);
        this.A05 = null;
        this.A03 = null;
        this.A0O = null;
        this.A0Q = null;
        this.A01 = null;
        this.A04 = null;
        this.A00 = null;
        this.A0N = null;
        this.A0P = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-1326857595, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-767177829);
        E54.super.onPause();
        TextView textView = this.A05;
        TextWatcher textWatcher = this.A0T;
        textView.removeTextChangedListener(textWatcher);
        this.A03.removeTextChangedListener(textWatcher);
        DbS.A1D(this);
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setSoftInputMode(3);
        AnonymousClass0fD.A09(1451566328, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-293242861);
        super.onResume();
        TextView textView = this.A05;
        TextWatcher textWatcher = this.A0T;
        textView.addTextChangedListener(textWatcher);
        this.A03.addTextChangedListener(textWatcher);
        Dbb.A0h(requireActivity());
        boolean A023 = 0mk.A02(requireContext());
        TextView textView2 = this.A05;
        int i = 16;
        if (A023) {
            i = 21;
        }
        textView2.setGravity(i);
        this.A03.setGravity(i);
        A00(this);
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setFlags(8192, 8192);
        AnonymousClass0fD.A09(1351198721, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("LoginLandingFragment.LOGIN_FAILED", this.A0G);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1789594530);
        E54.super.onStart();
        C49634Ezr ezr = this.A0P;
        if (ezr != null) {
            ezr.A00.DmJ(getActivity());
        }
        AnonymousClass0fD.A09(4174404, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1684686041);
        E54.super.onStop();
        C49634Ezr ezr = this.A0P;
        if (ezr != null) {
            ezr.A00.onStop();
        }
        AnonymousClass0fD.A09(-1292305259, A022);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.G85, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        if (!this.A0K && this.A0H && this.A0I) {
            this.A0L = false;
            int i = 0;
            this.A01.setVisibility(4);
            View view2 = this.A00;
            view2.getClass();
            if (!this.A0L) {
                i = 4;
            }
            view2.setVisibility(i);
        }
        1xC r2 = 1xC.A01;
        r2.A02(this.A0V, C50249FVg.class);
        r2.A02(this.A0U, C50261FVs.class);
        r2.A02(this.A0W, C50250FVh.class);
        Bundle bundle3 = this.mArguments;
        if ((bundle3 == null || !bundle3.getBoolean("IS_ONE_CLICK_LOGIN", false)) && ((bundle2 = this.mArguments) == null || !bundle2.getBoolean(AnonymousClass000.A00(960), false))) {
            AnonymousClass0aP r22 = this.A06;
            C46634DiE diE = C46634DiE.A0t;
            0qQ.A0B(r22, 0);
            C46632DiC.A00(this, r22, new Object(), diE, false);
        }
        AnonymousClass0aP r0 = this.A06;
        0qQ.A0B(r0, 0);
        1NY A0b = AnonymousClass7TG.A0b(r0);
        A0b.A0A("trusted_friend/get_non_expired_requests_info/");
        C47691EDa.A00(this, DbT.A0R((15p) null, A0b, DvW.class, C49819F8h.class, false), 13);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && DbS.A0m(bundle4) != null && this.mArguments.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", false)) {
            C358248ab A002 = C49952FGh.A00(getRootActivity());
            A002.A09(2131965610);
            Dba.A1L(A002);
            this.mArguments.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewStateRestored(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 1904453107(0x7183a5f3, float:1.303781E30)
            int r6 = X.AnonymousClass0fD.A02(r0)
            super.onViewStateRestored(r9)
            android.os.Bundle r2 = r8.mArguments
            if (r2 == 0) goto L_0x0034
            r7 = 0
            java.lang.String r0 = X.DbS.A0m(r2)
            if (r0 == 0) goto L_0x0021
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.String r0 = X.Dbj.A03()
            java.lang.String r7 = r1.getQueryParameter(r0)
        L_0x0021:
            java.lang.String r0 = A0X
            java.lang.String r1 = r2.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0035
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r7 = r1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x005f
            boolean r0 = r8.A0H
            if (r0 != 0) goto L_0x005f
            java.lang.String r2 = X.FGv.A01()
            if (r2 == 0) goto L_0x005f
            X.0aP r0 = r8.A06
            java.util.Iterator r1 = X.DbY.A0n(r0)
        L_0x004b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r1.next()
            X.6qx r0 = (X.C319646qx) r0
            java.lang.String r0 = r0.A07
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004b
        L_0x005f:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0096
            android.widget.TextView r0 = r8.A05
            r0.setText(r7)
            double r4 = X.DbS.A01()
            double r2 = X.DbS.A00()
            X.0aP r0 = r8.A06
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "login_username_prefilled"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbZ.A1G(r1, r4, r2)
            java.lang.String r0 = "prefill"
            X.DbY.A1I(r1, r0, r7, r2)
            java.lang.String r0 = "login"
            X.DbZ.A1J(r1, r0)
            X.FH8.A05(r1)
            X.DbT.A1P(r1)
            X.0aP r0 = r8.A06
            X.FH8.A0C(r1, r0)
        L_0x0096:
            r0 = -1023968216(0xffffffffc2f77c28, float:-123.74249)
            X.AnonymousClass0fD.A09(r0, r6)
            return
        L_0x009d:
            r7 = r2
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E54.onViewStateRestored(android.os.Bundle):void");
    }
}
