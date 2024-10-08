package X;

import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;
import java.util.List;

/* renamed from: X.Alc  reason: case insensitive filesystem */
public final class C40930Alc implements Runnable {
    public final /* synthetic */ XplatAssetManagerCompletionCallback A00;
    public final /* synthetic */ List A01;

    public C40930Alc(XplatAssetManagerCompletionCallback xplatAssetManagerCompletionCallback, List list) {
        this.A00 = xplatAssetManagerCompletionCallback;
        this.A01 = list;
    }

    public final void run() {
        this.A00.stateListener.onSuccess(this.A01);
    }
}
