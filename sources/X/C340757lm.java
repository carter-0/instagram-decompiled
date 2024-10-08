package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.7lm  reason: invalid class name and case insensitive filesystem */
public final class C340757lm {
    public static final UUID A06 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;

    public final synchronized C342107o3 A00(AnonymousClass8GD r6, String str, Callable callable) {
        C342107o3 r4;
        UUID uuid = this.A01;
        uuid.getClass();
        r4 = new C342107o3(this, str, uuid, callable);
        if (r6 != null) {
            r4.A01(r6);
        }
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis());
        return r4;
    }

    public final synchronized C342107o3 A01(AnonymousClass8GD r6, String str, Callable callable) {
        C342107o3 r3;
        UUID uuid = A06;
        r3 = new C342107o3(this, str, uuid, callable);
        r3.A01(r6);
        this.A03.postAtTime(r3, uuid, SystemClock.uptimeMillis());
        return r3;
    }

    public final synchronized C342107o3 A02(String str, Callable callable, long j) {
        C342107o3 r4;
        UUID uuid = this.A01;
        uuid.getClass();
        r4 = new C342107o3(this, str, uuid, callable);
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis() + j);
        return r4;
    }

    public final Object A03(String str, Callable callable) {
        C342107o3 r1;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            r1 = new C342107o3(this, str, uuid, callable);
            this.A02.post(r1);
        }
        return r1.get();
    }

    public final Object A04(String str, Callable callable) {
        C342107o3 r1;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            r1 = new C342107o3(this, str, uuid, callable);
            this.A02.post(r1);
        }
        C340897m0 r0 = (C340897m0) r1.get();
        r0.ADv();
        return r0.Bny();
    }

    public final synchronized void A05(Runnable runnable, UUID uuid) {
        UUID uuid2 = this.A01;
        if ((uuid2 != null && uuid2.equals(uuid)) || A06.equals(uuid)) {
            Handler handler = this.A00;
            if (handler != null) {
                handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (C342057ny.class) {
                    C342057ny.A00.postAtTime(runnable, uuid, uptimeMillis);
                }
            }
        }
    }

    public final synchronized void A07(String str, Callable callable) {
        A00((AnonymousClass8GD) null, str, callable);
    }

    public final synchronized void A08(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public final boolean A09() {
        if (this.A03.getLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        HandlerThread handlerThread = this.A04;
        handlerThread.quitSafely();
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        HandlerThread handlerThread2 = this.A05;
        handlerThread2.quitSafely();
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }

    public C340757lm() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        AnonymousClass0fe.A00(handlerThread);
        this.A05 = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A03 = new Handler(looper);
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        AnonymousClass0fe.A00(handlerThread2);
        this.A04 = handlerThread2;
        handlerThread2.start();
        Looper looper2 = handlerThread2.getLooper();
        looper2.getClass();
        this.A02 = new Handler(looper2);
    }

    public final void A06(String str) {
        if (!A09()) {
            throw new RuntimeException(002.A0g(str, " Current thread: ", Thread.currentThread().getName()));
        }
    }
}
