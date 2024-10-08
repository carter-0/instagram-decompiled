package com.instagram.shopping.model.analytics;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

public final class ShoppingSearchLoggingInfo extends AnonymousClass0T0 implements Parcelable {
    public static final W6F CREATOR = new W6F(47);
    public final String A00;
    public final String A01;
    public final HashMap A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingSearchLoggingInfo) {
                ShoppingSearchLoggingInfo shoppingSearchLoggingInfo = (ShoppingSearchLoggingInfo) obj;
                if (!0qQ.A0K(this.A01, shoppingSearchLoggingInfo.A01) || !0qQ.A0K(this.A02, shoppingSearchLoggingInfo.A02) || !0qQ.A0K(this.A00, shoppingSearchLoggingInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A00);
    }

    public ShoppingSearchLoggingInfo(String str, String str2, HashMap hashMap) {
        this.A01 = str;
        this.A02 = hashMap;
        this.A00 = str2;
    }
}
