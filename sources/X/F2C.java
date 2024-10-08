package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class F2C {
    public final Bundle A00;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A02 = new ConcurrentLinkedQueue();

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.G6v] */
    public final C51901G6v A00() {
        Object obj;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C51867G5e) it.next()).Cos(this.A00);
        }
        Iterator it2 = this.A02.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((C51901G6v) obj).CWt()) {
                break;
            }
        }
        C51901G6v g6v = (C51901G6v) obj;
        if (g6v == null) {
            return new Object();
        }
        return g6v;
    }

    public F2C(Bundle bundle) {
        this.A00 = bundle;
    }
}
