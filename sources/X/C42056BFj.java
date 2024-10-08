package X;

import java.util.List;

/* renamed from: X.BFj  reason: case insensitive filesystem */
public final class C42056BFj extends AnonymousClass0T0 implements DRK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42056BFj) {
                C42056BFj bFj = (C42056BFj) obj;
                if (!0qQ.A0K(this.A00, bFj.A00) || !0qQ.A0K(this.A01, bFj.A01) || !0qQ.A0K(this.A02, bFj.A02) || !0qQ.A0K(this.A03, bFj.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00))));
    }

    public C42056BFj(String str, String str2, String str3, List list) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(list, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }
}
