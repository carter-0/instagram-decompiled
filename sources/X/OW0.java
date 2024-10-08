package X;

public final class OW0 {
    public final C69363Nk3 A00;
    public final Boolean A01;
    public final Number A02;
    public final Number A03;

    public OW0(C69363Nk3 nk3, Boolean bool, Number number, Number number2) {
        this.A02 = number;
        this.A00 = nk3;
        this.A03 = number2;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OW0) {
                OW0 ow0 = (OW0) obj;
                if (!0qQ.A0K(this.A02, ow0.A02) || this.A00 != ow0.A00 || !0qQ.A0K(this.A03, ow0.A03) || !0qQ.A0K(this.A01, ow0.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        int A0E = C51971G9r.A0E(this.A02) + 31;
        C69363Nk3 nk3 = this.A00;
        if (nk3 == null) {
            ordinal = -1;
        } else {
            ordinal = nk3.ordinal();
        }
        return (((((A0E * 31) + ordinal) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A01);
    }

    public OW0(C70527OAa oAa) {
        this.A02 = null;
        this.A00 = oAa.A00;
        this.A03 = null;
        this.A01 = oAa.A01;
    }
}
