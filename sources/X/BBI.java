package X;

public final class BBI extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public BBI(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj3;
        this.A06 = str2;
        this.A04 = obj4;
    }

    public final boolean equals(Object obj) {
        BBI bbi;
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BBI)) {
                return false;
            }
            bbi = (BBI) obj;
            if (bbi.A00 != 1 || !0qQ.A0K(this.A01, bbi.A01) || !0qQ.A0K(this.A05, bbi.A05)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = bbi.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof BBI)) {
                return false;
            }
            bbi = (BBI) obj;
            if (bbi.A00 != 0 || this.A01 != bbi.A01 || !0qQ.A0K(this.A02, bbi.A02)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = bbi.A05;
        }
        if (!0qQ.A0K(obj2, obj3) || !0qQ.A0K(this.A03, bbi.A03) || !0qQ.A0K(this.A06, bbi.A06) || !0qQ.A0K(this.A04, bbi.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        int A0E;
        int i = this.A00;
        int A0C2 = AnonymousClass7TG.A0C(this.A01);
        if (i != 0) {
            A0C = ((A0C2 * 31) + AnonymousClass7TG.A0E(this.A05)) * 31;
            A0E = AnonymousClass7TG.A0C(this.A02);
        } else {
            A0C = ((A0C2 * 31) + AnonymousClass7TG.A0C(this.A02)) * 31;
            A0E = AnonymousClass7TG.A0E(this.A05);
        }
        return ((((((A0C + A0E) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }
}
