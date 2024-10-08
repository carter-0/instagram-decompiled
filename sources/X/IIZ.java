package X;

public final class IIZ implements C59536JNi {
    public final int A00;
    public final Object A01;

    public IIZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DFc(boolean z) {
        2Wa r1;
        C54633HLq hLq;
        switch (this.A00) {
            case 0:
                if (z) {
                    IIX iix = (IIX) this.A01;
                    if (iix.A01) {
                        iix.cancel();
                        return;
                    }
                }
                IIX iix2 = (IIX) this.A01;
                if (iix2.A01 && !z) {
                    int i = iix2.A00 + 1;
                    iix2.A00 = i;
                    if (iix2.A03.length == i) {
                        iix2.A01 = false;
                        iix2.A00 = 0;
                        for (C59536JNi DFc : iix2.A02) {
                            DFc.DFc(false);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (z) {
                    IIY iiy = (IIY) this.A01;
                    if (iiy.A01) {
                        iiy.cancel();
                        return;
                    }
                }
                IIY iiy2 = (IIY) this.A01;
                if (iiy2.A01 && !z) {
                    int i2 = iiy2.A00 + 1;
                    iiy2.A00 = i2;
                    C59606JQa[] jQaArr = iiy2.A03;
                    if (i2 == 2) {
                        iiy2.A01 = false;
                        iiy2.A00 = 0;
                        for (C59536JNi DFc2 : iiy2.A02) {
                            DFc2.DFc(false);
                        }
                        return;
                    }
                    jQaArr[i2].start();
                    return;
                }
                return;
            case 2:
                r1 = (2Wa) this.A01;
                hLq = C54633HLq.SCALING_DOWN;
                break;
            default:
                r1 = (2Wa) this.A01;
                hLq = C54633HLq.FINISHED;
                break;
        }
        r1.A01(hLq);
    }
}
