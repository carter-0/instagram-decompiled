package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ier  reason: case insensitive filesystem */
public final class C57688Ier implements JRF {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final GMD A03;
    public final UserSession A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();

    public C57688Ier(GMD gmd, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = gmd;
        this.A00 = str;
    }

    public final void Dxm(C267324bN r6, Integer num, int i) {
        AnonymousClass9JD A022;
        0qQ.A0B(r6, 0);
        if (!this.A02) {
            this.A05.putAll(1Av.A02(1Au.A00(this.A04), AnonymousClass000.A00(589)));
            this.A02 = true;
        }
        if (!0qQ.A0K(r6.getId(), this.A00)) {
            this.A01 = false;
            this.A00 = r6.getId();
        }
        if (!this.A01 && (A022 = this.A03.A02(r6)) != null) {
            this.A05.put(A022.A03, Double.valueOf(3.0d));
            this.A01 = true;
        }
    }

    public final void Dxg(C267324bN r5, int i) {
        if (this.A02) {
            1Av A002 = 1Au.A00(this.A04);
            HashMap hashMap = this.A05;
            0qQ.A0B(hashMap, 0);
            1Av.A05(A002, AnonymousClass000.A00(589), hashMap);
            hashMap.clear();
            this.A02 = false;
        }
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
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
