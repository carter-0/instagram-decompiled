package com.facebook.location.signalpackage;

import X.AnonymousClass7TG;
import X.C41845B3m;
import X.Pxf;
import X.RQi;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVisitStateAlgorithmVersion extends RQi implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(22);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!obj.equals((Object) null)) {
            if (this != obj) {
                if (obj instanceof RQi) {
                    RQi rQi = (RQi) obj;
                    if (!this.A01.equals(rQi.A01) || !this.A03.equals(rQi.A03) || !this.A02.equals(rQi.A02) || !this.A00.equals(rQi.A00)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((217 + this.A00.intValue()) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        Pxf.A19(parcel, this.A00);
    }
}
