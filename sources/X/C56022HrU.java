package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HrU  reason: case insensitive filesystem */
public final class C56022HrU {
    public final UserSession A00;

    public C56022HrU(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final 1OC A00(String str) {
        1NY A0M = DbU.A0M(this.A00);
        A0M.A05();
        A0M.A02();
        String A11 = 002.A11("api/", "v1/", "creators/", "achievements/", "fetch_toast/");
        0qQ.A07(A11);
        A0M.A0E = A11;
        A0M.A0Q(C43796CDo.class, C45558CyW.class);
        return DbT.A0T(A0M, "media_id", str);
    }

    public final 1OC A01(String str, List list, List list2) {
        String A0k;
        String str2;
        1NY A0M = DbU.A0M(this.A00);
        A0M.A04();
        A0M.A02();
        String A11 = 002.A11("api/", "v1/", "creators/", "achievements/", "mark_toast_seen/");
        0qQ.A07(A11);
        A0M.A0E = A11;
        A0M.A0Q(CDE.class, C45589Cz1.class);
        A0M.A9m("media_id", str);
        if (list2 == null || !AnonymousClass7TE.A1b(list2)) {
            A0k = C51970G9q.A0k(list);
            str2 = "achievement_ids";
        } else {
            A0k = C51970G9q.A0k(list2);
            str2 = "challenge_ids";
        }
        return DbT.A0T(A0M, str2, A0k);
    }
}
