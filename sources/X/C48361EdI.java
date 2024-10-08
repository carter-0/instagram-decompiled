package X;

import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EdI  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48361EdI {
    public static Map A00(UserBannerInlineOtherProfileDict userBannerInlineOtherProfileDict) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (userBannerInlineOtherProfileDict.AXs() != null) {
            A1H.put("account_id", userBannerInlineOtherProfileDict.AXs());
        }
        if (userBannerInlineOtherProfileDict.AXw() != null) {
            A1H.put("account_title", userBannerInlineOtherProfileDict.AXw());
        }
        if (userBannerInlineOtherProfileDict.AXx() != null) {
            IgUserRelatedAccountTypeEnum AXx = userBannerInlineOtherProfileDict.AXx();
            if (AXx != null) {
                str = AXx.A00;
            } else {
                str = null;
            }
            A1H.put("account_type", str);
        }
        return 0Yt.A0B(A1H);
    }
}
