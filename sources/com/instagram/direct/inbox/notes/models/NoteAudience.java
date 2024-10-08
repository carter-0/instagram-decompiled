package com.instagram.direct.inbox.notes.models;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NoteAudience implements Parcelable {
    UNKNOWN(-1),
    MUTUAL_FOLLOWERS(0),
    CLOSE_FRIENDS(1),
    INTERNAL_ONLY(2),
    ALL_FOLLOWERS(3);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;

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
        NoteAudience[] noteAudienceArr;
        A02 = 0oU.A00(noteAudienceArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (NoteAudience noteAudience : values()) {
            linkedHashMap.put(Integer.valueOf(noteAudience.A00), noteAudience);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(90);
    }

    /* access modifiers changed from: public */
    NoteAudience(int i) {
        this.A00 = i;
    }
}
