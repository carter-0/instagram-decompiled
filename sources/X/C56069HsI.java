package X;

/* renamed from: X.HsI  reason: case insensitive filesystem */
public final class C56069HsI {
    public final AnonymousClass5b8 A00;
    public final 0sP A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56069HsI) {
                C56069HsI hsI = (C56069HsI) obj;
                if (!0qQ.A0K(this.A01, hsI.A01) || !0qQ.A0K(this.A00, hsI.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C56069HsI(AnonymousClass5b8 r1, 0sP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Slide(slideOffset=");
        A1A.append(this.A01);
        A1A.append(", animationSpec=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
