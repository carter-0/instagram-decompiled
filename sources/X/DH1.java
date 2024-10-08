package X;

import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class DH1 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ C51151FpN A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ DH1(AnonymousClass7Z6 r1, C51151FpN fpN, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A04 = z;
        this.A02 = str;
        this.A01 = fpN;
        this.A03 = str2;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A04;
        String str = this.A02;
        C51151FpN fpN = this.A01;
        String str2 = this.A03;
        C66665MaY A05 = C66669Mac.A05(r0.A00, oDs, C66221kr.class, str, z);
        String str3 = fpN.A08;
        String str4 = fpN.A09;
        String str5 = fpN.A07;
        String str6 = fpN.A02;
        long A0H = AnonymousClass7TG.A0H();
        0qQ.A0B(directThreadKey, 2);
        0qQ.A0B(str2, 5);
        1bp r6 = new 1bp(A05, directThreadKey, l, A0H);
        r6.A02 = str3;
        r6.A03 = str4;
        r6.A00 = str2;
        r6.A01 = str5;
        r6.A04 = str6;
        return r6;
    }
}
