package X;

import java.util.Iterator;
import java.util.List;

public final class PUU implements Runnable {
    public final /* synthetic */ List A00;

    public PUU(List list) {
        this.A00 = list;
    }

    public final void run() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C262244Cs.A05(AnonymousClass7TE.A0t(AnonymousClass7TE.A18(it)));
        }
    }
}
