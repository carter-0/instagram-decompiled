package X;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;

public final /* synthetic */ class I9Q implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ C262204Co A00;

    public /* synthetic */ I9Q(C262204Co r1) {
        this.A00 = r1;
    }

    public final void onCancel() {
        this.A00.AG7((CancellationException) null);
    }
}
