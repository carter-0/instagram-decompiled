package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.OvN  reason: case insensitive filesystem */
public final /* synthetic */ class C72048OvN implements AnonymousClass68Z {
    public final /* synthetic */ C304566Ea A00;
    public final /* synthetic */ ClipInfo A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C72048OvN(C304566Ea r1, ClipInfo clipInfo, Integer num, Long l, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A01 = clipInfo;
        this.A04 = str;
        this.A02 = num;
        this.A03 = l;
        this.A06 = z;
        this.A05 = str2;
    }

    public final Object apply(Object obj) {
        C304566Ea r2 = this.A00;
        ClipInfo clipInfo = this.A01;
        String str = this.A04;
        Integer num = this.A02;
        Long l = this.A03;
        boolean z = this.A06;
        String str2 = this.A05;
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C72176Oxl) {
            return C72176Oxl.A00(prM);
        }
        MsysThreadId msysThreadId = (MsysThreadId) C66996MgU.A02(prM);
        long j = msysThreadId.A00;
        Long A012 = AnonymousClass4KK.A01(msysThreadId);
        return C66581MXm.A0O(C66581MXm.A0M(new C72052OvR(r2, clipInfo, num, l, A012, str, str2, j, z), C71991OuP.A00(r2)), "rxmailbox_send_secure_video_message");
    }
}
