package X;

import android.util.Pair;

/* renamed from: X.OvY  reason: case insensitive filesystem */
public final /* synthetic */ class C72059OvY implements AnonymousClass68Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C74233PrM A04;
    public final /* synthetic */ C304566Ea A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ byte[] A0E;

    public /* synthetic */ C72059OvY(C74233PrM prM, C304566Ea r2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, int i, int i2, int i3, int i4) {
        this.A05 = r2;
        this.A0E = bArr;
        this.A03 = i;
        this.A04 = prM;
        this.A06 = l;
        this.A0B = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A07 = l2;
        this.A08 = str4;
        this.A00 = i2;
        this.A09 = str5;
        this.A01 = i3;
        this.A02 = i4;
        this.A0A = str6;
    }

    public final Object apply(Object obj) {
        C304566Ea r30 = this.A05;
        byte[] bArr = this.A0E;
        int i = this.A03;
        C74233PrM prM = this.A04;
        Long l = this.A06;
        String str = this.A0B;
        String str2 = this.A0C;
        String str3 = this.A0D;
        Long l2 = this.A07;
        String str4 = this.A08;
        int i2 = this.A00;
        String str5 = this.A09;
        int i3 = this.A01;
        int i4 = this.A02;
        String str6 = this.A0A;
        Pair pair = (Pair) obj;
        String A032 = C304566Ea.A03((C68314NAb) pair.first, bArr);
        17k.A07(A032, "Failed to resolve preview ID");
        String A0k = DbS.A0k();
        String str7 = A032;
        String str8 = str5;
        String str9 = str6;
        int i5 = i;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        Long l3 = l;
        Long l4 = l2;
        String str13 = str;
        return 1aU.A07(new OxT((AnonymousClass67N) pair.second, prM, r30, l3, l4, str13, str10, str11, str12, str7, str8, str9, A0k, i5, i2, i3, i4), AnonymousClass6F9.A00("instagram_xma_story_reply_client_send"));
    }
}
