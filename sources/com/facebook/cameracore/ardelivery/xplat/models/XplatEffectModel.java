package com.facebook.cameracore.ardelivery.xplat.models;

import X.0qQ;
import X.AnonymousClass80A;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public final class XplatEffectModel {
    public final String MD5Hash;
    public final List arEffectAsyncAssets;
    public final String cacheKey;
    public List capabilitiesMinVersionModels;
    public final int compressionTypeCppValue;
    public final String effectId;
    public final String effectInstanceId;
    public final boolean encrypted;
    public final String fileName;
    public final long fileSize;
    public final String graphqlId;
    public final String manifestCapabilities;
    public List sparkVisionModels;
    public final String uri;

    public XplatEffectModel(ARRequestAsset aRRequestAsset) {
        ImmutableList immutableList;
        List list;
        0qQ.A0B(aRRequestAsset, 1);
        AnonymousClass80A r2 = aRRequestAsset.A02;
        if (r2.A02 == ARAssetType.EFFECT) {
            String str = r2.A09;
            this.effectId = str;
            this.effectInstanceId = r2.A0A;
            this.capabilitiesMinVersionModels = aRRequestAsset.A0A;
            SparkVisionCapability sparkVisionCapability = aRRequestAsset.A03;
            if (sparkVisionCapability == null || (list = sparkVisionCapability.A00) == null) {
                immutableList = null;
            } else {
                immutableList = ImmutableList.copyOf((Collection) list);
            }
            this.sparkVisionModels = immutableList;
            this.fileName = aRRequestAsset.A07;
            this.graphqlId = str;
            this.cacheKey = r2.A08;
            this.uri = aRRequestAsset.A09;
            this.MD5Hash = aRRequestAsset.A06;
            this.fileSize = aRRequestAsset.A00;
            this.compressionTypeCppValue = ARRequestAsset.CompressionMethod.toXplatCompressionType(r2.A03).A00;
            this.arEffectAsyncAssets = aRRequestAsset.A04;
            this.manifestCapabilities = aRRequestAsset.A08;
            this.encrypted = r2.A06.booleanValue();
            return;
        }
        throw new IllegalStateException("This adapter is only for effect asset");
    }

    public final List getCapabilitiesMinVersionModels() {
        return this.capabilitiesMinVersionModels;
    }

    public final List getSparkVisionModels() {
        return this.sparkVisionModels;
    }

    public final void setCapabilitiesMinVersionModels(List list) {
        this.capabilitiesMinVersionModels = list;
    }

    public final void setSparkVisionModels(List list) {
        this.sparkVisionModels = list;
    }
}
