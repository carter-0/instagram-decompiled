package X;

public final class WSB implements C232262tL {
    public final C15024UKd A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C15024UKd uKd;
        WSB wsb = (WSB) obj;
        C15024UKd uKd2 = this.A00;
        if (wsb != null) {
            uKd = wsb.A00;
        } else {
            uKd = null;
        }
        return 0qQ.A0K(uKd2, uKd);
    }

    public WSB(C15024UKd uKd, String str) {
        this.A01 = str;
        this.A00 = uKd;
    }
}
