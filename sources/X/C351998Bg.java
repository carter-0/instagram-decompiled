package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Bg  reason: invalid class name and case insensitive filesystem */
public final class C351998Bg implements CallerContextable {
    public static final String __redex_internal_original_name = "StoryShareToFBCloseFriendsController";
    public final UserSession A00;

    public final void A00() {
        if (2D5.A00(this.A00).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", false)) {
            CallerContext callerContext = AnonymousClass8PU.A00;
        }
    }

    public C351998Bg(UserSession userSession) {
        this.A00 = userSession;
    }
}
