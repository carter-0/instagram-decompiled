package X;

public final class Y26 implements Runnable {
    public final /* synthetic */ C22371Y0z A00;

    public Y26(C22371Y0z y0z) {
        this.A00 = y0z;
    }

    public final void run() {
        C22371Y0z y0z = this.A00;
        C21299XTw xTw = y0z.A03;
        if (xTw != null) {
            xTw.A01 = true;
            if (xTw.A02) {
                C21478XcN.A00(xTw.A00);
                y0z.A03 = null;
            }
        }
    }
}
