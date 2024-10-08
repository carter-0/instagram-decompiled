package X;

import com.instagram.api.schemas.ClipsMashupFollowButtonInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4s  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41874B4s {
    public static Map A00(ClipsMashupFollowButtonInfo clipsMashupFollowButtonInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (clipsMashupFollowButtonInfo.CYi() != null) {
            A1H.put("is_original_author_in_author_exp", clipsMashupFollowButtonInfo.CYi());
        }
        if (clipsMashupFollowButtonInfo.BvP() != null) {
            A1H.put("show_follow_bottom_sheet_button", clipsMashupFollowButtonInfo.BvP());
        }
        return 0Yt.A0B(A1H);
    }
}
