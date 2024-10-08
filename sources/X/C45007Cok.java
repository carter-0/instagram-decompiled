package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Cok  reason: case insensitive filesystem */
public abstract class C45007Cok {
    public static C42140BIv parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            User user = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("image_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("template_author".equals(A17)) {
                    user = C41845B3m.A0a(r10, false);
                } else if ("template_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_url", r10, "TemplateInfoImpl");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new C42140BIv(user, str, str2);
            } else {
                AnonymousClass7TF.A1L("template_id", r10, "TemplateInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
