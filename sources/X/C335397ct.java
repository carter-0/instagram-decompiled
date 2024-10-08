package X;

import com.instagram.user.model.User;

/* renamed from: X.7ct  reason: invalid class name and case insensitive filesystem */
public final class C335397ct extends C335387cs {
    public final int A00;
    public final User A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335397ct) {
                C335397ct r5 = (C335397ct) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && 0qQ.A0K(this.A01, r5.A01) && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        return ((((i2 + i3) * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    public C335397ct(User user, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = user;
        this.A00 = i;
    }
}
