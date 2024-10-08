package com.facebook.cameracore.ardelivery.xplat.models;

import X.0qQ;

public final class XplatEffectLoggingInfo {
    public final String effectId;
    public final String effectInstanceID;
    public final String effectSessionID;
    public final boolean isPrefetch;
    public final String oneCameraActiveSessionID;
    public final String operationUniqueID;
    public final String productName;
    public final String productSessionID;
    public final String requestSource;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XplatEffectLoggingInfo(X.C352728Ep r13, com.facebook.cameracore.ardelivery.model.ARRequestAsset r14) {
        /*
            r12 = this;
            r0 = 1
            X.0qQ.A0B(r13, r0)
            r0 = 2
            X.0qQ.A0B(r14, r0)
            X.80A r1 = r14.A02
            java.lang.String r3 = r1.A09
            java.lang.String r0 = ""
            if (r3 != 0) goto L_0x0011
            r3 = r0
        L_0x0011:
            java.lang.String r4 = r13.A01
            java.lang.String r5 = r13.A00
            java.lang.String r6 = r1.A0A
            if (r6 != 0) goto L_0x001a
            r6 = r0
        L_0x001a:
            boolean r7 = r13.A02
            java.lang.String r8 = r13.A06
            if (r8 != 0) goto L_0x0021
            r8 = r0
        L_0x0021:
            java.lang.String r9 = r13.A04
            if (r9 != 0) goto L_0x0026
            r9 = r0
        L_0x0026:
            java.lang.String r10 = r13.A05
            if (r10 != 0) goto L_0x002b
            r10 = r0
        L_0x002b:
            java.lang.String r11 = r13.A03
            if (r11 != 0) goto L_0x003a
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r11 = r0.toString()
            X.0qQ.A07(r11)
        L_0x003a:
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r1.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            if (r1 != r0) goto L_0x0045
            return
        L_0x0045:
            java.lang.String r1 = "This adapter is only for effect asset"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo.<init>(X.8Ep, com.facebook.cameracore.ardelivery.model.ARRequestAsset):void");
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectInstanceID() {
        return this.effectInstanceID;
    }

    public final String getEffectSessionID() {
        return this.effectSessionID;
    }

    public final String getOneCameraActiveSessionID() {
        return this.oneCameraActiveSessionID;
    }

    public final String getOperationUniqueID() {
        return this.operationUniqueID;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductSessionID() {
        return this.productSessionID;
    }

    public final String getRequestSource() {
        return this.requestSource;
    }

    public final boolean isPrefetch() {
        return this.isPrefetch;
    }

    public XplatEffectLoggingInfo(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(str5, 6);
        0qQ.A0B(str6, 7);
        this.effectId = str;
        this.operationUniqueID = str2;
        this.effectSessionID = str3;
        this.effectInstanceID = str4;
        this.isPrefetch = z;
        this.productSessionID = str5;
        this.productName = str6;
        this.requestSource = str7;
        this.oneCameraActiveSessionID = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XplatEffectLoggingInfo(boolean r11) {
        /*
            r10 = this;
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r2 = r0.toString()
            X.0qQ.A07(r2)
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r3 = r0.toString()
            X.0qQ.A07(r3)
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r9 = r0.toString()
            java.lang.String r1 = ""
            r0 = r10
            r5 = r11
            r4 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo.<init>(boolean):void");
    }
}
