package X;

/* renamed from: X.LlD  reason: case insensitive filesystem */
public final class C64974LlD implements C361518gM {
    public final int A00;
    public final Object A01;

    public C64974LlD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cuy(C61080JwI jwI, int i) {
        String str;
        K6G k6g;
        String name;
        LPF lpf;
        switch (this.A00) {
            case 0:
                C64968Ll7 ll7 = (C64968Ll7) this.A01;
                C64968Ll7.A05(ll7, ((C357268Xf) jwI.A00).BEU());
                AnonymousClass8XW r0 = ll7.A08;
                if (r0 == null) {
                    str = "mediaLoaderController";
                    break;
                } else {
                    r0.A07();
                    C64968Ll7.A02(ll7);
                    return;
                }
            case 1:
                k6g = K6K.A00((K6K) this.A01);
                break;
            case 2:
                k6g = K6J.A01((K6J) this.A01);
                break;
            default:
                lpf = ((KHO) this.A01).A01;
                if (lpf != null) {
                    name = ((C357268Xf) jwI.A00).getName();
                    break;
                } else {
                    return;
                }
        }
        if (k6g != null) {
            name = ((C357268Xf) jwI.A00).getName();
            lpf = k6g.A02;
            if (lpf == null) {
                str = "mediaPickerPhotosController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            lpf.A09.A01(new LR6(name), name);
        }
    }

    public final void Cv2() {
    }

    public final void Ch8(C63945LEl lEl, int i) {
    }

    public final void Ch9(C61080JwI jwI, int i) {
    }

    public final boolean DQC(C63945LEl lEl, int i) {
        return false;
    }

    public final void DiE(int i, String str) {
    }
}
