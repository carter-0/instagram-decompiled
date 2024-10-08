package X;

import java.util.Set;

/* renamed from: X.Qnt  reason: case insensitive filesystem */
public final class C8313Qnt extends RLs {
    public final long A00;
    public final long A01 = 86400000;
    public final Set A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RLs)) {
                return false;
            }
            C8313Qnt qnt = (C8313Qnt) ((RLs) obj);
            if (!(this.A00 == qnt.A00 && this.A01 == qnt.A01 && this.A02.equals(qnt.A02))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return this.A02.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public C8313Qnt(Set set, long j) {
        this.A00 = j;
        this.A02 = set;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ConfigValue{delta=");
        A1A.append(this.A00);
        A1A.append(", maxAllowedDelay=");
        A1A.append(this.A01);
        A1A.append(", flags=");
        return C66582MXn.A0v(this.A02, A1A);
    }
}
