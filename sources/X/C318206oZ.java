package X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6oZ  reason: invalid class name and case insensitive filesystem */
public abstract class C318206oZ {
    public static final C318206oZ $redex_init_class = null;

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }

    public C318286oh A00() {
        C318266of r0;
        if (this instanceof C318426ov) {
            C318426ov r02 = (C318426ov) this;
            return new C66597MYj(r02.A00, r02.A01);
        } else if (this instanceof C318396os) {
            return new AnonymousClass6FM(((C318396os) this).A00);
        } else {
            if (this instanceof C318256oe) {
                C318296oi r6 = (C318296oi) ((C318256oe) this).A01.get();
                int i = r6.A01;
                if (i == 0) {
                    r0 = C318256oe.A04;
                } else {
                    C318266of[] r4 = r6.A02;
                    long j = r6.A00;
                    r6.A00 = 1 + j;
                    r0 = r4[(int) (j % ((long) i))];
                }
                return new C66731Mbc(r0);
            } else if (this instanceof C318356oo) {
                return new XQJ();
            } else {
                if (this instanceof C318196oY) {
                    return new Ni2((ScheduledExecutorService) ((C318196oY) this).A01.get());
                }
                if (this instanceof C318386or) {
                    return new C318276og(((C318386or) this).A00);
                }
                return new Ni3((C318346on) ((C318326ol) this).A01.get());
            }
        }
    }

    public final C65051aA A01(Runnable runnable) {
        if (this instanceof C318396os) {
            C318396os r1 = (C318396os) this;
            1aP.A01(runnable, "run is null");
            try {
                Executor executor = r1.A00;
                if (executor instanceof ExecutorService) {
                    Y5t y5t = new Y5t(runnable);
                    y5t.A00(((ExecutorService) executor).submit(y5t));
                    return y5t;
                }
                AnonymousClass67O r12 = new AnonymousClass67O(runnable);
                executor.execute(r12);
                return r12;
            } catch (RejectedExecutionException e) {
                C318176oW.A01(e);
                return AnonymousClass6F8.INSTANCE;
            }
        } else if (!(this instanceof C318356oo)) {
            return A02(runnable, TimeUnit.NANOSECONDS, 0);
        } else {
            1aP.A01(runnable, "run is null");
            runnable.run();
            return AnonymousClass6F8.INSTANCE;
        }
    }

    public final C65051aA A02(Runnable runnable, TimeUnit timeUnit, long j) {
        C318266of r4;
        Future future;
        Future future2;
        if (this instanceof C318426ov) {
            C318426ov r1 = (C318426ov) this;
            if (timeUnit != null) {
                1aP.A01(runnable, "run is null");
                Handler handler = r1.A00;
                C66676Maj maj = new C66676Maj(handler, runnable);
                Message obtain = Message.obtain(handler, maj);
                if (r1.A01) {
                    obtain.setAsynchronous(true);
                }
                handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return maj;
            }
            throw new NullPointerException("unit == null");
        } else if (this instanceof C318356oo) {
            try {
                timeUnit.sleep(j);
                1aP.A01(runnable, "run is null");
                runnable.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C318176oW.A01(e);
            }
            return AnonymousClass6F8.INSTANCE;
        } else if (this instanceof C318196oY) {
            C318196oY r42 = (C318196oY) this;
            FutureTask futureTask = Y5t.A03;
            1aP.A01(runnable, "run is null");
            Y5t y5t = new Y5t(runnable);
            if (j <= 0) {
                try {
                    future2 = ((ExecutorService) r42.A01.get()).submit(y5t);
                } catch (RejectedExecutionException e2) {
                    C318176oW.A01(e2);
                    return AnonymousClass6F8.INSTANCE;
                }
            } else {
                future2 = ((ScheduledExecutorService) r42.A01.get()).schedule(y5t, j, timeUnit);
            }
            y5t.A00(future2);
            return y5t;
        } else if (this instanceof C318396os) {
            C318396os r3 = (C318396os) this;
            1aP.A01(runnable, "run is null");
            Executor executor = r3.A00;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    Y5t y5t2 = new Y5t(runnable);
                    y5t2.A00(((ScheduledExecutorService) executor).schedule(y5t2, j, timeUnit));
                    return y5t2;
                } catch (RejectedExecutionException e3) {
                    C318176oW.A01(e3);
                    return AnonymousClass6F8.INSTANCE;
                }
            } else {
                C22476Y5u y5u = new C22476Y5u(runnable);
                1af.A00(C318396os.A01.A02(new C22417Y2z(y5u, r3), timeUnit, j), y5u.A01);
                return y5u;
            }
        } else if (this instanceof C318256oe) {
            C318296oi r6 = (C318296oi) ((C318256oe) this).A01.get();
            int i = r6.A01;
            if (i == 0) {
                r4 = C318256oe.A04;
            } else {
                C318266of[] r5 = r6.A02;
                long j2 = r6.A00;
                r6.A00 = 1 + j2;
                r4 = r5[(int) (j2 % ((long) i))];
            }
            FutureTask futureTask2 = Y5t.A03;
            1aP.A01(runnable, "run is null");
            Y5t y5t3 = new Y5t(runnable);
            if (j <= 0) {
                future = r4.A00.submit(y5t3);
            } else {
                try {
                    future = r4.A00.schedule(y5t3, j, timeUnit);
                } catch (RejectedExecutionException e4) {
                    C318176oW.A01(e4);
                    return AnonymousClass6F8.INSTANCE;
                }
            }
            y5t3.A00(future);
            return y5t3;
        } else {
            C318286oh A00 = A00();
            1aP.A01(runnable, "run is null");
            C73422PcJ pcJ = new C73422PcJ(A00, runnable);
            A00.A01(pcJ, timeUnit, j);
            return pcJ;
        }
    }
}
