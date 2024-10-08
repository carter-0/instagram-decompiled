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

public enum CreatorViewerContextCTAType implements Parcelable {
    UNRECOGNIZED("CreatorViewerContextCTAType_unspecified"),
    INSPIRED_OTHERS_TO_CREATE("inspired_others_to_create"),
    POPULAR_AUDIO_WITH_FOLLOWERS("popular_audio_with_followers"),
    POPULAR_REEL_WITH_FOLLOWERS("popular_reel_with_followers"),
    REELS_RISING("reels_rising"),
    STRONG_HOOK("strong_hook");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreatorViewerContextCTAType[] creatorViewerContextCTATypeArr;
        A02 = 0oU.A00(creatorViewerContextCTATypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CreatorViewerContextCTAType creatorViewerContextCTAType : values()) {
            A0x.put(creatorViewerContextCTAType.A00, creatorViewerContextCTAType);
        }
        A01 = A0x;
        CREATOR = DE7.A00(34);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreatorViewerContextCTAType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
