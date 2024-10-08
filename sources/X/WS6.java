package X;

public final class WS6 implements C232262tL {
    public final C61046Jvk A00;
    public final String A01;

    public WS6(C61046Jvk jvk, String str) {
        0qQ.A0B(str, 2);
        this.A00 = jvk;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61046Jvk jvk;
        WS6 ws6 = (WS6) obj;
        C61046Jvk jvk2 = this.A00;
        if (ws6 != null) {
            jvk = ws6.A00;
        } else {
            jvk = null;
        }
        return 0qQ.A0K(jvk2, jvk);
    }
}
