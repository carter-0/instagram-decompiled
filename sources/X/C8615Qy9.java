package X;

/* renamed from: X.Qy9  reason: case insensitive filesystem */
public final class C8615Qy9 extends RPY {
    public final long A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof RPY) && this.A00 == ((C8615Qy9) ((RPY) obj)).A00);
    }

    public final int hashCode() {
        return -724379968 ^ C51968G9o.A03(this.A00);
    }

    public final String toString() {
        return 002.A0e("EventRecord{eventType=3, eventTimestamp=", "}", this.A00);
    }

    public C8615Qy9(long j) {
        this.A00 = j;
    }
}
