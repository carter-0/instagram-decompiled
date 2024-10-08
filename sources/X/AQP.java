package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.xplat.models.XplatARLocalAsset;
import java.io.IOException;
import java.util.List;

public final class AQP implements C371478yM {
    public OnAsyncAssetFetchCompletedListener A00;

    public final void DEV(C8993RKl rKl) {
        this.A00.onAsyncAssetFetchCompleted((String) null, rKl.A00());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.S1g] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.S1g] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            str = "empty asset downloaded";
        } else if (list.size() > 1) {
            str = "should not fetch more than 1 asset for at a time for async assets";
        } else {
            XplatARLocalAsset xplatARLocalAsset = (XplatARLocalAsset) AnonymousClass7TE.A13(list);
            if (!C372138zo.A01.contains(xplatARLocalAsset.getARAssetType())) {
                str = 002.A0R("Unsupported asset type used in Async Asset request : ", xplatARLocalAsset.getARAssetType().toString());
            } else {
                try {
                    this.A00.onAsyncAssetFetchCompleted(xplatARLocalAsset.filePath, (String) null);
                    return;
                } catch (IOException | SecurityException unused) {
                    ? obj2 = new Object();
                    obj2.A00 = AnonymousClass05K.A0B;
                    obj2.A01 = "bad async asset file path";
                    DEV(obj2.A00());
                    return;
                }
            }
        }
        ? obj3 = new Object();
        obj3.A00 = AnonymousClass05K.A0B;
        obj3.A01 = str;
        DEV(obj3.A00());
    }
}
