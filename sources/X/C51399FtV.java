package X;

import com.instagram.user.model.User;

/* renamed from: X.FtV  reason: case insensitive filesystem */
public final class C51399FtV implements Runnable {
    public final /* synthetic */ C3727892k A00;
    public final /* synthetic */ C47693EDc A01;

    public C51399FtV(C3727892k r1, C47693EDc eDc) {
        this.A01 = eDc;
        this.A00 = r1;
    }

    public final void run() {
        C47693EDc eDc = this.A01;
        eDc.A01.A0E("fetch_user_on_data");
        C3727892k r4 = this.A00;
        User A002 = C324696zk.A00(r4);
        C267604bt A003 = C47693EDc.A00(eDc);
        if (A002 != null) {
            if (A003 != null) {
                A003.EaM(false);
            }
            C267604bt A004 = C47693EDc.A00(eDc);
            if (A004 != null) {
                A004.Dwc(eDc.A02.A00(), A002, C324696zk.A01(r4), r4.mServerElapsedTime, r4.CPt());
            }
            C267604bt A005 = C47693EDc.A00(eDc);
            if (A005 != null) {
                0qQ.A0B(r4, 0);
                A005.Ehu(((C298935uH) r4.FH3()).BkJ());
            }
        } else if (A003 != null) {
            A003.DFR(false, true, AnonymousClass000.A00(487));
        }
    }
}
