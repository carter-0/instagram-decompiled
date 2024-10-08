package com.instagram.model.shopping.reels;

import X.0qQ;
import X.AnonymousClass0T0;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductShareConfig extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(29);
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductShareConfig) {
                ProductShareConfig productShareConfig = (ProductShareConfig) obj;
                if (!0qQ.A0K(this.A01, productShareConfig.A01) || this.A00 != productShareConfig.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public ProductShareConfig(Parcel parcel) {
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        this.A01 = readString;
        this.A00 = readInt;
    }
}
