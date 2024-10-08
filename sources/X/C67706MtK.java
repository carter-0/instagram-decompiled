package X;

/* renamed from: X.MtK  reason: case insensitive filesystem */
public final class C67706MtK extends V4M {
    public float A00 = 1.0f;
    public final C242553Us A01 = new C242553Us();

    public final /* bridge */ /* synthetic */ void A01(Object obj, float f) {
        C328287Ef r7 = (C328287Ef) obj;
        0qQ.A0B(r7, 0);
        this.A00 = f;
        C242553Us r5 = this.A01;
        float[] fArr = r7.BzG().A01;
        float f2 = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 > f2) {
                f2 = f3;
            }
        }
        r5.A06(f2);
        r7.FM4(r5, this.A00);
    }

    public final /* bridge */ /* synthetic */ float A00(Object obj) {
        return this.A00;
    }
}
