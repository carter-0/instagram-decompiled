package X;

public final class GRJ implements AnonymousClass5b9 {
    public final JSe A00;
    public final Integer A01;

    public final C3026164i FMw(C287805an r4) {
        return new GRK(this.A00.FMx(r4), this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GRJ)) {
            return false;
        }
        GRJ grj = (GRJ) obj;
        if (!0qQ.A0K(grj.A00, this.A00) || grj.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AnonymousClass7TE.A0K(this.A00);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "Reverse";
        } else {
            str = "Restart";
        }
        return C51971G9r.A0F(str, intValue, A0K) + ((int) (0 >>> 32));
    }

    public GRJ(JSe jSe, Integer num) {
        this.A00 = jSe;
        this.A01 = num;
    }
}
