package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum LeadGenEntryPoint implements Parcelable {
    UNRECOGNIZED("LeadGenEntryPoint_unspecified"),
    PROMOTE("promote"),
    PROFILE_BUTTON("profile_button"),
    STORY_STICKER("story_sticker"),
    FLAGGED_FORM("flagged_form");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LeadGenEntryPoint[] leadGenEntryPointArr;
        A02 = 0oU.A00(leadGenEntryPointArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (LeadGenEntryPoint leadGenEntryPoint : values()) {
            linkedHashMap.put(leadGenEntryPoint.A00, leadGenEntryPoint);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(47);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LeadGenEntryPoint(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
