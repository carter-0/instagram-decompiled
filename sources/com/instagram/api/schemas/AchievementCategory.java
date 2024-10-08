package com.instagram.api.schemas;

import X.0oU;
import X.DbS;
import X.DbY;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AchievementCategory implements Parcelable {
    UNRECOGNIZED("AchievementCategory_unspecified"),
    BONUS_EARNINGS("bonus_earnings"),
    COLLABORATOR("collaborator"),
    COMMENTS("comments"),
    COMMUNITY_BUILDER("community_builder"),
    CREATIVE_STREAK("creative_streak"),
    DOGFOODER("dogfooder"),
    FIRST_BONUSES_CONTENT("first_bonuses_content"),
    FOLLOWERS("followers"),
    LIKES("likes"),
    PLAYS("plays"),
    POST_IMPRESSIONS("post_impressions"),
    POSTS("posts"),
    REELS("reels"),
    REELS_WATCH_TIME("reels_watch_time"),
    SMASH_HIT("smash_hit"),
    STORIES("stories"),
    STORY_REACH("story_reach");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AchievementCategory[] achievementCategoryArr;
        A02 = 0oU.A00(achievementCategoryArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (AchievementCategory achievementCategory : values()) {
            A0x.put(achievementCategory.A00, achievementCategory);
        }
        A01 = A0x;
        CREATOR = new SWT(21);
    }

    /* access modifiers changed from: public */
    AchievementCategory(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
