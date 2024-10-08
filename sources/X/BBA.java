package X;

import java.util.ArrayList;

public final class BBA extends AnonymousClass0T0 {
    public String A00 = null;
    public ArrayList A01 = AnonymousClass7TE.A1C();
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBA) {
                BBA bba = (BBA) obj;
                if (!0qQ.A0K(this.A01, bba.A01) || !0qQ.A0K(this.A00, bba.A00) || this.A02 != bba.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A00)) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A0K + i;
    }
}
