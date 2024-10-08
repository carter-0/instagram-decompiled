package X;

import com.instagram.common.session.UserSession;

public final class PVX implements Runnable {
    public final /* synthetic */ UserSession A00;

    public PVX(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void run() {
        C372178zu A002 = C372178zu.A0A.A00();
        if (A002 != null) {
            A002.A06(this.A00.A06);
        }
        C66957Mfq A003 = C66957Mfq.A0A.A00();
        if (A003 != null) {
            A003.A03.remove(this.A00.A06);
            if (A003.A01 == null && DbT.A1b(A003.A04)) {
                C66957Mfq.A00(A003);
            }
        }
    }
}
