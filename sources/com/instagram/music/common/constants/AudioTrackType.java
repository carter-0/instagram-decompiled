package com.instagram.music.common.constants;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public enum AudioTrackType implements Parcelable {
    DEFAULT,
    REACTIVE,
    ORIGINAL;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        AudioTrackType[] audioTrackTypeArr;
        A00 = 0oU.A00(audioTrackTypeArr);
        CREATOR = LVO.A00(43);
    }
}
