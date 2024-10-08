package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;

public final class Pr4 extends AnonymousClass4D9 {
    public final C71823OrQ A00 = new C71823OrQ(this);

    public Pr4(C262094Cc r2) {
        super(r2, true, true);
    }

    public final void A0V(Object obj) {
        this.A00.A01.set(obj);
    }

    public final void A0W(boolean z, Throwable th) {
        C71823OrQ orQ = this.A00;
        boolean z2 = th instanceof CancellationException;
        SettableFuture settableFuture = orQ.A01;
        if (z2) {
            settableFuture.set(new OAX((CancellationException) th));
        } else if (settableFuture.setException(th)) {
            orQ.A00 = true;
        }
    }
}
