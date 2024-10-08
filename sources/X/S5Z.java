package X;

public final class S5Z {
    public final C11330SNj A00;
    public final C11214SFo A01;

    public S5Z(C11330SNj sNj, C11214SFo sFo) {
        0qQ.A0B(sFo, 2);
        this.A00 = sNj;
        this.A01 = sFo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S5Z) {
                S5Z s5z = (S5Z) obj;
                if (!0qQ.A0K(this.A00, s5z.A00) || !0qQ.A0K(this.A01, s5z.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CardPttRequest(authTicket=");
        A1A.append(this.A00);
        A1A.append(", pttRequestParam=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
