package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import androidx.fragment.app.Fragment;

public final class TJX implements Runnable {
    public Throwable A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ Runnable A03;

    public TJX(Handler handler, Fragment fragment, Runnable runnable) {
        this.A02 = fragment;
        this.A01 = handler;
        this.A03 = runnable;
        Thread currentThread = Thread.currentThread();
        this.A00 = new Throwable(002.A0r("Runnable instantiated on thread id: ", ", name: ", currentThread.getName(), currentThread.getId()));
    }

    public final void run() {
        try {
            Fragment fragment = this.A02;
            Context context = fragment.getContext();
            boolean z = true;
            boolean A1V = AnonymousClass7TF.A1V(fragment.mView);
            boolean A1a = DbW.A1a(context);
            if (!(context instanceof ContextWrapper) || ((ContextWrapper) context).getBaseContext() != null) {
                z = false;
            }
            if (!A1V || A1a || z) {
                this.A01.post(this);
            } else {
                this.A03.run();
            }
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            0KC.A0D("CDSThreadTracing", "--- start debug trace");
            0KC.A0H("CDSThreadTracing", "Thread tracing stacktrace", th2);
            0KC.A0D("CDSThreadTracing", "--- end debug trace");
            throw th;
        }
    }
}
