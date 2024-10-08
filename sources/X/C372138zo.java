package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.8zo  reason: invalid class name and case insensitive filesystem */
public final class C372138zo implements C372148zp {
    public static final List A01 = Arrays.asList(new ARAssetType[]{ARAssetType.ASYNC, ARAssetType.REMOTE});
    public final C314366i5 A00;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.AQP, java.lang.Object, X.8yM] */
    public final AnonymousClass6i7 CwB(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARRequestAsset aRRequestAsset) {
        ? obj = new Object();
        obj.A00 = onAsyncAssetFetchCompletedListener;
        C314366i5 r0 = this.A00;
        return r0.A05.fetchAsyncAsset(new XplatRemoteAsset(aRRequestAsset), new XplatAssetManagerCompletionCallback(obj, r0.A08));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.AQP, java.lang.Object, X.8yM] */
    public final AnonymousClass6i7 CwC(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARAssetType aRAssetType, C371118xc r7, String str, String str2, String str3, boolean z) {
        ? obj = new Object();
        obj.A00 = onAsyncAssetFetchCompletedListener;
        C314366i5 r1 = this.A00;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        return r1.A05.fetchAsyncAssetByFBID(str, str2, new XplatAssetManagerCompletionCallback(obj, r1.A08));
    }

    public final AnonymousClass6i7 DFB(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, String str, String str2) {
        C314366i5 r1 = this.A00;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(onAsyncAssetFetchCompletedListener, 2);
        return r1.A05.fetchAsyncAssetMetadata(str, str2, onAsyncAssetFetchCompletedListener);
    }

    public C372138zo(C314366i5 r1) {
        this.A00 = r1;
    }
}
