package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import java.util.List;

public interface RemoteModelVersionFetcher {
    void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback);
}
