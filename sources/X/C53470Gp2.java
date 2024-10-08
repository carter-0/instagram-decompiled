package X;

import java.util.List;

/* renamed from: X.Gp2  reason: case insensitive filesystem */
public final class C53470Gp2 extends AnonymousClass0T0 implements C66384MPq {
    public final int A00;
    public final C61071Jw9 A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C53470Gp2(C61071Jw9 jw9, String str, String str2, List list, int i) {
        0qQ.A0B(list, 5);
        this.A00 = i;
        this.A01 = jw9;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53470Gp2) {
                C53470Gp2 gp2 = (C53470Gp2) obj;
                if (this.A00 != gp2.A00 || !0qQ.A0K(this.A01, gp2.A01) || !0qQ.A0K(this.A03, gp2.A03) || !0qQ.A0K(this.A02, gp2.A02) || !0qQ.A0K(this.A04, gp2.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A01, this.A00 * 31))));
    }
}
