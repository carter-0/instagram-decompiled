package com.google.android.gms.location;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(49);
    @Deprecated
    public int A00;
    @Deprecated
    public int A01;
    public int A02;
    public long A03;
    public zzbd[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                LocationAvailability locationAvailability = (LocationAvailability) obj;
                if (!(this.A00 == locationAvailability.A00 && this.A01 == locationAvailability.A01 && this.A03 == locationAvailability.A03 && this.A02 == locationAvailability.A02 && Arrays.equals(this.A04, locationAvailability.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0C(Integer.valueOf(this.A02), Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A03), this.A04);
    }

    public final String toString() {
        boolean A1T = AnonymousClass7TF.A1T(this.A02, IgNetworkConsentStorage.MAX_ENTRIES);
        StringBuilder A14 = Pxe.A14(48);
        A14.append("LocationAvailability[isLocationAvailable: ");
        A14.append(A1T);
        return AnonymousClass7TF.A0l("]", A14);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A08(parcel, 3, this.A03);
        C301145yd.A07(parcel, 4, this.A02);
        C301145yd.A0G(parcel, this.A04, 5, i);
        C301145yd.A06(parcel, A032);
    }
}
