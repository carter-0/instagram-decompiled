package com.google.android.gms.location;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(48);
    public final int A00;
    public final String A01;
    public final List A02;

    public GeofencingRequest(List list, int i, String str) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GeofencingRequest[");
        A1A.append("geofences=");
        A1A.append(this.A02);
        int i = this.A00;
        StringBuilder A14 = Pxe.A14(30);
        A14.append(", initialTrigger=");
        A14.append(i);
        Pxe.A1Y(A14);
        Pxf.A1O(A1A, A14);
        String valueOf = String.valueOf(this.A01);
        A1A.append(Pxg.A0l(valueOf.length(), "tag=", valueOf));
        return AnonymousClass7TF.A0l("]", A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0E(parcel, this.A02, 1, false);
        C301145yd.A07(parcel, 2, this.A00);
        Pxf.A1A(parcel, this.A01, A03, false);
    }
}
