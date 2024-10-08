package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NoteActivationType implements Parcelable {
    UNRECOGNIZED("NoteActivationType_unspecified"),
    DEMURE_NOTES("demure_notes"),
    PARALYMPIC_NOTES("paralympic_notes"),
    SABRINA_NOTES("sabrina_notes"),
    UNSUPPORTED("unsupported"),
    WNBA_NOTES("wnba_notes");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        NoteActivationType[] noteActivationTypeArr;
        A02 = 0oU.A00(noteActivationTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (NoteActivationType noteActivationType : values()) {
            linkedHashMap.put(noteActivationType.A00, noteActivationType);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(95);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    NoteActivationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
