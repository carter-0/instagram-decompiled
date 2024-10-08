package X;

/* renamed from: X.7AF  reason: invalid class name */
public final class AnonymousClass7AF extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public AnonymousClass7AF(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str4, 4);
        0qQ.A0B(str6, 6);
        0qQ.A0B(str8, 8);
        0qQ.A0B(str10, 10);
        0qQ.A0B(str12, 12);
        0qQ.A0B(str14, 14);
        this.A07 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A02 = str5;
        this.A03 = str6;
        this.A0F = str7;
        this.A0D = str8;
        this.A0C = str9;
        this.A0B = str10;
        this.A09 = str11;
        this.A0A = str12;
        this.A00 = str13;
        this.A01 = str14;
        this.A08 = str15;
        this.A0E = str16;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AF) {
                AnonymousClass7AF r5 = (AnonymousClass7AF) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0E, r5.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A07.hashCode() * 31) + this.A06.hashCode()) * 31;
        String str = this.A05;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A04.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A03.hashCode()) * 31;
        String str3 = this.A0F;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.A0D.hashCode()) * 31;
        String str4 = this.A0C;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.A0B.hashCode()) * 31;
        String str5 = this.A09;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.A0A.hashCode()) * 31;
        String str6 = this.A00;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.A01.hashCode()) * 31;
        String str7 = this.A08;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0E;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }
}
