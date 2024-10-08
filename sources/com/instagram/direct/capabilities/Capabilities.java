package com.instagram.direct.capabilities;

import X.0qQ;
import X.C376179Gx;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.BitSet;

public final class Capabilities implements Parcelable {
    public static final Capabilities A02 = new Capabilities(new BitSet(), new BitSet());
    public static final Parcelable.Creator CREATOR = new C376419Hx(88);
    public final BitSet A00;
    public final BitSet A01;

    public final boolean A00(C376179Gx r3) {
        BitSet bitSet;
        0qQ.A0B(r3, 0);
        int i = r3.A00;
        if (i < 0) {
            bitSet = this.A01;
            i = -i;
        } else {
            bitSet = this.A00;
        }
        return bitSet.get(i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && 0qQ.A0K(getClass(), obj.getClass())) {
                Capabilities capabilities = (Capabilities) obj;
                if (!0qQ.A0K(this.A01, capabilities.A01) || !0qQ.A0K(this.A00, capabilities.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeByteArray(this.A01.toByteArray());
        parcel.writeByteArray(this.A00.toByteArray());
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public Capabilities(BitSet bitSet, BitSet bitSet2) {
        this.A01 = bitSet;
        this.A00 = bitSet2;
    }
}
