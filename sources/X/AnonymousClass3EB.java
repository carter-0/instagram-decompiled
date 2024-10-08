package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3EB  reason: invalid class name */
public final class AnonymousClass3EB implements Runnable {
    public static Handler A05;
    public final FutureTask A00;
    public final AtomicBoolean A01;
    public final AtomicBoolean A02;
    public volatile Integer A03;
    public final /* synthetic */ C228962mc A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass3EB(C228962mc r1) {
        this();
        this.A04 = r1;
    }

    public final void A00(Object obj) {
        Handler handler;
        synchronized (AnonymousClass3EB.class) {
            handler = A05;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                A05 = handler;
            }
        }
        handler.post(new C239823Ik(this, obj));
    }

    public final void run() {
        this.A04.A08();
    }

    public AnonymousClass3EB() {
        this.A03 = AnonymousClass05K.A00;
        this.A01 = new AtomicBoolean();
        this.A02 = new AtomicBoolean();
        this.A00 = new AnonymousClass3EE(this, new AnonymousClass3EC(this));
    }
}
