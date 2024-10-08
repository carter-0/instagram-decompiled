package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OvQ  reason: case insensitive filesystem */
public final /* synthetic */ class C72051OvQ implements AnonymousClass68Z {
    public final /* synthetic */ C304566Ea A00;
    public final /* synthetic */ 2FW A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C72051OvQ(C304566Ea r1, 2FW r2, Integer num, Integer num2, Long l, String str, String str2, String str3, boolean z) {
        this.A00 = r1;
        this.A05 = str;
        this.A08 = z;
        this.A04 = l;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = r2;
        this.A02 = num;
        this.A03 = num2;
    }

    public final Object apply(Object obj) {
        C304566Ea r2 = this.A00;
        String str = this.A05;
        boolean z = this.A08;
        Long l = this.A04;
        String str2 = this.A06;
        String str3 = this.A07;
        2FW r3 = this.A01;
        Integer num = this.A02;
        Integer num2 = this.A03;
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        MsysThreadId msysThreadId = (MsysThreadId) C66996MgU.A02(prM);
        long j = msysThreadId.A00;
        Long A012 = AnonymousClass4KK.A01(msysThreadId);
        String A0k = DbS.A0k();
        return C66581MXm.A0O(C66581MXm.A0M(new C72054OvT(r2, r3, num2, num, A012, l, str, str2, str3, A0k, j, z), r2.A00), "rxmailbox_send_secure_text_message");
    }
}
