package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6W7  reason: invalid class name */
public final class AnonymousClass6W7 implements AnonymousClass0lh {
    public final Map A00 = new LinkedHashMap();
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.A03(AnonymousClass6W7.class);
    }

    public AnonymousClass6W7(UserSession userSession) {
        this.A01 = userSession;
    }
}
