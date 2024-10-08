package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OvL  reason: case insensitive filesystem */
public final /* synthetic */ class C72046OvL implements AnonymousClass68Z {
    public final /* synthetic */ C304566Ea A00;
    public final /* synthetic */ C352218Cl A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C72046OvL(C304566Ea r1, C352218Cl r2, Integer num, Long l, String str, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
        this.A03 = l;
        this.A05 = z;
        this.A04 = str;
    }

    public final Object apply(Object obj) {
        C304566Ea r2 = this.A00;
        C352218Cl r3 = this.A01;
        Integer num = this.A02;
        Long l = this.A03;
        boolean z = this.A05;
        String str = this.A04;
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        MsysThreadId msysThreadId = (MsysThreadId) C66996MgU.A02(prM);
        long j = msysThreadId.A00;
        Long A012 = AnonymousClass4KK.A01(msysThreadId);
        return C66581MXm.A0O(C66581MXm.A0M(new C72050OvP(r2, r3, num, l, A012, str, j, z), C71991OuP.A00(r2)), "rxmailbox_send_secure_image_message");
    }
}
