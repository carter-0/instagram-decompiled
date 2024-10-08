package X;

import java.util.List;

public final class K2D extends C62708Kl8 {
    public final int A00;
    public final C61052Jvq A01;
    public final C59721JVf A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2D) {
                K2D k2d = (K2D) obj;
                if (!0qQ.A0K(this.A03, k2d.A03) || this.A00 != k2d.A00 || !0qQ.A0K(this.A04, k2d.A04) || !0qQ.A0K(this.A01, k2d.A01) || !0qQ.A0K(this.A02, k2d.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A04, (AnonymousClass7TE.A0O(this.A03) + this.A00) * 31)));
    }

    public K2D(C61052Jvq jvq, C59721JVf jVf, String str, List list, int i) {
        this.A03 = str;
        this.A00 = i;
        this.A04 = list;
        this.A01 = jvq;
        this.A02 = jVf;
    }
}
