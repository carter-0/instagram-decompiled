package X;

import java.util.List;

public final class UO8 extends AnonymousClass0T0 implements X4H {
    public final String A00;
    public final String A01;
    public final List A02;
    public final C16518UwN A03 = C16518UwN.OVERVIEW;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UO8) {
                UO8 uo8 = (UO8) obj;
                if (!0qQ.A0K(this.A01, uo8.A01) || !0qQ.A0K(this.A00, uo8.A00) || !0qQ.A0K(this.A02, uo8.A02)) {
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
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public UO8(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }
}
