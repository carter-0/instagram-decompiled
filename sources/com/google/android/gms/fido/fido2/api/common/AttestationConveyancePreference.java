package com.google.android.gms.fido.fido2.api.common;

import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum AttestationConveyancePreference implements Parcelable {
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);
    
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
        CREATOR = SWX.A00(76);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    AttestationConveyancePreference(String str) {
        this.A00 = str;
    }

    public static AttestationConveyancePreference A00(String str) {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.A00)) {
                return attestationConveyancePreference;
            }
        }
        throw new Exception(String.format("Attestation conveyance preference %s not supported", new Object[]{str}));
    }
}
