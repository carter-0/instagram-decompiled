package X;

public final class WS8 implements C232262tL {
    public final BBV A00;
    public final String A01;

    public WS8(BBV bbv, String str) {
        0qQ.A0B(str, 2);
        this.A00 = bbv;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        BBV bbv;
        WS8 ws8 = (WS8) obj;
        BBV bbv2 = this.A00;
        if (ws8 != null) {
            bbv = ws8.A00;
        } else {
            bbv = null;
        }
        return 0qQ.A0K(bbv2, bbv);
    }
}
