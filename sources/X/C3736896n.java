package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.96n  reason: invalid class name and case insensitive filesystem */
public abstract class C3736896n {
    public static Object A00(AnonymousClass9GD r3) {
        AnonymousClass3Qk.A05("Must not be called on the main application thread");
        AnonymousClass3Qk.A00();
        AnonymousClass3Qk.A03(r3, "Task must not be null");
        if (!r3.A0D()) {
            C3736996o r2 = new C3736996o((C391789tg) null);
            Executor executor = AnonymousClass9GH.A01;
            r3.A04(r2, executor);
            r3.A0A(r2, executor);
            r3.A03.A00(new C3737296r(r2, executor));
            AnonymousClass9GD.A01(r3);
            r2.A00.await();
        }
        if (r3.A0E()) {
            return r3.A06();
        }
        if (r3.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(r3.A05());
    }

    public static Object A01(AnonymousClass9GD r3, TimeUnit timeUnit, long j) {
        AnonymousClass3Qk.A05("Must not be called on the main application thread");
        AnonymousClass3Qk.A00();
        AnonymousClass3Qk.A03(r3, "Task must not be null");
        if (!r3.A0D()) {
            C3736996o r2 = new C3736996o((C391789tg) null);
            Executor executor = AnonymousClass9GH.A01;
            r3.A04(r2, executor);
            r3.A0A(r2, executor);
            r3.A03.A00(new C3737296r(r2, executor));
            AnonymousClass9GD.A01(r3);
            if (!r2.A00.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (r3.A0E()) {
            return r3.A06();
        }
        if (r3.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(r3.A05());
    }
}
