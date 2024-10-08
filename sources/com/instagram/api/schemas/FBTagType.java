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

public enum FBTagType implements Parcelable {
    UNRECOGNIZED("FBTagType_unspecified"),
    HIDDEN_PHOTO_TAG("hidden_photo_tag"),
    PHOTO_TAG("photo_tag"),
    WITH_TAG("with_tag");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        FBTagType[] fBTagTypeArr;
        A02 = 0oU.A00(fBTagTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (FBTagType fBTagType : values()) {
            A0x.put(fBTagType.A00, fBTagType);
        }
        A01 = A0x;
        CREATOR = new DE7(66);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FBTagType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
