package com.instagram.model.showreel;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public enum IgShowreelCompositionAssetType implements Parcelable {
    UNRECOGNIZED("IgShowreelCompositionAssetType_unspecified"),
    IMAGE("image"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);
    
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
        IgShowreelCompositionAssetType[] igShowreelCompositionAssetTypeArr;
        A02 = 0oU.A00(igShowreelCompositionAssetTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IgShowreelCompositionAssetType igShowreelCompositionAssetType : values()) {
            linkedHashMap.put(igShowreelCompositionAssetType.A00, igShowreelCompositionAssetType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376399Hv(53);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IgShowreelCompositionAssetType(String str) {
        this.A00 = str;
    }
}
