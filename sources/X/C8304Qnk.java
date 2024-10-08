package X;

import java.util.List;

/* renamed from: X.Qnk  reason: case insensitive filesystem */
public final class C8304Qnk extends C9683Rf1 {
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9683Rf1) {
            return this.A00.equals(((C8304Qnk) ((C9683Rf1) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public C8304Qnk(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BatchedLogRequest{logRequests=");
        return C66582MXn.A0v(this.A00, A1A);
    }
}
