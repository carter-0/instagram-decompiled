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

public enum ClipsTemplateBrowserCategory implements Parcelable {
    UNRECOGNIZED("ClipsTemplateBrowserCategory_unspecified"),
    RECOMMENDED_FOR_YOU("recommended_for_you"),
    SAVED("saved"),
    SAVED_AUDIO("saved_audio");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsTemplateBrowserCategory[] clipsTemplateBrowserCategoryArr;
        A02 = 0oU.A00(clipsTemplateBrowserCategoryArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ClipsTemplateBrowserCategory clipsTemplateBrowserCategory : values()) {
            A0x.put(clipsTemplateBrowserCategory.A00, clipsTemplateBrowserCategory);
        }
        A01 = A0x;
        CREATOR = new DE7(3);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsTemplateBrowserCategory(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
