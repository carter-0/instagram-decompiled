package X;

import java.util.List;

/* renamed from: X.9P3  reason: invalid class name */
public final class AnonymousClass9P3 implements Runnable {
    public final /* synthetic */ C359968dm A00;
    public final /* synthetic */ C359908dg A01;

    public AnonymousClass9P3(C359968dm r1, C359908dg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C359908dg r0 = this.A01;
        C359968dm r1 = this.A00;
        List list = r0.A01;
        if (list != null) {
            list.remove(r1);
        }
    }
}
