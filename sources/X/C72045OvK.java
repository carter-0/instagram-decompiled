package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OvK  reason: case insensitive filesystem */
public final /* synthetic */ class C72045OvK implements AnonymousClass68Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C68123N1l A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MYb A03;
    public final /* synthetic */ OMq A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ C72045OvK(C68123N1l n1l, UserSession userSession, MYb mYb, OMq oMq, List list, int i) {
        this.A03 = mYb;
        this.A04 = oMq;
        this.A01 = n1l;
        this.A00 = i;
        this.A02 = userSession;
        this.A05 = list;
    }

    public final Object apply(Object obj) {
        MYb mYb = this.A03;
        OMq oMq = this.A04;
        C68123N1l n1l = this.A01;
        int i = this.A00;
        UserSession userSession = this.A02;
        List list = this.A05;
        NAE nae = (NAE) obj;
        if (oMq != null) {
            oMq.A01.markerPoint(20132336, oMq.A00, "preview_fetch_start");
        }
        String obj2 = n1l.A00.toString();
        boolean A1R = AnonymousClass7TF.A1R(i);
        String A002 = C70106NxM.A00(userSession);
        boolean A022 = 2Aj.A02(userSession);
        return 1aU.A07(new C72160OxK(nae, oMq, obj2, A002, A1R, A022), AnonymousClass6F9.A00("mailbox_instagram_open_xma_receiver_fetch")).A0M(new C72037OvC(3, list, mYb, oMq, nae));
    }
}
