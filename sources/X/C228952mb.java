package X;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.2mb  reason: invalid class name and case insensitive filesystem */
public abstract class C228952mb extends C228962mc {
    public static final Handler A01 = new Handler(Looper.getMainLooper());
    public static volatile boolean A02;
    public Object A00;

    public final void A01() {
        this.A00 = null;
    }

    public final void A02() {
        if (this.A00 != null) {
            A01.post(new C59791JYk(this));
            return;
        }
        boolean z = this.A04;
        this.A04 = false;
        this.A05 |= z;
        if (z) {
            try {
                A09();
            } catch (RejectedExecutionException e) {
                String simpleName = getClass().getSimpleName();
                0qQ.A07(simpleName);
                0wb.A07(simpleName, e);
            }
        }
    }

    public final void A03(Object obj) {
        this.A00 = obj;
        if (this.A07) {
            C228952mb.super.A03(obj);
        }
    }

    public final Executor A07() {
        if (A02) {
            return AnonymousClass54M.A00;
        }
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        0qQ.A07(executor);
        return executor;
    }
}
