package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class E15 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ProfileCardNuxBottomSheetFragment";
    public Ey0 A00;
    public final String A01 = "https://help.instagram.com/347751748650214";
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbT.A16(view.getContext(), view, 2Yu.A02(getContext()));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(825975794);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 16), -769171997);
        AnonymousClass0fD.A09(1376967171, A022);
        return A0H;
    }
}
