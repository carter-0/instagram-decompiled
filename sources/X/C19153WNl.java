package X;

/* renamed from: X.WNl  reason: case insensitive filesystem */
public final class C19153WNl implements C240093Jo {
    public final /* synthetic */ WWD A00;
    public final /* synthetic */ X46 A01;

    public final float AwJ(C238133Ar r1, float f) {
        return f;
    }

    public final boolean EsH() {
        return false;
    }

    public final boolean EsI(C238133Ar r2) {
        return false;
    }

    public C19153WNl(WWD wwd, X46 x46) {
        this.A00 = wwd;
        this.A01 = x46;
    }

    public final void Dtt(float f) {
        WWD wwd = this.A00;
        float f2 = wwd.A01 - f;
        wwd.A00 = f2;
        if (f2 <= 1.1f) {
            f2 = 0.0f;
            wwd.A00 = 0.0f;
        }
        this.A01.DIt(f2);
    }

    public final /* synthetic */ boolean E3Y() {
        return false;
    }

    public final /* synthetic */ boolean Es8() {
        return true;
    }

    public final boolean EsJ(C238133Ar r2) {
        return AnonymousClass7TF.A1Q(r2.B6L());
    }
}
