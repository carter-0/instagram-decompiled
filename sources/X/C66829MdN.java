package X;

/* renamed from: X.MdN  reason: case insensitive filesystem */
public final class C66829MdN extends C69605Non {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66829MdN) && this.A00 == ((C66829MdN) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("FixedHeight(fixedHeight=", ')', this.A00);
    }

    public C66829MdN(int i) {
        this.A00 = i;
    }
}
