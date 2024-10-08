package X;

import java.util.List;

/* renamed from: X.Dtm  reason: case insensitive filesystem */
public final class C47258Dtm extends AnonymousClass0T0 implements G4w {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47258Dtm) {
                C47258Dtm dtm = (C47258Dtm) obj;
                if (!(this.A01 == dtm.A01 && 0qQ.A0K(this.A00, dtm.A00) && this.A02 == dtm.A02 && this.A03 == dtm.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A07(this.A00, i * 31)));
    }

    public C47258Dtm(List list, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = list;
        this.A02 = z2;
        this.A03 = z3;
    }
}
