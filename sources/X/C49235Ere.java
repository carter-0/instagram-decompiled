package X;

import com.google.gson.Gson;
import java.util.List;

/* renamed from: X.Ere  reason: case insensitive filesystem */
public abstract class C49235Ere {
    public static 1OC A00(0lg r3, String str, String str2, String str3, List list) {
        1NY A0N = DbU.A0N(r3);
        A0N.A0A("two_factor/check_trusted_notification_status/");
        A0N.A9m(AnonymousClass9NE.A01(52, 8, 53), str);
        A0N.A9m(AnonymousClass9NE.A01(0, 9, 119), str2);
        A0N.A0G(AnonymousClass9NE.A01(31, 21, 101), str3);
        if (list != null && !list.isEmpty()) {
            A0N.A9m("trusted_notification_polling_nonces", new Gson().A0B(list));
        }
        return DbT.A0S(A0N, CGF.class, D31.class);
    }
}
