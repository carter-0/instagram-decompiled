package X;

import com.instagram.user.model.User;

/* renamed from: X.7bp  reason: invalid class name and case insensitive filesystem */
public final class C334757bp extends AnonymousClass0T0 implements C334127ai {
    public final User A00;
    public final C62320sa A01;
    public final C62320sa A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334757bp) {
                C334757bp r5 = (C334757bp) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public C334757bp(User user, String str, C62320sa r3, C62320sa r4) {
        this.A03 = str;
        this.A00 = user;
        this.A01 = r3;
        this.A02 = r4;
    }
}
