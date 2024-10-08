package X;

import java.util.Iterator;
import java.util.List;

public final class TFP implements Runnable {
    public final /* synthetic */ C7902QcU A00;
    public final /* synthetic */ S3A A01;

    public TFP(C7902QcU qcU, S3A s3a) {
        this.A01 = s3a;
        this.A00 = qcU;
    }

    public final void run() {
        List list = this.A01.A04;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onPageStartedLoading");
            }
        }
    }
}
