package X;

public final class WSA implements C232262tL {
    public final C61054Jvs A00;
    public final String A01;

    public WSA(C61054Jvs jvs, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = jvs;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61054Jvs jvs;
        WSA wsa = (WSA) obj;
        C61054Jvs jvs2 = this.A00;
        if (wsa != null) {
            jvs = wsa.A00;
        } else {
            jvs = null;
        }
        return 0qQ.A0K(jvs2, jvs);
    }
}
