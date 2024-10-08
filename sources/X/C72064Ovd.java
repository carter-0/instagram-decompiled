package X;

import android.util.Pair;

/* renamed from: X.Ovd  reason: case insensitive filesystem */
public final class C72064Ovd implements AnonymousClass68Z {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;

    public C72064Ovd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A09 = obj;
        this.A0H = str;
        this.A04 = i;
        this.A0I = str2;
        this.A0J = str3;
        this.A0K = str4;
        this.A0C = str5;
        this.A0F = str6;
        this.A0A = str7;
        this.A0B = str8;
        this.A01 = i2;
        this.A0D = str9;
        this.A02 = i3;
        this.A03 = i4;
        this.A0E = str10;
        this.A07 = obj2;
        this.A08 = obj3;
        this.A0G = str11;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            String str = this.A0H;
            int i = this.A04;
            String str2 = this.A0I;
            String str3 = this.A0J;
            String str4 = this.A0K;
            String str5 = this.A0C;
            String str6 = this.A0F;
            String str7 = this.A0A;
            String str8 = this.A0B;
            int i2 = this.A01;
            String str9 = this.A0D;
            int i3 = this.A02;
            int i4 = this.A03;
            String str10 = this.A0E;
            String str11 = this.A0G;
            Pair pair = (Pair) obj2;
            C68314NAb nAb = (C68314NAb) pair.first;
            String A0k = DbS.A0k();
            String A032 = C304566Ea.A03(nAb, (byte[]) this.A05);
            String A0W = C66584MXp.A0W(nAb, A032, (byte[]) this.A06);
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            String str16 = str7;
            String str17 = str8;
            String str18 = A032;
            return 1aU.A07(new C72166Oxb((AnonymousClass67N) pair.second, (C74233PrM) this.A09, (Integer) this.A07, (Integer) this.A08, str, str2, str12, str13, str14, str15, str16, str17, str18, str9, A0W, str10, str11, A0k, i, i2, i3, i4), AnonymousClass6F9.A00("instagram_xma_client_send"));
        }
        C304566Ea r1 = (C304566Ea) this.A05;
        Object obj3 = this.A06;
        Object obj4 = this.A09;
        String str19 = this.A0H;
        int i5 = this.A04;
        String str20 = this.A0I;
        String str21 = this.A0J;
        String str22 = this.A0K;
        String str23 = this.A0C;
        String str24 = this.A0F;
        String str25 = this.A0A;
        String str26 = this.A0B;
        int i6 = this.A01;
        String str27 = this.A0D;
        int i7 = this.A02;
        int i8 = this.A03;
        String str28 = this.A0E;
        Object obj5 = this.A07;
        Object obj6 = this.A08;
        String str29 = this.A0G;
        C74233PrM prM = (C74233PrM) obj2;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        String str30 = str22;
        String str31 = str23;
        String str32 = str24;
        String str33 = str25;
        String str34 = str26;
        return C71991OuP.A00(r1).A0M(new C72064Ovd(prM, obj5, obj6, obj3, obj4, str19, str20, str21, str30, str31, str32, str33, str34, str27, str28, str29, i5, i6, i7, i8, 1));
    }
}
