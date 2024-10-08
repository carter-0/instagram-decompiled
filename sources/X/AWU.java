package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.ReferenceQueue;

public final class AWU implements C367718rS {
    public final AnonymousClass4MS A00;
    public final SettableFuture A01;
    public volatile C367718rS A02;

    public final C367718rS AKj(C367948rp r1, Object obj, ReferenceQueue referenceQueue) {
        return this;
    }

    public final C367948rp B1w() {
        return null;
    }

    public final boolean isLoading() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.1K2] */
    public final ListenableFuture A00(C368338sS r4, Object obj) {
        ListenableFuture listenableFuture;
        try {
            this.A00.A02();
            Object obj2 = this.A02.get();
            if (obj2 == null) {
                Object A012 = r4.A01(obj);
                ListenableFuture listenableFuture2 = this.A01;
                boolean z = listenableFuture2.set(A012);
                listenableFuture = listenableFuture2;
                if (!z) {
                    return C255183ti.A03(A012);
                }
                return listenableFuture;
            }
            return C303646Ae.A02(new C12608Szs((Object) this, 6), r4.A00(obj, obj2), 1Lf.A01);
        } catch (Throwable th) {
            ListenableFuture listenableFuture3 = this.A01;
            boolean exception = listenableFuture3.setException(th);
            ListenableFuture listenableFuture4 = listenableFuture3;
            if (!exception) {
                ? obj3 = new Object();
                obj3.setException(th);
                listenableFuture4 = obj3;
            }
            listenableFuture = listenableFuture4;
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                listenableFuture = listenableFuture4;
            }
        }
    }

    public final int CGN() {
        return this.A02.CGN();
    }

    public final void CsB(Object obj) {
        if (obj != null) {
            this.A01.set(obj);
        } else {
            this.A02 = C367698rQ.A0L;
        }
    }

    public final Object FNF() {
        return AnonymousClass412.A00(this.A01);
    }

    public final Object get() {
        return this.A02.get();
    }

    public final boolean isActive() {
        return this.A02.isActive();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public AWU(C367718rS r2) {
        this.A01 = new Object();
        this.A00 = new AnonymousClass4MS();
        this.A02 = r2;
    }

    public AWU() {
        this(C367698rQ.A0L);
    }
}
