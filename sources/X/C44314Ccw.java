package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Ccw  reason: case insensitive filesystem */
public abstract class C44314Ccw {
    public static BGD parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            User user = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("repost_context".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("repost_fbid".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("repost_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("reposted_at".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r14);
                } else {
                    user = C41846B3n.A0a(r14, user, A17, "reposter");
                }
                r14.A0z();
            }
            if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("repost_fbid", r14, "RepostInfo");
            } else if (str3 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("repost_id", r14, "RepostInfo");
            } else if (l == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("reposted_at", r14, "RepostInfo");
            } else if (user != null || !(r14 instanceof 0c9)) {
                return new BGD(user, str, str2, str3, l.longValue());
            } else {
                AnonymousClass7TF.A1L("reposter", r14, "RepostInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
