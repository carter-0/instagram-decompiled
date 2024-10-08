package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.AmF  reason: case insensitive filesystem */
public final class C40969AmF implements Runnable {
    public final /* synthetic */ 1LV A00;
    public final /* synthetic */ Map.Entry A01;

    public C40969AmF(1LV r1, Map.Entry entry) {
        this.A00 = r1;
        this.A01 = entry;
    }

    public final void run() {
        Map.Entry entry = this.A01;
        synchronized (entry.getValue()) {
            this.A00.A07.A08.A00((File) entry.getKey());
        }
    }
}
