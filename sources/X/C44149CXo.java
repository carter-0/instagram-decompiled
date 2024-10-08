package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CXo  reason: case insensitive filesystem */
public abstract class C44149CXo {
    public static UMz parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            UMv uMv = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            User user = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("custom_profile_pic_url".equals(A17)) {
                    uMv = CX2.parseFromJson(r9);
                } else if ("following".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("incoming_request".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r9);
                } else if ("outgoing_request".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r9);
                } else if (!"social_context".equals(A17)) {
                    user = C41846B3n.A0a(r9, user, A17, "user_info");
                } else if (r9.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r9.A1P();
                }
                r9.A0z();
            }
            return new UMz(uMv, user, bool, bool2, bool3, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
