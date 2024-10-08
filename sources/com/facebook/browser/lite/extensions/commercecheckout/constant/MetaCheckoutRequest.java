package com.facebook.browser.lite.extensions.commercecheckout.constant;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class MetaCheckoutRequest extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(17);
    public final Integer A00;
    public final String A01;

    public MetaCheckoutRequest(Integer num, String str) {
        0qQ.A0B(num, 1);
        this.A00 = num;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaCheckoutRequest) {
                MetaCheckoutRequest metaCheckoutRequest = (MetaCheckoutRequest) obj;
                if (this.A00 != metaCheckoutRequest.A00 || !0qQ.A0K(this.A01, metaCheckoutRequest.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        if (1 - this.A00.intValue() != 0) {
            str = "LOAD_URL";
        } else {
            str = "IGNORE_META_CHECKOUT";
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "LOAD_URL";
        } else {
            str = "IGNORE_META_CHECKOUT";
        }
        return ((str.hashCode() + intValue) * 31) + AnonymousClass7TG.A0E(this.A01);
    }
}
