package X;

import android.view.Surface;

/* renamed from: X.Ldg  reason: case insensitive filesystem */
public final class C64539Ldg implements C41842B2x {
    public final /* synthetic */ C340297l2 A00;
    public final /* synthetic */ K6W A01;

    public C64539Ldg(C340297l2 r1, K6W k6w) {
        this.A01 = k6w;
        this.A00 = r1;
    }

    public final int BHR() {
        C18078Vl7 vl7 = this.A01.A00;
        if (vl7 != null) {
            return vl7.A04;
        }
        return 0;
    }

    public final int BHc() {
        C18078Vl7 vl7 = this.A01.A00;
        if (vl7 != null) {
            return vl7.A05;
        }
        return 0;
    }

    public final void D5c() {
        C18078Vl7 vl7;
        K6W k6w = this.A01;
        if (1Au.A00(AnonymousClass7TE.A0l(k6w.A0E)).A1q() && (vl7 = k6w.A00) != null) {
            vl7.A0B.connect();
        }
    }

    public final void DKa(Surface surface) {
        W0T A002;
        K6W k6w = this.A01;
        C18078Vl7 vl7 = k6w.A00;
        if (vl7 != null) {
            vl7.A01();
        }
        C18078Vl7 vl72 = k6w.A00;
        if (vl72 != null) {
            vl72.A04(surface);
        }
        C18078Vl7 vl73 = k6w.A00;
        if (vl73 != null) {
            vl73.A0B.EeW(C66292MMb.A01(this.A00, 8));
        }
        if (vl73 != null) {
            vl73.A07(K6W.__redex_internal_original_name);
        }
        C18078Vl7 vl74 = k6w.A00;
        if (vl74 != null) {
            vl74.A07(AnonymousClass000.A00(882));
        }
        C18078Vl7 vl75 = k6w.A00;
        if (vl75 != null) {
            vl75.A05(new K0Q(3, this.A00, k6w), K6W.__redex_internal_original_name);
        }
        C357488Yc A012 = C357488Yc.A03.A01(AnonymousClass7TE.A0l(k6w.A0E));
        if (A012 != null && (A002 = A012.A00()) != null && A002.A0I()) {
            C18078Vl7 vl76 = k6w.A00;
            if (vl76 == null || !vl76.A0B.isStreaming()) {
                C65816M0i m0i = k6w.A04;
                if (m0i != null) {
                    m0i.A0X.A0M(true, false);
                    return;
                }
                return;
            }
            C340297l2 r2 = this.A00;
            C390989sA r1 = C390989sA.A04;
            if (!C340297l2.A05(r1, r2)) {
                r2.EI4(true);
                C340297l2.A05(r1, r2);
            }
        }
    }

    public final void Dcz() {
        C18078Vl7 vl7 = this.A01.A00;
        if (vl7 != null) {
            vl7.A0B.release();
        }
    }

    public final void Dq3() {
        C18078Vl7 vl7 = this.A01.A00;
        if (vl7 != null) {
            vl7.A02();
        }
    }

    public final void Dq4() {
        C18078Vl7 vl7 = this.A01.A00;
        if (vl7 != null) {
            vl7.A0B.EwG(vl7.A06);
        }
    }

    public final void Egc(Surface surface) {
        C18078Vl7 vl7 = this.A01.A00;
        if (vl7 != null) {
            vl7.A04(surface);
        }
    }
}
