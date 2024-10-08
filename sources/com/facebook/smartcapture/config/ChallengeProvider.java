package com.facebook.smartcapture.config;

import X.0qQ;
import X.AnonymousClass7TE;
import X.Pxe;
import X.Pxg;
import X.Pxi;
import X.RFH;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class ChallengeProvider implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(54);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeList(this.A03);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A01);
    }

    public ChallengeProvider(Parcel parcel) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A03 = A1C;
        Pxe.A1O(parcel, RFH.class, A1C);
        Class cls = Integer.TYPE;
        this.A00 = (Integer) Pxi.A0U(parcel, cls);
        this.A02 = (Integer) Pxi.A0U(parcel, cls);
        this.A01 = (Integer) Pxi.A0U(parcel, cls);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ChallengeProvider{mSteps=");
        A1A.append(TextUtils.join(",", this.A03));
        A1A.append(", mPhotoQuality=");
        A1A.append(this.A00);
        A1A.append(", mVideoQuality=");
        A1A.append(this.A02);
        A1A.append(", mVideoBitrate=");
        return Pxg.A0p(this.A01, A1A);
    }

    public ChallengeProvider(List list) {
        this.A03 = list;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
    }
}
