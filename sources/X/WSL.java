package X;

public final class WSL implements C232262tL {
    public final C59723JVh A00;
    public final String A01;
    public final C17467VWu A02;

    public WSL(C59723JVh jVh, C17467VWu vWu, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = jVh;
        this.A02 = vWu;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C59723JVh jVh;
        WSL wsl = (WSL) obj;
        C59723JVh jVh2 = this.A00;
        if (wsl != null) {
            jVh = wsl.A00;
        } else {
            jVh = null;
        }
        return 0qQ.A0K(jVh2, jVh);
    }
}
