package com.instagram.model.hashtag;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum HashtagFollowStatus implements Parcelable {
    UNRECOGNIZED("HashtagFollowStatus_unspecified"),
    NOT_FOLLOWING("not_following"),
    FOLLOWING("following");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        HashtagFollowStatus[] hashtagFollowStatusArr;
        A02 = 0oU.A00(hashtagFollowStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (HashtagFollowStatus hashtagFollowStatus : values()) {
            A0x.put(hashtagFollowStatus.A00, hashtagFollowStatus);
        }
        A01 = A0x;
        CREATOR = new C71269Ogb(55);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    HashtagFollowStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
