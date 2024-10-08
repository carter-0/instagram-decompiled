package X;

/* renamed from: X.Qno  reason: case insensitive filesystem */
public final class C8308Qno extends RLq {
    public final long A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof RLq) && this.A00 == ((C8308Qno) ((RLq) obj)).A00;
        }
        return true;
    }

    public final int hashCode() {
        return 1000003 ^ C51968G9o.A03(this.A00);
    }

    public final String toString() {
        return 002.A0e("LogResponse{nextRequestWaitMillis=", "}", this.A00);
    }

    public C8308Qno(long j) {
        this.A00 = j;
    }
}
