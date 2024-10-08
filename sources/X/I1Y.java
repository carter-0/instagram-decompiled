package X;

public final class I1Y {
    public final AnonymousClass62P A00;

    public I1Y(AnonymousClass62P r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof I1Y) && 0qQ.A0K(this.A00, ((I1Y) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineMEmuResponse(extendedCaptureImages=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public I1Y() {
        this(AnonymousClass62Q.A00(0sn.A00));
    }
}
