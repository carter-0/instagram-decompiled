package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C44324Cd6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class RingSpecImpl extends AnonymousClass0T0 implements RingSpec, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(18);
    public final RingSpecPoint A00;
    public final RingSpecPoint A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public RingSpecImpl(RingSpecPoint ringSpecPoint, RingSpecPoint ringSpecPoint2, String str, List list, List list2) {
        0qQ.A0B(list, 1);
        0qQ.A0B(ringSpecPoint, 2);
        0qQ.A0B(list2, 3);
        0qQ.A0B(str, 4);
        0qQ.A0B(ringSpecPoint2, 5);
        this.A03 = list;
        this.A00 = ringSpecPoint;
        this.A04 = list2;
        this.A02 = str;
        this.A01 = ringSpecPoint2;
    }

    public final RingSpecImpl F8l() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RingSpecImpl) {
                RingSpecImpl ringSpecImpl = (RingSpecImpl) obj;
                if (!0qQ.A0K(this.A03, ringSpecImpl.A03) || !0qQ.A0K(this.A00, ringSpecImpl.A00) || !0qQ.A0K(this.A04, ringSpecImpl.A04) || !0qQ.A0K(this.A02, ringSpecImpl.A02) || !0qQ.A0K(this.A01, ringSpecImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A03);
        parcel.writeParcelable(this.A00, i);
        List<Number> list = this.A04;
        parcel.writeInt(list.size());
        for (Number floatValue : list) {
            parcel.writeFloat(floatValue.floatValue());
        }
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public final List Ap5() {
        return this.A03;
    }

    public final RingSpecPoint B1X() {
        return this.A00;
    }

    public final List BNn() {
        return this.A04;
    }

    public final RingSpecPoint Byj() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRingSpec", C44324Cd6.A00(this));
    }

    public final String getName() {
        return this.A02;
    }
}
