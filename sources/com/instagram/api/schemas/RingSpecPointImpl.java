package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C44325Cd7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class RingSpecPointImpl extends AnonymousClass0T0 implements Parcelable, RingSpecPoint {
    public static final Parcelable.Creator CREATOR = new C376419Hx(19);
    public final float A00;
    public final float A01;

    public final RingSpecPointImpl F8m() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RingSpecPointImpl) {
                RingSpecPointImpl ringSpecPointImpl = (RingSpecPointImpl) obj;
                if (!(Float.compare(this.A00, ringSpecPointImpl.A00) == 0 && Float.compare(this.A01, ringSpecPointImpl.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
    }

    public final float CGs() {
        return this.A00;
    }

    public final float CHR() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRingSpecPoint", C44325Cd7.A00(this));
    }

    public RingSpecPointImpl(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
