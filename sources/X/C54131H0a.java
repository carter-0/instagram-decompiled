package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.H0a  reason: case insensitive filesystem */
public final class C54131H0a extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EarnedAchievementsFragment";
    public final AnonymousClass0eM A00 = C58683Ivs.A00(this, 34);
    public final AnonymousClass0eM A01 = C58683Ivs.A00(this, 35);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131972973);
    }

    public final String getModuleName() {
        return "see_all_earned_achievements";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2056083020);
        0qQ.A0B(layoutInflater, 0);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59137J7t(12, this, viewGroup, bundle, layoutInflater), -2072567995), false, false);
        AnonymousClass0fD.A09(633728915, A022);
        return A012;
    }
}
