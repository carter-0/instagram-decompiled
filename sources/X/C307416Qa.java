package X;

import android.os.Process;
import java.util.List;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6Qa  reason: invalid class name and case insensitive filesystem */
public final class C307416Qa implements C307426Qb {
    public final AnonymousClass6QY A00;

    public static AnonymousClass6SH A00(AnonymousClass6S4 r4, AnonymousClass6S6 r5, AnonymousClass6QY r6, List list) {
        RunnableFuture runnableFuture;
        AnonymousClass6SE r1;
        AnonymousClass6SH r2;
        synchronized (r6) {
            runnableFuture = r6.A01;
            r1 = r6.A00;
        }
        if (r1 == null) {
            if (runnableFuture != null) {
                AtomicInteger atomicInteger = r6.A02;
                if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                    runnableFuture.run();
                }
                r1 = (AnonymousClass6SE) C245983dn.A00(runnableFuture, atomicInteger.get());
                synchronized (r6) {
                    r6.A00 = r1;
                    r6.A01 = null;
                }
            } else {
                throw new IllegalStateException("The future task is null but there is no computed result");
            }
        }
        if (r5 != null) {
            r2 = r5.A00;
        } else {
            r2 = null;
        }
        AnonymousClass6SH A002 = AnonymousClass6SF.A00(r4, r2, r1, C307436Qc.A00, list);
        AnonymousClass6S6 r3 = new AnonymousClass6S6(A002, r1);
        return new AnonymousClass6SH(r3.A00.A00, r3, A002.A02);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass6SH EIW(AnonymousClass2TS r2, AnonymousClass6S4 r3, Object obj, List list) {
        return A00(r3, (AnonymousClass6S6) obj, this.A00, list);
    }

    public C307416Qa(AnonymousClass6QY r1) {
        this.A00 = r1;
    }
}
