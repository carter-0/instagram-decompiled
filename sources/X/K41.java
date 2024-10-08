package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K41 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PotatoAudienceSelectorFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;
    public final String A02 = "potato_audience_selector_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 5), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public K41() {
        MMU mmu = new MMU(this, 43);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMU(new MMU(this, 40), 41));
        this.A01 = DbS.A0I(new MMU(A002, 42), mmu, new MJ9(33, (Object) null, A002), DbS.A0z(C60177Jgw.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(48883082);
        ComposeView A0H = DbV.A0H(this, new C59112J6u(this, 25), 1804596131);
        AnonymousClass0fD.A09(1939042477, A022);
        return A0H;
    }
}
