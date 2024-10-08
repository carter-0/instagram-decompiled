package X;

import java.util.List;

public final class ULi extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public ULi(Integer num, String str, boolean z, boolean z2) {
        this.A01 = num;
        this.A02 = str;
        this.A04 = z;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        ULi uLi;
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ULi)) {
                return false;
            }
            uLi = (ULi) obj;
            if (uLi.A00 != 1 || this.A01 != uLi.A01) {
                return false;
            }
            obj2 = this.A02;
            obj3 = uLi.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof ULi)) {
                return false;
            }
            uLi = (ULi) obj;
            if (uLi.A00 != 0 || !0qQ.A0K(this.A02, uLi.A02)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = uLi.A01;
        }
        if (0qQ.A0K(obj2, obj3) && this.A04 == uLi.A04 && this.A03 == uLi.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A0O;
        int hashCode;
        String str;
        if (this.A00 != 0) {
            int A0M = AnonymousClass7TE.A0M(this.A01);
            switch (A0M) {
                case 1:
                    str = "LABEL";
                    break;
                case 2:
                    str = "LABEL_EMPHASIZED";
                    break;
                default:
                    str = "INFO_EMPHASIZED";
                    break;
            }
            A0O = (str.hashCode() + A0M) * 31;
            hashCode = this.A02.hashCode();
        } else {
            A0O = AnonymousClass7TE.A0O(this.A02);
            hashCode = this.A01.hashCode();
        }
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A04, (A0O + hashCode) * 31));
    }

    public ULi(String str, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = list;
        this.A04 = z;
        this.A03 = z2;
    }

    public ULi() {
        this("", (List) 0sn.A00, false, false);
    }
}
