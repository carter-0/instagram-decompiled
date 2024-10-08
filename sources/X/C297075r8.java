package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5r8  reason: invalid class name and case insensitive filesystem */
public final class C297075r8 implements AnonymousClass57r {
    public final long A00;
    public final long A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ 1Xj A03;

    public C297075r8(0lg r3, 1Xj r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = C297085r9.A00(r4.getId());
        this.A01 = C297085r9.A01(r4.getId());
    }

    public final boolean Ak4() {
        return !this.A03.A4c();
    }

    public final boolean AkU() {
        return this.A03.A4M();
    }

    public final boolean Ake() {
        1Xj r4 = this.A03;
        UserSession userSession = this.A02;
        if (r4.A1u() == 1sw.A04 || r4.A1t() == AnonymousClass3QO.CLOSE_FRIENDS || ((userSession instanceof UserSession) && r4.CcK() && !C231122qu.A0M(userSession, r4))) {
            return false;
        }
        return true;
    }

    public final String BDl() {
        UserSession userSession = this.A02;
        if (userSession instanceof UserSession) {
            return C231122qu.A0H(userSession, this.A03.getId());
        }
        return null;
    }

    public final long BEV() {
        return this.A00;
    }

    public final long BZx() {
        return this.A01;
    }

    public final List BkB() {
        return 0sn.A00;
    }

    public final Boolean CWF() {
        boolean A5d;
        UserSession userSession = this.A02;
        if (userSession instanceof UserSession) {
            UserSession userSession2 = userSession;
            0qQ.A0A(userSession2);
            A5d = 0q2.A00(userSession2).A0N(this.A03);
        } else {
            A5d = this.A03.A5d();
        }
        return Boolean.valueOf(A5d);
    }

    public final Boolean CbB() {
        boolean CbC;
        UserSession userSession = this.A02;
        if (userSession instanceof UserSession) {
            UserSession userSession2 = userSession;
            0qQ.A0A(userSession2);
            CbC = C225892f5.A00(userSession2).A0O(this.A03);
        } else {
            CbC = this.A03.CbC();
        }
        return Boolean.valueOf(CbC);
    }
}
