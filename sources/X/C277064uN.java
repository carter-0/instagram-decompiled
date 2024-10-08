package X;

/* renamed from: X.4uN  reason: invalid class name and case insensitive filesystem */
public final class C277064uN extends AnonymousClass0T0 implements C277074uO {
    public final C67241sS A00;
    public final C270864hR A01;
    public final C257593xe A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C277064uN) {
                C277064uN r5 = (C277064uN) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C257593xe r0 = this.A02;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A06;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C67241sS r02 = this.A00;
        int hashCode5 = (hashCode4 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C270864hR r03 = this.A01;
        int hashCode6 = (hashCode5 + (r03 == null ? 0 : r03.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.A05;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode8 + i;
    }

    public C277064uN(C67241sS r1, C270864hR r2, C257593xe r3, Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this.A02 = r3;
        this.A04 = num;
        this.A06 = str;
        this.A03 = bool;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = num2;
    }
}
