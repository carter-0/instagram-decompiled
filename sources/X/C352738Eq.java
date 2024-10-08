package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8Eq  reason: invalid class name and case insensitive filesystem */
public final class C352738Eq implements AnonymousClass83x {
    public final /* synthetic */ C314386iA A00;
    public final /* synthetic */ C352728Ep A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AtomicInteger A04;

    public C352738Eq(C314386iA r1, C352728Ep r2, SettableFuture settableFuture, String str, AtomicInteger atomicInteger) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = atomicInteger;
        this.A02 = settableFuture;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S1g] */
    public final void DEf(boolean z, Throwable th) {
        ? obj = new Object();
        obj.A00 = AnonymousClass05K.A05;
        obj.A02 = th;
        C8993RKl A002 = obj.A00();
        this.A00.A00.A00(this.A01, this.A03, false);
        SettableFuture settableFuture = this.A02;
        settableFuture.setException(A002);
        settableFuture.set(false);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.A00.A00(this.A01, this.A03, true);
        if (this.A04.decrementAndGet() == 0) {
            this.A02.set(true);
        }
    }
}
