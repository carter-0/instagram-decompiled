package X;

import android.view.View;
import java.util.ArrayList;

public final class ES3 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacTextMessageControlsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975778);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public static final void A06(ES3 es3) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        boolean z = es3.requireArguments().getBoolean("is_two_factor_enabled");
        PR9 A0f = DbS.A0f(new FQ2(es3, z, es3.requireArguments().getBoolean("is_totp_two_factor_enabled")), 2131975744, z);
        int A02 = DbZ.A02(es3);
        A0f.A05 = A02;
        A0f.A00 = A02;
        if (z) {
            String A0R = 002.A0R("****", FGN.A00(Dbb.A0Z(es3.requireArguments())));
            0qQ.A07(A0R);
            A0f.A0A = DbV.A0z(es3, A0R, 2131975743);
        } else {
            A0f.A02 = 2131975745;
        }
        A1C.add(A0f);
        A1C.add(new C71065Oak((View.OnClickListener) new FP3((Object) es3, 55), (String) null, 2131975779, 2131975777));
        es3.setItems(A1C);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1335991584);
        super.onResume();
        A06(this);
        AnonymousClass0fD.A09(970230223, A02);
    }
}
