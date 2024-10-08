package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class HzwPageInfoImpl extends AnonymousClass0T0 implements Parcelable, HzwPageInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(96);
    public final Boolean A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HzwPageInfoImpl) {
                HzwPageInfoImpl hzwPageInfoImpl = (HzwPageInfoImpl) obj;
                if (!0qQ.A0K(this.A01, hzwPageInfoImpl.A01) || !0qQ.A0K(this.A00, hzwPageInfoImpl.A00)) {
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
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A00) ? 1 : 0);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public HzwPageInfoImpl(String str, Boolean bool) {
        this.A01 = str;
        this.A00 = bool;
    }
}
