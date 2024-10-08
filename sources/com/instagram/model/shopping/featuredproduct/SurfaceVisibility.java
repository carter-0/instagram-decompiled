package com.instagram.model.shopping.featuredproduct;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SurfaceVisibility implements Parcelable {
    UNRECOGNIZED("SurfaceVisibility_unspecified"),
    IG_ONLY("IG_ONLY"),
    INTEROP("INTEROP");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        SurfaceVisibility[] surfaceVisibilityArr;
        A02 = 0oU.A00(surfaceVisibilityArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (SurfaceVisibility surfaceVisibility : values()) {
            A0x.put(surfaceVisibility.A00, surfaceVisibility);
        }
        A01 = A0x;
        CREATOR = C71269Ogb.A00(97);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SurfaceVisibility(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
