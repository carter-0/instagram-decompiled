package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class OUm {
    public static final OUm A00 = new Object();
    public static final Set A01 = 0sc.A07(new String[]{"direct_v2_text", "direct_v2_clips_share", "direct_v2_user_reaction", "direct_v2_media", "direct_v2_media_share", "direct_v2_raven", "direct_v2_reel_share", "direct_v2_reel_mention", "direct_v2_reel_reaction", "direct_v2_story_share"});

    public final boolean A00(UserSession userSession, String str) {
        if ((!A01.contains(str) || !182.A06(0Tu.A05, userSession, 36320360874451302L)) && !AnonymousClass5HM.A01.contains(str) && !"direct_v2_highlights_share".equals(str) && !182.A06(0Tu.A05, userSession, 36320360873992544L)) {
            return false;
        }
        return true;
    }
}
