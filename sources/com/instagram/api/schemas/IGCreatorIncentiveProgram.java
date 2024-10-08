package com.instagram.api.schemas;

import X.0oU;
import X.DbS;
import X.DbY;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGCreatorIncentiveProgram implements Parcelable {
    UNRECOGNIZED("IGCreatorIncentiveProgram_unspecified"),
    BONUS_PERFORMANCE_JAPAN("ig_bonus_performance_japan"),
    BONUS_PERFORMANCE_US_CA("ig_bonus_performance_us_canada"),
    POSTS_REELS_BONUS_JAPAN("ig_bonus_posts_reels_japan"),
    BLENDED_POSTS_REELS_BONUS_KOREA("ig_bonus_posts_reels_korea"),
    POSTS_REELS_BONUS_US("ig_bonus_posts_reels_us"),
    PARTNERSHIP_ADS_CREATOR_PAYMENTS("ig_pa_creator_payments"),
    THREADS_BONUS("ig_threads_bonus"),
    LATINX("latinx"),
    RAP_COMEDY_CLUB("rap_comedy_club"),
    REELS_BOOST("reels_boost"),
    REELS_EOY_RECAP_BOOST("reels_eoy_recap_boost"),
    REELS_ON_THE_RISE("reels_on_the_rise"),
    REELS_PERFORMANCE_FUND("reels_performance_fund"),
    REELS_PLAY_INDIA("reels_play_india"),
    REELS_PLAY_KOREA("reels_play_korea"),
    REELS_WELCOME("reels_welcome"),
    SPARK_AR_BOREALIS_AR_FOR_REELS("spark_ar_borealis_ar_for_reels"),
    SPARK_AR_BOREALIS_GROUP_EFFECTS("spark_ar_borealis_group_effects"),
    SPEAKER_ENGAGEMENT("speaker_engagement");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGCreatorIncentiveProgram[] iGCreatorIncentiveProgramArr;
        A02 = 0oU.A00(iGCreatorIncentiveProgramArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (IGCreatorIncentiveProgram iGCreatorIncentiveProgram : values()) {
            A0x.put(iGCreatorIncentiveProgram.A00, iGCreatorIncentiveProgram);
        }
        A01 = A0x;
        CREATOR = FK5.A00(16);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGCreatorIncentiveProgram(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
