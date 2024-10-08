package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CreateModeType implements Parcelable {
    UNRECOGNIZED("CreateModeType_unspecified"),
    AR_EFFECT("AR_EFFECT"),
    AVATAR_BACKGROUND("AVATAR_BACKGROUND"),
    AVATAR_EFFECT("AVATAR_EFFECT"),
    AVATAR_PLACEHOLDER("AVATAR_PLACEHOLDER"),
    AVATAR_PRESET("AVATAR_PRESET"),
    BOOMERANG("BOOMERANG"),
    CARDS("CARDS"),
    CLIPS("CLIPS"),
    COUNTDOWN("COUNTDOWN"),
    DISCOVERY_SURFACE("DISCOVERY_SURFACE"),
    ELECTIONS("ELECTIONS"),
    EMPTY("EMPTY"),
    FILTER("FILTER"),
    GIFS("GIFS"),
    GROUP_POLL("GROUP_POLL"),
    HANDSFREE("HANDSFREE"),
    HAPPENING_NOW("HAPPENING_NOW"),
    LAST_CHANCE("LAST_CHANCE"),
    LAYOUT("LAYOUT"),
    LOADING_AR_EFFECT("LOADING_AR_EFFECT"),
    MEMORIES("MEMORIES"),
    MENTIONS("MENTIONS"),
    MUSIC("MUSIC"),
    POLL("POLL"),
    QUESTIONS("QUESTIONS"),
    QUESTION_RESPONSES("QUESTION_RESPONSES"),
    QUIZ("QUIZ"),
    STOPMOTION("STOPMOTION"),
    TEMPLATES("TEMPLATES");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreateModeType[] createModeTypeArr;
        A02 = 0oU.A00(createModeTypeArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (CreateModeType createModeType : values()) {
            linkedHashMap.put(createModeType.A00, createModeType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(89);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreateModeType(String str) {
        this.A00 = str;
    }
}
