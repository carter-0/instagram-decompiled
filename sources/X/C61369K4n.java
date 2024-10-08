package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.K4n  reason: case insensitive filesystem */
public final class C61369K4n extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AggregatedWallFeedFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = "aggregated_wonder_wall_feed";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHK((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 27), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C61369K4n() {
        C58704IwD iwD = new C58704IwD(this, 16);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58704IwD(new C58704IwD(this, 17), 18));
        this.A00 = DbS.A0I(new C58704IwD(A002, 19), iwD, new MJ6(48, (Object) null, A002), DbS.A0z(C53046Ghe.class));
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952531);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1166161333);
        ComposeView A0H = DbV.A0H(this, new C59346JFy(this, 23), 1010132504);
        AnonymousClass0fD.A09(1428844452, A022);
        return A0H;
    }
}
