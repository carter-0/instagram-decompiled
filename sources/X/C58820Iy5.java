package X;

/* renamed from: X.Iy5  reason: case insensitive filesystem */
public final class C58820Iy5 extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C59662JSh A05;
    public final /* synthetic */ C268004cb A06;
    public final /* synthetic */ int[] A07;
    public final /* synthetic */ int[] A08;
    public final /* synthetic */ C267974cY[] A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58820Iy5(C59662JSh jSh, C268004cb r3, int[] iArr, int[] iArr2, C267974cY[] r6, int i, int i2, int i3, int i4, int i5) {
        super(1);
        this.A07 = iArr;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A09 = r6;
        this.A05 = jSh;
        this.A01 = i4;
        this.A06 = r3;
        this.A00 = i5;
        this.A08 = iArr2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C289085cz r1;
        C291605ha r12;
        C268104cl r10 = (C268104cl) obj;
        int[] iArr = this.A07;
        if (iArr != null) {
            i = iArr[this.A02];
        } else {
            i = 0;
        }
        int i2 = this.A04;
        int i3 = i2;
        while (i2 < this.A03) {
            C267974cY r4 = this.A09[i2];
            0qQ.A0A(r4);
            C59662JSh jSh = this.A05;
            Object BaX = r4.BaX();
            if (BaX instanceof C289085cz) {
                r1 = (C289085cz) BaX;
            } else {
                r1 = null;
            }
            int i4 = this.A01;
            int i5 = this.A00;
            if (r1 == null || (r12 = r1.A01) == null) {
                r12 = ((C56849IEw) jSh).A06;
            }
            int A0G = i4 - r4.A0G();
            r10.A05(r4, 0.0f, this.A08[i2 - i3], r12.A00(r4, AnonymousClass5Q8.Ltr, A0G, i5) + i);
            i2++;
        }
        return C60340gF.A00;
    }
}
