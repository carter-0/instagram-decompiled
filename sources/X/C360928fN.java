package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.8fN  reason: invalid class name and case insensitive filesystem */
public final class C360928fN implements AnonymousClass0lh {
    public String A00 = UUID.randomUUID().toString();
    public final Object A01 = new Object();
    public final UserSession A02;

    public final String A00() {
        String str;
        synchronized (this.A01) {
            str = this.A00;
            if (str == null) {
                str = UUID.randomUUID().toString();
                0qQ.A07(str);
            }
            this.A00 = str;
        }
        return str;
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C360928fN.class);
    }

    public C360928fN(UserSession userSession) {
        this.A02 = userSession;
    }
}
