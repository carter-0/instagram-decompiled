package com.instagram.user.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class UnavailableProductImpl extends AnonymousClass0T0 implements Parcelable, UnavailableProduct {
    public static final Parcelable.Creator CREATOR = new W6F(90);
    public final User A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnavailableProductImpl) {
                UnavailableProductImpl unavailableProductImpl = (UnavailableProductImpl) obj;
                if (!0qQ.A0K(this.A02, unavailableProductImpl.A02) || !0qQ.A0K(this.A00, unavailableProductImpl.A00) || !0qQ.A0K(this.A01, unavailableProductImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
    }

    public final User BRo() {
        return this.A00;
    }

    public final String getProductId() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0E(this.A02) * 31));
    }

    public UnavailableProductImpl(User user, String str, String str2) {
        AnonymousClass7TG.A1Q(user, str2);
        this.A02 = str;
        this.A00 = user;
        this.A01 = str2;
    }
}
