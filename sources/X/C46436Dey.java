package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Dey  reason: case insensitive filesystem */
public abstract class C46436Dey {
    public static final void A00(UserSession userSession, Integer num, String str, Throwable th) {
        String str2;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 2);
        Map A0w = AnonymousClass7TF.A0w(DialogModule.KEY_MESSAGE, str);
        switch (num.intValue()) {
            case 1:
                str2 = "promotion_id_null";
                break;
            case 2:
                str2 = "promotion_id_error";
                break;
            case 3:
                str2 = "parse_error";
                break;
            case 4:
                str2 = "action_handler_error";
                break;
            case 5:
                str2 = "unexpected_value";
                break;
            case 6:
                str2 = "unexpected_request";
                break;
            case 7:
                str2 = "fragment_pr_activity_null";
                break;
            case 8:
                str2 = "error";
                break;
            case 9:
                str2 = "qp_gql_fetcher";
                break;
            default:
                str2 = "qp_fetcher";
                break;
        }
        0kD.A0J(str2, th, A0w, 817901676);
    }
}
