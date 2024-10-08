package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.5gJ  reason: invalid class name and case insensitive filesystem */
public final class C290975gJ {
    public final 02m A00 = 02m.A0p;

    public C290975gJ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
    }

    public final void A00(int i, String str, String str2, int i2) {
        0qQ.A0B(str, 1);
        02m r1 = this.A00;
        r1.markerAnnotate(i, "ranking_request_id", str);
        r1.markerAnnotate(i, "banyan_view", str2);
        r1.markerAnnotate(i, "num_ranking_recommendations", i2);
        r1.markerEnd(i, 467);
    }

    public final void A01(String str, Map map, String[] strArr, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(strArr, 1);
        02m r5 = this.A00;
        r5.markerAnnotate(77008831, "ranking_request_id", str);
        r5.markerAnnotate(77008831, "requested_ranking_views", strArr);
        for (String str2 : map.keySet()) {
            Number number = (Number) map.get(str2);
            if (number != null) {
                r5.markerAnnotate(77008831, 002.A0R("num_ranking_recommendations ", str2), number.intValue());
            }
        }
        short s = 467;
        if (z) {
            s = 3;
        }
        r5.markerEnd(77008831, s);
    }
}
