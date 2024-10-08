package X;

/* renamed from: X.IkI  reason: case insensitive filesystem */
public final class C58025IkI implements AnonymousClass2Ha {
    public final Comparable A00;
    public final Comparable A01;

    public final Comparable B1S() {
        return this.A00;
    }

    public final Comparable Byc() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C58025IkI)) {
            return false;
        }
        if (isEmpty() && ((C58025IkI) obj).isEmpty()) {
            return true;
        }
        C58025IkI ikI = (C58025IkI) obj;
        if (!0qQ.A0K(this.A01, ikI.A01) || !0qQ.A0K(this.A00, ikI.A00)) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1R(this.A01.compareTo(this.A00));
    }

    public C58025IkI(Comparable comparable, Comparable comparable2) {
        this.A01 = comparable;
        this.A00 = comparable2;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        A1A.append("..");
        return AnonymousClass7TF.A0i(this.A00, A1A);
    }
}
