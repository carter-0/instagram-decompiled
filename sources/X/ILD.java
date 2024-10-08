package X;

public final class ILD implements AnonymousClass1DK {
    public final int A00;
    public final Object A01;

    public ILD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Eyq(AnonymousClass11X r9) {
        int i;
        boolean z;
        int i2;
        int i3;
        AnonymousClass11X r2 = r9;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r9, 0);
                i = 5;
                z = true;
                i2 = ((IMZ) this.A01).A00;
                i3 = 1829080448;
                break;
            case 1:
                0qQ.A0B(r9, 0);
                C57035IMb iMb = (C57035IMb) this.A01;
                i = 5;
                if (iMb.A03) {
                    i = 1;
                }
                z = true;
                i2 = iMb.A00;
                i3 = 607231408;
                break;
            default:
                i2 = 0;
                0qQ.A0B(r9, 0);
                C57034IMa iMa = (C57034IMa) this.A01;
                if (iMa instanceof HKL) {
                    i3 = 1896466993;
                } else if (iMa instanceof HKK) {
                    i3 = 1201242664;
                } else if ((iMa instanceof HKO) || (iMa instanceof HKN)) {
                    i3 = 1332375112;
                } else if (iMa instanceof HKJ) {
                    i3 = 2108339649;
                } else if (iMa instanceof HKI) {
                    i3 = 802726432;
                } else if (iMa instanceof HKM) {
                    i3 = 2131697699;
                } else {
                    i3 = 1236399;
                }
                i = 3;
                z = true;
                break;
        }
        1ES.A04(r2, i3, i, i2, z, z);
    }
}
