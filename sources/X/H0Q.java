package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0Q extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FanClubCreatorGuidanceFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public H0Q() {
        C51798G2h g2h = new C51798G2h(this, 29);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51798G2h(new C51798G2h(this, 26), 27));
        this.A01 = DbS.A0I(new C51798G2h(A002, 28), g2h, new C58187Inr(10, A002, (Object) null), DbS.A0z(C60093JfZ.class));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131962009);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1983484758);
        H0Q.super.onCreate(bundle);
        2YL A0H = DbS.A0H(this.A01);
        AnonymousClass7TE.A1Z(new C66182MGt((Object) A0H, (AnonymousClass4D7) null, 43), C318116oQ.A00(A0H));
        AnonymousClass0fD.A09(-1750637859, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-321520092);
        ComposeView A0H = DbV.A0H(this, JGK.A01(this, 30), 1312493628);
        AnonymousClass0fD.A09(-1351480502, A02);
        return A0H;
    }
}
