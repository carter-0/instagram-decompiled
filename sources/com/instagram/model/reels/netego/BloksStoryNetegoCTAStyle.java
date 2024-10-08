package com.instagram.model.reels.netego;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BloksStoryNetegoCTAStyle implements Parcelable {
    UNRECOGNIZED("BloksStoryNetegoCTAStyle_unspecified"),
    ANIMATED("animated");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BloksStoryNetegoCTAStyle[] bloksStoryNetegoCTAStyleArr;
        A02 = 0oU.A00(bloksStoryNetegoCTAStyleArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle : values()) {
            A0x.put(bloksStoryNetegoCTAStyle.A00, bloksStoryNetegoCTAStyle);
        }
        A01 = A0x;
        CREATOR = C71269Ogb.A00(66);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BloksStoryNetegoCTAStyle(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
