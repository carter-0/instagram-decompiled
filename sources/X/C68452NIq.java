package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.NIq  reason: case insensitive filesystem */
public final class C68452NIq extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SecurityAlertSettingFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131972957));
    }

    public final String getModuleName() {
        return "security_alert_setting";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 2), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C68452NIq() {
        C73913Plo A002 = C73913Plo.A00(this, 31);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73913Plo.A00(C73913Plo.A00(this, 28), 29));
        this.A01 = DbS.A0I(C73913Plo.A00(A003, 30), A002, new C73667Phg(22, (Object) null, A003), DbS.A0z(C67744Mtx.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2028002014);
        ComposeView A0H = DbV.A0H(this, new JGK(this, 3), -320659840);
        AnonymousClass0fD.A09(-319848882, A02);
        return A0H;
    }
}
