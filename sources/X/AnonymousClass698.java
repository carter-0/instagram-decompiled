package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.698  reason: invalid class name */
public abstract class AnonymousClass698 {
    public static final List A00(UserSession userSession, AnonymousClass2HN r8) {
        ArrayList A1L = 0sr.A1L(new Integer[]{16, 27, 44, 202, 95});
        if (!182.A06(0Tu.A05, userSession, 36322851954895397L)) {
            A1L.add(106);
        }
        if (((Boolean) r8.A0v.get()).booleanValue()) {
            A1L.add(1);
        }
        if (((Boolean) r8.A0M.get()).booleanValue()) {
            A1L.add(2);
        }
        if (r8.A05() || r8.A04() || r8.A06()) {
            A1L.add(6);
        }
        if (AnonymousClass65D.A00(userSession).A00()) {
            A1L.add(108);
            A1L.add(198);
        }
        if (((Boolean) r8.A0o.A00()).booleanValue()) {
            A1L.add(28);
        }
        A1L.add(89);
        if (AnonymousClass2HN.A00()) {
            A1L.add(197);
        }
        return 00k.A0a(A1L);
    }
}
