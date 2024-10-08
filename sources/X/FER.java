package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class FER {
    public static List A00;
    public static final FER A01 = new Object();

    public static final void A00(Context context, UserSession userSession, List list) {
        A00 = list;
        Context A05 = DbT.A05(context);
        List list2 = A00;
        String A02 = FH2.A02(A05);
        String A022 = DbT.A0P(userSession).A02(19f.A1W);
        String A0s = DbT.A0s(A05);
        JSONArray jSONArray = new JSONArray();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                DbT.A1W(it, jSONArray);
            }
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/process_contact_point_signals/");
        A0a.A9m(MYP.A01(0, 9, 86), A0s);
        DbW.A1G(A0a, jSONArray);
        A0a.A0G("phone_id", A022);
        A0a.A0G("sim_phone_number", A02);
        if (DbU.A1Z(userSession)) {
            A0a.A0N = true;
        }
        A0a.A0Q(1XP.class, 1XY.class);
        1OC A0K = DbW.A0K(A0a);
        C47696EDf.A01(A0K, userSession, 54);
        1ES.A03(A0K);
    }
}
