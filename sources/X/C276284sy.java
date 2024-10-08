package X;

/* renamed from: X.4sy  reason: invalid class name and case insensitive filesystem */
public final class C276284sy extends AnonymousClass0T0 {
    public Boolean A00 = null;
    public Integer A01 = null;
    public Integer A02 = null;
    public Integer A03 = null;
    public Integer A04 = null;
    public Integer A05 = null;
    public Integer A06 = null;
    public String A07 = null;
    public String A08 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C276284sy) {
                C276284sy r5 = (C276284sy) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A03;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A05;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A08;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.A01;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.A06;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A04;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode8 + i;
    }
}
