package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OrQ  reason: case insensitive filesystem */
public final class C71823OrQ implements ListenableFuture {
    public boolean A00;
    public final SettableFuture A01 = new Object();
    public final C262204Co A02;

    public final void addListener(Runnable runnable, Executor executor) {
        this.A01.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        if (!this.A01.cancel(z)) {
            return false;
        }
        this.A02.AG7((CancellationException) null);
        return true;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.A01.get(j, timeUnit);
        if (!(obj instanceof OAX)) {
            return obj;
        }
        throw new CancellationException().initCause(((OAX) obj).A00);
    }

    public final boolean isCancelled() {
        SettableFuture settableFuture = this.A01;
        if (!settableFuture.isCancelled()) {
            if (!isDone() || this.A00) {
                return false;
            }
            try {
                if (!(AnonymousClass412.A00(settableFuture) instanceof OAX)) {
                    return false;
                }
            } catch (CancellationException unused) {
            } catch (ExecutionException unused2) {
                this.A00 = true;
                return false;
            }
        }
        return true;
    }

    public final boolean isDone() {
        return this.A01.isDone();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public C71823OrQ(C262204Co r2) {
        this.A02 = r2;
    }

    public final String toString() {
        StringBuilder sb;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(AnonymousClass000.A00(1062));
        if (isDone()) {
            try {
                Object A002 = AnonymousClass412.A00(this.A01);
                if (A002 instanceof OAX) {
                    StringBuilder A1A2 = AnonymousClass7TE.A1A();
                    A1A2.append("CANCELLED, cause=[");
                    A1A2.append(((OAX) A002).A00);
                    A1A.append(C51967G9n.A0r(A1A2, ']'));
                } else {
                    StringBuilder A1A3 = AnonymousClass7TE.A1A();
                    A1A3.append(AnonymousClass000.A00(1028));
                    A1A3.append(A002);
                    A1A.append(C51967G9n.A0r(A1A3, ']'));
                }
            } catch (CancellationException unused) {
                A1A.append("CANCELLED");
            } catch (ExecutionException e) {
                sb = AnonymousClass7TE.A1A();
                sb.append(AnonymousClass000.A00(943));
                sb.append(e.getCause());
                sb.append(']');
            } catch (Throwable th) {
                sb = AnonymousClass7TE.A1A();
                sb.append(AnonymousClass000.A00(1040));
                sb.append(th.getClass());
                sb.append(AnonymousClass000.A00(836));
            }
        } else {
            sb = AnonymousClass7TE.A1A();
            sb.append("PENDING, delegate=[");
            sb.append(this.A01);
            sb.append(']');
            A1A.append(sb.toString());
        }
        A1A.append(']');
        return DbT.A10(A1A);
    }

    public final Object get() {
        Object obj = this.A01.get();
        if (!(obj instanceof OAX)) {
            return obj;
        }
        throw new CancellationException().initCause(((OAX) obj).A00);
    }
}
