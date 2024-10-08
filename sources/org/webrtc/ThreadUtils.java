package org.webrtc;

import X.C13988Tno;
import X.Pxe;
import X.Pxf;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    public interface BlockingOperation {
        void run();
    }

    public class ThreadChecker {
        public Thread thread = Thread.currentThread();

        public void detachThread() {
            this.thread = null;
        }

        public void checkIsOnValidThread() {
            Thread thread2 = this.thread;
            if (thread2 == null) {
                thread2 = Thread.currentThread();
                this.thread = thread2;
            }
            if (Thread.currentThread() != thread2) {
                throw new IllegalStateException("Wrong thread");
            }
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length;
        int length2 = stackTraceElementArr2.length;
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[(length + length2)];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, length, length2);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Pxe.A1F();
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() {
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() {
            public void run() {
                thread.join();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static Object invokeAtFrontUninterruptibly(Handler handler, final Callable callable) {
        if (C13988Tno.A0h(handler) == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            final AnonymousClass1Result r2 = new Object() {
                public Object value;
            };
            final AnonymousClass1CaughtException r3 = new Object() {
                public Exception e;
            };
            final CountDownLatch A0y = Pxf.A0y();
            handler.post(new Runnable() {
                public void run() {
                    try {
                        AnonymousClass1Result.this.value = callable.call();
                    } catch (Exception e) {
                        r3.e = e;
                    }
                    A0y.countDown();
                }
            });
            awaitUninterruptibly(A0y);
            Exception exc = r3.e;
            if (exc == null) {
                return r2.value;
            }
            RuntimeException runtimeException = new RuntimeException(exc);
            runtimeException.setStackTrace(concatStackTraces(r3.e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                z2 = true;
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j2 <= 0) {
                    break;
                }
            }
        }
        Pxe.A1F();
        return z;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, (Callable) new Callable() {
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Pxe.A1F();
        }
        return !thread.isAlive();
    }
}
