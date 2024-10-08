package X;

public final class XQO extends C65091aX {
    public final int A00;
    public final C3032668b A01;
    public final Integer A02;

    public final void A02(1aL r6) {
        1aL y5j;
        C65071aK r4 = this.A00;
        C3032668b r3 = this.A01;
        if (!AnonymousClass6FH.A00(r4, r6, r3)) {
            Integer num = this.A02;
            if (num == AnonymousClass05K.A00) {
                y5j = new C22469Y5i(new XDH(r6), r3, this.A00);
            } else {
                y5j = new Y5j(r6, r3, this.A00, AnonymousClass7TF.A1W(num, AnonymousClass05K.A0C));
            }
            r4.Eyt(y5j);
        }
    }

    public XQO(C65071aK r2, C3032668b r3, Integer num, int i) {
        super(r2);
        this.A01 = r3;
        this.A02 = num;
        this.A00 = Math.max(8, i);
    }
}
