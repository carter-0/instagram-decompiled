package X;

/* renamed from: X.2rd  reason: invalid class name and case insensitive filesystem */
public final class C231412rd extends C252303ot {
    public final /* synthetic */ 2Ru A00;

    public C231412rd(2Ru r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        C238283Bg r5 = (C238283Bg) obj2;
        int i = ((C238283Bg) obj).A03;
        if (i == Integer.MAX_VALUE || i != r5.A03) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        int i;
        C238283Bg r4 = (C238283Bg) obj;
        C238283Bg r5 = (C238283Bg) obj2;
        if (r4.A04 == r5.A04 && r4.A01 == r5.A01 && (i = r5.A02) != Integer.MAX_VALUE && r4.A02 == i) {
            return true;
        }
        return false;
    }
}
