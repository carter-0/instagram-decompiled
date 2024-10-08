package X;

import java.util.List;

/* renamed from: X.Drq  reason: case insensitive filesystem */
public final class C47175Drq extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    public C47175Drq() {
        this((Integer) null, (List) null, (List) null, 0, 255, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47175Drq) {
                C47175Drq drq = (C47175Drq) obj;
                if (!(this.A01 == drq.A01 && this.A00 == drq.A00 && this.A02 == drq.A02 && this.A03 == drq.A03 && 0qQ.A0K(this.A04, drq.A04) && 0qQ.A0K(this.A05, drq.A05) && this.A07 == drq.A07 && this.A06 == drq.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C47175Drq(Integer num, 0sn r6, 0sn r7, int i, int i2, boolean z, boolean z2) {
        int i3 = (i2 & 1) != 0 ? 2131952575 : 0;
        int i4 = (i2 & 2) != 0 ? 2131952574 : 0;
        i = (i2 & 4) != 0 ? 2131952558 : i;
        num = (i2 & 8) != 0 ? AnonymousClass05K.A00 : num;
        r6 = (i2 & 16) != 0 ? 0sn.A00 : r6;
        r7 = (i2 & 32) != 0 ? 0sn.A00 : r7;
        boolean z3 = false;
        z = (i2 & 64) != 0 ? false : z;
        z3 = (i2 & 128) == 0 ? z2 : z3;
        AnonymousClass7TG.A1R(num, r6);
        0qQ.A0B(r7, 6);
        this.A01 = i3;
        this.A00 = i4;
        this.A02 = i;
        this.A03 = num;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = z;
        this.A06 = z3;
    }

    public final int hashCode() {
        String str;
        int i = ((((this.A01 * 31) + this.A00) * 31) + this.A02) * 31;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "GRID";
        } else {
            str = "LIST";
        }
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, (i + str.hashCode() + intValue) * 31))));
    }
}
