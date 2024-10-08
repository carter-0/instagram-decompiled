package X;

public final class AhQ implements C252473pA {
    public final int A00;
    public final Object A01;

    public AhQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DU5(C265674Vs r5) {
        AnonymousClass80Q r0;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r5, 0);
                r0 = ((C384909i5) this.A01).A00;
                break;
            case 1:
                0qQ.A0B(r5, 0);
                C226122ff r3 = C226112fe.A0B;
                C378609Qm r2 = (C378609Qm) this.A01;
                r3.A05(r2.requireActivity(), new C14243TsQ(r5, r2));
                return;
            default:
                0qQ.A0B(r5, 0);
                r0 = ((C15291UZw) this.A01).A01;
                break;
        }
        if (r0 != null) {
            r0.A03(r5);
        }
    }
}
