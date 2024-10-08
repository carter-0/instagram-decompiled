package X;

import com.instagram.user.model.User;

/* renamed from: X.7bq  reason: invalid class name and case insensitive filesystem */
public final class C334767bq extends AnonymousClass0T0 implements C334127ai {
    public final User A00;
    public final String A01;

    public C334767bq(User user, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334767bq) {
                C334767bq r5 = (C334767bq) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }
}
