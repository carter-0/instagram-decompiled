package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class NJD extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "FriendMapHidePlacesBottomSheetFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        C73905Plg A002 = C73905Plg.A00(this, 27);
        boolean A1X = JTQ.A1X(this);
        C71054OaW.A00(requireActivity(), A002, A1X);
        return A1X;
    }

    public NJD() {
        0Yh A0z = DbS.A0z(C69028NdD.class);
        this.A00 = DbS.A0I(C73905Plg.A00(this, 29), C73905Plg.A00(this, 30), new C58185Inp(19, (Object) null, this), A0z);
        C73905Plg A002 = C73905Plg.A00(this, 28);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73905Plg.A00(C73905Plg.A00(this, 31), 32));
        this.A01 = DbS.A0I(C73905Plg.A00(A003, 33), A002, new C58185Inp(20, (Object) null, A003), DbS.A0z(HBP.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-148281810);
        ComposeView A0H = DbV.A0H(this, new C59341JFt(this, 23), -106968200);
        AnonymousClass0fD.A09(1125682225, A022);
        return A0H;
    }
}
