package com.instagram.clips.model.metadata;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AudioPartType implements Parcelable {
    UNRECOGNIZED("AudioPartType_unspecified"),
    ORIGINAL_SOUNDS("original_sounds");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AudioPartType[] audioPartTypeArr;
        A02 = 0oU.A00(audioPartTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (AudioPartType audioPartType : values()) {
            linkedHashMap.put(audioPartType.A00, audioPartType);
        }
        A01 = linkedHashMap;
        CREATOR = new W6D(75);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudioPartType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
