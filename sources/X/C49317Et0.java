package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Et0  reason: case insensitive filesystem */
public abstract class C49317Et0 {
    public static String A00;
    public static String A01;
    public static String A02;
    public static String A03;

    public static void A00(Context context, 1P0 r6, 0lg r7, Integer num, String str, Map map) {
        0bH r0;
        String str2 = A01;
        if (str2 != null) {
            str = 002.A0S(str, str2, '/');
        }
        String str3 = A00;
        if (str3 != null) {
            str = 002.A0S(str, str3, '/');
        }
        if (r7 instanceof UserSession) {
            r0 = new 0bH((UserSession) r7);
        } else {
            r0 = 0aS.A00;
        }
        1NY r3 = new 1NY(r7);
        r3.A0A(str);
        r3.A0G("challenge_node_id", A03);
        r3.A08(num);
        r3.A0O(r0, EM1.class, F7N.class, false);
        if (map != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                r3.A9m(DbT.A13(A1J), DbS.A0s(A1J));
            }
        }
        String str4 = A02;
        if (str4 != null) {
            r3.A9m("challenge_context", str4);
        }
        DbZ.A0y(context, r3, C46476Dff.A02(0, 9, 117), 0qv.A00(context));
        if (num == AnonymousClass05K.A01) {
            r3.A0R = true;
        }
        1OC A0M = r3.A0M();
        A0M.A00 = r6;
        1ES.A03(A0M);
    }
}
