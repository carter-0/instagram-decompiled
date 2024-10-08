package X;

import android.os.PerformanceHintManager;
import android.os.Process;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SOb  reason: case insensitive filesystem */
public final class C11344SOb {
    public static final C11344SOb A00 = new Object();
    public static final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C13341TVo.A00);

    public static final /* synthetic */ PerformanceHintManager A00() {
        return (PerformanceHintManager) A01.getValue();
    }

    public final void A02(int i) {
        PerformanceHintManager performanceHintManager = (PerformanceHintManager) A01.getValue();
        if (performanceHintManager != null) {
            int myPid = Process.myPid();
            performanceHintManager.createHintSession(new int[]{myPid}, TimeUnit.MINUTES.toNanos((long) i));
        }
    }

    public final void A01(int i) {
        int myTid = Process.myTid();
        0qQ.A0A(Thread.currentThread().getName());
        0nY.A00().ATE(new 0vX(1763559808, new C13011THt(i, myTid)));
    }
}
