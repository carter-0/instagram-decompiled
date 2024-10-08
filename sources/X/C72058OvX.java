package X;

import android.util.Pair;

/* renamed from: X.OvX  reason: case insensitive filesystem */
public final /* synthetic */ class C72058OvX implements AnonymousClass68Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C74233PrM A02;
    public final /* synthetic */ C304566Ea A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ byte[] A0C;
    public final /* synthetic */ byte[] A0D;

    public /* synthetic */ C72058OvX(C74233PrM prM, C304566Ea r2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, byte[] bArr2, int i, int i2) {
        this.A03 = r2;
        this.A0C = bArr;
        this.A0D = bArr2;
        this.A02 = prM;
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = str5;
        this.A04 = num;
        this.A05 = num2;
        this.A07 = str6;
    }

    public final Object apply(Object obj) {
        C304566Ea r15 = this.A03;
        byte[] bArr = this.A0C;
        byte[] bArr2 = this.A0D;
        C74233PrM prM = this.A02;
        String str = this.A08;
        String str2 = this.A09;
        String str3 = this.A0A;
        String str4 = this.A0B;
        int i = this.A00;
        int i2 = this.A01;
        String str5 = this.A06;
        Integer num = this.A04;
        Integer num2 = this.A05;
        String str6 = this.A07;
        Pair pair = (Pair) obj;
        C68314NAb nAb = (C68314NAb) pair.first;
        String A0k = DbS.A0k();
        String A032 = C304566Ea.A03(nAb, bArr);
        String A0W = C66584MXp.A0W(nAb, A032, bArr2);
        String str7 = str5;
        String str8 = str6;
        String str9 = A032;
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        String str13 = str;
        Integer num3 = num2;
        Integer num4 = num;
        C304566Ea r17 = r15;
        C74233PrM prM2 = prM;
        return 1aU.A07(new OxS((AnonymousClass67N) pair.second, prM2, r17, num4, num3, str13, str12, str11, str9, str10, A0W, str7, str8, A0k, i, i2), AnonymousClass6F9.A00("instagram_xma_profile_share_client_send"));
    }
}
