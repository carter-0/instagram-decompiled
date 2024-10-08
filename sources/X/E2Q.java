package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class E2Q extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PublisherControlBlockedCategoriesComposeFragment";
    public final AnonymousClass0eM A00 = C51791G2a.A00(this, 36);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.setTitle(getString(2131963677));
        r3.Eu5(new FPD((Object) this, 45), true);
    }

    public final String getModuleName() {
        return "publisher_control_blocked_categories_compose_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 49), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public E2Q() {
        C51791G2a g2a = new C51791G2a(this, 40);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51791G2a(new C51791G2a(this, 37), 38));
        this.A02 = DbS.A0I(new C51791G2a(A002, 39), g2a, new MJ4(3, (Object) null, A002), DbS.A0z(C46773Dl0.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2061257748);
        E2Q.super.onCreate(bundle);
        ((C46329Dbx) this.A00.getValue()).A00.A04();
        AnonymousClass0fD.A09(1504840963, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-367181447);
        ComposeView A0H = DbV.A0H(this, new C59345JFx(this, 49), 268779033);
        AnonymousClass0fD.A09(-1464080572, A022);
        return A0H;
    }
}
