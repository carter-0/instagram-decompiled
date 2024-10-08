package com.google.android.gms.location;

import X.AnonymousClass7TF;
import X.C51968G9o;
import X.Pxe;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = SWR.A00(51);
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            List<Location> list = ((LocationResult) obj).A00;
            int size = list.size();
            List list2 = this.A00;
            if (size == list2.size()) {
                Iterator it = list2.iterator();
                for (Location time : list) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.A00) {
            i = (i * 31) + C51968G9o.A03(time.getTime());
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A14 = Pxe.A14(Pxf.A09(valueOf) + 27);
        A14.append("LocationResult[locations: ");
        A14.append(valueOf);
        return AnonymousClass7TF.A0l("]", A14);
    }

    public LocationResult(List list) {
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxi.A16(parcel, this.A00, 1, Pxf.A03(parcel));
    }
}
