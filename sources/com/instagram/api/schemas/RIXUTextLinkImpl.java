package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class RIXUTextLinkImpl extends AnonymousClass0T0 implements Parcelable, RIXUTextLink {
    public static final Parcelable.Creator CREATOR = DE6.A00(61);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final RIXUTextLinkImpl F8T() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RIXUTextLinkImpl) {
                RIXUTextLinkImpl rIXUTextLinkImpl = (RIXUTextLinkImpl) obj;
                if (!0qQ.A0K(this.A00, rIXUTextLinkImpl.A00) || !0qQ.A0K(this.A02, rIXUTextLinkImpl.A02) || !0qQ.A0K(this.A01, rIXUTextLinkImpl.A01) || !0qQ.A0K(this.A03, rIXUTextLinkImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        parcel.writeString(this.A02);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A03);
    }

    public RIXUTextLinkImpl(Integer num, Integer num2, String str, String str2) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
        this.A03 = str2;
    }
}
