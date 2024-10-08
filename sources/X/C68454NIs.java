package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.NIs  reason: case insensitive filesystem */
public final class C68454NIs extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "KeyAlertDetailFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;
    public final String A02 = "key_alert_detail";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131952875);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 1), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C68454NIs() {
        C73913Plo A002 = C73913Plo.A00(this, 25);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73913Plo.A00(C73913Plo.A00(this, 22), 23));
        this.A01 = DbS.A0I(C73913Plo.A00(A003, 24), A002, new C73667Phg(21, (Object) null, A003), DbS.A0z(Object.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-910248614);
        ComposeView A002 = GTX.A00(this, AnonymousClass5PI.A04(new JGK(this, 1), 529767740, true));
        AnonymousClass0fD.A09(-1411922414, A022);
        return A002;
    }
}
