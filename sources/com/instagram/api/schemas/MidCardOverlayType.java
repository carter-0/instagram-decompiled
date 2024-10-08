package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MidCardOverlayType implements Parcelable {
    UNRECOGNIZED("MidCardOverlayType_unspecified"),
    AUDIO_ATTRIBUTION("audio_attribution"),
    COLLAB_ATTRIBUTION("collab_attribution"),
    DRAFT_DURATION("draft_duration"),
    STORY_USER_NAME("story_user_name"),
    TEXT_OVERLAY("text_overlay"),
    TRACK_COVER_AND_NAME("track_cover_and_name"),
    USER_NAME("user_name"),
    USER_NAME_AND_COMMENT_COUNT("user_name_and_comment_count"),
    USER_NAME_AND_FOLLOWER_COUNT("user_name_and_follower_count"),
    USER_NAME_AND_LIKE_COUNT("user_name_and_like_count"),
    USER_NAME_AND_PLAY_COUNT("user_name_and_play_count");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MidCardOverlayType[] midCardOverlayTypeArr;
        A02 = 0oU.A00(midCardOverlayTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MidCardOverlayType midCardOverlayType : values()) {
            A0x.put(midCardOverlayType.A00, midCardOverlayType);
        }
        A01 = A0x;
        CREATOR = new FK5(78);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MidCardOverlayType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
