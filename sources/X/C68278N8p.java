package X;

import java.util.List;

/* renamed from: X.N8p  reason: case insensitive filesystem */
public final class C68278N8p extends AnonymousClass0T0 implements JM9 {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68278N8p) {
                C68278N8p n8p = (C68278N8p) obj;
                if (!(0qQ.A0K(this.A00, n8p.A00) && this.A02 == n8p.A02 && this.A01 == n8p.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public C68278N8p(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = z2;
    }

    public C68278N8p() {
        this(0sn.A00, false, false);
    }
}
