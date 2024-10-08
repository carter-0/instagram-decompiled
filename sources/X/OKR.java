package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.concurrent.ExecutorService;

public final class OKR {
    public final UserSession A00;
    public final C258483z9 A01 = MoreExecutors.listeningDecorator((ExecutorService) new 0na(311177733, 3, false, false));

    public OKR(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C8707R1y A00(AnonymousClass9HR r14, ClipInfo clipInfo, Long l, String str, String str2, String str3) {
        0qQ.A0B(r14, 8);
        UserSession userSession = this.A00;
        ListenableFuture A012 = C70881OPy.A01(OUC.A00(userSession), userSession, r14);
        C258483z9 r3 = this.A01;
        0qQ.A06(r3);
        ClipInfo clipInfo2 = clipInfo;
        return C303646Ae.A02(new C71810OrC(new C73930PmA(8), 6), C303646Ae.A01(new C7277Q2c(3, new C73954PmY(this, clipInfo2, l, str2, str3)), C303646Ae.A01(new C7277Q2c(3, new C74189PqV((Object) A012, (Object) this, (Object) clipInfo2, str, 42)), A012, r3), r3), 1Lf.A01);
    }
}
