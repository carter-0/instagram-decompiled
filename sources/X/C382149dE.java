package X;

import android.os.Process;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9dE  reason: invalid class name and case insensitive filesystem */
public final class C382149dE extends 14r {
    public Pair A00 = new Pair(false, 0);
    public final int A01;

    public final int Ah6() {
        return 9;
    }

    public final C374849Ba A02(int i, int i2) {
        C374849Ba r3 = new C374849Ba();
        String obj = this.A00.second.toString();
        Map map = r3.A02;
        map.put("old_priority", obj);
        map.put("new_priority", String.valueOf(this.A01));
        map.put("is_boosted", this.A00.first.toString());
        this.A00 = new Pair(false, 0);
        return r3;
    }

    public final void A04() {
        AtomicInteger atomicInteger = C39626A2q.A01;
        if (atomicInteger.get() != 0) {
            int decrementAndGet = atomicInteger.decrementAndGet();
            if (decrementAndGet == 0) {
                if (C39626A2q.A03 != null && C39626A2q.A03.intValue() >= 0) {
                    Process.setThreadPriority(C39626A2q.A03.intValue(), C39626A2q.A02);
                    C39626A2q.A00.set(false);
                }
            } else if (decrementAndGet < 0) {
                atomicInteger.compareAndSet(decrementAndGet, 0);
            }
        }
    }

    public final boolean A05() {
        boolean z;
        int i;
        int i2 = this.A01;
        if (C39626A2q.A03 == null) {
            int[] A002 = 15O.A00(new String[]{"(ComponentLayout)"});
            if (A002.length != 1) {
                i = -1;
            } else {
                i = A002[0];
            }
            C39626A2q.A03 = Integer.valueOf(i);
        }
        int intValue = C39626A2q.A03.intValue();
        boolean z2 = false;
        if (intValue >= 0) {
            z2 = true;
        }
        int i3 = 0;
        if (!z2) {
            z = false;
        } else {
            if (C39626A2q.A00.compareAndSet(false, true)) {
                C39626A2q.A02 = Process.getThreadPriority(intValue);
                i3 = C39626A2q.A02;
            }
            Process.setThreadPriority(intValue, i2);
            C39626A2q.A01.incrementAndGet();
            z = true;
        }
        this.A00 = new Pair(z, Integer.valueOf(i3));
        return true;
    }

    public C382149dE(int i) {
        this.A01 = i;
    }
}
