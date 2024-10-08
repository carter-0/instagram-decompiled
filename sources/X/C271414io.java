package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4io  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C271414io implements C635813i {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xj A01;

    public /* synthetic */ C271414io(UserSession userSession, 1Xj r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final Object get() {
        User A2A = this.A01.A2A(this.A00);
        if (A2A != null) {
            return A2A.getId();
        }
        return null;
    }
}
