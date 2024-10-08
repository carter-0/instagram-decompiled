package com.instagram.direct.inbox.notes.models;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NoteStyle implements Parcelable {
    UNKNOWN(-1),
    TEXT(0),
    MUSIC(1),
    AUDIO(3),
    UNSUPPORTED(4),
    LOCATION(5),
    LIVE(6),
    EMPTY(7),
    PROMPT_QUESTION(8),
    NOTE_CHAT(9),
    LISTENING_NOW(10),
    GIF(11);
    
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
        NoteStyle[] noteStyleArr;
        A02 = 0oU.A00(noteStyleArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (NoteStyle noteStyle : values()) {
            linkedHashMap.put(Integer.valueOf(noteStyle.A00), noteStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(91);
    }

    /* access modifiers changed from: public */
    NoteStyle(int i) {
        this.A00 = i;
    }
}
