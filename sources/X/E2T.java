package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E2T extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacSetupManuallyFragment";
    public TextView A00;
    public TextView A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975768);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1993540611);
        E2T.super.onCreate(bundle);
        FCE.A02(AnonymousClass7TE.A0l(this.A03), "setup_manually_auth_app");
        AnonymousClass0fD.A09(-1867869410, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-984819614);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_setup_manually_fragment, viewGroup, false);
        this.A00 = DbU.A0G(inflate, R.id.ig_key_line_one);
        this.A01 = DbU.A0G(inflate, R.id.ig_key_line_two);
        FP3.A00(inflate.requireViewById(R.id.copy_key), 53, this);
        ((C3021461u) inflate.requireViewById(R.id.next_bottom_button)).setPrimaryActionOnClickListener(new FP3((Object) this, 54));
        Dbb.A1M(this);
        AnonymousClass0fD.A09(2025929717, A022);
        return inflate;
    }

    public final void onStart() {
        String str;
        int A022 = AnonymousClass0fD.A02(-218121751);
        E2T.super.onStart();
        String str2 = this.A02;
        if (str2 != null) {
            TextView textView = this.A00;
            if (textView == null) {
                str = "igKeyLineOne";
            } else {
                TextView textView2 = this.A01;
                if (textView2 == null) {
                    str = "igKeyLineTwo";
                } else {
                    FGN.A03(textView, textView2, str2);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C49930FFj.A02(requireContext(), new C47699EDi(this, 40), DbT.A0X(this.A03));
        AnonymousClass0fD.A09(694403506, A022);
    }
}
