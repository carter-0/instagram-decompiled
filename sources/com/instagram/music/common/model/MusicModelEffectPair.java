package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass8IJ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class MusicModelEffectPair implements Parcelable {
    public static final LVO CREATOR = LVO.A00(52);
    public AnonymousClass8IJ A00 = null;
    public MusicAssetModel A01 = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        AnonymousClass8IJ r0 = this.A00;
        if (r0 != null) {
            str = r0.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }
}
