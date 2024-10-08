package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ro  reason: invalid class name and case insensitive filesystem */
public final class C231522ro {
    public final UserSession A00;
    public final 11S A01 = new 11S("^[a-zA-Z, _]*$");
    public final 11S A02 = new 11S("^'\\s*'$");
    public final boolean A03;

    public /* synthetic */ C231522ro(UserSession userSession) {
        boolean A06 = 182.A06(0Tu.A05, userSession, 36323393121954945L);
        this.A00 = userSession;
        this.A03 = A06;
    }

    public static final C231572rt A00(C231522ro r3, String str, String str2) {
        String obj = 00l.A0B(str).toString();
        if (00l.A0W(obj) || r3.A02.A08(obj)) {
            return null;
        }
        if (r3.A03 && !r3.A01.A08(obj)) {
            0qQ.A0B(str2, 2);
            throw new RuntimeException(002.A0v("Invalid Litho Feed Eligibility: ", str, " [", str2, ']'));
        } else if (0qQ.A0K(obj, "all")) {
            return C231582ru.A00;
        } else {
            if (0qQ.A0K(obj, "main")) {
                return C231562rs.A00;
            }
            List<String> A0R = 00l.A0R(obj, new String[]{","}, 0);
            ArrayList arrayList = new ArrayList(0Yv.A1E(A0R, 10));
            for (String A0B : A0R) {
                arrayList.add(00l.A0B(A0B).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (!00l.A0W((String) next)) {
                    arrayList2.add(next);
                }
            }
            return new C232592tz(00k.A0k(arrayList2));
        }
    }
}
