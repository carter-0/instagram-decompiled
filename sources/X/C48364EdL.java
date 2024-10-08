package X;

import com.instagram.api.schemas.UserBannerInlineOtherProfileDictImpl;
import com.instagram.api.schemas.UserRelatedAccountsInfoDictImpl;
import java.io.IOException;

/* renamed from: X.EdL  reason: case insensitive filesystem */
public abstract class C48364EdL {
    public static UserRelatedAccountsInfoDictImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            UserBannerInlineOtherProfileDictImpl userBannerInlineOtherProfileDictImpl = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("banner_inline_other_profile".equals(A17)) {
                    userBannerInlineOtherProfileDictImpl = C48362EdJ.parseFromJson(r5);
                } else if ("banner_subtitle".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new UserRelatedAccountsInfoDictImpl(userBannerInlineOtherProfileDictImpl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
