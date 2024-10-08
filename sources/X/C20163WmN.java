package X;

import java.util.Map;

/* renamed from: X.WmN  reason: case insensitive filesystem */
public final class C20163WmN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ W00 A01;

    public C20163WmN(W00 w00, int i) {
        this.A01 = w00;
        this.A00 = i;
    }

    public final void run() {
        W00 w00 = this.A01;
        Map map = w00.A02;
        int i = this.A00;
        if (map.containsKey(Integer.valueOf(i))) {
            W00.A00(w00, i, w00.A00.currentMonotonicTimestamp(), 113);
        }
    }
}
