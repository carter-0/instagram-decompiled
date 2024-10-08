package com.instagram.ui.primer;

import X.0qQ;
import X.C41845B3m;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class IconConfig implements Parcelable {

    public final class IconWithTextConfig extends IconConfig {
        public static final Parcelable.Creator CREATOR = new W6F(78);
        public final int A00;
        public final String A01;

        public IconWithTextConfig(int i, String str) {
            0qQ.A0B(str, 2);
            this.A00 = i;
            this.A01 = str;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof IconWithTextConfig) {
                    IconWithTextConfig iconWithTextConfig = (IconWithTextConfig) obj;
                    if (this.A00 != iconWithTextConfig.A00 || !0qQ.A0K(this.A01, iconWithTextConfig.A01)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(this.A00);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return C41845B3m.A01(this.A01, this.A00 * 31);
        }
    }

    public final class SimpleIconConfig extends IconConfig {
        public static final Parcelable.Creator CREATOR = new W6F(79);
        public final int A00;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof SimpleIconConfig) && this.A00 == ((SimpleIconConfig) obj).A00);
        }

        public final int hashCode() {
            return this.A00;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(this.A00);
        }

        public SimpleIconConfig(int i) {
            this.A00 = i;
        }
    }
}
