package X;

/* renamed from: X.8eG  reason: invalid class name and case insensitive filesystem */
public final class C360238eG implements Comparable {
    public final long A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0qQ.A01(this.A00 ^ Long.MIN_VALUE, ((C360238eG) obj).A00 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C360238eG) || j != ((C360238eG) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return C291925i6.A03(this.A00);
    }

    public /* synthetic */ C360238eG(long j) {
        this.A00 = j;
    }
}
