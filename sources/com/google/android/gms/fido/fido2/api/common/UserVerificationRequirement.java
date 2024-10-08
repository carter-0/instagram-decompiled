package com.google.android.gms.fido.fido2.api.common;

import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;

public enum UserVerificationRequirement implements Parcelable {
    ;
    
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
        CREATOR = SWX.A00(78);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    UserVerificationRequirement(String str) {
        this.A00 = str;
    }

    public static UserVerificationRequirement A00(String str) {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.A00)) {
                return userVerificationRequirement;
            }
        }
        throw new Exception(String.format("User verification requirement %s not supported", new Object[]{str}));
    }
}
