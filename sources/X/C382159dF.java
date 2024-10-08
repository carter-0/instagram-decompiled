package X;

import android.os.Process;
import com.facebook.msys.mci.Execution;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9dF  reason: invalid class name and case insensitive filesystem */
public final class C382159dF extends 14r {
    public 0eP A00 = AnonymousClass7TF.A0x(false, 0);
    public final int A01;

    public final int Ah6() {
        return 26;
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
        AtomicInteger atomicInteger = C39621A2l.A01;
        if (atomicInteger.get() != 0) {
            int decrementAndGet = atomicInteger.decrementAndGet();
            if (decrementAndGet == 0) {
                Execution.setThreadPriorities(Integer.valueOf(C39621A2l.A02));
                C39621A2l.A00.set(false);
            } else if (decrementAndGet < 0) {
                atomicInteger.compareAndSet(decrementAndGet, 0);
            }
        }
    }

    public final boolean A05() {
        boolean z;
        int i;
        int i2 = this.A01;
        int i3 = 0;
        if (C39621A2l.A00.compareAndSet(false, true)) {
            List list = (List) Execution.sThreadIds.get(2);
            synchronized (list) {
                if (list.isEmpty()) {
                    i = AnonymousClass972.MUTABLE_FLAG_MASK;
                } else {
                    i = Process.getThreadPriority(((Integer) list.get(0)).intValue());
                }
            }
            C39621A2l.A02 = i;
            int i4 = C39621A2l.A02;
            if (C39621A2l.A02 == Integer.MIN_VALUE) {
                z = false;
                this.A00 = AnonymousClass7TF.A0x(z, i3);
                return true;
            }
            i3 = i4;
        }
        Execution.setThreadPriorities(Integer.valueOf(i2));
        C39621A2l.A01.incrementAndGet();
        z = true;
        this.A00 = AnonymousClass7TF.A0x(z, i3);
        return true;
    }

    public C382159dF(int i) {
        this.A01 = i;
    }
}
