package X;

import java.util.List;

public final class N47 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public N47(C61083JwL jwL, C61083JwL jwL2, String str, List list, boolean z) {
        0qQ.A0B(str, 1);
        C51972G9s.A1C(list, jwL);
        this.A04 = str;
        this.A03 = list;
        this.A05 = z;
        this.A02 = jwL;
        this.A01 = jwL2;
    }

    public static final N47 A00(Integer num, Integer num2, String str, List list, boolean z) {
        DbZ.A0t(0, list, num, num2);
        return new N47(num, num2, str, list, z);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof N47)) {
                return false;
            }
            N47 n47 = (N47) obj;
            if (n47.A00 != 1 || !0qQ.A0K(this.A04, n47.A04) || !0qQ.A0K(this.A03, n47.A03) || this.A05 != n47.A05 || !0qQ.A0K(this.A02, n47.A02)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = n47.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof N47)) {
                return false;
            }
            N47 n472 = (N47) obj;
            if (n472.A00 != 0 || !0qQ.A0K(this.A01, n472.A01) || this.A05 != n472.A05 || this.A03 != n472.A03 || this.A02 != n472.A02) {
                return false;
            }
            obj2 = this.A04;
            obj3 = n472.A04;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str;
        String str2;
        if (this.A00 != 0) {
            i = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A04))));
            Object obj = this.A01;
            if (obj != null) {
                i2 = obj.hashCode();
            }
            i2 = 0;
        } else {
            int A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TE.A0K(this.A01));
            int A0M = AnonymousClass7TE.A0M(this.A03);
            switch (A0M) {
                case 1:
                    str = "NULL";
                    break;
                case 2:
                    str = "NORMAL";
                    break;
                default:
                    str = "ERROR";
                    break;
            }
            int A0F = C51971G9r.A0F(str, A0M, A09);
            int A0M2 = AnonymousClass7TE.A0M(this.A02);
            switch (A0M2) {
                case 1:
                    str2 = "HIDE";
                    break;
                case 2:
                    str2 = "GRAY_OUT";
                    break;
                default:
                    str2 = "SHOW";
                    break;
            }
            i = C51971G9r.A0F(str2, A0M2, A0F);
            String str3 = this.A04;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            i2 = 0;
        }
        return i + i2;
    }

    public N47(Integer num, Integer num2, String str, List list, boolean z) {
        this.A01 = list;
        this.A05 = z;
        this.A03 = num;
        this.A02 = num2;
        this.A04 = str;
    }
}
