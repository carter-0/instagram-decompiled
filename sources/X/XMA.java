package X;

import java.util.List;

public final class XMA extends AnonymousClass0T0 {
    public final C233492vo A00;
    public final List A01;

    public XMA(C233492vo r2, List list) {
        0qQ.A0B(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XMA) {
                XMA xma = (XMA) obj;
                if (!0qQ.A0K(this.A00, xma.A00) || !0qQ.A0K(this.A01, xma.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }
}
