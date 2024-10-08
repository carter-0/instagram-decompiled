package X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Mqt  reason: case insensitive filesystem */
public final class C67621Mqt extends 0nc {
    public final /* synthetic */ C67620Mqs A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67621Mqt(C67620Mqs mqs, Callable callable) {
        super(callable, 43, 3, false, true);
        this.A00 = mqs;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Mqt, java.util.concurrent.FutureTask] */
    public final void done() {
        try {
            Object obj = get();
            C67620Mqs mqs = this.A00;
            C67623Mqv mqv = C67620Mqs.A04;
            if (!mqs.A02.get()) {
                C67620Mqs.A04.obtainMessage(1, new C67622Mqu(mqs, obj)).sendToTarget();
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            C67620Mqs mqs2 = this.A00;
            C67623Mqv mqv2 = C67620Mqs.A04;
            if (!mqs2.A02.get()) {
                C67620Mqs.A04.obtainMessage(1, new C67622Mqu(mqs2, null)).sendToTarget();
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing doInBackground()", th);
        }
    }
}
