package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gza  reason: case insensitive filesystem */
public final class C54105Gza extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ProfileCardDownloadBottomSheetFragment";
    public F0P A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbT.A16(view.getContext(), view, 2Yu.A02(getContext()));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = AnonymousClass0fD.A02(2046886794);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("header_res_key");
        } else {
            i = 0;
        }
        ComposeView A0H = DbV.A0H(this, new JGD(i, 39, this), -1865358480);
        AnonymousClass0fD.A09(842914962, A02);
        return A0H;
    }
}
