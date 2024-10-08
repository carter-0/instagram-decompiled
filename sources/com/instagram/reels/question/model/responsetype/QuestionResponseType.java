package com.instagram.reels.question.model.responsetype;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum QuestionResponseType implements Parcelable {
    UNRECOGNIZED("QuestionResponseType_unspecified"),
    LOCATION("location"),
    MEDIA("media"),
    MUSIC("music"),
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
        QuestionResponseType[] questionResponseTypeArr;
        A02 = 0oU.A00(questionResponseTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (QuestionResponseType questionResponseType : values()) {
            linkedHashMap.put(questionResponseType.A00, questionResponseType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376399Hv(74);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    QuestionResponseType(String str) {
        this.A00 = str;
    }
}
