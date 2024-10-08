package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.2v3  reason: invalid class name */
public final class AnonymousClass2v3 implements AnonymousClass2v2 {
    public long A00 = -1;
    public C233072uu A01;
    public final UserSession A02;

    public final void CNK(1Xj r9, Integer num, int i) {
        C250183l2 AaH;
        C269884fq B5D;
        AnonymousClass4EB A002;
        C233072uu r2;
        1Xj r3 = r9;
        0qQ.A0B(r9, 0);
        Integer num2 = num;
        0qQ.A0B(num, 2);
        C250513lZ injected = r9.A0C.getInjected();
        if (injected != null && (AaH = injected.AaH()) != null && (B5D = AaH.B5D()) != null && (A002 = C54773HSf.A00(AFI_TYPE.DWELL_FEED_SEE_MORE_LESS, B5D, this.A02, r3, num2, i, this.A00)) != null && (r2 = this.A01) != null) {
            r2.Dlz(AnonymousClass05K.A00, 0sr.A1M(new AnonymousClass4EB[]{A002}));
        }
    }

    public final void EEY() {
        this.A01 = null;
    }

    public final boolean EsQ(1Xj r6) {
        C250513lZ injected;
        C250183l2 AaH;
        boolean z = false;
        0qQ.A0B(r6, 0);
        if (!(!r6.CcK() || (injected = r6.A0C.getInjected()) == null || (AaH = injected.AaH()) == null || AaH.B5D() == null)) {
            UserSession userSession = this.A02;
            z = true;
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36326236389127821L) || !182.A06(r2, userSession, 36326236389193358L)) {
                return false;
            }
        }
        return z;
    }

    public AnonymousClass2v3(UserSession userSession) {
        this.A02 = userSession;
    }

    public final void Eir(C233072uu r1) {
        this.A01 = r1;
    }
}
