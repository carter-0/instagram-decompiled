package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryJoinChatStatus implements Parcelable {
    UNRECOGNIZED("StoryJoinChatStatus_unspecified"),
    CHAT_ENDED("chat_ended"),
    CHAT_FULL("chat_full"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    ACCEPTED("joined_chat"),
    PENDING("requested_chat");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryJoinChatStatus[] storyJoinChatStatusArr;
        A02 = 0oU.A00(storyJoinChatStatusArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (StoryJoinChatStatus storyJoinChatStatus : values()) {
            linkedHashMap.put(storyJoinChatStatus.A00, storyJoinChatStatus);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(94);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryJoinChatStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
