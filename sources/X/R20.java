package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public abstract class R20 extends C258533zE implements Runnable {
    public ListenableFuture A00;
    public Class A01;
    public Object A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R20, java.lang.Object, java.lang.Runnable, X.1K2] */
    public static void A01(AnonymousClass2hV r2, ListenableFuture listenableFuture, Executor executor) {
        ? obj = new Object();
        listenableFuture.getClass();
        obj.A00 = listenableFuture;
        obj.A01 = Exception.class;
        obj.A02 = r2;
        listenableFuture.addListener(obj, MoreExecutors.rejectionPropagatingExecutor(executor, obj));
    }

    public final String A07() {
        String str;
        StringBuilder A0n;
        ListenableFuture listenableFuture = this.A00;
        Class cls = this.A01;
        Object obj = this.A02;
        String A07 = R20.super.A07();
        if (listenableFuture != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(C273654mx.A00(754));
            A1A.append(listenableFuture);
            str = AnonymousClass7TF.A0l("], ", A1A);
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            A0n = AnonymousClass7TF.A0n(str);
            A0n.append("exceptionType=[");
            A0n.append(cls);
            A0n.append("], fallback=[");
            A0n.append(obj);
            A0n.append("]");
        } else if (A07 == null) {
            return null;
        } else {
            A0n = AnonymousClass7TF.A0n(str);
            A0n.append(A07);
        }
        return A0n.toString();
    }

    public final void A08() {
        A0B(this.A00);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public final void run() {
        Object th;
        Object obj;
        ListenableFuture listenableFuture = this.A00;
        Class cls = this.A01;
        Object obj2 = this.A02;
        boolean z = true;
        boolean A1a = DbW.A1a(listenableFuture) | DbW.A1a(cls);
        if (obj2 != null) {
            z = false;
        }
        if ((!z && !A1a) && !isCancelled()) {
            this.A00 = null;
            try {
                if (!(listenableFuture instanceof AnonymousClass1K3) || (th = ((AnonymousClass1K3) listenableFuture).A06()) == null) {
                    17k.A0B(listenableFuture, "Future was expected to be done: %s", listenableFuture.isDone());
                    set(AnonymousClass412.A00(listenableFuture));
                    return;
                }
            } catch (ExecutionException e) {
                th = e.getCause();
                if (th == null) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    Pxg.A1R(A1A, "Future type ", listenableFuture);
                    Pxg.A1R(A1A, " threw ", e);
                    th = AnonymousClass7TE.A11(AnonymousClass7TF.A0l(" without a cause", A1A));
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (!cls.isInstance(th)) {
                A0A(listenableFuture);
                return;
            }
            try {
                boolean z2 = this instanceof C8700R1r;
                if (z2) {
                    C303636Ad r4 = (C303636Ad) obj2;
                    obj = r4.ABk(th);
                    17k.A08(obj, r4, C273654mx.A00(1195));
                } else {
                    obj = ((AnonymousClass2hV) obj2).apply(th);
                }
                if (z2) {
                    A0A((ListenableFuture) obj);
                } else {
                    set(obj);
                }
            } catch (Throwable th3) {
                if (th3 instanceof InterruptedException) {
                    Pxe.A1F();
                }
                setException(th3);
            } finally {
                this.A01 = null;
                this.A02 = null;
            }
        }
    }
}
