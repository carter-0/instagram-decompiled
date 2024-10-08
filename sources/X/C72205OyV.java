package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.OyV  reason: case insensitive filesystem */
public final class C72205OyV implements AnonymousClass0lh, CallerContextable {
    public static final String __redex_internal_original_name = "FxIg4aStoryViewerAcUpsellLauncher";
    public final UserSession A00;

    public C72205OyV(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C72205OyV.class);
    }
}
