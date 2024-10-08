package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ContextualHighlightType implements Parcelable {
    UNRECOGNIZED("ContextualHighlightType_unspecified"),
    EFFECT("effect"),
    MASHUP("mashup");
    
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
        ContextualHighlightType[] contextualHighlightTypeArr;
        A02 = 0oU.A00(contextualHighlightTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ContextualHighlightType contextualHighlightType : values()) {
            linkedHashMap.put(contextualHighlightType.A00, contextualHighlightType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(87);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ContextualHighlightType(String str) {
        this.A00 = str;
    }
}
