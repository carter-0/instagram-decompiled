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

public enum InspirationSignalType implements Parcelable {
    UNRECOGNIZED("InspirationSignalType_unspecified"),
    AUDIO_TRENDING_SIMILAR_ACCOUNTS("audio_trending_similar_accounts"),
    DIGEST("digest"),
    REELS_MIMICRY("reels_mimicry"),
    REELS_POPULAR_SIMILAR_CONTENT("reels_popular_similar_content"),
    REELS_POPULAR_WITH_FOLLOWERS("reels_popular_with_followers"),
    REELS_RISING("reels_rising"),
    REELS_STRONG_HOOK("reels_strong_hook"),
    REELS_TEST_DEV_ONLY("reels_test_dev_only"),
    REELS_TEXT("reels_text"),
    REELS_VOICEOVER("reels_voiceover");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        InspirationSignalType[] inspirationSignalTypeArr;
        A02 = 0oU.A00(inspirationSignalTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (InspirationSignalType inspirationSignalType : values()) {
            A0x.put(inspirationSignalType.A00, inspirationSignalType);
        }
        A01 = A0x;
        CREATOR = FK5.A00(38);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    InspirationSignalType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
