package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OJw  reason: case insensitive filesystem */
public final /* synthetic */ class C70750OJw {
    public final /* synthetic */ C71153OeR A00;

    public /* synthetic */ C70750OJw(C71153OeR oeR) {
        this.A00 = oeR;
    }

    public final void A00() {
        C71153OeR oeR = this.A00;
        C69004Ncg ncg = oeR.A0o;
        ncg.A01 = true;
        ncg.A04("enter_reachability_settings", (String) null);
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = oeR.A0h;
        AnonymousClass0Dg.A00(A0a, userSession);
        AnonymousClass0iw r0 = oeR.A0c;
        new C71109Ocn(r0, userSession, (String) null).A05(3, DbW.A1S(1, userSession, r0) ? 1 : 0);
        AnonymousClass4DH r02 = oeR.A0b;
        FragmentActivity activity = r02.getActivity();
        activity.getClass();
        Bundle requireArguments = r02.requireArguments();
        requireArguments.putSerializable("reachability_settings_upsell", C69453Nlx.UPSELL);
        DbY.A0u(activity, requireArguments, userSession, "direct_message_options");
    }
}
