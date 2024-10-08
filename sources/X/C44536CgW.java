package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CgW  reason: case insensitive filesystem */
public abstract class C44536CgW {
    public static BI0 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            User user = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "target_user")) {
                    user = C41845B3m.A0a(r6, false);
                }
                r6.A0z();
            }
            if (user != null || !(r6 instanceof 0c9)) {
                return new BI0(user);
            }
            AnonymousClass7TF.A1L("target_user", r6, "ThreadHeaderContextFollowInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
