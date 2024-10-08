package X;

public final class LvU implements C230922qa {
    public final int A00;
    public final Object A01;

    public LvU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DVk(C300555xO r2) {
        C230882qT r0;
        switch (this.A00) {
            case 0:
                r0 = ((C65174Lod) this.A01).A02;
                break;
            case 1:
                r0 = ((C65175Loe) this.A01).A01;
                break;
            case 2:
                r0 = ((OH3) this.A01).A05;
                break;
            case 3:
                if (r2 != null) {
                    r0 = (C230882qT) ((K8A) this.A01).A05.getValue();
                    break;
                } else {
                    return;
                }
            case 4:
                r0 = ((C64710Lgj) this.A01).A0K;
                break;
            default:
                r0 = ((LEK) this.A01).A02;
                break;
        }
        r0.A02 = r2;
    }

    public final void Ds7(C300555xO r4) {
        C230882qT r1;
        C231002qi r0;
        String str;
        int i = this.A00;
        0qQ.A0B(r4, 0);
        switch (i) {
            case 0:
                C65174Lod lod = (C65174Lod) this.A01;
                if (!C52345GOp.A00.A0K(lod.A01)) {
                    r1 = lod.A02;
                    r0 = lod.A00;
                    break;
                } else {
                    return;
                }
            case 1:
                C65175Loe loe = (C65175Loe) this.A01;
                r1 = loe.A01;
                r0 = loe.A00;
                break;
            case 2:
                OH3 oh3 = (OH3) this.A01;
                r1 = oh3.A05;
                r0 = oh3.A01;
                if (r0 == null) {
                    str = "quickPromotionPresenter";
                    break;
                }
                break;
            case 3:
                K8A k8a = (K8A) this.A01;
                r1 = (C230882qT) k8a.A05.getValue();
                r0 = (2bu) k8a.A04.getValue();
                break;
            case 4:
                C64710Lgj lgj = (C64710Lgj) this.A01;
                C231002qi r12 = lgj.A00;
                if (r12 != null) {
                    lgj.A0K.A01(r12, r4);
                    return;
                }
                return;
            default:
                LEK lek = (LEK) this.A01;
                r1 = lek.A02;
                r0 = lek.A01;
                if (r0 == null) {
                    str = "quickPromotionDelegate";
                    break;
                }
                break;
        }
        if (r0 == null) {
            str = "qpFragmentPresenter";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A01(r0, r4);
    }
}
