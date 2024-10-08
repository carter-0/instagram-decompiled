package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5GM  reason: invalid class name */
public final class AnonymousClass5GM extends C252733pa implements AnonymousClass2ak {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eK A03;
    public final C262224Cq A04 = this.A01;
    public final AnonymousClass0r6 A05;
    public final 05G A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GM(UserSession userSession, AnonymousClass0eK r4, AnonymousClass0eK r5) {
        super("ActivityFeed", AnonymousClass43D.A01(2109432776, 3));
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = r5;
        02z A012 = 106.A01(AnonymousClass5GO.A00);
        this.A06 = A012;
        this.A05 = 10b.A03(A012);
    }

    public static final ArrayList A00(AnonymousClass5GM r4) {
        ArrayList A1M = 0sr.A1M(new Integer[]{0});
        UserSession userSession = r4.A01;
        if ((182.A06(0Tu.A05, userSession, 36321481861244339L) || 182.A06(0Tu.A06, userSession, 36322684451170654L)) && C283115Ge.A00(userSession).A02()) {
            A1M.add(1520);
            A1M.add(1519);
        }
        return A1M;
    }

    public final void AHS(C71062aE r2) {
        this.A00 = false;
    }

    public final void Af1(C71062aE r4, C241513Pm r5, 2aX r6) {
        0qQ.A0B(r4, 0);
        if (r4 == 2aD.A0U) {
            boolean z = this.A00;
            r5.A00.resumeWith(new 2aX(r4, (List) null, z ? 1 : 0, z));
        }
    }

    public final void A01() {
        1Eo.A05(AnonymousClass12T.A00.CO6(480314591, 3), new C66161MFy(this, (AnonymousClass4D7) null, 44), this.A04);
    }

    public final void A02() {
        C262224Cq r4 = this.A04;
        1Eo.A03(AnonymousClass05K.A00, AnonymousClass12T.A00.CO6(480314591, 3), new C376879Jr(this, (AnonymousClass4D7) null, 27), r4);
    }

    public final void A03(List list) {
        1Eo.A05(AnonymousClass12T.A00.CO6(480314591, 3), new MGW(this, list, (AnonymousClass4D7) null, 36), this.A01);
    }
}
