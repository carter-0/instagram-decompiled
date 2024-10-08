package X;

import com.instagram.user.model.User;

/* renamed from: X.Jxl  reason: case insensitive filesystem */
public final class C61135Jxl extends AnonymousClass0T0 implements C66382MPo {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61135Jxl) {
                C61135Jxl jxl = (C61135Jxl) obj;
                if (!0qQ.A0K(this.A00, jxl.A00) || !0qQ.A0K(this.A01, jxl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C61135Jxl(User user, String str) {
        this.A00 = user;
        this.A01 = str;
    }
}
