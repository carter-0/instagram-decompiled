package X;

import java.util.List;

/* renamed from: X.GqG  reason: case insensitive filesystem */
public final class C53545GqG extends AnonymousClass0T0 implements JM9 {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53545GqG) {
                C53545GqG gqG = (C53545GqG) obj;
                if (!(0qQ.A0K(this.A01, gqG.A01) && 0qQ.A0K(this.A00, gqG.A00) && this.A06 == gqG.A06 && this.A08 == gqG.A08 && this.A09 == gqG.A09 && this.A07 == gqG.A07 && this.A05 == gqG.A05 && this.A02 == gqG.A02 && this.A04 == gqG.A04 && this.A03 == gqG.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0K(this.A01))))))))));
    }

    public C53545GqG(String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A01 = list;
        this.A00 = str;
        this.A06 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A07 = z4;
        this.A05 = z5;
        this.A02 = z6;
        this.A04 = z7;
        this.A03 = z8;
    }

    public C53545GqG() {
        this("", 0sn.A00, true, false, false, false, false, false, false, false);
    }
}
