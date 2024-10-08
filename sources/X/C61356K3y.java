package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.K3y  reason: case insensitive filesystem */
public final class C61356K3y extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SettingsScreenConfirmBottomSheetFragment";
    public L2S A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "settings_screen_confirm_bottom_sheet_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(745445137);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59346JFy(requireArguments().getParcelableArrayList(DialogModule.KEY_ITEMS), 0), 1858612214), false, false);
        AnonymousClass0fD.A09(1088045334, A02);
        return A012;
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(1796892348);
        C61356K3y.super.onStart();
        L2S l2s = this.A00;
        if (l2s != null) {
            C59844JaK.A00(l2s.A00).A09(true);
        }
        AnonymousClass0fD.A09(758766651, A02);
    }
}
