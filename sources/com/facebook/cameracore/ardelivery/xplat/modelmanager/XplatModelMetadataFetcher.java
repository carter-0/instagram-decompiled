package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.0qQ;
import X.C12057Slk;
import X.C352718Eo;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import java.util.List;

public final class XplatModelMetadataFetcher {
    public ARModelMetadataDownloader modelMetadataDownloader;

    public XplatModelMetadataFetcher(ARModelMetadataDownloader aRModelMetadataDownloader) {
        0qQ.A0B(aRModelMetadataDownloader, 1);
        this.modelMetadataDownloader = aRModelMetadataDownloader;
    }

    public final void executeRequests(List list, XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback) {
        0qQ.A0B(list, 0);
        0qQ.A0B(xplatModelMetadataCompletionCallback, 1);
        this.modelMetadataDownloader.downloadModelMetadata(list, new C352718Eo().A00(), new C12057Slk(xplatModelMetadataCompletionCallback));
    }

    public final void setModelMetadataDownloader(ARModelMetadataDownloader aRModelMetadataDownloader) {
        0qQ.A0B(aRModelMetadataDownloader, 0);
        this.modelMetadataDownloader = aRModelMetadataDownloader;
    }

    public final ARModelMetadataDownloader getModelMetadataDownloader() {
        return this.modelMetadataDownloader;
    }
}
