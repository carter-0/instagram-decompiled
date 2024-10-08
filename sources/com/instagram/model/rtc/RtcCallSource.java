package com.instagram.model.rtc;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C331537Rj;
import X.C69465Nm9;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class RtcCallSource extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(72);
    public final C69465Nm9 A00;
    public final C331537Rj A01;
    public final RtcThreadKey A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcCallSource) {
                RtcCallSource rtcCallSource = (RtcCallSource) obj;
                if (!(this.A01 == rtcCallSource.A01 && 0qQ.A0K(this.A02, rtcCallSource.A02) && this.A00 == rtcCallSource.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        this.A02.writeToParcel(parcel, i);
        C69465Nm9 nm9 = this.A00;
        if (nm9 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        AnonymousClass7TE.A1T(parcel, nm9);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0C(this.A00);
    }

    public RtcCallSource(C69465Nm9 nm9, C331537Rj r2, RtcThreadKey rtcThreadKey) {
        AnonymousClass7TG.A1O(r2, rtcThreadKey);
        this.A01 = r2;
        this.A02 = rtcThreadKey;
        this.A00 = nm9;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallSource(source=");
        A1A.append(this.A01);
        A1A.append(", threadKey=");
        A1A.append(this.A02);
        A1A.append(", xmaType=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
