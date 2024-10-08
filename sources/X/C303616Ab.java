package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Ab  reason: invalid class name and case insensitive filesystem */
public final class C303616Ab implements ListenableFuture, AnonymousClass685 {
    public final AnonymousClass685 A00;

    public final AnonymousClass685 A7y(MailboxCallback mailboxCallback, Executor executor) {
        return this.A00.A7y(mailboxCallback, executor);
    }

    public final AnonymousClass685 Eiu(MailboxCallback mailboxCallback) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void addListener(Runnable runnable, Executor executor) {
        0qQ.A0B(runnable, 0);
        0qQ.A0B(executor, 1);
        AnonymousClass685 r1 = this.A00;
        synchronized (r1) {
            r1.addResultCallback(executor, new AnonymousClass6Ag(runnable));
            r1.A7y(new C303666Ah(runnable), executor);
        }
    }

    public final boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    public final Object get() {
        return this.A00.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public final boolean isDone() {
        return this.A00.isDone();
    }

    public final /* bridge */ /* synthetic */ MailboxObservable addResultCallback(MailboxCallback mailboxCallback) {
        return this.A00.addResultCallback(mailboxCallback);
    }

    public C303616Ab(AnonymousClass685 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback) {
        return this.A00.addResultCallback(executor, mailboxCallback);
    }
}
