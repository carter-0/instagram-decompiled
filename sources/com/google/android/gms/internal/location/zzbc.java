package com.google.android.gms.internal.location;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbc extends AbstractSafeParcelable {
    public static final List A0B = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = SWR.A00(22);
    public long A00;
    public LocationRequest A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbc = (zzbc) obj;
        if (SA1.A01(this.A01, zzbc.A01) && SA1.A01(this.A05, zzbc.A05) && SA1.A01(this.A02, zzbc.A02) && this.A06 == zzbc.A06 && this.A07 == zzbc.A07 && this.A08 == zzbc.A08 && SA1.A01(this.A03, zzbc.A03) && this.A09 == zzbc.A09 && this.A0A == zzbc.A0A) {
            return SA1.A00(this.A04, zzbc.A04);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        String str = this.A02;
        if (str != null) {
            A1A.append(" tag=");
            A1A.append(str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            A1A.append(" moduleId=");
            A1A.append(str2);
        }
        String str3 = this.A04;
        if (str3 != null) {
            A1A.append(" contextAttributionTag=");
            A1A.append(str3);
        }
        A1A.append(" hideAppOps=");
        A1A.append(this.A06);
        A1A.append(" clients=");
        A1A.append(this.A05);
        A1A.append(" forceCoarseLocation=");
        A1A.append(this.A07);
        if (this.A08) {
            A1A.append(" exemptFromBackgroundThrottle");
        }
        if (this.A09) {
            A1A.append(" locationSettingsIgnored");
        }
        if (this.A0A) {
            A1A.append(" inaccurateLocationsDelayed");
        }
        return A1A.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A01, 1, i, false);
        C301145yd.A0E(parcel, this.A05, 5, false);
        C301145yd.A0C(parcel, this.A02, 6, false);
        C301145yd.A09(parcel, 7, this.A06);
        C301145yd.A09(parcel, 8, this.A07);
        C301145yd.A09(parcel, 9, this.A08);
        C301145yd.A0C(parcel, this.A03, 10, false);
        C301145yd.A09(parcel, 11, this.A09);
        C301145yd.A09(parcel, 12, this.A0A);
        C301145yd.A0C(parcel, this.A04, 13, false);
        C301145yd.A08(parcel, 14, this.A00);
        C301145yd.A06(parcel, A032);
    }
}
