package com.facebook.cameracore.ardelivery.xplat.async;

import X.C371138xf;
import X.C51974G9v;

public final class XplatAsyncMetadataResponse {
    public final String cacheKey;
    public final String graphQLID;
    public final C371138xf jCompressionType;
    public final String uri;

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final int getCompressionType() {
        return this.jCompressionType.A00;
    }

    public final String getGraphQLID() {
        return this.graphQLID;
    }

    public final String getUri() {
        return this.uri;
    }

    public XplatAsyncMetadataResponse(String str, String str2, String str3, C371138xf r4) {
        C51974G9v.A1P(str, str2, str3, r4);
        this.graphQLID = str;
        this.cacheKey = str2;
        this.uri = str3;
        this.jCompressionType = r4;
    }
}
