package X;

import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.WeM  reason: case insensitive filesystem */
public final class C19720WeM implements XAU {
    public C17887Vhe A00;

    public final void EXZ(C18735VzF vzF) {
        0qQ.A0B(vzF, 0);
        C17887Vhe vhe = this.A00;
        0qQ.A0A(vhe);
        vhe.A00(vzF.A04, vzF.A03);
    }

    public final void Ewg(C18735VzF vzF) {
        0qQ.A0B(vzF, 0);
        this.A00 = new C17887Vhe(vzF.A04, vzF.A03);
    }

    public final void AIc(long j) {
        C17887Vhe vhe = this.A00;
        0qQ.A0A(vhe);
        Point2 point2 = vhe.A00;
        if (point2 != vhe.A01) {
            vhe.A00(point2, j);
            vhe.A01 = vhe.A00;
        }
    }

    public final C18618VvB BtS() {
        C17887Vhe vhe = this.A00;
        0qQ.A0A(vhe);
        C18618VvB vvB = vhe.A02;
        0qQ.A07(vvB);
        return vvB;
    }
}
