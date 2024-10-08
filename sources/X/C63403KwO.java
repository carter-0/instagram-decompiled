package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.KwO  reason: case insensitive filesystem */
public abstract class C63403KwO {
    public static final void A00(Context context, AnonymousClass0iw r12, UserSession userSession, C270184gK r14, Reel reel) {
        String str;
        C18069Vkw A00 = C49089EpE.A00(userSession);
        AnonymousClass3Q2 r4 = r14.A00;
        0qQ.A07(r4);
        1ua A0n = JTO.A0n(context, userSession);
        if (182.A06(0Tu.A06, userSession, 36318943534848774L)) {
            str = "user_action_user_initiated_story_upload_cancel";
        } else {
            str = null;
        }
        AnonymousClass0iw r6 = r12;
        if (r4.A4w) {
            if (reel == null) {
                0wb.A03("ReelOptimisticStateDeletionHelper#deleteOptimisticState", "Param reel is null for deletion of multiconfig pending media upload.");
            }
            C64459LcJ lcJ = C64459LcJ.A00;
            0qQ.A0B(lcJ, 0);
            synchronized (r4.A6H) {
                r4.A0T(lcJ, 1us.class);
            }
            if (!r4.A0s()) {
                A0n.A06(r6, r4.A35, str, false, false, false);
            }
            28K.A00(userSession).A0A();
        } else {
            A0n.A06(r6, r4.A35, str, false, true, false);
        }
        A00.A01.flowEndSuccess(A00.A00);
    }
}
