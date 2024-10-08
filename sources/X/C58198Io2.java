package X;

/* renamed from: X.Io2  reason: case insensitive filesystem */
public final class C58198Io2 extends 0Yg implements C62320sa {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ AnonymousClass8HJ A02;
    public final /* synthetic */ I09 A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58198Io2(AnonymousClass8HJ r2, I09 i09, String str, float f, float f2) {
        super(0);
        this.A03 = i09;
        this.A04 = str;
        this.A02 = r2;
        this.A01 = f;
        this.A00 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        I09 i09 = this.A03;
        C11443SVf sVf = i09.A00;
        if (sVf == null) {
            0qQ.A0F("framesHandler");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = this.A04;
        AnonymousClass8HJ r1 = this.A02;
        float f = this.A01;
        float f2 = this.A00;
        C56943IIm iIm = i09.A03;
        0qQ.A0B(iIm, 4);
        C11443SVf.A01(r1, iIm, sVf, str, f, f2);
        return C60340gF.A00;
    }
}
