package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AudioBrowserCollectionType implements Parcelable {
    UNRECOGNIZED("AudioBrowserCollectionType_unspecified"),
    SPOTIFY_RECOMMENDATIONS("spotify_recommendations");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AudioBrowserCollectionType[] audioBrowserCollectionTypeArr;
        A02 = 0oU.A00(audioBrowserCollectionTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AudioBrowserCollectionType audioBrowserCollectionType : values()) {
            A0x.put(audioBrowserCollectionType.A00, audioBrowserCollectionType);
        }
        A01 = A0x;
        CREATOR = SWT.A00(52);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudioBrowserCollectionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
