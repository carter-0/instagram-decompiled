package X;

import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NxM  reason: case insensitive filesystem */
public abstract class C70106NxM {
    public static final String A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        JSONObject A11 = DbS.A11();
        try {
            0Tu r3 = 0Tu.A05;
            A11.put("experiment_0", 182.A06(r3, userSession, 36321816867776298L));
            A11.put("experiment_1", 182.A06(r3, userSession, 36321816867841835L));
            A11.put("experiment_2", 182.A06(r3, userSession, 36321816867907372L));
            A11.put("experiment_3", 182.A06(r3, userSession, 36321816867972909L));
            A11.put("experiment_4", 182.A06(r3, userSession, 36321816868038446L));
        } catch (JSONException e) {
            0wj r32 = 0wj.A01;
            String A00 = AnonymousClass000.A00(2336);
            0f9 AEf = r32.AEf(A00, 20134884);
            AEf.ABQ(A00, e.getMessage());
            AEf.report();
        }
        return DbT.A10(A11);
    }
}
