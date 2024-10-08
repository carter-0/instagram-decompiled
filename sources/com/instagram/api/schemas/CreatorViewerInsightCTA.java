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

public enum CreatorViewerInsightCTA implements Parcelable {
    UNRECOGNIZED("CreatorViewerInsightCTA_unspecified"),
    OPEN_AUDIO_PIVOT_PAGE("open_audio_pivot_page"),
    OPEN_COMMENT_SHEET("open_comment_sheet"),
    OPEN_FOLLOWERS_SHEET("open_followers_sheet"),
    OPEN_LIKERS_LIST("open_likers_list"),
    OPEN_POPULAR_REEL_INSIGHT_SHEET("open_popular_reel_insight_sheet");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreatorViewerInsightCTA[] creatorViewerInsightCTAArr;
        A02 = 0oU.A00(creatorViewerInsightCTAArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CreatorViewerInsightCTA creatorViewerInsightCTA : values()) {
            A0x.put(creatorViewerInsightCTA.A00, creatorViewerInsightCTA);
        }
        A01 = A0x;
        CREATOR = DE7.A00(35);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreatorViewerInsightCTA(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
