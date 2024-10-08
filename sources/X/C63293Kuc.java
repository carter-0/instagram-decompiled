package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kuc  reason: case insensitive filesystem */
public abstract class C63293Kuc {
    public static final 1OC A00(UserSession userSession, C63640L1c l1c, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(l1c, str);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("igtv/channel/");
        A0a.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        A0a.A9m("max_id", str2);
        A0a.A0C("count", 10);
        if (!(str2 == null || str2.length() == 0)) {
            str4 = null;
        }
        A0a.A9m("start_at_media_id", str4);
        A0a.A0G("encoded_paging_token", str3);
        A0a.A0O((15p) null, C61292K1d.class, LJ4.class, false);
        Context context = l1c.A00;
        1G2.A00(context, A0a, userSession, new 1Cn(context), false);
        return A0a.A0M();
    }
}
