package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class HKC extends C52050GCw implements JRF {
    public final GD6 A00;
    public final C52016GBn A01;
    public final UserSession A02;
    public final JTB A03;
    public final C262224Cq A04;

    public final void Dxm(C267324bN r6, Integer num, int i) {
        String str;
        int A06;
        C267324bN A0E;
        1Xj r1;
        JRN A022;
        C52016GBn gBn = this.A01;
        C376689Iy A0B = gBn.A0B();
        if (A0B != null && (str = (String) 00k.A0J(00k.A0X((Iterable) A0B.A01))) != null) {
            C52078GDy A023 = C52019GBq.A02(gBn);
            if (!(A023 == null || (A022 = C52016GBn.A02(gBn, A023)) == null)) {
                A022.EgQ(str);
            }
            C52012GBj gBj = this.A02;
            if (gBj != null && (A06 = gBj.A06()) >= 0) {
                C52009GBg gBg = this.A00.A0A;
                if (A06 < gBg.A0A() && (A0E = gBg.A0E(A06)) != null && (r1 = A0E.A02) != null && AnonymousClass3WS.A09(this.A02, r1)) {
                    this.A03.Ev4(r1, str);
                    1Eo.A05(AnonymousClass12T.A00.A04, new C58100ImM(this, this, (AnonymousClass4D7) null, 4), this.A04);
                }
            }
        }
    }

    public final void Dzs() {
    }

    public HKC(UserSession userSession, GD6 gd6, JTB jtb, C52016GBn gBn, C262224Cq r5) {
        C51974G9v.A1P(userSession, gd6, gBn, jtb);
        this.A02 = userSession;
        this.A00 = gd6;
        this.A01 = gBn;
        this.A03 = jtb;
        this.A04 = r5;
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
