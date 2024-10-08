package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CreatorViewerInsightTypeV2 implements Parcelable {
    UNRECOGNIZED("CreatorViewerInsightTypeV2_unspecified"),
    AUDIO_ARTIST_TITLE_GLOBALLY_TRENDING("audio_artist_title_globally_trending"),
    AUDIO_ARTIST_TITLE_TRENDING("audio_artist_title_trending"),
    AUDIO_USED_BY_CLIPS_COUNT("audio_used_by_clips_count"),
    CLIPS_CREATED_AFTER_VIEWING("clips_created_after_viewing"),
    PLAY_COUNT_BY_FOLLOWERS("play_count_by_followers"),
    PLAY_COUNT_ENTIRE_CLIPS("play_count_entire_clips"),
    PLAY_COUNT_WITH_SOUND_OFF("play_count_with_sound_off"),
    TEXT_STYLE("text_style");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreatorViewerInsightTypeV2[] creatorViewerInsightTypeV2Arr;
        A02 = 0oU.A00(creatorViewerInsightTypeV2Arr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2 : values()) {
            A0x.put(creatorViewerInsightTypeV2.A00, creatorViewerInsightTypeV2);
        }
        A01 = A0x;
        CREATOR = new DE7(38);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreatorViewerInsightTypeV2(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
