package X;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import java.util.ArrayList;

public final class ES6 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacOtherMethodsFragment";
    public Bundle A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public static final void A06(ES6 es6) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ES6 es62 = es6;
        Bundle bundle = es62.A00;
        if (bundle != null) {
            boolean z = bundle.getBoolean("is_two_factor_enabled");
            Bundle bundle2 = es62.A00;
            if (bundle2 != null) {
                boolean z2 = bundle2.getBoolean("is_totp_two_factor_enabled");
                FAZ faz = new FAZ(2131975754);
                faz.A01 = 1;
                faz.A05 = new F0T(DbV.A05(es62).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), 0, Dbb.A07(es62, R.dimen.abc_dialog_padding_material), DbZ.A02(es62), Dbb.A07(es62, R.dimen.abc_dialog_padding_material), Dbb.A07(es62, R.dimen.abc_dialog_padding_material));
                faz.A03 = R.style.TwoFacRowBodyText;
                A1C.add(faz);
                Bundle bundle3 = es62.A00;
                if (bundle3 != null) {
                    PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new FQO(es62, 17), (C358618bC) FdR.A00, 2131975757, bundle3.getBoolean("is_trusted_notifications_enabled"));
                    int dimensionPixelSize = DbV.A05(es62).getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                    pr9.A05 = dimensionPixelSize;
                    pr9.A00 = dimensionPixelSize;
                    pr9.A02 = 2131975756;
                    int A07 = Dbb.A07(es62, R.dimen.account_discovery_bottom_gap);
                    pr9.A05 = A07;
                    pr9.A00 = A07;
                    A1C.add(pr9);
                    Bundle bundle4 = es62.A00;
                    if (bundle4 != null) {
                        ArrayList<String> stringArrayList = bundle4.getStringArrayList("backup_codes");
                        if ((z || z2) && stringArrayList != null) {
                            A1C.add(new C71065Oak((View.OnClickListener) new FPF(55, (Object) stringArrayList, (Object) es62), (String) null, 2131975753, 2131975752));
                        }
                        es62.setItems(A1C);
                        return;
                    }
                }
            }
        }
        0qQ.A0F("twoFacResponseBundle");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131975758);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2132450867);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        AnonymousClass0fD.A09(875197608, A02);
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(970375830);
        ES6.super.onStart();
        A06(this);
        AnonymousClass0fD.A09(791932301, A02);
    }
}
