package X;

import android.util.Pair;

/* renamed from: X.Owe  reason: case insensitive filesystem */
public final class C72119Owe implements AnonymousClass68Z {
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

    public C72119Owe(C74233PrM prM, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        this.A00 = 1;
        this.A08 = bArr;
        this.A09 = bArr2;
        this.A07 = prM;
        this.A0E = str;
        this.A04 = i;
        this.A0F = str2;
        this.A0G = str3;
        this.A0H = str4;
        this.A0C = str5;
        this.A01 = i2;
        this.A0A = str6;
        this.A02 = i3;
        this.A03 = i4;
        this.A0B = str7;
        this.A05 = num;
        this.A06 = num2;
        this.A0D = str8;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C304566Ea r11 = (C304566Ea) this.A08;
                byte[] bArr = (byte[]) this.A09;
                byte[] bArr2 = (byte[]) this.A07;
                String str = this.A0E;
                int i = this.A04;
                String str2 = this.A0F;
                String str3 = this.A0G;
                String str4 = this.A0H;
                String str5 = this.A0C;
                int i2 = this.A01;
                String str6 = this.A0A;
                int i3 = this.A02;
                int i4 = this.A03;
                String str7 = this.A0B;
                Integer num = (Integer) this.A05;
                Integer num2 = (Integer) this.A06;
                String str8 = this.A0D;
                C74233PrM prM = (C74233PrM) obj2;
                if (prM instanceof C72176Oxl) {
                    return C72176Oxl.A00(prM);
                }
                String str9 = str8;
                String str10 = str;
                String str11 = str3;
                return C71991OuP.A00(r11).A0M(new C72119Owe(prM, num, num2, str10, str2, str11, str4, str5, str6, str7, str9, bArr, bArr2, i, i2, i3, i4));
            case 1:
                String str12 = this.A0E;
                int i5 = this.A04;
                String str13 = this.A0F;
                String str14 = this.A0G;
                String str15 = this.A0H;
                String str16 = this.A0C;
                int i6 = this.A01;
                String str17 = this.A0A;
                int i7 = this.A02;
                int i8 = this.A03;
                String str18 = this.A0B;
                String str19 = this.A0D;
                Pair pair = (Pair) obj2;
                C68314NAb nAb = (C68314NAb) pair.first;
                String A0k = DbS.A0k();
                String A032 = C304566Ea.A03(nAb, (byte[]) this.A08);
                String A0W = C66584MXp.A0W(nAb, A032, (byte[]) this.A09);
                C269794fh A002 = AnonymousClass6F9.A00("instagram_xma_igtv_share_client_send");
                String str20 = str15;
                String str21 = str16;
                String str22 = A032;
                String str23 = str17;
                String str24 = str18;
                Integer num3 = (Integer) this.A05;
                Integer num4 = (Integer) this.A06;
                String str25 = str14;
                return 1aU.A07(new OxV((AnonymousClass67N) pair.second, (C74233PrM) this.A07, num3, num4, str12, str13, str25, str20, str21, str22, str23, A0W, str24, str19, A0k, i5, i6, i7, i8), A002);
            default:
                C304566Ea r13 = (C304566Ea) this.A08;
                Object obj3 = this.A09;
                Object obj4 = this.A07;
                int i9 = this.A04;
                String str26 = this.A0F;
                String str27 = this.A0G;
                String str28 = this.A0H;
                String str29 = this.A0E;
                String str30 = this.A0A;
                int i10 = this.A01;
                String str31 = this.A0B;
                int i11 = this.A02;
                int i12 = this.A03;
                String str32 = this.A0C;
                Object obj5 = this.A05;
                Object obj6 = this.A06;
                String str33 = this.A0D;
                C74233PrM prM2 = (C74233PrM) obj2;
                if (prM2 instanceof C72176Oxl) {
                    return C72176Oxl.A00(prM2);
                }
                Object obj7 = obj4;
                String str34 = str26;
                return C71991OuP.A00(r13).A0M(new C72060OvZ(prM2, r13, obj5, obj6, obj3, obj7, str34, str27, str28, str29, str30, str31, str32, str33, i9, i10, i11, i12, 0));
        }
    }

    public C72119Owe(C304566Ea r6, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A08 = r6;
        this.A09 = bArr;
        this.A07 = bArr2;
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        int i9 = i2;
        if (i5 != 0) {
            this.A04 = i8;
            this.A0F = str;
            this.A0G = str2;
            this.A0H = str3;
            this.A0E = str4;
            this.A0A = str5;
            this.A01 = i9;
            this.A0B = str6;
            this.A02 = i6;
            this.A03 = i7;
            this.A0C = str7;
        } else {
            this.A0E = str;
            this.A04 = i8;
            this.A0F = str2;
            this.A0G = str3;
            this.A0H = str4;
            this.A0C = str5;
            this.A01 = i9;
            this.A0A = str6;
            this.A02 = i6;
            this.A03 = i7;
            this.A0B = str7;
        }
        this.A05 = num;
        this.A06 = num2;
        this.A0D = str8;
    }
}
