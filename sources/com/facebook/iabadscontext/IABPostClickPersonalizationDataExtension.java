package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C41848B3p;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class IABPostClickPersonalizationDataExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(2);
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABPostClickPersonalizationDataExtension) && 0qQ.A0K(this.A00, ((IABPostClickPersonalizationDataExtension) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A00);
        while (A1F.hasNext()) {
            IabAdCreativeOptimizationConfigByType iabAdCreativeOptimizationConfigByType = (IabAdCreativeOptimizationConfigByType) A1F.next();
            if (iabAdCreativeOptimizationConfigByType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iabAdCreativeOptimizationConfigByType.writeToParcel(parcel, i);
            }
        }
    }

    public IABPostClickPersonalizationDataExtension(List list) {
        this.A00 = list;
    }
}
