package X;

import java.io.Serializable;

public final class Q41 implements Serializable {
    public final long A00;
    public final T9F A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q41) {
                Q41 q41 = (Q41) obj;
                if (this.A00 != q41.A00 || !0qQ.A0K(this.A01, q41.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C51968G9o.A03(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public Q41(T9F t9f, long j) {
        this.A00 = j;
        this.A01 = t9f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DiskCacheMetadata(responseCreatedTimestampMs=");
        A1A.append(this.A00);
        A1A.append(", resources=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
