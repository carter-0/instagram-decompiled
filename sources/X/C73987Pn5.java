package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.Pn5  reason: case insensitive filesystem */
public final class C73987Pn5 extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73987Pn5(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.A07 = str;
        this.A0C = str2;
        this.A0E = z;
        this.A00 = i;
        this.A08 = str3;
        this.A01 = i2;
        this.A0D = str4;
        this.A05 = l;
        this.A0H = z2;
        this.A04 = l2;
        this.A09 = str5;
        this.A0A = str6;
        this.A0B = str7;
        this.A03 = j;
        this.A06 = str8;
        this.A02 = i3;
        this.A0F = z3;
        this.A0G = z4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Mailbox A0H2 = C66581MXm.A0H(obj);
        C269794fh A002 = AnonymousClass6F9.A00("insert sync path notification");
        String str = this.A07;
        String str2 = this.A0C;
        boolean z = this.A0E;
        int i = this.A00;
        String str3 = this.A08;
        int i2 = this.A01;
        String str4 = this.A0D;
        Long l = this.A05;
        boolean z2 = this.A0H;
        Long l2 = this.A04;
        String str5 = this.A09;
        String str6 = this.A0A;
        String str7 = this.A0B;
        long j = this.A03;
        String str8 = this.A06;
        int i3 = this.A02;
        int i4 = i;
        String str9 = str;
        String str10 = str3;
        return 1aU.A07(new OxW(A0H2, l, l2, str9, str2, str10, str4, str5, str6, str7, str8, i4, i2, i3, j, z, z2, this.A0F, this.A0G), A002);
    }
}
