package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.AmE  reason: case insensitive filesystem */
public final class C40968AmE implements Runnable {
    public final /* synthetic */ 1LV A00;
    public final /* synthetic */ Map.Entry A01;

    public C40968AmE(1LV r1, Map.Entry entry) {
        this.A00 = r1;
        this.A01 = entry;
    }

    public final void run() {
        Map.Entry entry = this.A01;
        1LH r2 = (1LH) entry.getValue();
        synchronized (r2) {
            this.A00.A03(r2, (File) entry.getKey());
        }
    }
}
