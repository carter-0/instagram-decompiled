package X;

import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class TLD implements Runnable, C273284mH {
    public long A00;
    public Thread A01;
    public RK3 A02;
    public final String A03;
    public final ThreadPoolExecutor A04;
    public final Runnable A05;
    public final ExecutorService A06;
    public final AtomicBoolean A07 = new AtomicBoolean(true);
    public final AtomicBoolean A08 = JTQ.A0k();

    public TLD(ExecutorService executorService, ThreadPoolExecutor threadPoolExecutor) {
        TB4 tb4 = new TB4(this);
        this.A05 = tb4;
        this.A06 = executorService;
        this.A04 = threadPoolExecutor;
        this.A03 = "IgExecutor";
        executorService.execute(tb4);
    }

    public final boolean AH4() {
        if (this.A07.get()) {
            return true;
        }
        Thread thread = this.A01;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.A02 = A00(thread);
        return false;
    }

    public final void CoZ() {
        boolean z = this.A08.get();
        AtomicBoolean atomicBoolean = this.A07;
        if (z) {
            atomicBoolean.set(true);
            return;
        }
        atomicBoolean.set(false);
        this.A00 = SystemClock.uptimeMillis();
        this.A06.execute(this);
    }

    public final void EFw() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            Thread thread = this.A01;
            if (thread != null && thread.isAlive()) {
                RK3 A002 = A00(thread);
                RK3 rk3 = this.A02;
                if (rk3 != null) {
                    A002.initCause(rk3);
                }
                if (!atomicBoolean.get()) {
                    C273264mF.A00().A05(002.A0R("ThreadPoolExecutorWatchdog-", this.A03), A002);
                }
            }
            this.A08.set(true);
            C273264mF A003 = C273264mF.A00();
            synchronized (A003.A03) {
                A003.A05.add(this);
            }
            return;
        }
        this.A02 = null;
    }

    public final String getName() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Throwable, X.RK3, java.lang.Exception] */
    private RK3 A00(Thread thread) {
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        StringBuilder A0n = AnonymousClass7TF.A0n(002.A0R("Blocked on ", this.A03));
        A0n.append(" thread=[num=");
        ThreadPoolExecutor threadPoolExecutor = this.A04;
        A0n.append(threadPoolExecutor.getPoolSize());
        A0n.append(", active=");
        A0n.append(threadPoolExecutor.getActiveCount());
        StringBuilder A0n2 = AnonymousClass7TF.A0n(AnonymousClass7TF.A0l("]", A0n));
        A0n2.append(" task=[queuing=");
        A0n2.append(threadPoolExecutor.getQueue().size());
        A0n2.append(", finished=");
        A0n2.append(threadPoolExecutor.getCompletedTaskCount());
        ? exc = new Exception(002.A0s(002.A0s(AnonymousClass7TF.A0l("]", A0n2), " for ", " seconds; ", (SystemClock.uptimeMillis() - this.A00) / 1000), "dump took ", AnonymousClass000.A00(835), (SystemClock.uptimeMillis() - uptimeMillis) / 1000));
        exc.setStackTrace(stackTrace);
        return exc;
    }

    public final void run() {
        this.A01 = Thread.currentThread();
        this.A07.set(true);
        if (this.A08.getAndSet(false)) {
            C273264mF A002 = C273264mF.A00();
            synchronized (A002.A03) {
                A002.A05.remove(this);
            }
        }
    }
}
