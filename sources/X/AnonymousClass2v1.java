package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.2v1  reason: invalid class name */
public final class AnonymousClass2v1 implements AnonymousClass2v2 {
    public C233072uu A00;
    public final UserSession A01;

    public final void CNK(1Xj r9, Integer num, int i) {
        C250183l2 AaH;
        C269884fq B5N;
        AnonymousClass4EB A002;
        C233072uu r2;
        1Xj r3 = r9;
        0qQ.A0B(r9, 0);
        Integer num2 = num;
        0qQ.A0B(num, 2);
        C250513lZ injected = r9.A0C.getInjected();
        if (injected != null && (AaH = injected.AaH()) != null && (B5N = AaH.B5N()) != null && (A002 = C54773HSf.A00(AFI_TYPE.SEE_MORE_LESS, B5N, this.A01, r3, num2, i, -1)) != null && (r2 = this.A00) != null) {
            r2.Dlz(AnonymousClass05K.A00, 0sr.A1M(new AnonymousClass4EB[]{A002}));
        }
    }

    public final void EEY() {
        this.A00 = null;
    }

    public final boolean EsQ(1Xj r3) {
        C250513lZ injected;
        C250183l2 AaH;
        0qQ.A0B(r3, 0);
        if (!r3.CcK() || (injected = r3.A0C.getInjected()) == null || (AaH = injected.AaH()) == null || AaH.B5N() == null) {
            return false;
        }
        return C295435o9.A01(this.A01);
    }

    public AnonymousClass2v1(UserSession userSession) {
        this.A01 = userSession;
    }

    public final void Eir(C233072uu r1) {
        this.A00 = r1;
    }
}
