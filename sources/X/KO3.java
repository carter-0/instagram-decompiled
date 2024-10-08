package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

public final class KO3 extends LRK {
    public AnonymousClass3Q2 A00;
    public final UserSession A01;
    public final C3499682q A02;
    public final C267834cI A03;
    public final Queue A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KO3(FragmentActivity fragmentActivity, UserSession userSession, C3499682q r7) {
        super(userSession);
        AnonymousClass3Q2 r0;
        String E2M;
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        this.A02 = r7;
        this.A03 = (C267834cI) fragmentActivity;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36323504789990602L)) {
            if (r7.COf()) {
                E2M = ((JWE) r7).A01.A0C;
            } else {
                E2M = r7.E2M();
            }
            r0 = JTQ.A0M(this.A01, E2M);
        } else {
            r0 = null;
        }
        this.A00 = r0;
        02z A012 = 106.A01(C361268fw.A00);
        this.A05 = A012;
        this.A06 = 10b.A03(A012);
        this.A04 = new LinkedList();
        if (!DbY.A1Y(r3, this.A01, 36323504790252750L)) {
            this.A03.EBv(new C65890M3f(this));
        }
    }

    public final AnonymousClass3Q2 A04() {
        AnonymousClass3Q2 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean A05() {
        String E2M;
        UserSession userSession = this.A01;
        if (!182.A06(0Tu.A05, userSession, 36323504789990602L)) {
            C3499682q r1 = this.A02;
            if (r1.COf()) {
                E2M = ((JWE) r1).A01.A0C;
            } else {
                E2M = r1.E2M();
            }
            this.A00 = JTQ.A0M(userSession, E2M);
        }
        return AnonymousClass7TF.A1V(this.A00);
    }
}
