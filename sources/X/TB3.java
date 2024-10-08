package X;

import java.util.Iterator;
import java.util.List;

public final class TB3 implements Runnable {
    public final /* synthetic */ S3A A00;

    public TB3(S3A s3a) {
        this.A00 = s3a;
    }

    public final void run() {
        List list = this.A00.A03;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onDomContentLoaded");
            }
        }
    }
}
