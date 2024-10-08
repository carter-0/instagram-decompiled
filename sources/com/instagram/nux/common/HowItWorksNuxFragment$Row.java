package com.instagram.nux.common;

import X.0qQ;
import X.AnonymousClass7TG;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class HowItWorksNuxFragment$Row implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(68);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
    }

    public HowItWorksNuxFragment$Row(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A03 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A01 = num4;
    }

    public HowItWorksNuxFragment$Row() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null);
    }
}
