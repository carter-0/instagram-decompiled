package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8bx  reason: invalid class name and case insensitive filesystem */
public final class C359068bx {
    public final UserSession A00;
    public final 1ua A01;
    public final User A02;
    public final Map A03 = new LinkedHashMap();
    public final AnonymousClass2Zd A04;

    public C359068bx(UserSession userSession, 1ua r3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = 0eE.A00(userSession).A00();
        C359078by r0 = new C359078by(this);
        this.A04 = r0;
        r3.A0J(r0);
    }
}
