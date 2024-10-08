package X;

import com.facebook.cameracore.ardelivery.xplat.models.XplatModelManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Es  reason: invalid class name and case insensitive filesystem */
public final class C352748Es extends XplatModelManagerCompletionCallback {
    public final /* synthetic */ AnonymousClass84Q A00;
    public final /* synthetic */ C314366i5 A01;
    public final /* synthetic */ ListenableFuture A02;

    public final void onSuccess(XplatModelPaths xplatModelPaths) {
        0qQ.A0B(xplatModelPaths, 0);
        try {
            ListenableFuture listenableFuture = this.A02;
            if (listenableFuture.isDone() && ((Boolean) listenableFuture.get()).booleanValue()) {
                this.A00.D51(xplatModelPaths.aRModelPaths, (Exception) null);
                return;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        ListenableFuture listenableFuture2 = this.A02;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ScheduledExecutorService scheduledExecutorService = this.A01.A08;
        C255183ti.A04(new AnonymousClass8LO(this.A00, xplatModelPaths), C255183ti.A02(listenableFuture2, scheduledExecutorService, timeUnit, 20), scheduledExecutorService);
    }

    public C352748Es(AnonymousClass84Q r1, C314366i5 r2, ListenableFuture listenableFuture) {
        this.A02 = listenableFuture;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S1g] */
    public final void onFail(String str) {
        AnonymousClass84Q r2 = this.A00;
        ? obj = new Object();
        obj.A00 = AnonymousClass05K.A02;
        obj.A01 = str;
        r2.D51((AnonymousClass8LL) null, obj.A00());
    }
}
