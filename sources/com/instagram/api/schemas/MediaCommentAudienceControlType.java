package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaCommentAudienceControlType implements Parcelable {
    UNRECOGNIZED("MediaCommentAudienceControlType_unspecified"),
    EVERYONE("any"),
    ESTABLISHED_FOLLOWERS("established"),
    PEOPLE_FOLLOW_ME("follower"),
    PEOPLE_I_FOLLOW("following"),
    PEOPLE_I_FOLLOW_AND_PEOPLE_FOLLOW_ME("following_and_follower");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaCommentAudienceControlType[] mediaCommentAudienceControlTypeArr;
        A02 = 0oU.A00(mediaCommentAudienceControlTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MediaCommentAudienceControlType mediaCommentAudienceControlType : values()) {
            linkedHashMap.put(mediaCommentAudienceControlType.A00, mediaCommentAudienceControlType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(53);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaCommentAudienceControlType(String str) {
        this.A00 = str;
    }
}
