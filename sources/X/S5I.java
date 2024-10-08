package X;

public final class S5I {
    public final QXN A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof S5I) && 0qQ.A0K(this.A00, ((S5I) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00) * 31;
    }

    public S5I(QXN qxn) {
        this.A00 = qxn;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FBPayEmailResponse(emailResponse=");
        A1A.append(this.A00);
        A1A.append(", deletedEmail=");
        return C51975G9x.A0i((String) null, A1A);
    }
}
