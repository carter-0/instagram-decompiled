package X;

public final class P8R implements AnonymousClass7DU {
    public final /* synthetic */ OE1 A00;

    public P8R(OE1 oe1) {
        this.A00 = oe1;
    }

    public final /* bridge */ /* synthetic */ boolean DA8(Object obj, Object obj2) {
        C71979OuB ouB = (C71979OuB) obj;
        C249703kE r5 = (C249703kE) obj2;
        if (ouB.A0E || !ouB.A09) {
            return true;
        }
        r5.itemView.performHapticFeedback(3);
        this.A00.A02.A00(ouB.A06, ouB.A0D);
        return true;
    }
}
