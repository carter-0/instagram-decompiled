package X;

public final class IIF implements AnonymousClass2UZ {
    public final int A00;
    public final Object A01;

    public IIF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dwu(2V5 r3) {
        C52609GZi gZi;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                gZi = (C52609GZi) obj;
                gZi.A04 = true;
                gZi.requestLayout();
                break;
            case 1:
                gZi = (C52609GZi) obj;
                gZi.A00 = C229632nm.A01(C51970G9q.A02(r3));
                break;
            default:
                ((2Wa) obj).A01(r3.A00);
                return;
        }
        gZi.invalidate();
    }
}
