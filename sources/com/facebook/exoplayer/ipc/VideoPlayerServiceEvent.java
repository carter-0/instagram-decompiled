package com.facebook.exoplayer.ipc;

import X.RFX;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class VideoPlayerServiceEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(82);

    public final int describeContents() {
        RFX rfx;
        if (this instanceof VpsVideoCacheDatabaseFullEvent) {
            rfx = RFX.DATABASE_FULL;
        } else if (this instanceof VpsPrefetchStartEvent) {
            rfx = RFX.PREFETCH_START;
        } else if (this instanceof VpsPrefetchCacheEvictEvent) {
            rfx = RFX.PREFETCH_CACHE_EVICT;
        } else if (this instanceof VpsManifestParseErrorEvent) {
            rfx = RFX.MANIFEST_PARSE_ERROR;
        } else if (this instanceof VpsCacheErrorEvent) {
            rfx = RFX.CACHE_ERROR;
        } else {
            throw new AbstractMethodError("describeContents");
        }
        return rfx.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
    }
}
