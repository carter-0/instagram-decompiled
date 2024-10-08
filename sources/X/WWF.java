package X;

public final class WWF implements JPM {
    public final int A00;
    public final Object A01;

    public WWF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final 0xF E4u(C298755ty r4) {
        0jB E4k;
        switch (this.A00) {
            case 0:
                E4k = ((C15381Ube) this.A01).E4k();
                break;
            case 1:
                E4k = ((C15357Ub9) this.A01).E4k();
                break;
            case 2:
                E4k = ((C15286UZq) this.A01).E4k();
                break;
            default:
                E4k = ((C15358UbA) this.A01).E4k();
                break;
        }
        E4k.A04(C297705sC.A02, r4.A01);
        E4k.A04(C297705sC.A06, "SHOPPING_CATEGORY");
        E4k.A04(C297705sC.A05, "KEYWORD");
        return E4k.A00();
    }

    public final 0xF E4v(C296935qt r2, 1Xj r3) {
        0jB E4k;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r3, 0);
                E4k = ((C15381Ube) this.A01).E4k();
                break;
            case 1:
                E4k = ((C15357Ub9) this.A01).E4l(r3);
                break;
            case 2:
                0qQ.A0B(r3, 0);
                E4k = ((C15286UZq) this.A01).E4l(r3);
                break;
            default:
                0qQ.A0B(r3, 0);
                E4k = ((C15358UbA) this.A01).E4l(r3);
                break;
        }
        C18244VoB.A01(E4k, r2);
        return E4k.A00();
    }
}
