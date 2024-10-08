package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class FNC implements View.OnClickListener {
    public final /* synthetic */ C323366xN A00;
    public final /* synthetic */ String A01;

    public FNC(C323366xN r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1800536724);
        C323366xN r6 = this.A00;
        UserSession userSession = r6.A0E;
        if (182.A06(0Tu.A06, userSession, 36312363645207610L)) {
            AnonymousClass4DH r0 = r6.A0D;
            AnonymousClass7TF.A1H(userSession, r0);
            F79.A01(r0.getActivity(), userSession, (String) null, false);
        } else {
            F79.A00(r6.A0D, userSession, "profile", this.A01, false);
        }
        r6.A0I.A10("nav_bar", C273654mx.A00(984));
        AnonymousClass0fD.A0C(677313537, A05);
    }
}
