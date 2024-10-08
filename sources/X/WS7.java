package X;

public final class WS7 implements C232262tL {
    public final C61054Jvs A00;
    public final String A01;

    public WS7(C61054Jvs jvs, String str) {
        0qQ.A0B(str, 2);
        this.A00 = jvs;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61054Jvs jvs;
        WS7 ws7 = (WS7) obj;
        C61054Jvs jvs2 = this.A00;
        if (ws7 != null) {
            jvs = ws7.A00;
        } else {
            jvs = null;
        }
        return 0qQ.A0K(jvs2, jvs);
    }
}
