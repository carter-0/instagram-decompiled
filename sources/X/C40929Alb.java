package X;

import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;

/* renamed from: X.Alb  reason: case insensitive filesystem */
public final class C40929Alb implements Runnable {
    public final /* synthetic */ XplatAssetManagerCompletionCallback A00;
    public final /* synthetic */ String A01;

    public C40929Alb(XplatAssetManagerCompletionCallback xplatAssetManagerCompletionCallback, String str) {
        this.A00 = xplatAssetManagerCompletionCallback;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S1g] */
    public final void run() {
        C371478yM r2 = this.A00.stateListener;
        ? obj = new Object();
        obj.A00 = AnonymousClass05K.A15;
        obj.A01 = this.A01;
        r2.DEV(obj.A00());
    }
}
