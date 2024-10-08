package com.instagram.friendmap.configs;

import X.0qQ;
import X.AnonymousClass000;
import X.C58434Irr;
import X.C58435Irs;
import X.C62320sa;
import X.C69486NmU;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class PagerSheetLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(55);
    public C69486NmU A00;
    public C62320sa A01 = C58434Irr.A00;
    public C62320sa A02 = C58435Irs.A00;
    public boolean A03 = true;
    public final Integer A04;

    public PagerSheetLaunchConfig(Integer num) {
        0qQ.A0B(num, 1);
        this.A04 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String A002;
        0qQ.A0B(parcel, 0);
        switch (this.A04.intValue()) {
            case 0:
                A002 = "NUX";
                break;
            case 1:
                A002 = AnonymousClass000.A00(2131);
                break;
            case 2:
                A002 = "SHARE_LOCATION_EDUCATION";
                break;
            default:
                A002 = "MAP_LOCATION_EDUCATION";
                break;
        }
        parcel.writeString(A002);
    }
}
