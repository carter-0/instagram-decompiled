package com.facebook.cameracore.ardelivery.xplat.models;

import X.C371128xe;

public final class XplatRemoteAsset {
    public static final C371128xe Companion = new Object();
    public static final String UNKNOWN = "unknown";
    public final String assetId;
    public final String cacheKey;
    public final int compressionType;
    public final String effectInstanceId;
    public final boolean encrypted;
    public final String fileName;
    public final long fileSizeInBytes;
    public final String md5Hash;
    public final String modelAssetType;
    public final String url;
    public final int xplatAssetType;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r8.length() == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XplatRemoteAsset(com.facebook.cameracore.ardelivery.model.ARRequestAsset r10) {
        /*
            r9 = this;
            r3 = 1
            X.0qQ.A0B(r10, r3)
            r9.<init>()
            X.80A r2 = r10.A02
            java.lang.String r8 = r2.A0A
            java.lang.String r7 = r2.A08
            java.lang.String r6 = r10.A07
            r5 = r6
            java.lang.String r4 = r2.A09
            if (r4 == 0) goto L_0x0101
            r9.assetId = r4
            if (r8 == 0) goto L_0x001f
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            java.lang.String r1 = "unknown"
            if (r0 == 0) goto L_0x0025
            r8 = r1
        L_0x0025:
            r9.effectInstanceId = r8
            if (r7 == 0) goto L_0x002f
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r7 = r4
        L_0x0030:
            r9.cacheKey = r7
            if (r6 == 0) goto L_0x003a
            int r0 = r6.length()
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r6 = r1
        L_0x003b:
            r9.fileName = r6
            com.facebook.cameracore.ardelivery.model.ARAssetType r4 = r2.A02
            if (r4 == 0) goto L_0x00f1
            int r1 = r4.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00ca
            r0 = 2
            if (r1 == r0) goto L_0x00c7
            r0 = 3
            if (r1 == r0) goto L_0x00c4
            r0 = 5
            if (r1 == r0) goto L_0x00c1
            if (r1 != r3) goto L_0x00f1
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT
            r1 = 0
            if (r4 != r0) goto L_0x0059
            r1 = 1
        L_0x0059:
            java.lang.String r0 = "Cannot get VersionedCapability from Effect Asset"
            X.0JA.A09(r1, r0)
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r2.A00
            if (r0 == 0) goto L_0x00e9
            com.facebook.cameracore.ardelivery.model.XplatAssetType r0 = com.facebook.cameracore.ardelivery.model.XplatAssetType.fromVersionedCapability(r0)
            X.0qQ.A07(r0)
        L_0x0069:
            int r0 = r0.getValue()
            r9.xplatAssetType = r0
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = r2.A03
            if (r0 == 0) goto L_0x00e1
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x00be
            r0 = 2
            if (r1 == r0) goto L_0x00bb
            r0 = 0
            if (r1 != r0) goto L_0x00e1
            X.8xf r0 = X.C371138xf.None
        L_0x0081:
            int r0 = r0.A00
            r9.compressionType = r0
            java.lang.String r1 = r10.A09
            if (r1 == 0) goto L_0x00d9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00cd
            r9.url = r1
            java.lang.Boolean r0 = r2.A06
            boolean r0 = r0.booleanValue()
            r9.encrypted = r0
            java.lang.String r0 = r10.A06
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = ""
        L_0x009f:
            r9.md5Hash = r0
            long r0 = r10.A00
            r9.fileSizeInBytes = r0
            X.8LN r0 = r2.A05
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x00b8
        L_0x00af:
            r0 = r5
            if (r5 != 0) goto L_0x00b8
            X.8LN r0 = X.AnonymousClass8LN.Unknown
            java.lang.String r0 = r0.toString()
        L_0x00b8:
            r9.modelAssetType = r0
            return
        L_0x00bb:
            X.8xf r0 = X.C371138xf.TarBrotli
            goto L_0x0081
        L_0x00be:
            X.8xf r0 = X.C371138xf.Zip
            goto L_0x0081
        L_0x00c1:
            com.facebook.cameracore.ardelivery.model.XplatAssetType r0 = com.facebook.cameracore.ardelivery.model.XplatAssetType.SparkVision
            goto L_0x0069
        L_0x00c4:
            com.facebook.cameracore.ardelivery.model.XplatAssetType r0 = com.facebook.cameracore.ardelivery.model.XplatAssetType.Remote
            goto L_0x0069
        L_0x00c7:
            com.facebook.cameracore.ardelivery.model.XplatAssetType r0 = com.facebook.cameracore.ardelivery.model.XplatAssetType.Async
            goto L_0x0069
        L_0x00ca:
            com.facebook.cameracore.ardelivery.model.XplatAssetType r0 = com.facebook.cameracore.ardelivery.model.XplatAssetType.AREffect
            goto L_0x0069
        L_0x00cd:
            r0 = 1257(0x4e9, float:1.761E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00d9:
            java.lang.String r1 = "Expected a non-empty string, but got null"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            java.lang.String r1 = ""
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            java.lang.String r0 = "support type asset should not have a null capability."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00f1:
            java.lang.String r1 = "Asset type not supported by xplat : "
            java.lang.String r0 = r4.name()
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0101:
            java.lang.String r1 = "ARRequestAsset id cannot be empty."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset.<init>(com.facebook.cameracore.ardelivery.model.ARRequestAsset):void");
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final int getCompressionType() {
        return this.compressionType;
    }

    public final String getEffectInstanceId() {
        return this.effectInstanceId;
    }

    public final boolean getEncrypted() {
        return this.encrypted;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSizeInBytes() {
        return this.fileSizeInBytes;
    }

    public final String getMd5Hash() {
        return this.md5Hash;
    }

    public final String getModelAssetType() {
        return this.modelAssetType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getXplatAssetType() {
        return this.xplatAssetType;
    }
}
