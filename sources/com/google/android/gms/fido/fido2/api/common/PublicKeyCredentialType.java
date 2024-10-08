package com.google.android.gms.fido.fido2.api.common;

import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;

public enum PublicKeyCredentialType implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "public-key";
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = SWX.A00(70);
    }

    /* access modifiers changed from: public */
    PublicKeyCredentialType() {
    }

    public static PublicKeyCredentialType A00(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals("public-key")) {
                return publicKeyCredentialType;
            }
        }
        throw new Exception(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
