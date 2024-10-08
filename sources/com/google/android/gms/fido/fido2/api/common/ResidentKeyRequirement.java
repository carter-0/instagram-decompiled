package com.google.android.gms.fido.fido2.api.common;

import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;

public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = SWX.A00(72);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    ResidentKeyRequirement(String str) {
        this.A00 = str;
    }

    public static ResidentKeyRequirement A00(String str) {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.A00)) {
                return residentKeyRequirement;
            }
        }
        throw new Exception(String.format("Resident key requirement %s not supported", new Object[]{str}));
    }
}
