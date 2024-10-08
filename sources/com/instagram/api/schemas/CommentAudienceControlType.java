package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CommentAudienceControlType implements Parcelable {
    UNRECOGNIZED("CommentAudienceControlType_unspecified"),
    EVERYONE("any"),
    PEOPLE_FOLLOW_ME("follower"),
    PEOPLE_I_FOLLOW("following"),
    FOLLOWING_AND_FOLLOWER("following_and_follower");
    
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
        CommentAudienceControlType[] commentAudienceControlTypeArr;
        A02 = 0oU.A00(commentAudienceControlTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (CommentAudienceControlType commentAudienceControlType : values()) {
            linkedHashMap.put(commentAudienceControlType.A00, commentAudienceControlType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(81);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CommentAudienceControlType(String str) {
        this.A00 = str;
    }
}
