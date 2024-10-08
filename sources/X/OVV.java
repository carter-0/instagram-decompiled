package X;

public final class OVV {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07 = "undefined";
    public boolean A08;

    public static C14486Tx8 A00(Integer num, String str, String str2, String str3, String str4, String str5) {
        String str6 = str4;
        String str7 = str2;
        0qQ.A0A(str2);
        if (str4 == null) {
            str6 = "";
        }
        0qQ.A0A(str3);
        return new C14486Tx8(DbZ.A0c(num), str7, str6, str5, str3, str, (String) null, (String) null, false);
    }

    public final C14486Tx8 A01() {
        String str = this.A03;
        0qQ.A0A(str);
        String str2 = this.A05;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.A07;
        String str4 = this.A04;
        0qQ.A0A(str4);
        String str5 = this.A01;
        String str6 = this.A02;
        return new C14486Tx8(DbZ.A0c(this.A00), str, str2, str3, str4, str5, str6, this.A06, this.A08);
    }
}
