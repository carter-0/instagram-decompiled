package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K4B extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiCreationBottomSheetNuxFragment";
    public final AnonymousClass0eM A00 = C51975G9x.A0r(this, "AiStudioArgumentKeys.creation_entry_point", 0eO.A02, 2);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(C66301MMk.A01(this, 42), C66301MMk.A01(this, 43), MMV.A00((Object) null, this, 15), JTT.A0w());

    public final String getModuleName() {
        return "ai_creation_bottom_sheet_nux_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A03 = LTH.A03(this.A01);
        String A0t = DbS.A0t(this.A00);
        AnonymousClass0eM r0 = this.A02;
        A03.A06(C60316JjJ.A00(r0), A0t, C60316JjJ.A01(r0));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1774034084);
        K4B.super.onCreate(bundle);
        KX0 kx0 = JTO.A0R(this.A02).A00;
        AnonymousClass7TE.A1Z(new C59676JTh((Object) kx0, (AnonymousClass4D7) null, 41), kx0.A01);
        AnonymousClass0fD.A09(744579984, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1673132233);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 35), 1538077036);
        AnonymousClass0fD.A09(-1136788882, A022);
        return A0H;
    }
}
