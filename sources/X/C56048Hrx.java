package X;

/* renamed from: X.Hrx  reason: case insensitive filesystem */
public final class C56048Hrx {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C56048Hrx) || j != ((C56048Hrx) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        return 002.A0K("GridItemSpan(packedValue=", ')', this.A00);
    }

    public /* synthetic */ C56048Hrx(long j) {
        this.A00 = j;
    }
}
