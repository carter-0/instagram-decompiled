package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GSl  reason: case insensitive filesystem */
public final class C52433GSl {
    public static final C52433GSl A00 = new Object();

    public final ArrayList A01(UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        List Ama = user.A03.Ama();
        if (Ama != null) {
            return A00(userSession, Ama);
        }
        return AnonymousClass7TE.A1C();
    }

    public static final ArrayList A00(UserSession userSession, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            FollowStatus A0N = AnonymousClass2f1.A00(userSession).A0N(user);
            if (A0N == FollowStatus.A08) {
                A0N = FollowStatus.A06;
                user.A0n(A0N);
            }
            if (A0N == FollowStatus.A06) {
                A1C.add(user);
            }
        }
        return A1C;
    }
}
