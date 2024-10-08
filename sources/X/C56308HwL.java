package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HwL  reason: case insensitive filesystem */
public abstract class C56308HwL {
    public static 1OC A00(UserSession userSession, Integer num, String str) {
        int i;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("language/translate/");
        A0O.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        switch (num.intValue()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        A0O.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.toString(i));
        A0O.A0H("can_support_carousel_mentions", AnonymousClass4CM.A00(userSession).A00());
        A0O.A0R(C54067Gyq.class, C56309HwM.class);
        return A0O.A0M();
    }

    public static 1OC A01(UserSession userSession, List list) {
        1NY A0O = DbU.A0O(userSession);
        A0O.A0A("language/bulk_translate/");
        A0O.A0H("can_support_carousel_mentions", AnonymousClass4CM.A00(userSession).A00());
        A0O.A0R(C54067Gyq.class, C56309HwM.class);
        if (!list.isEmpty()) {
            A0O.A9m("comment_ids", C239023El.A00(',').A02(list));
        }
        return A0O.A0M();
    }
}
