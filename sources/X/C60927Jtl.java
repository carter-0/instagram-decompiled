package X;

import java.util.List;

/* renamed from: X.Jtl  reason: case insensitive filesystem */
public final class C60927Jtl extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60927Jtl) {
                C60927Jtl jtl = (C60927Jtl) obj;
                if (this.A01 != jtl.A01 || this.A00 != jtl.A00 || !0qQ.A0K(this.A02, jtl.A02) || !0qQ.A0K(this.A03, jtl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A01(this.A00, ((int) (j ^ (j >>> 32))) * 31)));
    }

    public C60927Jtl(String str, List list, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = str;
        this.A03 = list;
    }
}
