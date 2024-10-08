package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class NJN extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MetaVerifiedBrandedChatNUXInterstitialFragment";
    public OAO A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Etr(false);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(903287061);
        NJN.super.onCreate(bundle);
        AnonymousClass0fD.A09(1642661339, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(786407385);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 31), -1956272555);
        AnonymousClass0fD.A09(1144473672, A02);
        return A0H;
    }
}
