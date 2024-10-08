package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CeI  reason: case insensitive filesystem */
public abstract class C44398CeI {
    public static C42091BGu parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            User user = null;
            C42136BIr bIr = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("amount_raised".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("charity".equals(A17)) {
                    user = C41845B3m.A0a(r8, false);
                } else if ("donations".equals(A17)) {
                    bIr = C44977CoG.parseFromJson(r8);
                } else if ("fundraiser_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new C42091BGu(bIr, user, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
