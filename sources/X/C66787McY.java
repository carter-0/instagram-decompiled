package X;

/* renamed from: X.McY  reason: case insensitive filesystem */
public final class C66787McY extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public C66787McY(String str, AnonymousClass62P r3, int i, boolean z) {
        this.A02 = r3;
        this.A04 = z;
        this.A03 = str;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        C66787McY mcY;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C66787McY) {
                    C66787McY mcY2 = (C66787McY) obj;
                    if (mcY2.A00 == 0 && 0qQ.A0K(this.A02, mcY2.A02) && this.A04 == mcY2.A04 && 0qQ.A0K(this.A03, mcY2.A03)) {
                        i = this.A01;
                        i2 = mcY2.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C66787McY)) {
                    return false;
                }
                mcY = (C66787McY) obj;
                if (mcY.A00 != 1 || !0qQ.A0K(this.A02, mcY.A02) || !0qQ.A0K(this.A03, mcY.A03)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C66787McY)) {
                    return false;
                }
                mcY = (C66787McY) obj;
                if (!(mcY.A00 == 2 && 0qQ.A0K(this.A03, mcY.A03) && this.A02 == mcY.A02)) {
                    return false;
                }
        }
        if (this.A01 != mcY.A01) {
            return false;
        }
        i = this.A04;
        i2 = mcY.A04;
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        int i;
        int A0K;
        int hashCode;
        String str;
        switch (this.A00) {
            case 0:
                A09 = (AnonymousClass7TF.A09(this.A04, AnonymousClass7TE.A0K(this.A02)) + AnonymousClass7TG.A0E(this.A03)) * 31;
                i = this.A01;
                break;
            case 1:
                A0K = AnonymousClass7TE.A0K(this.A02);
                hashCode = this.A03.hashCode();
                break;
            default:
                A0K = AnonymousClass7TE.A0O(this.A03);
                int A0M = AnonymousClass7TE.A0M(this.A02);
                switch (A0M) {
                    case 1:
                        str = "PET";
                        break;
                    case 2:
                        str = "OTHERS";
                        break;
                    case 3:
                        str = "UNRECOGNIZED";
                        break;
                    default:
                        str = "PERSON";
                        break;
                }
                hashCode = C51966G9m.A04(str, A0M);
                break;
        }
        A09 = (((A0K + hashCode) * 31) + this.A01) * 31;
        i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return A09 + i;
    }

    public C66787McY(2EM r2, String str, int i, boolean z) {
        AnonymousClass7TF.A1B(r2, 1, str);
        this.A02 = r2;
        this.A03 = str;
        this.A01 = i;
        this.A04 = z;
    }

    public C66787McY(Integer num, String str, int i, boolean z) {
        0qQ.A0B(num, 2);
        this.A03 = str;
        this.A02 = num;
        this.A01 = i;
        this.A04 = z;
    }
}
