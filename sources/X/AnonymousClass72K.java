package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.72K  reason: invalid class name */
public abstract class AnonymousClass72K {
    public static final void A00(UserSession userSession, String str, String str2, int i) {
        String str3;
        0qQ.A0B(userSession, 0);
        if (00p.A0j(str, str2, false) || str == null || 00y.A0n(10, str) == null) {
            str = null;
        }
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A01);
        r2.A0A("fbsearch/register_recent_search_click/");
        if (i == 0) {
            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        } else if (i == 1) {
            str3 = "hashtag";
        } else if (i == 2) {
            str3 = "place";
        } else if (i == 4) {
            str3 = "keyword";
        } else if (i == 13) {
            str3 = AnonymousClass000.A00(978);
        } else if (i == 7) {
            str3 = MediaStreamTrack.AUDIO_TRACK_KIND;
        } else if (i != 8) {
            str3 = null;
            0wb.A03("RegisterRecentStoreApi", 002.A0O("Unexpected type: ", i));
        } else {
            str3 = "echo";
        }
        r2.A9m("entity_type", str3);
        r2.A0G("entity_id", str);
        r2.A0G("entity_name", str2);
        r2.A0O((15p) null, 1XP.class, 1XY.class, false);
        1ES.A03(r2.A0M());
    }
}
