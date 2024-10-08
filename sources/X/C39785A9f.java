package X;

/* renamed from: X.A9f  reason: case insensitive filesystem */
public final class C39785A9f {
    public final C391129sO A00;
    public final C344737sL A01;
    public final C266724aF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39785A9f) {
                C39785A9f a9f = (C39785A9f) obj;
                if (!0qQ.A0K(this.A01, a9f.A01) || !0qQ.A0K(this.A02, a9f.A02) || this.A00 != a9f.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C39785A9f(C344737sL r2, C266724aF r3) {
        C391129sO r0 = C391129sO.TRANSITION;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r0;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TransitionEffect(mediaGraph=");
        A1A.append(this.A01);
        A1A.append(", timeRange=");
        A1A.append(this.A02);
        A1A.append(", effectType=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
