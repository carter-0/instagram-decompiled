package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gze  reason: case insensitive filesystem */
public final class C54109Gze extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CommentsInsightsOptInFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "comments_insights_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 25), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C54109Gze() {
        0eO r3 = 0eO.A02;
        this.A02 = C51804G2n.A01(this, "summary_id", r3, 12);
        GW6 gw6 = new GW6(this, 11);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new GW6(new GW6(this, 12), 13));
        this.A00 = DbS.A0I(new GW6(A002, 14), gw6, new C73664Phd(5, A002, (Object) null), DbS.A0z(C52995Ggm.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1717358100);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 6), -863541888);
        AnonymousClass0fD.A09(641834257, A022);
        return A0H;
    }
}
