package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsTemplateBrowserV2Type implements Parcelable {
    UNRECOGNIZED("ClipsTemplateBrowserV2Type_unspecified"),
    MAIN("main"),
    SAVED("saved");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsTemplateBrowserV2Type[] clipsTemplateBrowserV2TypeArr;
        A02 = 0oU.A00(clipsTemplateBrowserV2TypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type : values()) {
            A0x.put(clipsTemplateBrowserV2Type.A00, clipsTemplateBrowserV2Type);
        }
        A01 = A0x;
        CREATOR = new DE7(5);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsTemplateBrowserV2Type(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
