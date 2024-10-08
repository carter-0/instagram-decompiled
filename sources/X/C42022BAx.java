package X;

import java.util.List;

/* renamed from: X.BAx  reason: case insensitive filesystem */
public final class C42022BAx extends AnonymousClass0T0 {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42022BAx) {
                C42022BAx bAx = (C42022BAx) obj;
                if (!0qQ.A0K(this.A00, bAx.A00) || this.A01 != bAx.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0C + i;
    }

    public C42022BAx(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
