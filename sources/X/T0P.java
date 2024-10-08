package X;

import com.facebook.models.ModelAssetMetadata;
import com.facebook.models.ModelMetadata;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public final class T0P implements 2IR {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ HashMap A02;
    public final /* synthetic */ CountDownLatch A03;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        0KC.A0F("BCModelDownloader", 002.A0R("Failed to download model ", this.A01), th);
        this.A03.countDown();
    }

    public T0P(String str, String str2, HashMap hashMap, CountDownLatch countDownLatch) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = countDownLatch;
        this.A02 = hashMap;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        ModelMetadata modelMetadata = (ModelMetadata) obj;
        if (modelMetadata != null) {
            ModelAssetMetadata assetMetadata = modelMetadata.getAssetMetadata(this.A00);
            if (!(assetMetadata == null || (str = assetMetadata.path) == null)) {
                this.A02.put(this.A01, str);
            }
        } else {
            0KC.A0C("BCModelDownloader", 002.A0R("Failed to download model ", this.A01));
        }
        this.A03.countDown();
    }
}
