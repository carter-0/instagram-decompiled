package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final /* synthetic */ class Y3P implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5NW A01;
    public final /* synthetic */ CopyOnWriteArraySet A02;

    public /* synthetic */ Y3P(AnonymousClass5NW r1, CopyOnWriteArraySet copyOnWriteArraySet, int i) {
        this.A02 = copyOnWriteArraySet;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A02;
        int i = this.A00;
        AnonymousClass5NW r3 = this.A01;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            AnonymousClass5NG r1 = (AnonymousClass5NG) it.next();
            if (!r1.A02) {
                if (i != -1) {
                    r1.A00.A01(i);
                }
                r1.A01 = true;
                r3.CNv(r1.A03);
            }
        }
    }
}
