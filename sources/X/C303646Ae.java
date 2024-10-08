package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.6Ae  reason: invalid class name and case insensitive filesystem */
public abstract class C303646Ae extends C258533zE implements Runnable {
    public ListenableFuture A00;
    public Object A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Af, X.6Ae, java.lang.Object, java.lang.Runnable, X.1K2] */
    public static C303656Af A01(C303636Ad r2, ListenableFuture listenableFuture, Executor executor) {
        ? obj = new Object();
        obj.A00 = listenableFuture;
        obj.A01 = r2;
        listenableFuture.addListener(obj, MoreExecutors.rejectionPropagatingExecutor(executor, obj));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Ae, java.lang.Object, X.R1y, java.lang.Runnable, X.1K2] */
    public static C8707R1y A02(AnonymousClass2hV r2, ListenableFuture listenableFuture, Executor executor) {
        ? obj = new Object();
        listenableFuture.getClass();
        obj.A00 = listenableFuture;
        obj.A01 = r2;
        listenableFuture.addListener(obj, MoreExecutors.rejectionPropagatingExecutor(executor, obj));
        return obj;
    }

    public final String A07() {
        String str;
        StringBuilder sb;
        ListenableFuture listenableFuture = this.A00;
        Object obj = this.A01;
        String A07 = C303646Ae.super.A07();
        if (listenableFuture != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("inputFuture=[");
            sb2.append(listenableFuture);
            sb2.append("], ");
            str = sb2.toString();
        } else {
            str = "";
        }
        if (obj != null) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("function=[");
            sb.append(obj);
            sb.append("]");
        } else if (A07 == null) {
            return null;
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(A07);
        }
        return sb.toString();
    }

    public final void A08() {
        A0B(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    public Object A0C(Object obj, Object obj2) {
        C303636Ad r3 = (C303636Ad) obj;
        ListenableFuture ABk = r3.ABk(obj2);
        17k.A08(ABk, r3, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return ABk;
    }

    public void A0D(Object obj) {
        A0A((ListenableFuture) obj);
    }

    public final void run() {
        ListenableFuture listenableFuture = this.A00;
        Object obj = this.A01;
        boolean isCancelled = isCancelled();
        boolean z = true;
        boolean z2 = false;
        if (listenableFuture == null) {
            z2 = true;
        }
        boolean z3 = isCancelled | z2;
        if (obj != null) {
            z = false;
        }
        if (!z3 && !z) {
            this.A00 = null;
            if (listenableFuture.isCancelled()) {
                A0A(listenableFuture);
                return;
            }
            try {
                17k.A0B(listenableFuture, "Future was expected to be done: %s", listenableFuture.isDone());
                try {
                    Object A0C = A0C(obj, AnonymousClass412.A00(listenableFuture));
                    this.A01 = null;
                    A0D(A0C);
                } catch (Throwable th) {
                    this.A01 = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                e = e.getCause();
                setException(e);
            } catch (Error | Exception e2) {
                e = e2;
                setException(e);
            }
        }
    }
}
