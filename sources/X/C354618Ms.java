package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;

/* renamed from: X.8Ms  reason: invalid class name and case insensitive filesystem */
public final class C354618Ms implements 2Kw {
    public final /* synthetic */ XplatRemoteModelVersionFetchCompletionCallback A00;

    public C354618Ms(XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        this.A00 = xplatRemoteModelVersionFetchCompletionCallback;
    }

    public final void invoke(Throwable th) {
        XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback = this.A00;
        String message = th.getMessage();
        if (message == null) {
            message = "Failed to receive model version from nmlml";
        }
        xplatRemoteModelVersionFetchCompletionCallback.onFailure(message);
    }
}
