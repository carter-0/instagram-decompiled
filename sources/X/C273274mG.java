package X;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4mG  reason: invalid class name and case insensitive filesystem */
public class C273274mG implements Runnable, C273284mH {
    public static Method A06;
    public static final Set A07 = new HashSet();
    public long A00;
    public RK3 A01;
    public final Looper A02;
    public final Handler A03;
    public final AtomicBoolean A04 = new AtomicBoolean(true);
    public final AtomicBoolean A05 = new AtomicBoolean(false);

    static {
        try {
            Method declaredMethod = MessageQueue.class.getDeclaredMethod("isPolling", new Class[0]);
            A06 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable unused) {
        }
    }

    public final String A00(long j) {
        String A0R;
        long uptimeMillis;
        long j2;
        if (this instanceof C273304mJ) {
            C273304mJ r5 = (C273304mJ) this;
            A0R = 002.A0R("Blocked on ", r5.getName());
            C273294mI r0 = r5.A00;
            if (r0 != null) {
                A0R = 002.A0g(A0R, " in ", r0.getName());
            }
            uptimeMillis = SystemClock.uptimeMillis();
            j2 = r5.A00;
        } else {
            A0R = 002.A0R("Blocked on ", getName());
            uptimeMillis = SystemClock.uptimeMillis();
            j2 = this.A00;
        }
        return 002.A0s(002.A0s(A0R, " for ", " seconds; ", (uptimeMillis - j2) / 1000), "dump took ", AnonymousClass000.A00(835), j);
    }

    public boolean A01() {
        Method method = A06;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(this.A02.getQueue(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Throwable, X.RK3, java.lang.Exception] */
    public final boolean AH4() {
        if (this.A04.get()) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTrace = this.A02.getThread().getStackTrace();
        ? exc = new Exception(A00((SystemClock.uptimeMillis() - uptimeMillis) / 1000));
        exc.setStackTrace(stackTrace);
        this.A01 = exc;
        return false;
    }

    public final void CoZ() {
        if (this.A05.get() || A01()) {
            this.A04.set(true);
            return;
        }
        this.A04.set(false);
        this.A00 = SystemClock.uptimeMillis();
        this.A03.postAtFrontOfQueue(this);
    }

    public final void EFw() {
        AtomicBoolean atomicBoolean = this.A04;
        if (!atomicBoolean.get()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StackTraceElement[] stackTrace = this.A02.getThread().getStackTrace();
            Exception exc = new Exception(A00((SystemClock.uptimeMillis() - uptimeMillis) / 1000));
            exc.setStackTrace(stackTrace);
            RK3 rk3 = this.A01;
            if (rk3 != null) {
                exc.initCause(rk3);
            }
            if (!atomicBoolean.get()) {
                C273264mF.A00().A05(002.A0R("LooperWatchdog-", getName()), exc);
                this.A05.set(true);
                C273264mF A002 = C273264mF.A00();
                synchronized (A002.A03) {
                    A002.A05.add(this);
                }
                return;
            }
        }
        this.A01 = null;
    }

    public final String getName() {
        return this.A02.getThread().getName();
    }

    public void run() {
        this.A04.set(true);
        if (this.A05.getAndSet(false)) {
            C273264mF A002 = C273264mF.A00();
            synchronized (A002.A03) {
                A002.A05.remove(this);
            }
        }
    }

    public C273274mG(Handler handler) {
        Looper looper = handler.getLooper();
        this.A02 = looper;
        this.A03 = handler;
        A07.add(looper);
    }
}
