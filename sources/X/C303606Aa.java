package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.6Aa  reason: invalid class name and case insensitive filesystem */
public abstract class C303606Aa {
    public static final ListenableFuture A00(AnonymousClass685 r1) {
        0qQ.A0B(r1, 0);
        return new C303616Ab(r1);
    }

    public static final Object A01(AnonymousClass685 r3, AnonymousClass4D7 r4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r1 = new 1IW(1, 1Ey.A02(r4));
        r1.A0I();
        if (r3.isCancelled()) {
            r1.AG9((Throwable) null);
        } else {
            r3.addResultCallback(new C64414LbV(r1));
        }
        return r1.A0E();
    }
}
