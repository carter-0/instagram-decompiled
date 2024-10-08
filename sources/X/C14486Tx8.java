package X;

/* renamed from: X.Tx8  reason: case insensitive filesystem */
public final class C14486Tx8 {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public static void A01(0Aj r2, C14486Tx8 tx8, String str) {
        r2.AAJ("selected_follow_status", str);
        r2.AAJ("selected_source_type", tx8.A07);
    }

    public C14486Tx8(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A03 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A04 = str4;
        this.A01 = str5;
        this.A02 = str6;
        this.A00 = l;
        this.A08 = z;
        this.A06 = str7;
    }

    public static void A00(0Aj r2, C14486Tx8 tx8, Integer num, int i) {
        r2.AAJ("search_type", C67419Mna.A00(num));
        r2.AAJ("selected_id", tx8.A03);
        r2.A9F("selected_position", Long.valueOf((long) i));
        r2.AAJ("selected_type", tx8.A04);
    }
}
