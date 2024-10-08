package X;

import java.util.List;

public final class N54 extends AnonymousClass0T0 implements C74438Put {
    public final N49 A00;
    public final C61037Jvb A01;
    public final N2c A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final Integer A0B = AnonymousClass05K.A01;

    public N54(N49 n49, C61037Jvb jvb, N2c n2c, Integer num, Integer num2, String str, String str2, String str3, List list, List list2) {
        DbW.A1O(list, 4, num);
        0qQ.A0B(num2, 10);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = n2c;
        this.A09 = list;
        this.A01 = jvb;
        this.A03 = num;
        this.A08 = list2;
        this.A00 = n49;
        this.A07 = str3;
        this.A04 = num2;
        this.A0A = AnonymousClass7TF.A1V(n2c);
    }

    public final String Aqe() {
        return this.A05;
    }

    public final Integer Aqk() {
        return this.A0B;
    }

    public final boolean CeS() {
        return this.A0A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N54) || !0qQ.A0K(((N54) obj).A05, this.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A05.hashCode();
    }
}
