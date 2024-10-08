package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.TSd  reason: case insensitive filesystem */
public final class C13262TSd extends AbstractExecutorService implements ExecutorService, ScheduledExecutorService {
    public static final String A0A = 002.A0R(C13262TSd.class.getCanonicalName(), ".ACTION_ALARM.");
    public final Handler A00;
    public final String A01;
    public final PriorityQueue A02 = new PriorityQueue();
    public final AlarmManager A03;
    public final PendingIntent A04;
    public final BroadcastReceiver A05;
    public final Context A06;
    public final RealtimeSinceBootClock A07;
    public final AnonymousClass3RB A08;
    public final AtomicLong A09 = Pxe.A1D(-1);

    public static void A01(C13262TSd tSd) {
        ArrayList A1C;
        synchronized (tSd) {
            A1C = AnonymousClass7TE.A1C();
            while (true) {
                PriorityQueue priorityQueue = tSd.A02;
                if (priorityQueue.isEmpty() || ((TA7) priorityQueue.peek()).A00 > SystemClock.elapsedRealtime()) {
                    A02(tSd);
                } else {
                    A1C.add(((TA7) priorityQueue.remove()).A01);
                }
            }
            A02(tSd);
        }
        A1C.size();
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            ((C7871Qbv) it.next()).run();
        }
    }

    public final void execute(Runnable runnable) {
        submit((Object) null, runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C7871Qbv qbv = new C7871Qbv(this, (Object) null, runnable);
        Pxj.A1G(qbv, this, timeUnit, j);
        return qbv;
    }

    public static void A02(C13262TSd tSd) {
        PendingIntent pendingIntent = tSd.A04;
        if (pendingIntent == null) {
            0KC.A0D("WakingExecutorService", "Pending intent is null, not scheduling intent to run");
            return;
        }
        PriorityQueue priorityQueue = tSd.A02;
        if (priorityQueue.isEmpty()) {
            tSd.A08.A03(tSd.A03, pendingIntent);
            return;
        }
        long j = ((TA7) priorityQueue.peek()).A00;
        AtomicLong atomicLong = tSd.A09;
        if (atomicLong.get() != j) {
            SystemClock.elapsedRealtime();
            tSd.A08.A04(tSd.A06, tSd.A03, 2, j, pendingIntent);
            atomicLong.set(j);
        }
    }

    /* renamed from: A03 */
    public final C7871Qbv submit(Object obj, Runnable runnable) {
        C7871Qbv qbv = new C7871Qbv(this, obj, runnable);
        A00(qbv, this, SystemClock.elapsedRealtime());
        this.A00.post(new TCU(this));
        return qbv;
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C7873Qbx(this, obj, runnable);
    }

    public final void shutdown() {
        PendingIntent pendingIntent = this.A04;
        if (pendingIntent != null) {
            this.A08.A03(this.A03, pendingIntent);
        }
        try {
            this.A06.unregisterReceiver(this.A05);
        } catch (IllegalArgumentException e) {
            0KC.A0I("WakingExecutorService", "Failed to unregister broadcast receiver", e);
        }
    }

    public C13262TSd(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass3RB r15, C10936S1p s1p, String str) {
        PendingIntent pendingIntent;
        StringBuilder A16 = Pxe.A16(A0A);
        Pxk.A0O(context, str, A16);
        String obj = A16.toString();
        this.A01 = obj;
        this.A06 = context;
        this.A07 = realtimeSinceBootClock;
        T9D A002 = s1p.A00(AlarmManager.class, "alarm");
        if (A002 instanceof C7860Qbk) {
            throw AnonymousClass7TE.A0w("Cannot acquire Alarm service");
        }
        this.A03 = (AlarmManager) A002.A01();
        Handler handler2 = handler;
        this.A00 = handler;
        this.A08 = r15;
        Intent A0G = Pxe.A0G(obj);
        Pxe.A1L(context, A0G);
        try {
            0Sy r1 = new 0Sy();
            r1.A0A(A0G);
            r1.A09();
            pendingIntent = r1.A02(context, 0, 134217728);
        } catch (SecurityException e) {
            pendingIntent = null;
            0KC.A0G("WakingExecutorService", "Failed to create pending intent", e);
        }
        this.A04 = pendingIntent;
        Q63 q63 = new Q63(this, 5);
        this.A05 = q63;
        this.A08.A07(q63, this.A06, new IntentFilter(this.A01), handler2, false);
    }

    public static void A00(C7871Qbv qbv, C13262TSd tSd, long j) {
        SystemClock.elapsedRealtime();
        synchronized (tSd) {
            tSd.A02.add(new TA7(qbv, j));
            A02(tSd);
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public final List shutdownNow() {
        throw C66580MXl.A11();
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new C7873Qbx(this, callable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        C7871Qbv qbv = new C7871Qbv(this, callable);
        Pxj.A1G(qbv, this, timeUnit, j);
        return qbv;
    }

    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C7871Qbv qbv = new C7871Qbv(this, callable);
        Pxj.A1G(qbv, this, timeUnit, 0);
        this.A00.post(new TCT(this));
        return qbv;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return submit((Object) null, runnable);
    }
}
