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

public enum CreatorViewerInsightType implements Parcelable {
    UNRECOGNIZED("CreatorViewerInsightType_unspecified"),
    COMMENTED_BY_FOLLOWERS("commented_by_followers"),
    LIKED_BY_FOLLOWERS("liked_by_followers"),
    MEDIA_OWNER_FOLLOWED_BY_FOLLOWERS("media_owner_followed_by_followers"),
    POPULAR_AUDIO_AMONG_FOLLOWERS("popular_audio_among_followers"),
    POPULAR_REEL_WITH_FOLLOWERS("popular_reel_with_followers");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreatorViewerInsightType[] creatorViewerInsightTypeArr;
        A02 = 0oU.A00(creatorViewerInsightTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CreatorViewerInsightType creatorViewerInsightType : values()) {
            A0x.put(creatorViewerInsightType.A00, creatorViewerInsightType);
        }
        A01 = A0x;
        CREATOR = DE7.A00(37);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreatorViewerInsightType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
