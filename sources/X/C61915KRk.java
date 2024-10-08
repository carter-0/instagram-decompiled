package X;

import java.util.List;

/* renamed from: X.KRk  reason: case insensitive filesystem */
public final class C61915KRk extends C62816Kms {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61915KRk) {
                C61915KRk kRk = (C61915KRk) obj;
                if (!0qQ.A0K(this.A00, kRk.A00) || this.A01 != kRk.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C61915KRk(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public C61915KRk() {
        this(0sn.A00, false);
    }
}
