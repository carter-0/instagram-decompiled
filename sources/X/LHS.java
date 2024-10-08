package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public abstract class LHS {
    public static final void A00(UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "avatar_tooltip_impression");
        if (A0e.isSampled()) {
            DbV.A1L(A0e, AnonymousClass7TF.A0w(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str));
        }
    }

    public static final void A01(UserSession userSession, String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "avatar_mentions_bottom_sheet_action");
        if (A0e.isSampled()) {
            DbV.A1L(A0e, DbY.A0p("is_story_author", String.valueOf(z), AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str)));
        }
    }
}
