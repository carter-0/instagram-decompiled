package X;

public final class WS3 implements C232262tL {
    public final C17080VHc A00;
    public final String A01;

    public WS3(C17080VHc vHc, String str) {
        0qQ.A0B(str, 2);
        this.A00 = vHc;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C17080VHc vHc;
        WS3 ws3 = (WS3) obj;
        C17080VHc vHc2 = this.A00;
        if (ws3 != null) {
            vHc = ws3.A00;
        } else {
            vHc = null;
        }
        return 0qQ.A0K(vHc2, vHc);
    }
}
