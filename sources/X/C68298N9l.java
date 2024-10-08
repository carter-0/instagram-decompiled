package X;

/* renamed from: X.N9l  reason: case insensitive filesystem */
public final class C68298N9l extends AnonymousClass0T0 implements C74272Ps0 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68298N9l) {
                C68298N9l n9l = (C68298N9l) obj;
                if (this.A01 != n9l.A01 || !0qQ.A0K(this.A00, n9l.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A01) + AnonymousClass7TG.A0E(this.A00);
    }

    public C68298N9l(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
