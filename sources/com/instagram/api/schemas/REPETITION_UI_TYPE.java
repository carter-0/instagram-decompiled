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

public enum REPETITION_UI_TYPE implements Parcelable {
    UNRECOGNIZED("REPETITION_UI_TYPE_unspecified"),
    LIGHTWEIGHT("lightweight"),
    MEDIUM("medium");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        REPETITION_UI_TYPE[] repetition_ui_typeArr;
        A02 = 0oU.A00(repetition_ui_typeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (REPETITION_UI_TYPE repetition_ui_type : values()) {
            A0x.put(repetition_ui_type.A00, repetition_ui_type);
        }
        A01 = A0x;
        CREATOR = new DE6(56);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    REPETITION_UI_TYPE(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
