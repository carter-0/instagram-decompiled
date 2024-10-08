package X;

/* renamed from: X.QyE  reason: case insensitive filesystem */
public final class C8620QyE extends TL4 {
    public final /* synthetic */ C365498nD A00;
    public final /* synthetic */ RPW A01;
    public final /* synthetic */ C10613Rv7 A02;
    public final /* synthetic */ byte[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8620QyE(C365498nD r1, C365498nD r2, RPW rpw, C10613Rv7 rv7, byte[] bArr) {
        super(r1);
        this.A02 = rv7;
        this.A03 = bArr;
        this.A00 = r2;
        this.A01 = rpw;
    }

    public final void A00(Exception exc) {
        if (exc instanceof C13210TQb) {
            super.A00(new C8360QpI(-9, exc));
        } else {
            super.A00(exc);
        }
    }
}
