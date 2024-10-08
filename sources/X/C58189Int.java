package X;

/* renamed from: X.Int  reason: case insensitive filesystem */
public final class C58189Int extends 0Yg implements C62320sa {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ I09 A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58189Int(I09 i09, String str, float f, float f2) {
        super(0);
        this.A02 = i09;
        this.A03 = str;
        this.A01 = f;
        this.A00 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        I09 i09 = this.A02;
        C11443SVf sVf = i09.A00;
        if (sVf == null) {
            0qQ.A0F("framesHandler");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = this.A03;
        float f = this.A01;
        float f2 = this.A00;
        C56943IIm iIm = i09.A03;
        0qQ.A0B(iIm, 4);
        C11443SVf.A01((AnonymousClass8HJ) null, iIm, sVf, str, f, f2);
        return C60340gF.A00;
    }
}
