package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.AnonymousClass7TE;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class EffectMetadata {
    public final String mEffectId;
    public final String mEffectName;
    public final List mInstructionModels;
    public final String mManifestCapabilities;
    public final String mProductList;
    public final int mSortOrder;
    public final String mThumbnailUrl;
    public final int mThumbnailUrlExpirationTimestamp;
    public final String mThumbnailUrlFallback;

    public String getEffectId() {
        return this.mEffectId;
    }

    public String getEffectName() {
        return this.mEffectName;
    }

    public List getInstructionModels() {
        return this.mInstructionModels;
    }

    public String getManifestCapabilities() {
        return this.mManifestCapabilities;
    }

    public String getProductList() {
        return this.mProductList;
    }

    public int getSortOrder() {
        return this.mSortOrder;
    }

    public String getThumbnailUrl() {
        return this.mThumbnailUrl;
    }

    public int getThumbnailUrlExpirationTimestamp() {
        return this.mThumbnailUrlExpirationTimestamp;
    }

    public String getThumbnailUrlFallback() {
        return this.mThumbnailUrlFallback;
    }

    public EffectMetadata(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, ImmutableList immutableList) {
        this.mEffectId = str;
        this.mEffectName = str2;
        this.mProductList = str3;
        this.mSortOrder = i;
        this.mManifestCapabilities = str4;
        this.mThumbnailUrl = str5;
        this.mThumbnailUrlExpirationTimestamp = i2;
        this.mThumbnailUrlFallback = str6;
        this.mInstructionModels = immutableList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EffectMetadata{mEffectId='");
        A1A.append(this.mEffectId);
        A1A.append('\'');
        A1A.append(", mEffectName='");
        A1A.append(this.mEffectName);
        A1A.append('\'');
        A1A.append(", mProductList='");
        A1A.append(this.mProductList);
        A1A.append('\'');
        A1A.append(", mSortOrder=");
        A1A.append(this.mSortOrder);
        A1A.append(", mManifestCapabilities='");
        A1A.append(this.mManifestCapabilities);
        A1A.append('\'');
        A1A.append(", mThumbnailUrl='");
        A1A.append(this.mThumbnailUrl);
        A1A.append('\'');
        A1A.append(", mThumbnailUrlExpirationTimestamp=");
        A1A.append(this.mThumbnailUrlExpirationTimestamp);
        A1A.append(", mThumbnailUrlFallback='");
        A1A.append(this.mThumbnailUrlFallback);
        A1A.append('\'');
        A1A.append(", mInstructionModels=");
        A1A.append(this.mInstructionModels);
        A1A.append('}');
        return A1A.toString();
    }
}
