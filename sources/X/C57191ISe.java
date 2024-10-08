package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ISe  reason: case insensitive filesystem */
public final class C57191ISe implements C252223ol {
    public String A00;
    public final UserSession A01;

    public final Integer BQo() {
        return AnonymousClass05K.A00;
    }

    public final String BjP() {
        1Xj A02;
        if (this.A00 == null || (A02 = 1E7.A00(this.A01).A02(this.A00)) == null) {
            return null;
        }
        return DbT.A0x(A02);
    }

    public final String getMediaId() {
        return this.A00;
    }

    public C57191ISe(UserSession userSession) {
        this.A01 = userSession;
    }
}
