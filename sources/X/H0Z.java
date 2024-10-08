package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0Z extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AchievementTiersFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C58169InZ(this));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C58170Ina(this));

    public final void configureActionBar(2da r6) {
        String str;
        0qQ.A0B(r6, 0);
        Context context = getContext();
        if (context != null) {
            str = DbW.A0h(context, requireArguments().getString("achievementTitle"), 2131952121);
        } else {
            str = null;
        }
        r6.setTitle(str);
        r6.Eu4(true);
    }

    public final String getModuleName() {
        return "achievement_tiers_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1823574870);
        0qQ.A0B(layoutInflater, 0);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59137J7t(10, this, viewGroup, bundle, layoutInflater), 2027082917), false, false);
        AnonymousClass0fD.A09(1964017997, A022);
        return A012;
    }
}
