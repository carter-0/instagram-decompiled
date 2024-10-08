package X;

public final class XG4 extends C286545Wv {
    public static final XG4 A00 = new C286545Wv(0, 0);

    public XG4() {
        super(0, 0);
    }

    public final void A02(C286475Wm r4, C288455bw r5, AnonymousClass5X4 r6, C288475by r7) {
        if (r6.A06 == 0) {
            AnonymousClass5X4.A04(r6);
            r6.A00 = 0;
            r6.A01 = (r6.A0I.length / 5) - r6.A04;
            r6.A02 = 0;
            r6.A03 = 0;
            r6.A07 = 0;
            return;
        }
        AnonymousClass5XN.A03("Cannot reset when inserting");
        throw AnonymousClass00P.createAndThrow();
    }
}
