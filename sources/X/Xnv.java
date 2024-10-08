package X;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class Xnv {
    public ExecutorService A00;
    public final Deque A01 = new ArrayDeque();
    public final Deque A02 = new ArrayDeque();
    public final Deque A03 = new ArrayDeque();

    public final void A01(Y7K y7k) {
        y7k.A01.decrementAndGet();
        Deque deque = this.A02;
        synchronized (this) {
            if (!deque.remove(y7k)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        A00(this);
    }

    public static void A00(Xnv xnv) {
        int i;
        ExecutorService executorService;
        ArrayList A1C = AnonymousClass7TE.A1C();
        synchronized (xnv) {
            Iterator it = xnv.A01.iterator();
            while (it.hasNext()) {
                Y7K y7k = (Y7K) it.next();
                Deque deque = xnv.A02;
                if (deque.size() < 64) {
                    if (y7k.A01.get() < 5) {
                        it.remove();
                        y7k.A01.incrementAndGet();
                        A1C.add(y7k);
                        deque.add(y7k);
                    }
                }
            }
            xnv.A02.size();
            xnv.A03.size();
        }
        int size = A1C.size();
        for (i = 0; i < size; i++) {
            Y7K y7k2 = (Y7K) A1C.get(i);
            synchronized (xnv) {
                executorService = xnv.A00;
                if (executorService == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                    C22023Xt4 xt4 = SUS.A04;
                    executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new Y4C("OkHttp Dispatcher", false));
                    xnv.A00 = executorService;
                }
            }
            try {
                executorService.execute(y7k2);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                Y1T y1t = y7k2.A02;
                y1t.A00.A01(interruptedIOException);
                y7k2.A00.DEl(interruptedIOException, y1t);
                y1t.A02.A0J.A01(y7k2);
            } catch (Throwable th) {
                y7k2.A02.A02.A0J.A01(y7k2);
                throw th;
            }
        }
    }
}
