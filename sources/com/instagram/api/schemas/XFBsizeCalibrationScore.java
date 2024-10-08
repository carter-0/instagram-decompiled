package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XFBsizeCalibrationScore implements Parcelable {
    UNRECOGNIZED("XFBsizeCalibrationScore_unspecified"),
    EMPTY("EMPTY"),
    RUNS_LARGE("RUNS_LARGE"),
    RUNS_SMALL("RUNS_SMALL"),
    RUNS_VERY_LARGE("RUNS_VERY_LARGE"),
    RUNS_VERY_SMALL("RUNS_VERY_SMALL");
    
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
        XFBsizeCalibrationScore[] xFBsizeCalibrationScoreArr;
        A02 = 0oU.A00(xFBsizeCalibrationScoreArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (XFBsizeCalibrationScore xFBsizeCalibrationScore : values()) {
            linkedHashMap.put(xFBsizeCalibrationScore.A00, xFBsizeCalibrationScore);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(58);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XFBsizeCalibrationScore(String str) {
        this.A00 = str;
    }
}
