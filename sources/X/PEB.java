package X;

import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class PEB implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ PEB(AnonymousClass7Z6 r1, 1Xj r2, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = r2;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        1Xj r2 = this.A01;
        1bp r3 = new 1bp(C66669Mac.A05(r0.A00, oDs, C65521dX.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r3.A00 = new C376649Iu(r2, (String) null);
        return r3;
    }
}
