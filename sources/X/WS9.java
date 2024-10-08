package X;

public final class WS9 implements C232262tL {
    public final C3034368u A00;
    public final String A01;

    public WS9(C3034368u r2, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C3034368u r0;
        WS9 ws9 = (WS9) obj;
        C3034368u r1 = this.A00;
        if (ws9 != null) {
            r0 = ws9.A00;
        } else {
            r0 = null;
        }
        return 0qQ.A0K(r1, r0);
    }
}
