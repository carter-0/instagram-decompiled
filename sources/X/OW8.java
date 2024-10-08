package X;

public final class OW8 {
    public C70765OKl A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OW8)) {
            return false;
        }
        OW8 ow8 = (OW8) obj;
        return 0qQ.A0K(this.A09, ow8.A09) && 0qQ.A0K(this.A07, ow8.A07) && 0qQ.A0K(this.A02, ow8.A02) && 0qQ.A0K(this.A01, ow8.A01) && 0qQ.A0K(this.A08, ow8.A08) && 0qQ.A0K(this.A05, ow8.A05);
    }

    public final int hashCode() {
        int i = 0;
        int A0G = ((((((((((JTR.A0G(this.A09) * 31) + JTR.A0G(this.A07)) * 31) + JTR.A0G(this.A02)) * 31) + JTR.A0G(this.A01)) * 31) + JTR.A0G(this.A08)) * 31) + JTR.A0G(this.A05)) * 31;
        C70765OKl oKl = this.A00;
        if (oKl != null) {
            i = oKl.hashCode();
        }
        return A0G + i;
    }

    public OW8() {
    }

    public OW8(C70765OKl oKl, 2FW r4, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        this.A02 = str;
        this.A04 = str2;
        this.A06 = str3;
        if (r4 != null) {
            str8 = r4.A00;
        } else {
            str8 = null;
        }
        this.A03 = str8;
        this.A07 = str4;
        this.A09 = "like";
        this.A01 = str5;
        this.A08 = str6;
        this.A05 = str7;
        this.A00 = oKl;
    }
}
