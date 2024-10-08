package com.instagram.api.schemas;

import X.0oU;
import X.0se;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SoundPlatformProduct implements Parcelable {
    UNRECOGNIZED("SoundPlatformProduct_unspecified"),
    IGLITE_STORY("IGLITE_STORY"),
    IG_AUDIO_COMMENTS("IG_AUDIO_COMMENTS"),
    IG_AUDIO_FILTERS("IG_AUDIO_FILTERS"),
    IG_BOOST_ADS("IG_BOOST_ADS"),
    IG_CLIPS_MUSIC_RECOMMENDATION_MIDCARD("IG_CLIPS_MUSIC_RECOMMENDATION_MIDCARD"),
    IG_FROM_FB_CROSSPOST_REELS("IG_FROM_FB_CROSSPOST_REELS"),
    IG_FROM_FB_CROSSPOST_STORY("IG_FROM_FB_CROSSPOST_STORY"),
    IG_AUDIO_GLOBAL_SEARCH("IG_GLOBAL_SEARCH"),
    IG_INTERNAL_ADMIN_TOOL_CLIPS_SEARCH_PAGE("IG_INTERNAL_ADMIN_TOOL_CLIPS_SEARCH_PAGE"),
    IG_MUSIC_IN_COMMENTS("IG_MUSIC_IN_COMMENTS"),
    IG_MUSIC_NOTES("IG_MUSIC_NOTES"),
    IG_MUSIC_ON_FEED("IG_MUSIC_ON_FEED"),
    IG_MUSIC_ON_PROFILE("IG_MUSIC_ON_PROFILE"),
    IG_MUSIC_OVERLAY_POST_CAPTURE("IG_MUSIC_OVERLAY_POST_CAPTURE"),
    IG_MUSIC_OVERLAY_PRE_CAPTURE("IG_MUSIC_OVERLAY_PRE_CAPTURE"),
    IG_MUSIC_STATUS("IG_MUSIC_STATUS"),
    IG_MUSIC_TAB_ON_PROFILE("IG_MUSIC_TAB_ON_PROFILE"),
    IG_PLAYLIST_PAGE("IG_PLAYLIST_PAGE"),
    IG_QUESTION_REPLY("IG_QUESTION_REPLY"),
    IG_QUESTION_RESHARE("IG_QUESTION_RESHARE"),
    IG_SEARCH_AUDIO_HCM("IG_SEARCH_AUDIO_HCM"),
    IG_STORY_CAMERA_CLIPS("IG_STORY_CAMERA_CLIPS"),
    IG_STORY_CAMERA_CLIPS_V2("IG_STORY_CAMERA_CLIPS_V2"),
    IG_STORY_MUSIC_AR_EFFECT("IG_STORY_MUSIC_AR_EFFECT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        SoundPlatformProduct[] soundPlatformProductArr;
        A02 = 0oU.A00(soundPlatformProductArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L);
        for (SoundPlatformProduct soundPlatformProduct : values()) {
            A0x.put(soundPlatformProduct.A00, soundPlatformProduct);
        }
        A01 = A0x;
        CREATOR = new DE6(83);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SoundPlatformProduct(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
