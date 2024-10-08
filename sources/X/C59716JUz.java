package X;

/* renamed from: X.JUz  reason: case insensitive filesystem */
public final class C59716JUz {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C59716JUz) || j != ((C59716JUz) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        return 002.A0K("FirstVisibleItemState(packedValue=", ')', this.A00);
    }

    public /* synthetic */ C59716JUz(long j) {
        this.A00 = j;
    }
}
