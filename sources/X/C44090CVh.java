package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CVh  reason: case insensitive filesystem */
public abstract class C44090CVh {
    public static BEB parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            String str2 = null;
            User user = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("content_url".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("developer_app_logo_url".equals(A17)) {
                    simpleImageUrl = 16h.A00(r7);
                } else if (!"media_count".equals(A17)) {
                    user = C41846B3n.A0a(r7, user, A17, "profile");
                } else if (r7.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r7.A1P();
                }
                r7.A0z();
            }
            return new BEB(simpleImageUrl, user, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
