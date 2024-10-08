package X;

/* renamed from: X.7og  reason: invalid class name and case insensitive filesystem */
public final class C342487og extends AnonymousClass0T0 implements C342497oh {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C342487og(String str, String str2, String str3, String str4, String str5, String str6) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(str5, 5);
        0qQ.A0B(str6, 6);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C342487og) {
                C342487og r5 = (C342487og) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        String str = this.A03;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode();
    }
}
