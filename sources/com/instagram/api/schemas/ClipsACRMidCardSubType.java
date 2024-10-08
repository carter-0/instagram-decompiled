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

public enum ClipsACRMidCardSubType implements Parcelable {
    UNRECOGNIZED("ClipsACRMidCardSubType_unspecified"),
    ACR_FEED_CAROUSEL_HISTORICAL("acr_feed_carousel_historical"),
    ACR_FEED_CAROUSEL_HISTORICAL_3D("acr_feed_carousel_historical_3d"),
    ACR_FEED_GENERIC("acr_feed_generic"),
    ACR_MEMORY_HIGHLIGHT("acr_memory_highlight"),
    ACR_SMART_REELS("acr_smart_reels"),
    ACR_SMART_REELS_3D("acr_smart_reels_3d"),
    ACR_SMART_REELS_STRICT_MULTI_FORMAT("acr_smart_reels_strict_multi_format"),
    ACR_STORY_HIGHLIGHT("acr_story_highlight");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsACRMidCardSubType[] clipsACRMidCardSubTypeArr;
        A02 = 0oU.A00(clipsACRMidCardSubTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsACRMidCardSubType clipsACRMidCardSubType : values()) {
            A0x.put(clipsACRMidCardSubType.A00, clipsACRMidCardSubType);
        }
        A01 = A0x;
        CREATOR = new SWT(92);
    }

    /* access modifiers changed from: public */
    ClipsACRMidCardSubType(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
