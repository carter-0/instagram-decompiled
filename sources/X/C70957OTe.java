package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OTe  reason: case insensitive filesystem */
public final class C70957OTe {
    public long A00;
    public final AnonymousClass0iw A01;
    public final 1a8 A02 = C66581MXm.A0P();
    public final UserSession A03;
    public final C66813Mcz A04;

    public /* synthetic */ C70957OTe(AnonymousClass0iw r2, UserSession userSession) {
        C66813Mcz mcz = new C66813Mcz(r2, userSession);
        this.A03 = userSession;
        this.A01 = r2;
        this.A04 = mcz;
    }

    public static final void A00(C70957OTe oTe, MsysThreadId msysThreadId) {
        oTe.A02.A02(C72120Owf.A01(MYc.A01(oTe.A03, "MsysProactiveWarningBannerManager").A01.A0B, msysThreadId, 48).A0Q(C318146oT.A00), PU4.A00);
    }
}
