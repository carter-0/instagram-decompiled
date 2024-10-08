package X;

import java.util.ArrayList;

public final class N2S extends AnonymousClass0T0 {
    public final String A00;
    public final ArrayList A01;

    public N2S(String str, ArrayList arrayList) {
        0qQ.A0B(arrayList, 2);
        this.A01 = arrayList;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2S) {
                N2S n2s = (N2S) obj;
                if (!0qQ.A0K(this.A01, n2s.A01) || !0qQ.A0K(this.A00, n2s.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0K(this.A01));
    }
}
