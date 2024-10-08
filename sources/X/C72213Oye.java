package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Oye  reason: case insensitive filesystem */
public final class C72213Oye implements 0lm {
    public final List A00 = AnonymousClass7TE.A1C();
    public final Context A01;
    public final UserSession A02;
    public final OCE A03;
    public final List A04 = AnonymousClass7TE.A1C();

    public final synchronized void onUserSessionWillEnd(boolean z) {
        this.A04.clear();
        this.A00.clear();
        if (z) {
            OCE oce = this.A03;
            oce.A00.A04(oce.A01);
        }
    }

    public C72213Oye(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = new OCE(002.A0R("direct_story_recipients_", userSession.A06));
    }
}
