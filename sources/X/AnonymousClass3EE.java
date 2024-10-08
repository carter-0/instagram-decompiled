package X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.3EE  reason: invalid class name */
public final class AnonymousClass3EE extends FutureTask {
    public final /* synthetic */ AnonymousClass3EB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3EE(AnonymousClass3EB r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public final void done() {
        try {
            Object obj = get();
            AnonymousClass3EB r1 = this.A00;
            if (!r1.A02.get()) {
                r1.A00(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            AnonymousClass3EB r2 = this.A00;
            if (!r2.A02.get()) {
                r2.A00((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
