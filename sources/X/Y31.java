package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final /* synthetic */ class Y31 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Y8w A01;
    public final /* synthetic */ CopyOnWriteArraySet A02;

    public /* synthetic */ Y31(Y8w y8w, CopyOnWriteArraySet copyOnWriteArraySet, int i) {
        this.A02 = copyOnWriteArraySet;
        this.A00 = i;
        this.A01 = y8w;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A02;
        int i = this.A00;
        Y8w y8w = this.A01;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C21482XcZ xcZ = (C21482XcZ) it.next();
            if (i != -1) {
                xcZ.A00.A01(i);
            }
            xcZ.A01 = true;
            y8w.CNv(xcZ.A02);
        }
    }
}
