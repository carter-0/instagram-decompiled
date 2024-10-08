package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.56E  reason: invalid class name */
public final class AnonymousClass56E extends 0vM {
    public final /* synthetic */ 2Dn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass56E(2Dn r7) {
        super("prefetchFriendsMapImage", 126519694, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        1q6 A002 = AnonymousClass3HE.A00();
        Context context = C60960kU.A00;
        0qQ.A07(context);
        UserSession userSession = this.A00.A02;
        A002.A03(context, userSession, AnonymousClass05K.A00, new AnonymousClass9LZ(userSession, 38), context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width));
    }
}
