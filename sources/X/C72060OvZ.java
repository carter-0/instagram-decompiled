package X;

import android.util.Pair;

/* renamed from: X.OvZ  reason: case insensitive filesystem */
public final class C72060OvZ implements AnonymousClass68Z {
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

    public C72060OvZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A09 = obj2;
        this.A0A = obj5;
        this.A07 = obj6;
        this.A04 = i;
        this.A08 = obj;
        this.A0H = str;
        this.A0I = str2;
        this.A0G = str3;
        this.A0C = str4;
        this.A0B = str5;
        this.A01 = i2;
        this.A0D = str6;
        this.A02 = i3;
        this.A03 = i4;
        this.A0E = str7;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A0F = str8;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        int i = this.A00;
        C304566Ea r13 = (C304566Ea) this.A09;
        if (i != 0) {
            byte[] bArr = (byte[]) this.A0A;
            byte[] bArr2 = (byte[]) this.A07;
            int i2 = this.A04;
            String str = this.A0G;
            String str2 = this.A0H;
            String str3 = this.A0I;
            Long l = (Long) this.A08;
            String str4 = this.A0F;
            String str5 = this.A0B;
            int i3 = this.A01;
            String str6 = this.A0C;
            int i4 = this.A02;
            int i5 = this.A03;
            String str7 = this.A0D;
            Integer num = (Integer) this.A05;
            Integer num2 = (Integer) this.A06;
            String str8 = this.A0E;
            C74233PrM prM = (C74233PrM) obj2;
            if (prM instanceof C72176Oxl) {
                return C72176Oxl.A00(prM);
            }
            return C71991OuP.A00(r13).A0M(new C72061Ova(prM, r13, num, num2, l, str, str2, str3, str4, str5, str6, str7, str8, bArr, bArr2, i2, i3, i4, i5));
        }
        int i6 = this.A04;
        String str9 = this.A0H;
        String str10 = this.A0I;
        String str11 = this.A0G;
        String str12 = this.A0C;
        String str13 = this.A0B;
        int i7 = this.A01;
        String str14 = this.A0D;
        int i8 = this.A02;
        int i9 = this.A03;
        String str15 = this.A0E;
        String str16 = this.A0F;
        Pair pair = (Pair) obj2;
        C68314NAb nAb = (C68314NAb) pair.first;
        String A0k = DbS.A0k();
        String A032 = C304566Ea.A03(nAb, (byte[]) this.A0A);
        String A0W = C66584MXp.A0W(nAb, A032, (byte[]) this.A07);
        C269794fh A002 = AnonymousClass6F9.A00("instagram_xma_clips_share_client_send");
        C304566Ea r16 = r13;
        Integer num3 = (Integer) this.A05;
        Integer num4 = (Integer) this.A06;
        String str17 = str12;
        String str18 = str13;
        String str19 = A032;
        String str20 = str14;
        return 1aU.A07(new OxX((AnonymousClass67N) pair.second, (C74233PrM) this.A08, r16, num3, num4, str9, str10, str11, str17, str18, str19, str20, A0W, str15, str16, A0k, i6, i7, i8, i9), A002);
    }
}
