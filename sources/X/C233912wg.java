package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2wg  reason: invalid class name and case insensitive filesystem */
public final class C233912wg {
    public final UserSession A00;

    public static final String A00(C233912wg r5, List list) {
        StringBuilder sb = new StringBuilder();
        List<1Xg> A0h = 00k.A0h(list, 25);
        if (list.size() > A0h.size()) {
            sb.append("...");
        }
        for (1Xg r0 : A0h) {
            1Xj A02 = 1Xi.A02(r0.A05);
            if (A02 != null) {
                UserSession userSession = r5.A00;
                1Xv r02 = 1Xj.A0h;
                String A36 = A02.A36(userSession, false);
                if (A36 != null) {
                    sb.append(A36);
                    sb.append(",");
                }
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public C233912wg(UserSession userSession) {
        this.A00 = userSession;
    }
}
