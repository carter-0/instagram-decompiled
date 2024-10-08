package X;

/* renamed from: X.Ixg  reason: case insensitive filesystem */
public final class C58795Ixg extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ AnonymousClass62O A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58795Ixg(AnonymousClass62O r2, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(1);
        this.A05 = r2;
        this.A03 = i;
        this.A06 = z;
        this.A04 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A02 = i5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C268104cl r11 = (C268104cl) obj;
        0qQ.A0B(r11, 0);
        AnonymousClass62O r0 = this.A05;
        int i2 = this.A03;
        boolean z = this.A06;
        int i3 = this.A04;
        int i4 = this.A01;
        int i5 = this.A00;
        int i6 = this.A02;
        int i7 = 0;
        for (Object next : r0) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C267974cY r3 = (C267974cY) next;
            int i9 = r3.A00;
            int i10 = r3.A01;
            int i11 = (i2 - i9) / 2;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        i = i3 - i10;
                    }
                } else if (z) {
                    i = (i3 - i4) / 2;
                } else {
                    i = ((i5 - i4) / 2) + i6;
                }
                r11.A05(r3, 0.0f, i, i11);
            } else {
                r11.A05(r3, 0.0f, 0, i11);
            }
            i7 = i8;
        }
        return C60340gF.A00;
    }
}
