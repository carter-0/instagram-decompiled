package X;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Ssb  reason: case insensitive filesystem */
public final class C12387Ssb implements C13728Tfy {
    public final C13728Tfy A00;
    public final ExecutorService A01;

    public final void onFailure(Exception exc) {
        this.A01.execute(new C12976TGj(this, exc));
    }

    public C12387Ssb(C13728Tfy tfy, ExecutorService executorService) {
        this.A00 = tfy;
        this.A01 = executorService;
    }

    public final void D56(List list) {
        this.A01.execute(new C12975TGi(this, AnonymousClass7TE.A1D(list)));
    }
}
