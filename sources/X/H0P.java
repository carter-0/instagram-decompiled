package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0P extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AchievementsHubFragment";
    public boolean A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C58683Ivs.A00(this, 19);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C58683Ivs(this, 21));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final String A05 = "achievements_v2";

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbW.A1B(r4, 2131952048);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A02(AnonymousClass05K.A0Y);
        DbX.A19(new C56800ICx(this, 33), A0K, r4);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public H0P() {
        C58683Ivs ivs = new C58683Ivs(this, 18);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58683Ivs(new C58683Ivs(this, 22), 23));
        this.A01 = DbS.A0I(new C58683Ivs(A002, 24), ivs, new MMY(46, A002, (Object) null), DbS.A0z(C53038GhU.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1878466576);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 23), -161529695);
        AnonymousClass0fD.A09(-1840063908, A022);
        return A0H;
    }
}
