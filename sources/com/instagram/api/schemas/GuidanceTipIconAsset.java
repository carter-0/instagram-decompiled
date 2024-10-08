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

public enum GuidanceTipIconAsset implements Parcelable {
    UNRECOGNIZED("GuidanceTipIconAsset_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        GuidanceTipIconAsset[] guidanceTipIconAssetArr;
        A02 = 0oU.A00(guidanceTipIconAssetArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (GuidanceTipIconAsset guidanceTipIconAsset : values()) {
            A0x.put(guidanceTipIconAsset.A00, guidanceTipIconAsset);
        }
        A01 = A0x;
        CREATOR = DE7.A00(92);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    GuidanceTipIconAsset(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
