package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import com.instagram.api.schemas.UserRelatedAccountsInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EdK  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48363EdK {
    public static Map A00(UserRelatedAccountsInfoDict userRelatedAccountsInfoDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (userRelatedAccountsInfoDict.AfD() != null) {
            UserBannerInlineOtherProfileDict AfD = userRelatedAccountsInfoDict.AfD();
            if (AfD != null) {
                treeUpdaterJNI = AfD.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("banner_inline_other_profile", treeUpdaterJNI);
        }
        if (userRelatedAccountsInfoDict.AfF() != null) {
            A1H.put("banner_subtitle", userRelatedAccountsInfoDict.AfF());
        }
        return 0Yt.A0B(A1H);
    }
}
