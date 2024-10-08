package com.instagram.creation.capture.assetpicker.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.C51965G9l;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShoppingMultiProductConfig extends AnonymousClass0T0 implements Parcelable {
    public static final LVP CREATOR = LVP.A00(10);
    public final int A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingMultiProductConfig) {
                ShoppingMultiProductConfig shoppingMultiProductConfig = (ShoppingMultiProductConfig) obj;
                if (!(this.A01 == shoppingMultiProductConfig.A01 && this.A00 == shoppingMultiProductConfig.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A01) + this.A00;
    }

    public ShoppingMultiProductConfig(Parcel parcel) {
        boolean A1P = AnonymousClass7TF.A1P(parcel.readByte());
        int readInt = parcel.readInt();
        this.A01 = A1P;
        this.A00 = readInt;
    }
}
