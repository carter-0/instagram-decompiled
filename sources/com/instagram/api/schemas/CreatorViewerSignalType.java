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

public enum CreatorViewerSignalType implements Parcelable {
    UNRECOGNIZED("CreatorViewerSignalType_unspecified"),
    TRENDING_AUDIO_INCREASE_REACH("TRENDING_AUDIO_INCREASE_REACH"),
    CAPTION_STICKER_ENABLED_SOUND_OFF_VIEWING("caption_sticker_enabled_sound_off_viewing"),
    POPULAR_REEL_WITH_FOLLOWERS("popular_reel_with_followers"),
    TEXT("text"),
    TRENDING_WITH_SIMILAR_ACCOUNTS_AUDIO("trending_with_similar_accounts_audio");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreatorViewerSignalType[] creatorViewerSignalTypeArr;
        A02 = 0oU.A00(creatorViewerSignalTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CreatorViewerSignalType creatorViewerSignalType : values()) {
            A0x.put(creatorViewerSignalType.A00, creatorViewerSignalType);
        }
        A01 = A0x;
        CREATOR = DE7.A00(45);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreatorViewerSignalType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
