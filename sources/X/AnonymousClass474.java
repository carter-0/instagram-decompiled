package X;

/* renamed from: X.474  reason: invalid class name */
public final class AnonymousClass474 extends AnonymousClass19P {
    public final Object A00;
    public final 19N A01;
    public final 1Rc A02;
    public final C262214Cp A03;

    public final void A05(Throwable th) {
        C262214Cp r6 = this.A03;
        1Rc r5 = this.A02;
        19N r0 = this.A01;
        Object obj = this.A00;
        19N A05 = C262214Cp.A05(r0);
        if (A05 != null) {
            while (A05.A00.CO4(new AnonymousClass474(obj, A05, r5, r6), false, false) == 19K.A00) {
                A05 = C262214Cp.A05(A05);
                if (A05 == null) {
                }
            }
            return;
        }
        r6.A0I(C262214Cp.A02(obj, r5, r6));
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C60340gF.A00;
    }

    public AnonymousClass474(Object obj, 19N r2, 1Rc r3, C262214Cp r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = obj;
    }
}
