package X;

import com.instagram.api.schemas.CollabFollowButtonInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4W {
    public static Map A00(CollabFollowButtonInfo collabFollowButtonInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (collabFollowButtonInfo.CYn() != null) {
            A1H.put("is_owner_in_author_exp", collabFollowButtonInfo.CYn());
        }
        if (collabFollowButtonInfo.BvQ() != null) {
            A1H.put("show_follow_button", collabFollowButtonInfo.BvQ());
        }
        return 0Yt.A0B(A1H);
    }
}
