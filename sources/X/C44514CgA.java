package X;

import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CgA  reason: case insensitive filesystem */
public abstract class C44514CgA {
    public static TestimonialDictImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            User user = null;
            Long l = null;
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("author".equals(A17)) {
                    user = C41845B3m.A0a(r8, false);
                } else if ("created_at".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r8);
                } else if (AnonymousClass000.A00(697).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (C41845B3m.A1A(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new TestimonialDictImpl(user, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
