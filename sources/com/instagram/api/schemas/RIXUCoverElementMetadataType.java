package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXUCoverElementMetadataType implements Parcelable {
    UNRECOGNIZED("RIXUCoverElementMetadataType_unspecified"),
    AUTHOR_USERNAME("author_username"),
    AUTHOR_USERNAME_WITH_PROFILE_PIC("author_username_with_profile_pic"),
    CONTENT_NOTE("content_note"),
    FACEPILE_OR_LIKE_COUNT_WITH_HEART("facepile_or_like_count_with_heart"),
    LIKE_COUNT_TEXT_WTIH_ICON("like_count_text_with_icon"),
    LIKE_COUNT_WITH_HEART("like_count_with_heart"),
    LIKED_BY_FACEPILE("liked_by_facepile"),
    LIKED_BY_FACEPILE_WITH_HEART("liked_by_facepile_with_heart"),
    PLAY_COUNT_TEXT_WITH_ICON("play_count_text_with_icon");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        RIXUCoverElementMetadataType[] rIXUCoverElementMetadataTypeArr;
        A02 = 0oU.A00(rIXUCoverElementMetadataTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (RIXUCoverElementMetadataType rIXUCoverElementMetadataType : values()) {
            A0x.put(rIXUCoverElementMetadataType.A00, rIXUCoverElementMetadataType);
        }
        A01 = A0x;
        CREATOR = new DE6(58);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUCoverElementMetadataType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
