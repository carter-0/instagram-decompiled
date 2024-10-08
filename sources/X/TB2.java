package X;

import java.util.Iterator;
import java.util.List;

public final class TB2 implements Runnable {
    public final /* synthetic */ S3A A00;

    public TB2(S3A s3a) {
        this.A00 = s3a;
    }

    public final void run() {
        List list = this.A00.A06;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onUrlChanged");
            }
        }
    }
}
