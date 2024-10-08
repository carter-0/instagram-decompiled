package com.meta.foa.cds;

import X.002;
import X.0qQ;
import X.G9w;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class CdsBottomSheetTopSpan implements Parcelable {

    public final class Dp extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator CREATOR = new SWU(26);
        public final int A00;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof Dp) && this.A00 == ((Dp) obj).A00);
        }

        public final int hashCode() {
            return this.A00;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(this.A00);
        }

        public final String toString() {
            return G9w.A0j("Dp(dp=", this.A00);
        }

        public Dp(int i) {
            this.A00 = i;
        }
    }

    public final class ScreenPercent extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator CREATOR = new SWU(27);
        public final float A00;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof ScreenPercent) && Float.compare(this.A00, ((ScreenPercent) obj).A00) == 0);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public final String toString() {
            return 002.A0F("ScreenPercent(percent=", ')', this.A00);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeFloat(this.A00);
        }

        public ScreenPercent(float f) {
            this.A00 = f;
        }
    }
}
