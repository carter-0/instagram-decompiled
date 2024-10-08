package X;

import java.util.HashMap;

public final class TGA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Q8c A01;

    public TGA(Q8c q8c, int i) {
        this.A01 = q8c;
        this.A00 = i;
    }

    public final void run() {
        Q8c q8c = this.A01;
        HashMap hashMap = q8c.A02;
        Integer valueOf = Integer.valueOf(this.A00);
        hashMap.remove(valueOf);
        q8c.A01.remove(valueOf);
        q8c.invalidate();
    }
}
