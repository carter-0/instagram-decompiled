package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.E3b  reason: case insensitive filesystem */
public final class C47455E3b extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectThreadSharedLinksFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final String A01 = "direct_thread_shared_links";

    public final boolean onBackPressed() {
        return false;
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(836685416);
        ComposeView A002 = GTX.A00(this, C49312Esv.A01);
        AnonymousClass0fD.A09(-1301811825, A02);
        return A002;
    }
}
