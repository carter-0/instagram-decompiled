package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PermalinkItemType implements Parcelable {
    UNRECOGNIZED("PermalinkItemType_unspecified"),
    TARGET_POST("target_post"),
    POST("post");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PermalinkItemType[] permalinkItemTypeArr;
        A02 = 0oU.A00(permalinkItemTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (PermalinkItemType permalinkItemType : values()) {
            linkedHashMap.put(permalinkItemType.A00, permalinkItemType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(13);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PermalinkItemType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
