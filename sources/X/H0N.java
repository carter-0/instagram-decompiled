package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0N extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AboutAchievementsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C58683Ivs.A00(this, 7);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131951982);
    }

    public final String getModuleName() {
        return "about_achievements_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public H0N() {
        C58683Ivs ivs = new C58683Ivs(this, 6);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58683Ivs(new C58683Ivs(this, 8), 9));
        this.A00 = DbS.A0I(new C58683Ivs(A002, 10), ivs, new MMY(37, A002, (Object) null), DbS.A0z(C52981GgY.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1163585818);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 20), 1142879841);
        AnonymousClass0fD.A09(-862147985, A022);
        return A0H;
    }
}
