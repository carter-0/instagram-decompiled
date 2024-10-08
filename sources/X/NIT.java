package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class NIT extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SecurityAlertFeedFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "security_alert_feed";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHI(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public NIT() {
        C73913Plo A002 = C73913Plo.A00(this, 21);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73913Plo.A00(C73913Plo.A00(this, 18), 19));
        this.A01 = DbS.A0I(C73913Plo.A00(A003, 20), A002, new C73667Phg(19, (Object) null, A003), DbS.A0z(C60091JfX.class));
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(901489495);
        NIT.super.onCreate(bundle);
        2YL A0H = DbS.A0H(this.A01);
        AnonymousClass7TE.A1Z(new C66182MGt((Object) A0H, (AnonymousClass4D7) null, 25), C318116oQ.A00(A0H));
        AnonymousClass0fD.A09(-1323414941, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(535882468);
        View view = new View(requireContext());
        AnonymousClass0fD.A09(2028247823, A02);
        return view;
    }
}
