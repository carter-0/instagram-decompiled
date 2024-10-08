package X;

import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class Cm3 {
    public static DirectPendingLayeredXma parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            User user = null;
            ExtendedImageUrl extendedImageUrl = null;
            ExtendedImageUrl extendedImageUrl2 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if (C41845B3m.A1E(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if (C41845B3m.A1B(A17)) {
                    user = C41845B3m.A0a(r15, false);
                } else if ("allow_share_comment_to_story".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if ("preview_url".equals(A17)) {
                    extendedImageUrl = 16W.parseFromJson(r15);
                } else if ("favicon_url".equals(A17)) {
                    extendedImageUrl2 = 16W.parseFromJson(r15);
                } else {
                    bool2 = C41847B3o.A0z(r15, bool2, A17, "show_sucess_toast");
                }
                r15.A0z();
            }
            if (bool == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("allow_share_comment_to_story", r15, "DirectPendingLayeredXma");
            } else if (bool2 != null || !(r15 instanceof 0c9)) {
                return new DirectPendingLayeredXma(extendedImageUrl, extendedImageUrl2, user, str, str2, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("show_sucess_toast", r15, "DirectPendingLayeredXma");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
