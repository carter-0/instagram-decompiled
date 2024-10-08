package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0G extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CreatorAISettingsComposableFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final String A07 = "creator_ai_settings_fragment_compose";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 21), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public H0G() {
        0eO r4 = 0eO.A02;
        this.A02 = C51804G2n.A01(this, "creator_ai_entry_point_extra", r4, 0);
        this.A01 = C51804G2n.A01(this, "creator_ai_creator_igid", r4, 1);
        this.A05 = AnonymousClass0eN.A00(r4, new C58719IwS(false, this, "creator_ai_should_open_audience_management", 46));
        C58706IwF A012 = C58706IwF.A01(this, 20);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, C58706IwF.A01(C58706IwF.A01(this, 17), 18));
        this.A06 = DbS.A0I(C58706IwF.A01(A002, 19), A012, new C58689Ivy(39, A002, (Object) null), DbS.A0z(C53030GhL.class));
        this.A00 = AnonymousClass1YB.A00(C58706IwF.A01(this, 12));
        this.A03 = AnonymousClass1YB.A00(C58706IwF.A01(this, 16));
    }

    public static final void A00(H0G h0g) {
        C53030GhL A0Y = G9w.A0Y(h0g);
        String string = DbV.A05(h0g).getString(2131956974);
        String A0d = AnonymousClass7TF.A0d(Dbb.A09(h0g, string), 2131956981);
        A0Y.A09.Epw(new Gq8(string));
        AnonymousClass7TE.A1Z(new MFW(A0Y, A0d, (AnonymousClass4D7) null, 15), C318116oQ.A00(A0Y));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1817577234);
        H0G.super.onCreate(bundle);
        if (AnonymousClass7TF.A1Z(this.A05)) {
            G9w.A0Y(this).A04 = true;
        }
        AnonymousClass0fD.A09(1614304515, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1312074657);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 49), -1774697453);
        AnonymousClass0fD.A09(1305706838, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(761606394);
        super.onResume();
        G9w.A0Y(this).A00(DbX.A07(this.A03));
        AnonymousClass0fD.A09(1851999279, A022);
    }
}
