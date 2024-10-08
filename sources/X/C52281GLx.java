package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.GLx  reason: case insensitive filesystem */
public final class C52281GLx implements AnonymousClass0lh {
    public final UserSession A00;
    public final Map A01 = Collections.synchronizedMap(AnonymousClass7TE.A1E());

    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C52281GLx(UserSession userSession) {
        this.A00 = userSession;
    }
}
