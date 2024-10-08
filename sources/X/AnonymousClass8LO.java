package X;

import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;

/* renamed from: X.8LO  reason: invalid class name */
public final class AnonymousClass8LO implements 2IR {
    public final /* synthetic */ AnonymousClass84Q A00;
    public final /* synthetic */ XplatModelPaths A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S1g] */
    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        AnonymousClass84Q r2 = this.A00;
        ? obj = new Object();
        obj.A00 = AnonymousClass05K.A05;
        obj.A02 = th;
        r2.D51((AnonymousClass8LL) null, obj.A00());
    }

    public AnonymousClass8LO(AnonymousClass84Q r1, XplatModelPaths xplatModelPaths) {
        this.A00 = r1;
        this.A01 = xplatModelPaths;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.D51(this.A01.aRModelPaths, (Exception) null);
    }
}
