package X;

import com.instagram.registration.model.UserBirthDate;
import java.io.IOException;

/* renamed from: X.Epb  reason: case insensitive filesystem */
public abstract class C49112Epb {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    public static UserBirthDate parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("birth_year".equals(A17)) {
                    obj.A02 = r3.A1D();
                } else if ("birth_month".equals(A17)) {
                    obj.A01 = r3.A1D();
                } else if ("birth_day".equals(A17)) {
                    obj.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
