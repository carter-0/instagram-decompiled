package X;

public final class BET extends AnonymousClass0T0 implements DR4 {
    public final String A00;
    public final int A01;
    public final Integer A02;
    public final Long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BET) {
                BET bet = (BET) obj;
                if (!0qQ.A0K(this.A02, bet.A02) || this.A01 != bet.A01 || !0qQ.A0K(this.A00, bet.A00) || !0qQ.A0K(this.A03, bet.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A02) * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public BET(Integer num, Long l, String str, int i) {
        this.A02 = num;
        this.A01 = i;
        this.A00 = str;
        this.A03 = l;
    }
}
