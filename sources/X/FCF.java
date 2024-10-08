package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public abstract class FCF {
    public static final void A00(AnonymousClass0iw r0, UserSession userSession, String str) {
        0xI A00 = 0xI.A00(r0, str);
        if (userSession != null) {
            DbU.A1R(A00, userSession);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(AnonymousClass0iw r2, UserSession userSession, String str) {
        0xI A00 = 0xI.A00(r2, str);
        A00.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "is_all");
        if (userSession != null) {
            DbU.A1R(A00, userSession);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(AnonymousClass0iw r2, UserSession userSession, String str, String str2, boolean z) {
        0xI A00 = 0xI.A00(r2, str);
        A00.A09("sso_enabled", Boolean.valueOf(z));
        A00.A0C(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        A00.A0C("app_device_id", DbV.A0t());
        if (userSession != null) {
            DbU.A1R(A00, userSession);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
