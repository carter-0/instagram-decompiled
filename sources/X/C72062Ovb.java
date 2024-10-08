package X;

import android.util.Pair;

/* renamed from: X.Ovb  reason: case insensitive filesystem */
public final class C72062Ovb implements AnonymousClass68Z {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public C72062Ovb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A00 = i7;
        this.A0A = obj4;
        this.A0B = obj5;
        this.A07 = obj;
        this.A09 = obj2;
        this.A06 = i;
        this.A0I = str;
        this.A0J = str2;
        this.A08 = obj3;
        this.A0F = str3;
        this.A03 = i2;
        this.A0C = str4;
        this.A01 = i3;
        this.A02 = i4;
        this.A0D = str5;
        this.A0E = str6;
        this.A0G = str7;
        this.A04 = i5;
        this.A05 = i6;
        this.A0H = str8;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            C304566Ea r15 = (C304566Ea) this.A0A;
            Object obj3 = this.A0B;
            Object obj4 = this.A07;
            Object obj5 = this.A09;
            int i = this.A06;
            String str = this.A0I;
            String str2 = this.A0J;
            Object obj6 = this.A08;
            String str3 = this.A0F;
            int i2 = this.A03;
            String str4 = this.A0C;
            int i3 = this.A01;
            int i4 = this.A02;
            String str5 = this.A0D;
            String str6 = this.A0E;
            String str7 = this.A0G;
            int i5 = this.A04;
            int i6 = this.A05;
            String str8 = this.A0H;
            C74233PrM prM = (C74233PrM) obj2;
            if (prM instanceof C72176Oxl) {
                return C72176Oxl.A00(prM);
            }
            return C71991OuP.A00(r15).A0M(new C72062Ovb(prM, obj5, obj6, obj3, obj4, str, str2, str3, str4, str5, str6, str7, str8, i, i2, i3, i4, i5, i6, 0));
        }
        int i7 = this.A06;
        String str9 = this.A0I;
        String str10 = this.A0J;
        String str11 = this.A0F;
        int i8 = this.A03;
        String str12 = this.A0C;
        int i9 = this.A01;
        int i10 = this.A02;
        String str13 = this.A0D;
        String str14 = this.A0E;
        String str15 = this.A0G;
        int i11 = this.A04;
        int i12 = this.A05;
        String str16 = this.A0H;
        Pair pair = (Pair) obj2;
        C68314NAb nAb = (C68314NAb) pair.first;
        String A0k = DbS.A0k();
        String A032 = C304566Ea.A03(nAb, (byte[]) this.A0A);
        17k.A07(A032, "Failed to resolve preview ID");
        String A033 = C304566Ea.A03(nAb, (byte[]) this.A0B);
        17k.A07(A033, "Failed to resolve preview ID");
        String str17 = str10;
        String str18 = str11;
        String str19 = A032;
        String str20 = str12;
        String str21 = str13;
        String str22 = str14;
        String str23 = A033;
        String str24 = str15;
        return 1aU.A07(new OxZ((AnonymousClass67N) pair.second, (C74233PrM) this.A07, (Long) this.A09, (Long) this.A08, str9, str17, str18, str19, str20, str21, str22, str23, str24, str16, A0k, i7, i8, i9, i10, i11, i12), AnonymousClass6F9.A00("instagram_xma_story_reply_with_sticker_client_send"));
    }
}
