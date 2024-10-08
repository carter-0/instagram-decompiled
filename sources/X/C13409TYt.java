package X;

/* renamed from: X.TYt  reason: case insensitive filesystem */
public final class C13409TYt extends TAS implements AnonymousClass2Ha {
    public final /* bridge */ /* synthetic */ Comparable B1S() {
        return Character.valueOf(this.A01);
    }

    public final /* bridge */ /* synthetic */ Comparable Byc() {
        return Character.valueOf(this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13409TYt)) {
            return false;
        }
        if (isEmpty() && ((C13409TYt) obj).isEmpty()) {
            return true;
        }
        TAS tas = (TAS) obj;
        if (this.A00 == tas.A00 && this.A01 == tas.A01) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1R(0qQ.A00(this.A00, this.A01));
    }

    public final String toString() {
        return 002.A0E("..", this.A00, this.A01);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }
}
