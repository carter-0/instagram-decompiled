package com.instagram.api.schemas;

import X.0oU;
import X.DE7;
import X.DbS;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsMidCardType implements Parcelable {
    UNRECOGNIZED("ClipsMidCardType_unspecified"),
    CAMERA_ROLL("camera_roll"),
    CREATION_INSPIRATION("creation_inspiration"),
    CREATION_TOOL("creation_tool"),
    DRAFT("draft"),
    FEED_COLLECTION("feed_collection"),
    GREEN_SCREEN("green_screen"),
    GROWTH_BEST_PRACTICES("growth_best_practices"),
    INSPIRATION_HUB("inspiration_hub"),
    LIKED_BY_FOLLOWEE("liked_by_followee"),
    META_GALLERY("meta_gallery"),
    MULTI_PLAYLIST("multi_playlist"),
    MUSIC_RECOMMENDATION("music_recommendation"),
    NME_LINKS_IN_REELS("nme_links_in_reels"),
    POPULAR_AUDIO("popular_audio"),
    POPULAR_COLLAB_REELS("popular_collab_reels"),
    POPULAR_REELS("popular_reels"),
    PRODUCER_FEEDBACK("producer_feedback"),
    PROMPT("prompt"),
    RECENTLY_SAVED_AUDIO("recently_saved_audio"),
    REELS_INSIGHTS("reels_insights"),
    REELS_SURPRISE("reels_surprise"),
    SINGLE_PLAYLIST("single_playlist"),
    STORIES_IN_REELS("stories_in_reels"),
    STORY("story"),
    STORY_TO_REEL("story_to_reel"),
    TEMPLATE("template"),
    TOP_IN_CREATOR_VERTICAL("top_in_creator_vertical"),
    TOP_RESHARED("top_reshared"),
    TREND("trend"),
    TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS("trending_track_with_similar_accounts");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsMidCardType[] clipsMidCardTypeArr;
        A02 = 0oU.A00(clipsMidCardTypeArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r4));
        for (ClipsMidCardType clipsMidCardType : values()) {
            A0x.put(clipsMidCardType.A00, clipsMidCardType);
        }
        A01 = A0x;
        CREATOR = new DE7(0);
    }

    /* access modifiers changed from: public */
    ClipsMidCardType(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
