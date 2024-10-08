package X;

public final class KY2 extends C64185LSs {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KY2) && 0qQ.A0K(this.A00, ((KY2) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public KY2(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C64185LSs.A03(A1A, super.toString());
        return C64185LSs.A01(this.A00, A1A);
    }
}
