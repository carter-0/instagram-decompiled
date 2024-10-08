package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4GR  reason: invalid class name */
public final class AnonymousClass4GR implements AnonymousClass4GS {
    public final UserSession A00;
    public final AnonymousClass3W1 A01;
    public final String A02;

    public AnonymousClass4GR(UserSession userSession, AnonymousClass3W1 r3, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r3, 3);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r3;
    }

    public final String All() {
        1Xj A1c;
        1Xj A022 = 1E7.A00(this.A00).A02(this.A02);
        if (A022 == null || (A1c = A022.A1c(this.A01.A03)) == null) {
            return null;
        }
        return A1c.getId();
    }

    public final Integer Als() {
        return Integer.valueOf(this.A01.A03);
    }
}
