package com.google.android.gms.fido.u2f.api.common;

import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN");
    
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
        CREATOR = SWR.A00(4);
    }

    public static ProtocolVersion A00(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.A00)) {
                return protocolVersion;
            }
        }
        throw new Exception(String.format("Protocol version %s not supported", new Object[]{str}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    ProtocolVersion(String str) {
        this.A00 = str;
    }
}
