package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NudgeType implements Parcelable {
    UNRECOGNIZED("NudgeType_unspecified"),
    BOTTOM_SHEET_FEED_REVIEW_RESPECTFUL("bottom_sheet_feed_review_respectful"),
    BOTTOM_SHEET_STORY_REPLY_RESPECTFUL("bottom_sheet_story_reply_respectful"),
    BOTTOM_SHEET_STORY_REVIEW_RESPECTFUL("bottom_sheet_story_review_respectful"),
    BOTTOM_SHEET_IG_LED(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    DIRECT_CHANNEL_REPLY_NUDGE("direct_channel_reply_nudge"),
    BOTTOM_SHEET_EMPATHY("empathy_v1"),
    LIGHTWEIGHT_SET_TONE("lightweight_set_tone"),
    LIGHTWEIGHT_STORY_REPLY_RESPECTFUL("lightweight_story_reply_respectful"),
    LIGHTWEIGHT_WELCOME("lightweight_welcome");
    
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
        NudgeType[] nudgeTypeArr;
        A02 = 0oU.A00(nudgeTypeArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (NudgeType nudgeType : values()) {
            linkedHashMap.put(nudgeType.A00, nudgeType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(84);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    NudgeType(String str) {
        this.A00 = str;
    }
}
