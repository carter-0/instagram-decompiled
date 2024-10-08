package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0Y extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ChallengeTiersFragment";
    public final AnonymousClass0eM A00 = C58683Ivs.A00(this, 33);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1C(r3, requireArguments().getString("challengeTitle"));
    }

    public final String getModuleName() {
        return "challenge_tiers_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1027989866);
        0qQ.A0B(layoutInflater, 0);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59137J7t(11, this, viewGroup, bundle, layoutInflater), -1640292251), false, false);
        AnonymousClass0fD.A09(1346099606, A02);
        return A012;
    }
}
