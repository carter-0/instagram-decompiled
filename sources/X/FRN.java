package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class FRN implements CallerContextable {
    public static final String __redex_internal_original_name = "NuxHelper";
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass0iw A02;

    public final void A00() {
        UserSession userSession = this.A01;
        userSession.A03(C49039EoJ.class);
        FBY.A00().A02();
        FRW frw = FRW.A04;
        if (frw == null) {
            frw = new FRW(userSession);
            FRW.A04 = frw;
        }
        frw.A01();
        C46413Dea.A08(this.A00.getActivity(), this.A02, userSession);
    }

    public final void A01() {
        Fragment fragment = this.A00;
        C309516Yo A0J = DbY.A0J(fragment.requireActivity(), this.A01);
        Bundle bundle = fragment.mArguments;
        C47490E4u e4u = new C47490E4u();
        e4u.setArguments(bundle);
        A0J.A0E(e4u);
        A0J.A0G = true;
        A0J.A04();
    }

    public FRN(Fragment fragment, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = r2;
    }
}
