package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Iep  reason: case insensitive filesystem */
public final class C57686Iep implements JRF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57686Iep(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DaS(C267324bN r3, int i, int i2, boolean z) {
        if (this.A00 != 0) {
            0qQ.A0B(r3, 0);
            C51967G9n.A1I((2Wa) this.A01, ((C53806GuZ) this.A02).A02.CRr(r3));
        }
    }

    public final void DxZ(C267324bN r5, int i, int i2) {
        C270564gw A1P;
        if (this.A00 == 0) {
            0qQ.A0B(r5, 0);
            C53839Gv6 gv6 = (C53839Gv6) this.A02;
            C267324bN r3 = gv6.A01;
            if (C51969G9p.A1Y(r5, r3.getId())) {
                GJI gji = gv6.A06;
                if (gji == GJI.TEMPLATE_CREATION || gji == GJI.TRENDING_AUDIO) {
                    UserSession userSession = gv6.A04;
                    0qQ.A0B(userSession, 1);
                    if (!B58.A00(r3, r5, userSession, i2, AnonymousClass3ZJ.A0D(userSession, r3.A02))) {
                        1Xj r0 = r3.A02;
                        if ((r0 != null && (A1P = r0.A1P()) != null && A1P.BrX() != null && i2 == 2) || i2 == 2) {
                            ((2Wa) this.A01).A03(C59087J5u.A00);
                        }
                    }
                }
            }
        }
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
