package X;

public final class S67 {
    public final 2IV A00;
    public final C11330SNj A01;
    public final C11214SFo A02;

    public S67(2IV r2, C11330SNj sNj, C11214SFo sFo) {
        0qQ.A0B(sFo, 3);
        this.A00 = r2;
        this.A01 = sNj;
        this.A02 = sFo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S67) {
                S67 s67 = (S67) obj;
                if (!0qQ.A0K(this.A00, s67.A00) || !0qQ.A0K(this.A01, s67.A01) || !0qQ.A0K(this.A02, s67.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PaymentComponentPttRequest(saveCredentialInput=");
        A1A.append(this.A00);
        A1A.append(", authTicket=");
        A1A.append(this.A01);
        A1A.append(", pttRequestParam=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
