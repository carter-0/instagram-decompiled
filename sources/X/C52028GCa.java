package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GCa  reason: case insensitive filesystem */
public final class C52028GCa extends C52050GCw implements JRF, AnonymousClass32U {
    public int A00;
    public Runnable A01;
    public final C52016GBn A02;
    public final UserSession A03;

    public C52028GCa(UserSession userSession, C52016GBn gBn) {
        0qQ.A0B(gBn, 2);
        this.A03 = userSession;
        this.A02 = gBn;
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
        0qQ.A0B(gDy, 0);
        if (!z) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                11Z.A01(runnable);
            }
            gDy.A0E.setVisibility(8);
        } else if (gDy.A0E.CFV() != 0) {
            C52647GaL gaL = new C52647GaL(gDy);
            11Z.A04(gaL, 1000);
            this.A01 = gaL;
        }
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DW8(int i, int i2) {
        this.A00 = i;
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
