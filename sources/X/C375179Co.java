package X;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Co  reason: invalid class name and case insensitive filesystem */
public final class C375179Co extends 14r {
    public 0eP A00 = new 0eP(false, 0);
    public final int A01;

    public final int Ah6() {
        return 6;
    }

    public final C374849Ba A02(int i, int i2) {
        C374849Ba r3 = new C374849Ba();
        String valueOf = String.valueOf(((Number) this.A00.A01).intValue());
        Map map = r3.A02;
        map.put("old_priority", valueOf);
        map.put("new_priority", String.valueOf(this.A01));
        map.put("is_boosted", String.valueOf(((Boolean) this.A00.A00).booleanValue()));
        this.A00 = new 0eP(false, 0);
        return r3;
    }

    public final void A04() {
        AtomicInteger atomicInteger = C324346z8.A01;
        if (atomicInteger.get() != 0) {
            int decrementAndGet = atomicInteger.decrementAndGet();
            if (decrementAndGet == 0) {
                int A002 = AnonymousClass15N.A00();
                if (A002 >= 0) {
                    Process.setThreadPriority(A002, C324346z8.A02);
                    C324346z8.A00.set(false);
                }
            } else if (decrementAndGet < 0) {
                atomicInteger.compareAndSet(decrementAndGet, 0);
            }
        }
    }

    public final boolean A05() {
        boolean z;
        int i = this.A01;
        int A002 = AnonymousClass15N.A00();
        boolean z2 = false;
        if (A002 >= 0) {
            z2 = true;
        }
        int i2 = 0;
        if (!z2) {
            z = false;
        } else {
            if (C324346z8.A00.compareAndSet(false, true)) {
                C324346z8.A02 = Process.getThreadPriority(A002);
                i2 = C324346z8.A02;
            }
            Process.setThreadPriority(A002, i);
            C324346z8.A01.incrementAndGet();
            z = true;
        }
        this.A00 = new 0eP(z, Integer.valueOf(i2));
        return true;
    }

    public C375179Co(int i) {
        this.A01 = i;
    }
}
