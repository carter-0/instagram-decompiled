package com.instagram.model.rixu;

import X.0qQ;
import X.0sn;
import X.AnonymousClass0T0;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import java.util.List;

public final class RIXUChainingBehaviorDefinition extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(45);
    public RIXUChainingSourceType A00 = null;
    public RIXUCoverChainingType A01 = null;
    public Boolean A02 = false;
    public Boolean A03 = false;
    public Integer A04 = null;
    public List A05;

    public RIXUChainingBehaviorDefinition() {
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 6);
        this.A05 = r1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
    }
}
