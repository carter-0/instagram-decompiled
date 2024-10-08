package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CUo  reason: case insensitive filesystem */
public abstract class C44071CUo {
    public static C61096Jx7 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            User user = null;
            ArrayList arrayList = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("access_token".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("sponsor".equals(A17)) {
                    user = C41845B3m.A0a(r9, false);
                } else if ("sponsors".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C41846B3n.A1E(r9, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r9.A0z();
            }
            if (str != null || !(r9 instanceof 0c9)) {
                return new C61096Jx7(user, str, arrayList);
            }
            AnonymousClass7TF.A1L("access_token", r9, "BCAdsBoostPostAccessToken");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
