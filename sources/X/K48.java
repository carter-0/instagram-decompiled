package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K48 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UpdatesHubSettingsFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C51801G2k(this, 1));
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C51801G2k(this, 2));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C51801G2k(this, 3));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final C262224Cq A04 = 19E.A02(AnonymousClass12T.A00.AOJ(-18, 3));

    public final String getModuleName() {
        return "updates_hub_settings_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1981959956);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 21), 361276834);
        AnonymousClass0fD.A09(-1605328409, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(909730499);
        K48.super.onPause();
        AnonymousClass7TE.A1Z(new MFS(this, (AnonymousClass4D7) null, 6), this.A04);
        AnonymousClass0fD.A09(-1789263102, A022);
    }
}
