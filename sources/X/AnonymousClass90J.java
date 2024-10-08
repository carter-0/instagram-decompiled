package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.90J  reason: invalid class name */
public final class AnonymousClass90J implements Runnable {
    public final /* synthetic */ 1LV A00;

    public AnonymousClass90J(1LV r1) {
        this.A00 = r1;
    }

    public final void run() {
        C292835jb r0;
        synchronized (C292835jb.class) {
            r0 = C292835jb.A0A;
            if (r0 == null) {
                throw new IllegalStateException("getInstance() called before initialize()");
            }
        }
        if (!r0.A04.A08()) {
            1LV r5 = this.A00;
            for (Map.Entry entry : r5.A01().entrySet()) {
                r5.A09.execute(new C41128Aoo((1LH) entry.getValue(), r5, (File) entry.getKey()));
            }
        }
    }
}
