package X;

import java.util.List;

public final class BBE extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBE) {
                BBE bbe = (BBE) obj;
                if (this.A00 != bbe.A00 || !0qQ.A0K(this.A01, bbe.A01) || !0qQ.A0K(this.A02, bbe.A02) || this.A03 != bbe.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31));
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return A07 + i;
    }

    public BBE(String str, List list, int i, boolean z) {
        AnonymousClass7TG.A1Q(str, list);
        this.A00 = i;
        this.A01 = str;
        this.A02 = list;
        this.A03 = z;
    }
}
