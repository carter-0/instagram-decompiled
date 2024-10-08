package X;

import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CoN  reason: case insensitive filesystem */
public abstract class C44984CoN {
    public static C42137BIs parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            User user = null;
            FriendshipStatus friendshipStatus = null;
            Integer num2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("seen".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("ts".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (C41845B3m.A1B(A17)) {
                    user = C41845B3m.A0a(r9, false);
                } else if ("viewer_relationship_info".equals(A17)) {
                    friendshipStatus = 1c0.parseFromJson(r9);
                } else if ("vote".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r9);
                }
                r9.A0z();
            }
            return new C42137BIs(friendshipStatus, user, bool, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
