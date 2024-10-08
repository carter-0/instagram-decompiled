package com.instagram.reels.question.constants;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum QuestionStickerType implements Parcelable {
    UNRECOGNIZED("QuestionStickerType_unspecified"),
    ANON("anon"),
    LOCATION("location"),
    MUSIC("music"),
    PICS_PLEASE("pics_please"),
    TEXT("text");
    
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
        QuestionStickerType[] questionStickerTypeArr;
        A02 = 0oU.A00(questionStickerTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (QuestionStickerType questionStickerType : values()) {
            linkedHashMap.put(questionStickerType.A00, questionStickerType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376399Hv(73);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    QuestionStickerType(String str) {
        this.A00 = str;
    }
}
