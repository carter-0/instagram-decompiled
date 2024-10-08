package X;

public final class WS5 implements C232262tL {
    public final XA7 A00;
    public final String A01;

    public WS5(XA7 xa7, String str) {
        0qQ.A0B(str, 2);
        this.A00 = xa7;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        XA7 xa7;
        WS5 ws5 = (WS5) obj;
        XA7 xa72 = this.A00;
        if (ws5 != null) {
            xa7 = ws5.A00;
        } else {
            xa7 = null;
        }
        return 0qQ.A0K(xa72, xa7);
    }
}
