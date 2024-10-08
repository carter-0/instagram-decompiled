package X;

/* renamed from: X.HIy  reason: case insensitive filesystem */
public final class C54563HIy extends C54721HQa {
    public final C56551I1f A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C54563HIy) && 0qQ.A0K(this.A00, ((C54563HIy) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C54563HIy(C56551I1f i1f) {
        this.A00 = i1f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Error(errorInfo=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C54563HIy() {
        this(new C56551I1f((String) null, true));
    }
}
