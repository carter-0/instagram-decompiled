package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ChallengeName implements Parcelable {
    UNRECOGNIZED("ChallengeName_unspecified"),
    COMBO_CREATION_CHALLENGE("combo_creation_challenge"),
    DAILY_STORY_CHALLENGE("daily_story_challenge"),
    POSTS_CREATION_CHALLENGE("posts_creation_challenge"),
    REELS_CREATION_CHALLENGE("reels_creation_challenge");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ChallengeName[] challengeNameArr;
        A02 = 0oU.A00(challengeNameArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ChallengeName challengeName : values()) {
            A0x.put(challengeName.A00, challengeName);
        }
        A01 = A0x;
        CREATOR = new SWT(88);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ChallengeName(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
