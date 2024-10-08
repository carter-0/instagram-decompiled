package X;

import android.os.Process;
import com.facebook.msys.mci.Execution;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.45Z  reason: invalid class name */
public final class AnonymousClass45Z implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;

    public AnonymousClass45Z(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        AtomicInteger atomicInteger = Execution.sThreadPriority;
        if (atomicInteger.get() != Integer.MIN_VALUE) {
            Process.setThreadPriority(atomicInteger.get());
        }
        ConcurrentHashMap concurrentHashMap = Execution.sThreadPriorityMap;
        Integer valueOf = Integer.valueOf(this.A00);
        if (concurrentHashMap.get(valueOf) != null) {
            Process.setThreadPriority(((Number) concurrentHashMap.get(valueOf)).intValue());
        }
        Object obj = Execution.sThreadIds.get(valueOf);
        obj.getClass();
        ((List) obj).add(Integer.valueOf(Process.myTid()));
        Execution.nativeStartExecutor(this.A01);
    }
}
