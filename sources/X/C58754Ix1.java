package X;

/* renamed from: X.Ix1  reason: case insensitive filesystem */
public final class C58754Ix1 extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass5S2 A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58754Ix1(AnonymousClass5S2 r2, float f, float f2, int i, boolean z) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
        this.A03 = r2;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C52917Ger ger;
        AnonymousClass5RU r5 = (AnonymousClass5RU) obj;
        float F06 = r5.F06(this.A00);
        float F062 = r5.F06(this.A01);
        if (F06 <= 0.0f || F062 <= 0.0f) {
            ger = null;
        } else {
            ger = new C52917Ger(this.A02, F06, F062);
        }
        r5.EiT(ger);
        AnonymousClass5S2 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass5S0.A00;
        }
        r5.Ek8(r0);
        r5.ERg(this.A04);
        return C60340gF.A00;
    }
}
