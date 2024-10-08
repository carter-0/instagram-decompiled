package X;

import java.util.ArrayList;

public final class N2T extends AnonymousClass0T0 {
    public String A00 = null;
    public ArrayList A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2T) {
                N2T n2t = (N2T) obj;
                if (!0qQ.A0K(this.A00, n2t.A00) || !0qQ.A0K(this.A01, n2t.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }

    public N2T() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A01 = A1C;
    }
}
