package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GFi  reason: case insensitive filesystem */
public abstract class C52114GFi {
    public static final boolean A01(SocialContextType socialContextType, UserSession userSession) {
        0qQ.A0B(socialContextType, 1);
        int ordinal = socialContextType.ordinal();
        if (ordinal == 9) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36329680952901881L) || 182.A06(r2, userSession, 36329680953164027L)) {
                return true;
            }
            return false;
        } else if (ordinal != 3) {
            return false;
        } else {
            return 182.A06(0Tu.A05, userSession, 36329680952967418L);
        }
    }

    public static final boolean A05(UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        if (z || z2) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36322834775615981L) || 182.A06(r2, userSession, 36322834776140276L) || 182.A06(r2, userSession, 36326137605731887L)) {
            return true;
        }
        return false;
    }

    public static final List A00() {
        return 0sr.A1P(new String[]{"ig_android_clips_friendly_viewer.floaty_bubble_diameter", "ig_android_clips_friendly_viewer.hype_style_comment_bubble_enabled", "ig_android_clips_friendly_viewer.is_comment_preview_style_enabled", "ig_android_clips_friendly_viewer.is_floaty_comments_enabled", "ig_android_clips_friendly_viewer.is_floaty_likes_enabled", "ig_android_clips_friendly_viewer.preview_comments_disabled", "ig_android_clips_friendly_viewer.preview_comments_enabled_with_likes", "ig_android_clips_friendly_viewer.should_hide_attribution_hub", "ig_android_clips_friendly_viewer.should_hide_social_context_when_bubbles_showing", "ig_android_clips_friendly_viewer.show_only_high_value_bubbles", "ig_android_clips_friendly_viewer.is_bubble_positioned_under_caption"});
    }

    public static final boolean A02(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36329680952901881L) || 182.A06(r2, userSession, 36329680953164027L) || 182.A06(r2, userSession, 36329680952967418L)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        return 0qQ.A0K(182.A04(AnonymousClass7TF.A0H(userSession), userSession, 36892630906438588L), "below_caption");
    }

    public static final boolean A04(UserSession userSession) {
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        if (182.A06(A0H, userSession, 36322834775812591L) || 182.A06(A0H, userSession, 36326137605797424L)) {
            return true;
        }
        return false;
    }
}
