package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qbv  reason: case insensitive filesystem */
public class C7871Qbv extends C7874Qby implements Runnable, C13987Tnd, ScheduledFuture {
    public final C13269TSk A00;
    public final /* synthetic */ C13262TSd A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7871Qbv(C13262TSd tSd, Object obj, Runnable runnable) {
        super(tSd.A00);
        this.A01 = tSd;
        String str = C13262TSd.A0A;
        this.A00 = new C13269TSk(runnable, obj);
    }

    public final void run() {
        this.A00.run();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw C66580MXl.A11();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7871Qbv(C13262TSd tSd, Callable callable) {
        super(tSd.A00);
        this.A01 = tSd;
        String str = C13262TSd.A0A;
        this.A00 = new C13269TSk(callable);
    }
}
