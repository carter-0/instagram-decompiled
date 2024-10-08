package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class IPD implements C250603lj {
    public final ClipsViewerConfig A00;
    public final UserSession A01;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        AnonymousClass3W1 r4;
        int A0A;
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r8);
        1Xj r5 = ((C267324bN) r7.A03).A02;
        if (r5 != null && (r4 = ((C52058GDe) r7.A04).A0E) != null && (A0A = C51968G9o.A0A(r7, r8)) != 0 && A0A != A1U) {
            UserSession userSession = this.A01;
            if (182.A06(0Tu.A05, userSession, 36326760375138261L) && r4.A1q) {
                AnonymousClass1Nd.A00(userSession).A00(new C240163Jv(r5));
            }
        }
    }

    public IPD(ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, clipsViewerConfig);
        this.A01 = userSession;
        this.A00 = clipsViewerConfig;
    }
}
