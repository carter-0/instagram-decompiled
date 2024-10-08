package X;

import com.instagram.api.schemas.OriginalityFollowButtonInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CbC {
    public static Map A00(OriginalityFollowButtonInfo originalityFollowButtonInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (originalityFollowButtonInfo.CYi() != null) {
            A1H.put("is_original_author_in_author_exp", originalityFollowButtonInfo.CYi());
        }
        if (originalityFollowButtonInfo.BvP() != null) {
            A1H.put("show_follow_bottom_sheet_button", originalityFollowButtonInfo.BvP());
        }
        return 0Yt.A0B(A1H);
    }
}
