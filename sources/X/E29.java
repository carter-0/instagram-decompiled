package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class E29 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EarlyAccessFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131961078);
    }

    public final String getModuleName() {
        return "early_access_settings";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-246255352);
        ComposeView A002 = GTX.A00(this, C45188Crq.A00);
        AnonymousClass0fD.A09(1233813639, A02);
        return A002;
    }
}
