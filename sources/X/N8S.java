package X;

import java.util.Map;
import java.util.Set;

public final class N8S extends AnonymousClass0T0 implements C74247Prb {
    public final Map A00;
    public final Set A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8S) {
                N8S n8s = (N8S) obj;
                if (this.A02 != n8s.A02 || !0qQ.A0K(this.A01, n8s.A01) || !0qQ.A0K(this.A00, n8s.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C51965G9l.A05(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public N8S(Map map, Set set, boolean z) {
        this.A02 = z;
        this.A01 = set;
        this.A00 = map;
    }
}
