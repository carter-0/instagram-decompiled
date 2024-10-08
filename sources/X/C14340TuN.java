package X;

/* renamed from: X.TuN  reason: case insensitive filesystem */
public final class C14340TuN implements C240963Ni {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C14340TuN(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
    }

    public final void DEN() {
        WW4 ww4;
        1Xj r4;
        int i;
        C296935qt r2;
        int i2;
        switch (this.A00) {
            case 0:
                ww4 = (WW4) this.A01;
                r4 = (1Xj) this.A03;
                C296995qz r0 = (C296995qz) this.A02;
                i = r0.A01;
                i2 = r0.A00;
                r2 = (C296935qt) this.A04;
                break;
            case 1:
                r2 = (C296935qt) this.A03;
                C296995qz r02 = (C296995qz) this.A01;
                ww4 = ((C14371Tv0) this.A04).A03;
                r4 = (1Xj) this.A02;
                i = r02.A01;
                i2 = r02.A00;
                break;
            default:
                return;
        }
        ww4.DQR(r4, r2.A01, i, i2);
    }

    public final void DO4(C240983Nk r7) {
        HAS has;
        1Xj r4;
        int i;
        int i2;
        WW4 ww4;
        switch (this.A00) {
            case 0:
                ww4 = (WW4) this.A01;
                r4 = (1Xj) this.A03;
                C296995qz r0 = (C296995qz) this.A02;
                i = r0.A01;
                i2 = r0.A00;
                has = (C296935qt) this.A04;
                break;
            case 1:
                ww4 = ((C14371Tv0) this.A04).A03;
                HAS has2 = (HAS) this.A03;
                C296995qz r02 = (C296995qz) this.A01;
                ww4.A0I(r02, has2);
                r4 = (1Xj) this.A02;
                i = r02.A01;
                i2 = r02.A00;
                has = has2;
                break;
            default:
                return;
        }
        ww4.DQT(r4, has.A01, i, i2);
    }
}
