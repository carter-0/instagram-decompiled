package com.facebook.locationsharing.core.models;

import X.AnonymousClass05K;
import X.C13990Tnq;
import X.C41847B3o;
import X.C51968G9o;
import X.Pxi;
import X.Pxj;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Location implements Parcelable {
    public static volatile Integer A07;
    public static final Parcelable.Creator CREATOR = new SWZ(29);
    public final double A00;
    public final double A01;
    public final long A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final Set A06;

    public Location(Set set, double d, double d2, int i, int i2, long j) {
        this.A03 = i;
        this.A04 = i2;
        this.A00 = d;
        this.A01 = d2;
        this.A05 = null;
        this.A02 = j;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Location) {
                Location location = (Location) obj;
                if (!(this.A03 == location.A03 && this.A04 == location.A04 && this.A00 == location.A00 && this.A01 == location.A01 && A00() == location.A00() && this.A02 == location.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A06.contains(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)) {
            return this.A05;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = AnonymousClass05K.A00;
                }
            }
        }
        return A07;
    }

    public final int hashCode() {
        int intValue;
        int A032 = ((((((this.A03 + 31) * 31) + this.A04) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01));
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        return (((A032 * 31) + intValue) * 31) + C51968G9o.A03(this.A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(C41847B3o.A00(parcel, this.A05));
        parcel.writeLong(this.A02);
        Iterator A0w = Pxj.A0w(parcel, this.A06);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
    }

    public Location(Parcel parcel) {
        Integer num;
        getClass().getClassLoader();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            num = null;
        } else {
            num = AnonymousClass05K.A00(4)[parcel.readInt()];
        }
        this.A05 = num;
        this.A02 = parcel.readLong();
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C13990Tnq.A07(parcel, hashSet, i);
        }
        this.A06 = Collections.unmodifiableSet(hashSet);
    }
}
