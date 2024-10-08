package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class GVK implements Runnable {
    public final /* synthetic */ GVL A00;
    public final /* synthetic */ 1DM A01;

    public GVK(GVL gvl, 1DM r2) {
        this.A00 = gvl;
        this.A01 = r2;
    }

    public final void run() {
        GVL gvl = this.A00;
        0sP r5 = gvl.A01;
        HashSet hashSet = this.A01.A02;
        0qQ.A0B(hashSet, 0);
        List list = gvl.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!hashSet.contains(next)) {
                A1C.add(next);
            }
        }
        r5.invoke(A1C);
    }
}
