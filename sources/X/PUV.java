package X;

import java.util.Iterator;

public final class PUV implements Runnable {
    public final /* synthetic */ C69654Npc A00;

    public PUV(C69654Npc npc) {
        this.A00 = npc;
    }

    public final void run() {
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            C262244Cs.A05(AnonymousClass7TE.A0t(AnonymousClass7TE.A18(it)));
        }
    }
}
