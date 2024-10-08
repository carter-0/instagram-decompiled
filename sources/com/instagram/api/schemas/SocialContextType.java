package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SocialContextType implements Parcelable {
    UNRECOGNIZED("SocialContextType_unspecified"),
    BLEND_MEDIA_SUGGESTED_BY("blend_media_suggested_by"),
    COMMENT_REACTION("comment_reaction"),
    COMMENTED_BY("commented_by"),
    EFFECT_USED_BY_FRIENDS("effect_used_by_friends"),
    EFFECT_USED_BY_PEOPLE("effect_used_by_people"),
    EFFECT_USED_TIMES("effect_used_times"),
    FOLLOWED_BY("followed_by"),
    FOLLOWER_COUNT("follower_count"),
    LIKED_BY("liked_by"),
    PROMPT_USED_BY_PEOPLE("prompt_used_by_people"),
    REEL_EXTERNAL_SHARE("reel_external_share"),
    REMIXED_ORIGINAL_USED_TIMES("remix_original_used_times"),
    REMIXED_BY_FRIENDS("remixed_by_friends"),
    REMIXED_BY_PEOPLE("remixed_by_people"),
    SPOTLIGHT("spotlight"),
    TEMPLATE_USED_BY_FRIENDS("template_used_by_friends"),
    TEMPLATE_USED_BY_PEOPLE("template_used_by_people"),
    TEMPLATE_USED_TIMES("template_used_times"),
    TRENDING_LOCATION("trending_location"),
    VOTED_ON_BY("voted_on_by");
    
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
        SocialContextType[] socialContextTypeArr;
        A02 = 0oU.A00(socialContextTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (SocialContextType socialContextType : values()) {
            linkedHashMap.put(socialContextType.A00, socialContextType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(25);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SocialContextType(String str) {
        this.A00 = str;
    }
}
