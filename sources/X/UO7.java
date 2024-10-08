package X;

public final class UO7 extends AnonymousClass0T0 implements X4H {
    public final String A00;
    public final String A01;
    public final String A02;
    public final C16518UwN A03 = C16518UwN.INCENTIVES;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UO7) {
                UO7 uo7 = (UO7) obj;
                if (!0qQ.A0K(this.A02, uo7.A02) || !0qQ.A0K(this.A00, uo7.A00) || !0qQ.A0K(this.A01, uo7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C16518UwN CAZ() {
        return this.A03;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public UO7(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
