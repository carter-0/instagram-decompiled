package X;

/* renamed from: X.Sty  reason: case insensitive filesystem */
public final class C12420Sty implements C13451Tae {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C12420Sty) && this.A00 == ((C12420Sty) obj).A00);
    }

    public C12420Sty(boolean z) {
        this.A00 = z;
    }

    public final int hashCode() {
        return DbS.A06(this.A00, 38161);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PopContainerFragmentTransitionInfo(shouldPopContainerFragment=");
        A1A.append(true);
        A1A.append(", forcePopBackStack=");
        return G9t.A1C(A1A, this.A00);
    }
}
