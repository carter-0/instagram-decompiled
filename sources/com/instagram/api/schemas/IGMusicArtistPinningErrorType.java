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

public enum IGMusicArtistPinningErrorType implements Parcelable {
    UNRECOGNIZED("IGMusicArtistPinningErrorType_unspecified"),
    CLIP_MARKED_SENSITIVE("clip_marked_sensitive"),
    HAS_MAX_PINNED("has_max_pinned"),
    INVALID_AUDIO("invalid_audio"),
    MEDIA_ALREADY_PINNED("media_already_pinned"),
    MEDIA_NON_RECOMMENDABLE("media_non_recommendable"),
    MEDIA_NOT_PINNED("media_not_pinned"),
    NOT_MEDIA_OWNER("not_media_owner"),
    UNKNOWN("unknown"),
    USER_NOT_PASSING_INTEGRITY("user_not_passing_integrity"),
    VIEWER_NOT_OWNER("viewer_not_owner"),
    VIEWER_OWNS_REEL("viewer_owns_reel");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGMusicArtistPinningErrorType[] iGMusicArtistPinningErrorTypeArr;
        A02 = 0oU.A00(iGMusicArtistPinningErrorTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType : values()) {
            A0x.put(iGMusicArtistPinningErrorType.A00, iGMusicArtistPinningErrorType);
        }
        A01 = A0x;
        CREATOR = new FK5(23);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGMusicArtistPinningErrorType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
