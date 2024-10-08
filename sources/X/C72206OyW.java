package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.OyW  reason: case insensitive filesystem */
public final class C72206OyW implements AnonymousClass0lh, CallerContextable {
    public static final String __redex_internal_original_name = "FxAvatarsEditorUpsellHelper";
    public final UserSession A00;

    public C72206OyW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A06, userSession, 2342157563291765419L) || !2Lv.A00(userSession).A03(CallerContext.A00(C72206OyW.class), "ig_avatar_editor_upsell")) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C72206OyW.class);
    }
}
