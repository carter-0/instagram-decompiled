package com.instagram.shopping.model.recon;

import X.0qQ;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ShoppingReconFeedEndpoint implements Parcelable {

    public final class ReconDestinationFeedEndpoint extends ShoppingReconFeedEndpoint {
        public static final ReconDestinationFeedEndpoint A00 = new Object();
        public static final Parcelable.Creator CREATOR = new W6F(56);

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(1);
        }
    }
}
