package com.meta.foa.cds;

import X.002;
import X.0qQ;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

public abstract class CdsBottomSheetDimmingBehaviour implements Parcelable {

    public final class Default extends CdsBottomSheetDimmingBehaviour {
        public static final Default A00 = new Object();
        public static final Parcelable.Creator CREATOR = new SWU(24);

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return -1522220413;
        }

        public final String toString() {
            return ServerW3CShippingAddressConstants.DEFAULT;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(1);
        }
    }

    public final class FixedAlpha extends CdsBottomSheetDimmingBehaviour {
        public static final Parcelable.Creator CREATOR = new SWU(25);
        public final float A00;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof FixedAlpha) && Float.compare(this.A00, ((FixedAlpha) obj).A00) == 0);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public final String toString() {
            return 002.A0F("FixedAlpha(alpha=", ')', this.A00);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeFloat(this.A00);
        }

        public FixedAlpha(float f) {
            this.A00 = f;
        }

        public FixedAlpha() {
            this(0.5f);
        }
    }
}
