package X;

/* renamed from: X.IkH  reason: case insensitive filesystem */
public final class C58024IkH implements C74589Pxc {
    public final double A00;

    public final /* bridge */ /* synthetic */ boolean AJZ(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        if (doubleValue < this.A00 || doubleValue > 1.0d) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Comparable B1S() {
        return Double.valueOf(1.0d);
    }

    public final /* bridge */ /* synthetic */ Comparable Byc() {
        return Double.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean Cfv(Comparable comparable, Comparable comparable2) {
        return Dba.A1U((((Number) comparable).doubleValue() > ((Number) comparable2).doubleValue() ? 1 : (((Number) comparable).doubleValue() == ((Number) comparable2).doubleValue() ? 0 : -1)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C58024IkH)) {
            return false;
        }
        if ((!isEmpty() || !((C58024IkH) obj).isEmpty()) && this.A00 != ((C58024IkH) obj).A00) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1R((this.A00 > 1.0d ? 1 : (this.A00 == 1.0d ? 0 : -1)));
    }

    public C58024IkH(double d) {
        this.A00 = d;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (C51968G9o.A03(Double.doubleToLongBits(this.A00)) * 31) + C51968G9o.A03(Double.doubleToLongBits(1.0d));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A00);
        A1A.append("..");
        A1A.append(1.0d);
        return A1A.toString();
    }
}
