package X;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9VL  reason: invalid class name */
public final class AnonymousClass9VL extends 14r {
    public 0eP A00 = AnonymousClass7TF.A0x(false, 0);
    public final int A01;

    public final int Ah6() {
        return 8;
    }

    public final C374849Ba A02(int i, int i2) {
        C374849Ba r3 = new C374849Ba();
        String valueOf = String.valueOf(AnonymousClass7TE.A0M(this.A00.A01));
        Map map = r3.A02;
        map.put("old_priority", valueOf);
        map.put("new_priority", String.valueOf(this.A01));
        map.put("is_boosted", String.valueOf(AnonymousClass7TE.A1a(this.A00.A00)));
        this.A00 = AnonymousClass7TF.A0x(false, 0);
        return r3;
    }

    public final void A04() {
        AtomicInteger atomicInteger = AnonymousClass9VR.A01;
        if (atomicInteger.get() != 0) {
            int decrementAndGet = atomicInteger.decrementAndGet();
            if (decrementAndGet == 0) {
                Process.setThreadPriority(Process.myPid(), AnonymousClass9VR.A02);
                AnonymousClass9VR.A00.set(false);
            } else if (decrementAndGet < 0) {
                atomicInteger.compareAndSet(decrementAndGet, 0);
            }
        }
    }

    public final boolean A05() {
        boolean z;
        Integer valueOf;
        int i = this.A01;
        int myPid = Process.myPid();
        AtomicBoolean atomicBoolean = AnonymousClass9VR.A00;
        int i2 = 0;
        if (atomicBoolean.compareAndSet(false, true)) {
            AnonymousClass9VR.A02 = Process.getThreadPriority(myPid);
            int i3 = AnonymousClass9VR.A02;
            if (AnonymousClass9VR.A02 <= i) {
                atomicBoolean.set(false);
                z = false;
                valueOf = Integer.valueOf(AnonymousClass9VR.A02);
                this.A00 = AnonymousClass7TE.A1L(z, valueOf);
                return true;
            }
            i2 = i3;
        }
        Process.setThreadPriority(myPid, i);
        AnonymousClass9VR.A01.incrementAndGet();
        z = true;
        valueOf = Integer.valueOf(i2);
        this.A00 = AnonymousClass7TE.A1L(z, valueOf);
        return true;
    }

    public AnonymousClass9VL(int i) {
        this.A01 = i;
    }
}
