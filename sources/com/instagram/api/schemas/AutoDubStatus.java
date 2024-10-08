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

public enum AutoDubStatus implements Parcelable {
    UNRECOGNIZED("AutoDubStatus_unspecified"),
    FAILED("FAILED"),
    FINISHED("FINISHED"),
    INITIALIZED("INITIALIZED"),
    IN_PROGRESS("IN_PROGRESS"),
    READY_FOR_REVIEW("READY_FOR_REVIEW");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AutoDubStatus[] autoDubStatusArr;
        A02 = 0oU.A00(autoDubStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AutoDubStatus autoDubStatus : values()) {
            A0x.put(autoDubStatus.A00, autoDubStatus);
        }
        A01 = A0x;
        CREATOR = SWT.A00(56);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AutoDubStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
