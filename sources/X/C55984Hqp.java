package X;

import java.util.List;

/* renamed from: X.Hqp  reason: case insensitive filesystem */
public final class C55984Hqp {
    public float A00;
    public float A01;
    public float A02;
    public List A03;
    public final C270284gU A04;

    public C55984Hqp(C270284gU r2, List list, float f, float f2, float f3) {
        0qQ.A0B(r2, 5);
        this.A03 = list;
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A04 = r2;
    }

    public final C52924Gey A00(C268024cd r7) {
        float A032 = C51971G9r.A03(this.A04);
        float f = this.A00;
        float F06 = A032 * r7.F06(this.A02 + f);
        return C304796Fg.A00(this.A03, C289325dP.A00(F06 - r7.F06(f), 0.0f), C289325dP.A00(F06, r7.F06(this.A01)));
    }
}
