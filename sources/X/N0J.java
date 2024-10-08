package X;

public final class N0J extends C69552Nnw {
    public final Exception A00;

    public N0J() {
        this((Exception) null);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N0J) && 0qQ.A0K(this.A00, ((N0J) obj).A00));
    }

    public static N0J A00(Exception exc) {
        return new N0J(exc);
    }

    public static void A01(C71087ObS obS, Exception exc) {
        obS.A05(new N0J(exc));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Error(cause=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public N0J(Exception exc) {
        this.A00 = exc;
    }
}
