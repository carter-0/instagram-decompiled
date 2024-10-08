package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.MrQ  reason: case insensitive filesystem */
public final class C67637MrQ extends ContentObserver {
    public int A00 = -1;
    public final C70406O5j A01;
    public final /* synthetic */ OHF A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67637MrQ(Handler handler, C70406O5j o5j, OHF ohf) {
        super(handler);
        this.A02 = ohf;
        this.A01 = o5j;
    }

    public final void onChange(boolean z, Uri uri) {
        OHF ohf = this.A02;
        C73170PY5 py5 = new C73170PY5(this, ohf);
        ExecutorService executorService = ohf.A05;
        C69729NrE nrE = ohf.A01;
        if (nrE instanceof NE0) {
            if (182.A06(0Tu.A05, ((NE0) nrE).A00, 36316173281136651L)) {
                Future future = ohf.A02;
                if (future == null || future.isDone()) {
                    ohf.A02 = executorService.submit(py5);
                    return;
                }
                return;
            }
        }
        py5.run();
    }

    public final void onChange(boolean z) {
        onChange(z, (Uri) null);
    }
}
