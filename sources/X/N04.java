package X;

public final class N04 extends C69551Nnv {
    public static final C69551Nnv A01 = new N04(C60340gF.A00);
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N04) && 0qQ.A0K(this.A00, ((N04) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public N04(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Either.Left(");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
