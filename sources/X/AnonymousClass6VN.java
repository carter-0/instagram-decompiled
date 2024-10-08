package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6VN  reason: invalid class name */
public abstract class AnonymousClass6VN {
    public static final C233392ve A00(Context context, UserSession userSession, C270414gh r7, ReelViewerFragment reelViewerFragment) {
        C233392ve r2;
        UserSession userSession2 = userSession;
        boolean booleanValue = AnonymousClass1P8.A00(userSession).booleanValue();
        Context context2 = context;
        C270414gh r5 = r7;
        ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
        if (booleanValue) {
            0Tu r22 = 0Tu.A05;
            if (182.A06(r22, userSession2, 36323779668815332L)) {
                r2 = new C57331IXo(context2, userSession2, r5, reelViewerFragment2, 182.A06(r22, userSession2, 36310542582808744L), 182.A06(r22, userSession2, 36317483245966512L));
                return r2;
            }
        }
        0Tu r23 = 0Tu.A05;
        r2 = new AnonymousClass6VO(context2, userSession2, r5, reelViewerFragment2, 182.A06(r23, userSession2, 36310542582808744L), 182.A06(r23, userSession2, 36317483245966512L));
        return r2;
    }
}
