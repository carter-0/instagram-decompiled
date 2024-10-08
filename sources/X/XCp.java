package X;

public final class XCp extends C65091aX {
    public final int A00;
    public final C318206oZ A01;

    public final void A02(1aL r5) {
        C318206oZ r1 = this.A01;
        if (r1 instanceof C318356oo) {
            this.A00.Eyt(r5);
            return;
        }
        this.A00.Eyt(new XCx(r5, r1.A00(), this.A00));
    }

    public XCp(C65071aK r1, C318206oZ r2, int i) {
        super(r1);
        this.A01 = r2;
        this.A00 = i;
    }
}
