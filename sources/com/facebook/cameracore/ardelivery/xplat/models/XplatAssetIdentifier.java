package com.facebook.cameracore.ardelivery.xplat.models;

import X.0qQ;

public final class XplatAssetIdentifier {
    public final String assetId;
    public final String cacheKey;
    public final String effectInstanceId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XplatAssetIdentifier(com.facebook.cameracore.ardelivery.model.ARRequestAsset r4) {
        /*
            r3 = this;
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.80A r0 = r4.A02
            java.lang.String r2 = r0.A09
            X.0qQ.A07(r2)
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r0.A08
            r3.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.models.XplatAssetIdentifier.<init>(com.facebook.cameracore.ardelivery.model.ARRequestAsset):void");
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final String getEffectInstanceId() {
        return this.effectInstanceId;
    }

    public XplatAssetIdentifier(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        this.assetId = str;
        this.effectInstanceId = str2;
        this.cacheKey = str3;
    }
}
