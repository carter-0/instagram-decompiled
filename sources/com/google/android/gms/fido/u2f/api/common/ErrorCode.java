package com.google.android.gms.fido.u2f.api.common;

import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public enum ErrorCode implements Parcelable {
    OTHER_ERROR(1);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = SWR.A00(1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    /* access modifiers changed from: public */
    ErrorCode(int i) {
        this.A00 = i;
    }
}
