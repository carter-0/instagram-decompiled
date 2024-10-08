package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public enum AssetRecommendationType implements Parcelable {
    UNRECOGNIZED("AssetRecommendationType_unspecified"),
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    EFFECT("effect");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AssetRecommendationType[] assetRecommendationTypeArr;
        A02 = 0oU.A00(assetRecommendationTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AssetRecommendationType assetRecommendationType : values()) {
            A0x.put(assetRecommendationType.A00, assetRecommendationType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(43);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AssetRecommendationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
