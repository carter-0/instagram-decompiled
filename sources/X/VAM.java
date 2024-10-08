package X;

import com.instagram.business.promote.model.AudienceInterest;
import java.io.IOException;

public abstract class VAM {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, com.instagram.business.promote.model.AudienceInterest] */
    public static AudienceInterest parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A00 = A0l;
                } else if (C41845B3m.A19(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    obj.A01 = A0l2;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
