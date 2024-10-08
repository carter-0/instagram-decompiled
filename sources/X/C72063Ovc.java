package X;

import android.util.Pair;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ovc  reason: case insensitive filesystem */
public final class C72063Ovc implements AnonymousClass68Z {
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
    public final Object A0A;
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

    public C72063Ovc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A05 = obj6;
        this.A06 = obj;
        this.A04 = i;
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A09 = obj5;
        this.A0K = str4;
        this.A0A = obj2;
        this.A0F = str5;
        this.A01 = i2;
        this.A02 = i3;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A03 = i4;
        this.A0E = str9;
        this.A07 = obj3;
        this.A08 = obj4;
        this.A0G = str10;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            int i = this.A04;
            String str = this.A0H;
            String str2 = this.A0I;
            String str3 = this.A0J;
            String str4 = this.A0K;
            String str5 = this.A0F;
            int i2 = this.A01;
            int i3 = this.A02;
            String str6 = this.A0B;
            String str7 = this.A0C;
            String str8 = this.A0D;
            int i4 = this.A03;
            String str9 = this.A0E;
            String str10 = this.A0G;
            Pair pair = (Pair) obj2;
            C68314NAb nAb = (C68314NAb) pair.first;
            String A0k = DbS.A0k();
            String A032 = C304566Ea.A03(nAb, (byte[]) this.A05);
            17k.A07(A032, "Failed to resolve preview ID");
            C68113N1b A002 = C70108NxO.A00(C69422Nl4.A0M, ImmutableList.of(C69423Nl5.A05));
            C269794fh A003 = AnonymousClass6F9.A00("instagram_xma_client_send");
            Integer num = (Integer) this.A08;
            Long l = (Long) this.A09;
            String str11 = str6;
            String str12 = str7;
            return 1aU.A07(new C72167Oxc((AnonymousClass67N) pair.second, A002, (C74233PrM) this.A06, (Boolean) this.A0A, (Integer) this.A07, num, l, str, str2, str3, str4, str5, str11, str12, str8, A032, str9, str10, A0k, i, i2, i3, i4), A003);
        }
        C304566Ea r1 = (C304566Ea) this.A05;
        Object obj3 = this.A06;
        int i5 = this.A04;
        String str13 = this.A0H;
        String str14 = this.A0I;
        String str15 = this.A0J;
        Object obj4 = this.A09;
        String str16 = this.A0K;
        Object obj5 = this.A0A;
        String str17 = this.A0F;
        int i6 = this.A01;
        int i7 = this.A02;
        String str18 = this.A0B;
        String str19 = this.A0C;
        String str20 = this.A0D;
        int i8 = this.A03;
        String str21 = this.A0E;
        Object obj6 = this.A07;
        Object obj7 = this.A08;
        String str22 = this.A0G;
        C74233PrM prM = (C74233PrM) obj2;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        String str23 = str16;
        String str24 = str17;
        return C71991OuP.A00(r1).A0M(new C72063Ovc(prM, obj5, obj6, obj7, obj4, obj3, str13, str14, str15, str23, str24, str18, str19, str20, str21, str22, i5, i6, i7, i8, 1));
    }
}
