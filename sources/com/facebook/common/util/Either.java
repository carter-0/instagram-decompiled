package com.facebook.common.util;

import X.2PP;
import X.C635813i;
import X.Pxf;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;

public class Either implements C635813i, Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(74);
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Either)) {
            return false;
        }
        return 2PP.A00(get(), ((Either) obj).get());
    }

    public final Object get() {
        if (this.A02) {
            return this.A00;
        }
        return this.A01;
    }

    public final String toString() {
        String str;
        if (this.A02) {
            str = "left";
        } else {
            str = "right";
        }
        return StringFormatUtil.formatStrLocaleSafe("Either.%s(%s)", str, String.valueOf(get()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public Either(Object obj, Object obj2, boolean z) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }

    public final int hashCode() {
        return Pxf.A08(get());
    }
}
