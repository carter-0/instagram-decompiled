package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdsAPIInstagramPosition implements Parcelable {
    UNRECOGNIZED("AdsAPIInstagramPosition_unspecified"),
    EFFECT_TRAY("EFFECT_TRAY"),
    EXPLORE("EXPLORE"),
    EXPLORE_HOME("EXPLORE_HOME"),
    IGTV("IGTV"),
    IG_SEARCH("IG_SEARCH"),
    LEAD_GEN_MULTI_SUBMIT("LEAD_GEN_MULTI_SUBMIT"),
    PROFILE_FEED("PROFILE_FEED"),
    PROFILE_REELS("PROFILE_REELS"),
    REELS("REELS"),
    REELS_OVERLAY("REELS_OVERLAY"),
    SHOP("SHOP"),
    STORY("STORY"),
    STREAM("STREAM");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdsAPIInstagramPosition[] adsAPIInstagramPositionArr;
        A02 = 0oU.A00(adsAPIInstagramPositionArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (AdsAPIInstagramPosition adsAPIInstagramPosition : values()) {
            linkedHashMap.put(adsAPIInstagramPosition.A00, adsAPIInstagramPosition);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(31);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdsAPIInstagramPosition(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
