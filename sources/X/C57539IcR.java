package X;

/* renamed from: X.IcR  reason: case insensitive filesystem */
public final class C57539IcR implements JMO {
    public final Iterable A00;
    public final 0sP A01;
    public final 0sL A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57539IcR) {
                C57539IcR icR = (C57539IcR) obj;
                if (!0qQ.A0K(this.A00, icR.A00) || !0qQ.A0K(this.A01, icR.A01) || !0qQ.A0K(this.A02, icR.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public C57539IcR(Iterable iterable, 0sP r2, 0sL r3) {
        this.A00 = iterable;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Children(items=");
        A1A.append(this.A00);
        A1A.append(", id=");
        A1A.append(this.A01);
        A1A.append(", componentFunction=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
