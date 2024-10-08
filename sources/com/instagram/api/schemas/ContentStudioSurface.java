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

public enum ContentStudioSurface implements Parcelable {
    UNRECOGNIZED("ContentStudioSurface_unspecified"),
    CREATOR_ACTIVATION_BOTTOM_SHEET("creator_activation_bottom_sheet"),
    CREATOR_ACTIVATION_FULL_SHEET("creator_activation_full_sheet");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ContentStudioSurface[] contentStudioSurfaceArr;
        A02 = 0oU.A00(contentStudioSurfaceArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ContentStudioSurface contentStudioSurface : values()) {
            A0x.put(contentStudioSurface.A00, contentStudioSurface);
        }
        A01 = A0x;
        CREATOR = new DE7(25);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ContentStudioSurface(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
