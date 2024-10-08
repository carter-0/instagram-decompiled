package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H17 extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ComposePivotPageDefaultHeaderFragmentImpl";
    public C74302Psc A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final void A00(AnonymousClass0Ud r6) {
        0qQ.A0B(r6, 0);
        C53019GhA ghA = (C53019GhA) this.A02.getValue();
        AnonymousClass4D7 A0t = C51975G9x.A0t(ghA.A00);
        ghA.A00 = C51966G9m.A1L(new C58105ImR((Object) ghA, (Object) r6, A0t, 23), C318116oQ.A00(ghA));
    }

    public final String getModuleName() {
        return "compose_default_pivot_page_header_fragment";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public H17() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58712IwL.A01(new MMH(this, 49), 0));
        0Yh A0z = DbS.A0z(C53019GhA.class);
        this.A02 = DbS.A0I(C58712IwL.A01(A002, 1), C58690Ivz.A00(A002, this, 30), C58690Ivz.A00((Object) null, A002, 29), A0z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1942578811);
        ComposeView A0H = DbV.A0H(this, new JGB(this, 13), 1171389889);
        AnonymousClass0fD.A09(1439559400, A022);
        return A0H;
    }
}
