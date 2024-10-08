package X;

import java.util.List;

/* renamed from: X.N2g  reason: case insensitive filesystem */
public final class C68140N2g extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final List A03;

    public C68140N2g(String str, List list, int i, long j) {
        0qQ.A0B(list, 2);
        this.A02 = str;
        this.A03 = list;
        this.A01 = j;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68140N2g) {
                C68140N2g n2g = (C68140N2g) obj;
                if (!0qQ.A0K(this.A02, n2g.A02) || !0qQ.A0K(this.A03, n2g.A03) || this.A01 != n2g.A01 || this.A00 != n2g.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51972G9s.A07(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A02))) + this.A00;
    }
}
