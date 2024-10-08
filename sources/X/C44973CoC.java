package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CoC  reason: case insensitive filesystem */
public abstract class C44973CoC {
    public static C42134BIp parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            User user = null;
            String str = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("charity_user".equals(A17)) {
                    user = C41845B3m.A0a(r9, false);
                } else if ("prompt_title".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (user == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("charity_user", r9, "DonationsPromptInfoModel");
            } else if (str != null || !(r9 instanceof 0c9)) {
                return new C42134BIp(user, str);
            } else {
                AnonymousClass7TF.A1L("prompt_title", r9, "DonationsPromptInfoModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
