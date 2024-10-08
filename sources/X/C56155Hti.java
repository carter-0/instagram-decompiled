package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Hti  reason: case insensitive filesystem */
public final class C56155Hti {
    public C268074ci A00;
    public C268074ci A01;
    public C267974cY A02;
    public C267974cY A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C56155Hti);
    }

    public final int hashCode() {
        String str;
        Integer num = this.A04;
        if (num.intValue() != 0) {
            str = "Clip";
        } else {
            str = "Visible";
        }
        return C51971G9r.A0D(num, str) * 31 * 31;
    }

    public C56155Hti(Integer num) {
        this.A04 = num;
    }

    public final void A00(C268084cj r6, C268084cj r7, long j) {
        C268074ci r72;
        C268074ci r62;
        long A022 = C51974G9v.A02(j);
        if (r6 != null) {
            int A002 = Constraints.A00(A022);
            C291605ha r0 = I5T.A01;
            r6.CoO(r6.CoR(A002));
            if (r6 instanceof C268074ci) {
                r62 = (C268074ci) r6;
            } else {
                r62 = null;
            }
            this.A01 = r62;
            this.A03 = null;
        }
        if (r7 != null) {
            int A003 = Constraints.A00(A022);
            C291605ha r02 = I5T.A01;
            r7.CoO(r7.CoR(A003));
            if (r7 instanceof C268074ci) {
                r72 = (C268074ci) r7;
            } else {
                r72 = null;
            }
            this.A00 = r72;
            this.A02 = null;
        }
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FlowLayoutOverflowState(type=");
        if (this.A04.intValue() != 0) {
            str = "Clip";
        } else {
            str = "Visible";
        }
        A1A.append(str);
        A1A.append(", minLinesToShowCollapse=");
        A1A.append(0);
        A1A.append(", minCrossAxisSizeToShowCollapse=");
        return C51975G9x.A0j(A1A, 0);
    }
}
