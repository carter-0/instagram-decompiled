package X;

import android.net.ConnectivityManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.fx.access.sso.FxSsoViewModel;
import java.util.Iterator;

public final class EEE extends C252233om {
    public EEM A00;
    public E0M A01 = null;
    public boolean A02;
    public EEB A03;
    public final FragmentActivity A04;
    public final AnonymousClass4DH A05;
    public final AnonymousClass0aP A06;
    public final C46634DiE A07;
    public final 1wn A08 = FXZ.A00(this, 51);

    public final void onCreate() {
        FragmentActivity fragmentActivity;
        boolean z;
        AnonymousClass0aP r12 = this.A06;
        AnonymousClass4DH r10 = this.A05;
        C46634DiE diE = this.A07;
        this.A00 = new EEM(r10, r10, r12, (FxSsoViewModel) null, diE, (String) null);
        AnonymousClass1qB r0 = AnonymousClass1qB.$redex_init_class;
        AnonymousClass1qC r02 = AnonymousClass1qC.$redex_init_class;
        if (AnonymousClass1qB.A00()) {
            0wb.A03("failed_to_load_library_logged_out", "failed_to_load_library_logged_out");
            FragmentActivity fragmentActivity2 = this.A04;
            C358248ab A0X = DbS.A0X(fragmentActivity2);
            A0X.A0r(false);
            A0X.A09(2131961740);
            DbU.A17(fragmentActivity2, A0X, 2131975834);
            A0X.A0E(C50020FJf.A00(this, 63));
            DbT.A1V(A0X);
        }
        try {
            0qv r03 = 0qv.A02;
            fragmentActivity = this.A04;
            r03.A05(fragmentActivity);
        } catch (RuntimeException unused) {
            0wb.A03("failed_to_write_to_fs", AnonymousClass000.A00(3526));
            C50020FJf A002 = C50020FJf.A00(this, 64);
            fragmentActivity = this.A04;
            C358248ab A0X2 = DbS.A0X(fragmentActivity);
            A0X2.A0Z(A002, DbW.A0h(fragmentActivity, "http://bit.ly/igfilesystem", 2131971328), "http://bit.ly/igfilesystem");
            Dba.A0t(C50020FJf.A00(this, 65), A0X2, 2131960862);
        }
        Object systemService = fragmentActivity.getSystemService(AnonymousClass000.A00(567));
        systemService.getClass();
        String A0A = C61970qY.A0A(((ConnectivityManager) systemService).getActiveNetworkInfo());
        boolean A0B = 0oI.A0B(fragmentActivity);
        0wc A022 = AnonymousClass0kN.A02(r12);
        long currentTimeMillis = System.currentTimeMillis();
        0Aj A0e = AnonymousClass7TE.A0e(A022, "landing_created");
        DbZ.A1E(A0e);
        DbY.A1E(A0e, currentTimeMillis, 1Q0.A00());
        DbW.A12(A0e, DbS.A00());
        String str = diE.A01;
        DbS.A1H(A0e, str);
        A0e.A7p("is_facebook_app_installed", Boolean.valueOf(A0B));
        DbY.A1A(A0e);
        synchronized (FGv.class) {
            z = FGv.A00.A00.getBoolean("did_facebook_sso", false);
        }
        A0e.A7p("did_facebook_sso", Boolean.valueOf(z));
        A0e.A7p("did_log_in", Boolean.valueOf(FGv.A05()));
        A0e.AAJ(AnonymousClass000.A00(173), A0A);
        A0e.AAJ("app_lang", AnonymousClass1Q2.A02().toString());
        A0e.AAJ("device_lang", AnonymousClass1Q2.A03().toString());
        A0e.AAJ("funnel_name", diE.A00);
        DbW.A14(A0e, currentTimeMillis);
        A0e.Cgf();
        0nY.A00().ATE(new C47799EHk(fragmentActivity));
        C49315Esy.A00(r12, str, r10.getModuleName());
    }

    public final void onDestroyView() {
        this.A05.unregisterLifecycleListener(this.A03);
        1xC.A01.A03(this.A08, C50249FVg.class);
    }

    public final void onPause() {
        E0M e0m = this.A01;
        if (e0m != null) {
            e0m.A07();
        }
    }

    public EEE(FragmentActivity fragmentActivity, AnonymousClass4DH r3, AnonymousClass0aP r4, C46634DiE diE) {
        this.A06 = r4;
        this.A04 = fragmentActivity;
        this.A05 = r3;
        this.A07 = diE;
    }

    public final void D6z(View view) {
        String displayName;
        view.requireViewById(R.id.landing_container);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.language_selector_button);
        if (A0d != null) {
            2eS.A01(A0d);
            FragmentActivity fragmentActivity = this.A04;
            if (!2Yu.A0L(fragmentActivity, R.attr.nuxAllowLanguagePicker, true)) {
                A0d.setVisibility(8);
            } else {
                String A012 = AnonymousClass1Q2.A01();
                if (!TextUtils.isEmpty(A012)) {
                    Iterator it = FEP.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C47271Dtz dtz = (C47271Dtz) it.next();
                        if (dtz.A02.equals(A012)) {
                            displayName = fragmentActivity.getString(dtz.A01);
                            break;
                        }
                    }
                }
                displayName = fragmentActivity.getResources().getConfiguration().locale.getDisplayName();
                int A013 = DbV.A01(fragmentActivity);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(displayName);
                spannableStringBuilder.append("  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new ImageSpan(A0B.A00(fragmentActivity, R.drawable.feed_sponsored_chevron, 8, A013), 1), length - 1, length, 33);
                A0d.setText(spannableStringBuilder);
                A0d.setContentDescription(AnonymousClass7TF.A0e(A0d.getResources(), A0d.getText(), 2131964626));
                FPD.A00(A0d, 25, this);
            }
        }
        this.A03 = new EEB(this.A06, (C47491E4v) null, this.A07);
        1xC.A01.A02(this.A08, C50249FVg.class);
        this.A05.registerLifecycleListener(this.A03);
    }
}
