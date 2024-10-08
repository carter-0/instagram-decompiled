package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.87u  reason: invalid class name and case insensitive filesystem */
public final class C3511587u extends 2YL {
    public C270564gw A00;
    public final C3511787w A01;
    public final C3512087z A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final UserSession A05;

    public C3511587u(C3511787w r3, C3512087z r4, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(r4, 3);
        this.A05 = userSession;
        this.A01 = r3;
        this.A02 = r4;
        1HR r0 = new 1HR(0);
        this.A03 = r0;
        this.A04 = 0u9.A04(r0);
    }

    public final void A01() {
        List C9U;
        C270564gw r0 = this.A00;
        if (r0 != null && (C9U = r0.C9U()) != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(C9U, 10));
            for (Object next : C9U) {
                C318136oS A002 = C318116oQ.A00(this);
                arrayList.add(1Eo.A04(19B.A00, new C66188MGz(next, (Object) this, (AnonymousClass4D7) null, 12), A002));
            }
        }
    }

    public final void A00() {
        C318136oS A002 = C318116oQ.A00(this);
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 9);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }
}
