package X;

/* renamed from: X.HGu  reason: case insensitive filesystem */
public final class C54508HGu extends C263754Nf {
    public final float A00;
    public final C54189H2j A01;
    public final C267324bN A02;
    public final C57611Idc A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54508HGu(C54189H2j h2j, C267324bN r5, C57611Idc idc, int i) {
        super((Object) r5, i);
        float f;
        C246623eu A1S;
        1Xj r0 = r5.A02;
        if (r0 == null || (A1S = r0.A1S()) == null) {
            f = 0.5625f;
        } else {
            f = ((float) A1S.A01) / ((float) A1S.A00);
        }
        this.A02 = r5;
        this.A03 = idc;
        this.A01 = h2j;
        this.A00 = f;
    }
}
