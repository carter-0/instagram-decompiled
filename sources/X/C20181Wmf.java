package X;

import java.util.Iterator;

/* renamed from: X.Wmf  reason: case insensitive filesystem */
public final class C20181Wmf implements Runnable {
    public final /* synthetic */ UUB A00;
    public final /* synthetic */ C279254yK A01;

    public C20181Wmf(UUB uub, C279254yK r2) {
        this.A01 = r2;
        this.A00 = uub;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            this.A01.A03((AnonymousClass5AC) it.next());
        }
    }
}
