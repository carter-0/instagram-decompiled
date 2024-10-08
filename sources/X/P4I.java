package X;

import com.instagram.common.session.UserSession;

public final class P4I implements C13756TgS {
    public final /* synthetic */ C72358P2x A00;
    public final /* synthetic */ boolean A01;

    public P4I(C72358P2x p2x, boolean z) {
        this.A00 = p2x;
        this.A01 = z;
    }

    public final void onFailure() {
        OWM owm = OWM.A00;
        C72358P2x p2x = this.A00;
        owm.A01(p2x.A02, "thread_details_page", N4P.A03(p2x.A06));
    }

    public final void onSuccess() {
        C72358P2x p2x = this.A00;
        UserSession userSession = p2x.A02;
        C254793t3 r4 = p2x.A06.A0L;
        C254763t0 A012 = C300965yF.A01(r4);
        boolean z = this.A01;
        C66671Mae.A0A(userSession, A012, "thread_details_page", z);
        String A0x = C66580MXl.A0x(r4);
        C270264gS r1 = p2x.A05;
        if (z) {
            if (A0x != null) {
                r1.A02.add(A0x);
            }
            r1.A01 = false;
        } else if (A0x != null) {
            r1.A02.remove(A0x);
        }
        p2x.A07.invoke();
        OWM.A00.A02(userSession, "thread_details_page", C300965yF.A07(r4));
    }
}
