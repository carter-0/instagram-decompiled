package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CVy  reason: case insensitive filesystem */
public abstract class C44107CVy {
    public static C61081JwJ parseFromJson(16F r9) {
        String A00;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            User user = null;
            String str = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(753);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if ("actor".equals(A17)) {
                    user = C41845B3m.A0a(r9, false);
                } else if (A00.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (user == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("actor", r9, "CollectionItemReactionDetails");
            } else if (str != null || !(r9 instanceof 0c9)) {
                return new C61081JwJ(user, str, 9);
            } else {
                AnonymousClass7TF.A1L(A00, r9, "CollectionItemReactionDetails");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
