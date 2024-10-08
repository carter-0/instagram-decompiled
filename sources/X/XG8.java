package X;

public final class XG8 extends C286545Wv {
    public static final XG8 A00 = new XG8();

    public XG8() {
        super(3, 0);
    }

    public final String A00(int i) {
        if (i == 0) {
            return "from";
        }
        if (i == 1) {
            return "to";
        }
        if (i == 2) {
            return "count";
        }
        return super.A00(i);
    }

    public final void A02(C286475Wm r6, C288455bw r7, AnonymousClass5X4 r8, C288475by r9) {
        C288465bx r92 = (C288465bx) r9;
        int[] iArr = r92.A03.A05;
        int i = r92.A00;
        ((AnonymousClass5R6) ((C286465Wl) r6).A00).A0U(iArr[i], iArr[i + 1], iArr[i + 2]);
    }
}
