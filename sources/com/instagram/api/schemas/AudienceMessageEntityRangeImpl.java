package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class AudienceMessageEntityRangeImpl extends AnonymousClass0T0 implements Parcelable, AudienceMessageEntityRange {
    public static final Parcelable.Creator CREATOR = new SWT(46);
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceMessageEntityRangeImpl) {
                AudienceMessageEntityRangeImpl audienceMessageEntityRangeImpl = (AudienceMessageEntityRangeImpl) obj;
                if (!0qQ.A0K(this.A00, audienceMessageEntityRangeImpl.A00) || !0qQ.A0K(this.A01, audienceMessageEntityRangeImpl.A01) || !0qQ.A0K(this.A02, audienceMessageEntityRangeImpl.A02)) {
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
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        parcel.writeString(this.A02);
    }

    public final Integer BMP() {
        return this.A00;
    }

    public final Integer BXp() {
        return this.A01;
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public AudienceMessageEntityRangeImpl(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }
}
