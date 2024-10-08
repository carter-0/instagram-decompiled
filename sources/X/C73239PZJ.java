package X;

import android.net.Uri;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.PZJ  reason: case insensitive filesystem */
public final class C73239PZJ implements Runnable {
    public final /* synthetic */ AnonymousClass5HJ A00;
    public final /* synthetic */ C72215Oyg A01;

    public C73239PZJ(AnonymousClass5HJ r1, C72215Oyg oyg) {
        this.A00 = r1;
        this.A01 = oyg;
    }

    public final void run() {
        C254703su BRz;
        AnonymousClass5HJ r7 = this.A00;
        String str = r7.A0g;
        if (str == null) {
            str = "";
        }
        Uri A09 = DbT.A09(str);
        String A002 = C66630MZz.A00(A09);
        if (A002 == null) {
            0wb.A03("StellaMessageNotificationHandler", "Null message id from notification");
            return;
        }
        C72215Oyg oyg = this.A01;
        oyg.A05.put(A002, r7);
        UserSession userSession = oyg.A04;
        AnonymousClass1Nd.A00(userSession).A01(oyg.A03, 2Kb.class);
        1NW r4 = oyg.A00;
        if (r4 == null) {
            0qQ.A0F("handler");
            throw AnonymousClass00P.createAndThrow();
        }
        r4.A02(new C73238PZI(oyg, A002), 33735910, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        String A012 = C66630MZz.A01(A09);
        if (A012 != null && (BRz = 1bJ.A00(userSession).BRz(C66581MXm.A0e(A012), A002)) != null) {
            C72215Oyg.A00(oyg, A002);
            C72215Oyg.A01(r7, BRz, oyg);
        }
    }
}
