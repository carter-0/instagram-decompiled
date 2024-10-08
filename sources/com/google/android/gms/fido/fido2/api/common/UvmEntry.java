package com.google.android.gms.fido.fido2.api.common;

import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(80);
    public final int A00;
    public final short A01;
    public final short A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        if (this.A00 == uvmEntry.A00 && this.A01 == uvmEntry.A01 && this.A02 == uvmEntry.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0B(Integer.valueOf(this.A00), Short.valueOf(this.A01), Short.valueOf(this.A02));
    }

    public UvmEntry(int i, short s, short s2) {
        this.A00 = i;
        this.A01 = s;
        this.A02 = s2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        short s = this.A01;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.A02;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        C301145yd.A06(parcel, A03);
    }
}
