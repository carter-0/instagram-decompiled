package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataResponse;

public final class S0H {
    public final /* synthetic */ XplatAsyncMetadataCompletionCallback A00;

    public final void A00(C10665Rvz rvz) {
        0qQ.A0B(rvz, 0);
        String str = rvz.A02;
        String str2 = rvz.A00;
        String str3 = rvz.A03;
        C371138xf xplatCompressionType = ARRequestAsset.CompressionMethod.toXplatCompressionType(ARRequestAsset.CompressionMethod.fromString(rvz.A01));
        0qQ.A07(xplatCompressionType);
        this.A00.onSuccess(new XplatAsyncMetadataResponse(str, str2, str3, xplatCompressionType));
    }

    public S0H(XplatAsyncMetadataCompletionCallback xplatAsyncMetadataCompletionCallback) {
        this.A00 = xplatAsyncMetadataCompletionCallback;
    }
}
