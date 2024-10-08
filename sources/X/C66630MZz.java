package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;

/* renamed from: X.MZz  reason: case insensitive filesystem */
public abstract class C66630MZz {
    public static final 0bY A00 = DbW.A0G();

    public static final boolean A03(AnonymousClass5HJ r3, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!LockedChatKillSwitch.isLockedChatEnabled(userSession, false) || r3.A02 != 1) {
            return false;
        }
        return true;
    }

    public static final String A00(Uri uri) {
        String queryParameter = uri.getQueryParameter("x");
        if (queryParameter == null) {
            return uri.getQueryParameter("dx");
        }
        return queryParameter;
    }

    public static final String A01(Uri uri) {
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter == null) {
            return uri.getQueryParameter("did");
        }
        return queryParameter;
    }

    public static final String A02(AnonymousClass5HJ r2) {
        Uri A01 = 0cp.A01(A00, 002.A0R("ig://", r2.A0g));
        if (A01 == null) {
            return null;
        }
        return A00(A01);
    }
}
