package com.instagram.common.gallery.metadata;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class ImmersiveMediaFields extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(74);
    public String A00 = null;
    public boolean A01 = false;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImmersiveMediaFields) {
                ImmersiveMediaFields immersiveMediaFields = (ImmersiveMediaFields) obj;
                if (!0qQ.A0K(this.A00, immersiveMediaFields.A00) || this.A01 != immersiveMediaFields.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0m("ImmersiveMediaFields(glbUrl=", this.A00, ", enabled3d=", ')', this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }
}
