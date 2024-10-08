package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.EnB  reason: case insensitive filesystem */
public abstract class C48973EnB {
    public static void A00(Activity activity, Bundle bundle, AnonymousClass07i r7, AnonymousClass0iw r8, AnonymousClass0aP r9) {
        if (bundle != null && bundle.getString(AnonymousClass000.A00(3167), "").equalsIgnoreCase(AnonymousClass000.A00(1372))) {
            String string = bundle.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            String string2 = bundle.getString("token");
            1NY A0N = DbU.A0N(r9);
            A0N.A0A("accounts/post_force_logout_login/");
            A0N.A9m("uid", string);
            DbZ.A0y(activity, A0N, C66955Mfo.A01(), DbT.A0u(activity, A0N, "source", "post_force_logout_login_push"));
            A0N.A9m("token", string2);
            1OC A0K = Dbb.A0K(A0N, EM4.class, FCB.class);
            A0K.A00 = new EMH(activity, r8, r9);
            1ES.A00(activity, r7, A0K);
        }
    }
}
