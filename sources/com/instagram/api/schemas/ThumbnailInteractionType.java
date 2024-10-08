package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ThumbnailInteractionType implements Parcelable {
    UNRECOGNIZED("ThumbnailInteractionType_unspecified"),
    LIKES("likes");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ThumbnailInteractionType[] thumbnailInteractionTypeArr;
        A02 = 0oU.A00(thumbnailInteractionTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ThumbnailInteractionType thumbnailInteractionType : values()) {
            A0x.put(thumbnailInteractionType.A00, thumbnailInteractionType);
        }
        A01 = A0x;
        CREATOR = FK6.A00(46);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ThumbnailInteractionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
