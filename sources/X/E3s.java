package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.ui.NetzDgTermsTextView;

public final class E3s extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass25J {
    public static final String __redex_internal_original_name = "FacebookLandingFragment";
    public long A00;
    public ViewGroup A01;
    public TextSwitcher A02;
    public TextView A03;
    public 0jh A04;
    public AnonymousClass0aP A05;
    public FxSsoViewModel A06;
    public F3M A07;
    public EEM A08;
    public boolean A09 = false;
    public boolean A0A;
    public TextView A0B;
    public C249883kW A0C;
    public final 1wn A0D = FXZ.A00(this, 37);
    public final 1wn A0E = FXZ.A00(this, 36);
    public final 1wn A0F = FXZ.A00(this, 38);

    public final String getModuleName() {
        return "landing_facebook";
    }

    public static void A01(E3s e3s) {
        1R7 C82 = e3s.A0C.C82();
        if (C82.A0C.contains("ig_landing_screen_text")) {
            String str = C82.A06;
            if (str == null) {
                str = e3s.getString(2131976988);
            }
            DbY.A0y(DbV.A05(e3s), e3s.A0B, str, 2131976992);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            e3s.A0B.startAnimation(alphaAnimation);
            return;
        }
        DbS.A1C(e3s.A0B);
    }

    public static void A02(E3s e3s, String str) {
        if (e3s.A02 != null && !TextUtils.isEmpty(str)) {
            e3s.A02.setCurrentText(str);
            e3s.A0A = true;
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A08.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A05, "landing");
        return false;
    }

    public final void onTokenChange() {
        11Z.A02(new C51236Fqr(this));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.E3s, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x002f;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.E3s r3) {
        /*
            X.FV8 r0 = X.FV8.A00()
            X.9Gs r0 = r0.A01
            if (r0 == 0) goto L_0x0064
            X.9Gt r0 = r0.A00
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = r0.A00
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x002f
            X.FXk r2 = X.C50305FXk.A03
            X.0aP r0 = r3.A05
            java.lang.String r1 = "FacebookLandingFragment"
            boolean r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0039
            X.0aP r0 = r3.A05
            boolean r0 = X.Dbc.A12(r0, r1)
            if (r0 == 0) goto L_0x0061
            r1 = 0
        L_0x0029:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0039
        L_0x002f:
            r0 = 2131956700(0x7f1313dc, float:1.9549963E38)
            java.lang.String r0 = X.DbV.A0z(r3, r1, r0)
            A02(r3, r0)
        L_0x0039:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r3.A06
            X.0eM r0 = r0.A00
            java.lang.Object r0 = X.Dba.A0W(r0)
            java.lang.String r0 = (java.lang.String) r0
            A02(r3, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r3.A06
            X.0eM r0 = r0.A00
            X.2Fk r1 = X.DbT.A0H(r0)
            r0 = 27
            X.C50139FQw.A00(r3, r1, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r3.A06
            X.0eM r0 = r0.A02
            X.2Fk r1 = X.DbT.A0H(r0)
            r0 = 28
            X.C50139FQw.A00(r3, r1, r0)
            return
        L_0x0061:
            java.lang.String r1 = X.C50305FXk.A01
            goto L_0x0029
        L_0x0064:
            r1 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3s.A00(X.E3s):void");
    }

    public static boolean A03(E3s e3s) {
        if (C3270479e.A00(e3s.getRootActivity()).A00.equals("RU") || (!C50305FXk.A03.A00(e3s.A05, __redex_internal_original_name) && !AnonymousClass1G3.A04(e3s.getContext()))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.G85, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00bc, code lost:
        if (r3 != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -1787563163(0xffffffff9573f365, float:-4.9265464E-26)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r7 = r13
            X.E3s.super.onCreate(r14)
            android.os.Bundle r3 = r13.mArguments
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            android.app.Application r0 = r0.getApplication()
            X.AnonymousClass2XD.A00(r0)
            X.08y r0 = X.09i.A0A
            X.0aP r0 = r0.A02(r3)
            r13.A05 = r0
            X.0jh r0 = X.DbT.A0P(r0)
            r13.A04 = r0
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            com.instagram.fx.access.sso.FxSsoViewModel r0 = X.DbY.A0V(r0)
            r13.A06 = r0
            X.2jd r5 = new X.2jd
            r5.<init>()
            androidx.fragment.app.FragmentActivity r4 = r13.requireActivity()
            boolean r0 = r4 instanceof com.instagram.nux.activity.SignedOutFragmentActivity
            if (r0 == 0) goto L_0x00bf
            r0 = r4
            com.instagram.nux.activity.SignedOutFragmentActivity r0 = (com.instagram.nux.activity.SignedOutFragmentActivity) r0
            java.lang.String r12 = r0.A06
        L_0x0042:
            X.0aP r9 = r13.A05
            X.DiE r11 = X.C46634DiE.A0r
            com.instagram.fx.access.sso.FxSsoViewModel r10 = r13.A06
            X.EEM r6 = new X.EEM
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A08 = r6
            X.0aP r1 = r13.A05
            X.EEE r0 = new X.EEE
            r0.<init>(r4, r13, r1, r11)
            r5.A0E(r0)
            X.EEM r0 = r13.A08
            r5.A0E(r0)
            r13.registerLifecycleListenerSet(r5)
            X.0aP r1 = r13.A05
            X.F3M r0 = new X.F3M
            r0.<init>(r13, r1)
            r13.A07 = r0
            r0.A00()
            android.view.Window r1 = r4.getWindow()
            r0 = 32
            r1.setSoftInputMode(r0)
            X.0aP r0 = r13.A05
            X.3kW r0 = X.AnonymousClass1Qz.A00(r0)
            r13.A0C = r0
            X.0aP r1 = r13.A05
            java.lang.String r0 = "landing"
            X.AnonymousClass7TG.A1N(r1, r0)
            X.C49938FFr.A01(r1, r0)
            r4 = 0
            if (r3 == 0) goto L_0x00af
            java.lang.String r0 = "IS_ONE_CLICK_LOGIN"
            boolean r0 = r3.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x00a0
            r0 = 960(0x3c0, float:1.345E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x00af
        L_0x00a0:
            java.lang.String r0 = "is_current_user_fb_connected"
            boolean r0 = r3.getBoolean(r0, r4)
            r13.A09 = r0
        L_0x00a8:
            r0 = 324816886(0x135c4ff6, float:2.7807328E-27)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x00af:
            X.0aP r1 = r13.A05
            X.0qQ.A0B(r1, r4)
            X.Fdr r0 = new X.Fdr
            r0.<init>()
            X.C46632DiC.A00(r13, r1, r0, r11, r4)
            if (r3 == 0) goto L_0x00a8
            goto L_0x00a0
        L_0x00bf:
            r12 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3s.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [X.KHA, X.11X] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        CharSequence fromHtml;
        int A022 = AnonymousClass0fD.A02(-671537386);
        if (A03(this)) {
            inflate = DbT.A0C(layoutInflater, viewGroup, R.layout.landing_prominent_login);
            ((NetzDgTermsTextView) inflate.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A05);
            this.A01 = DbS.A0E(inflate, R.id.button_group);
            boolean A032 = A03(this);
            int i = R.layout.email_or_phone_button_group;
            if (A032) {
                i = R.layout.email_or_phone_plus_login_button_group;
            }
            layoutInflater.inflate(i, this.A01);
        } else {
            inflate = layoutInflater.inflate(R.layout.landing_prominent_facebook, viewGroup, false);
            ViewGroup A0E2 = DbS.A0E(inflate, R.id.button_group);
            this.A01 = A0E2;
            layoutInflater.inflate(R.layout.facebook_button_group, A0E2);
            Resources A052 = DbV.A05(this);
            TextSwitcher textSwitcher = (TextSwitcher) inflate.requireViewById(R.id.facebook_text_switcher);
            this.A02 = textSwitcher;
            textSwitcher.setFactory(new FQh(A052, this));
            this.A02.setCurrentText(getString(2131965542));
            FP0.A00(this.A02, 54, this);
            this.A02.setBackgroundResource(R.drawable.blue_button_background);
            this.A00 = SystemClock.elapsedRealtime();
            this.A0A = false;
            boolean z = this.A04.A00.A01.getBoolean("analytics_device_id_external", false);
            if (z || AnonymousClass1G3.A04(getContext())) {
                TextView A0G = DbU.A0G(inflate, R.id.social_context);
                this.A03 = A0G;
                A0G.setVisibility(0);
                View requireViewById = inflate.requireViewById(R.id.divider);
                ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(requireViewById);
                A0D2.setMargins(0, 0, 0, 0);
                requireViewById.setLayoutParams(A0D2);
                if (z) {
                    1OC A023 = FCI.A02(this.A05, Dba.A0X(this), this.A04.A02(19f.A1f), (String) null, false);
                    A023.A00 = new ED3(this);
                    schedule(A023);
                }
            }
            C49886FBm.A01(1Q0.A0Z.A02(this.A05).A06(EXD.A04, C46634DiE.A0r), this.A09);
            ((NetzDgTermsTextView) inflate.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A05);
        }
        ImageView A0G2 = DbS.A0G(inflate, R.id.logo);
        C49958FGq.A01(getContext(), inflate.findViewById(R.id.subtitle), A0G2);
        Dba.A0p(getContext(), A0G2);
        this.A0B = AnonymousClass7TE.A0d(inflate, R.id.zero_rating_landing_page_text_view);
        A01(this);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.sign_up_with_email_or_phone);
        A0d.getClass();
        2eS.A01(A0d);
        FP0.A00(A0d, 52, this);
        int i2 = 2131973892;
        if (A03(this)) {
            i2 = 2131956874;
        }
        A0d.setText(i2);
        TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.log_in_button);
        A0d2.getClass();
        2eS.A01(A0d2);
        if (A03(this)) {
            fromHtml = getString(2131965541);
        } else {
            fromHtml = Html.fromHtml(DbV.A05(this).getString(2131952921));
        }
        A0d2.setText(fromHtml);
        if (!A03(this)) {
            FCK.A00(A0d2, requireContext());
        }
        FP0.A00(A0d2, 53, this);
        FragmentActivity activity = getActivity();
        1ES.A00(activity, AnonymousClass07i.A00(activity), new KHA(4, activity, this.A05, this));
        AnonymousClass0fD.A09(913868003, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-503136344);
        super.onDestroyView();
        1xC r2 = 1xC.A01;
        r2.A03(this.A0D, C50249FVg.class);
        r2.A03(this.A0F, C50250FVh.class);
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0B = null;
        AnonymousClass0fD.A09(-359712677, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-4092273);
        E3s.super.onPause();
        1xC.A01.A03(this.A0E, C60890jr.class);
        AnonymousClass0fD.A09(-1528468534, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(862200392);
        super.onResume();
        1xC.A01.A02(this.A0E, C60890jr.class);
        AnonymousClass0fD.A09(528775597, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1821100845);
        E3s.super.onStart();
        this.A0C.AAX(this);
        AnonymousClass0fD.A09(-9230632, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1479876037);
        E3s.super.onStop();
        this.A0C.EEn(this);
        AnonymousClass0fD.A09(-1080507106, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        1xC r2 = 1xC.A01;
        r2.A02(this.A0D, C50249FVg.class);
        r2.A02(this.A0F, C50250FVh.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && DbS.A0m(bundle2) != null && this.mArguments.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", false)) {
            C358248ab A002 = C49952FGh.A00(getRootActivity());
            A002.A09(2131965610);
            Dba.A1L(A002);
            this.mArguments.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        }
    }
}
