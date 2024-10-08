package com.google.android.gms.fido.common;

import X.AnonymousClass00P;
import X.SDE;
import X.SWX;
import X.SyD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable {
    HYBRID("cable");
    
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
        CREATOR = SWX.A00(55);
    }

    public static Transport A00(String str) {
        if (str.equals("hybrid")) {
            SyD.A01.A00.FP1();
            SDE.A02.FP1();
            throw AnonymousClass00P.createAndThrow();
        }
        for (Transport transport : values()) {
            if (str.equals(transport.A00)) {
                return transport;
            }
        }
        throw new Exception(String.format("Transport %s not supported", new Object[]{str}));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    Transport(String str) {
        this.A00 = str;
    }
}
