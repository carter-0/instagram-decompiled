package X;

import android.util.Log;
import androidx.work.multiprocess.IListenableWorkerImpl;

public final class TEw implements Runnable {
    public final /* synthetic */ IListenableWorkerImpl A00;
    public final /* synthetic */ TJS A01;

    public TEw(IListenableWorkerImpl iListenableWorkerImpl, TJS tjs) {
        this.A01 = tjs;
        this.A00 = iListenableWorkerImpl;
    }

    public final void run() {
        try {
            TJS tjs = this.A01;
            tjs.A02.ATJ(tjs.A01, this.A00);
        } catch (Throwable th) {
            AnonymousClass389.A00();
            Log.e(SHS.A04, "Unable to execute", th);
            TL7.A00(this.A01.A01, th);
        }
    }
}
