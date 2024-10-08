package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import com.google.gson.annotations.SerializedName;

public class EffectAssetMetadataWithLastFetchTimestamp {
    @SerializedName("asset_metadata")
    public final EffectAssetMetadata assetMetadata;
    @SerializedName("last_fetch_timestamp")
    public final long lastFetchTimestamp;

    public EffectAssetMetadataWithLastFetchTimestamp(EffectAssetMetadata effectAssetMetadata, long j) {
        this.lastFetchTimestamp = j;
        this.assetMetadata = effectAssetMetadata;
    }
}
