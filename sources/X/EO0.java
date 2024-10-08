package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class EO0 extends E3K {
    public static final String __redex_internal_original_name = "OpalAudienceSelectorFragment";
    public boolean A00 = true;
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.ErN(getString(2131968835));
        super.configureActionBar(r2);
    }

    public final String getModuleName() {
        return "opal_audience_selector_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 43), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void A08(boolean z) {
        DbU.A0L(this, 2dZ.A0t).A0Z(z);
        super.A08(z);
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public EO0() {
        C51794G2d g2d = new C51794G2d(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51794G2d(new C41562AwU(this, 49), 0));
        this.A01 = DbS.A0I(new C51794G2d(A002, 1), g2d, new MJ7(38, (Object) null, A002), DbS.A0z(C52964GgH.class));
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-167646687);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 != null) {
            z = bundle2.getBoolean("argument_should_reset_dark_theme", true);
        }
        this.A00 = z;
        super.onCreate(bundle);
        AnonymousClass0eM r1 = this.A00;
        C49049EoT.A00(this, AnonymousClass7TE.A0l(r1), "surface_appear", "empty", "edit_audience", AnonymousClass7TE.A0l(r1).A06, (String) null);
        AnonymousClass0fD.A09(1077649509, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1418854703);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new C59345JFx(this, 36), 1201722553, true), true, false);
        AnonymousClass0fD.A09(1082182010, A02);
        return A012;
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(2060586521);
        super.onDestroy();
        AnonymousClass0eM r1 = this.A00;
        C49049EoT.A00(this, AnonymousClass7TE.A0l(r1), "surface_disappear", "empty", "edit_audience", AnonymousClass7TE.A0l(r1).A06, (String) null);
        AnonymousClass0fD.A09(37379863, A02);
    }
}
