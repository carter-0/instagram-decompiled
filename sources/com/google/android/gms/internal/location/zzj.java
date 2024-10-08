package com.google.android.gms.internal.location;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxf;
import X.Pxh;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzo;
import java.util.Collections;
import java.util.List;

public final class zzj extends AbstractSafeParcelable {
    public static final zzo A03 = new zzo();
    public static final List A04 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = SWR.A00(25);
    public zzo A00;
    public String A01;
    public List A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        if (!SA1.A01(this.A00, zzj.A00) || !SA1.A01(this.A02, zzj.A02)) {
            return false;
        }
        return SA1.A00(this.A01, zzj.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(this.A02);
        String str = this.A01;
        StringBuilder A0q = Pxh.A0q(str, Pxf.A09(valueOf) + 77 + Pxf.A09(valueOf2));
        A0q.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        A0q.append(valueOf);
        A0q.append(", clients=");
        A0q.append(valueOf2);
        A0q.append(", tag='");
        A0q.append(str);
        return AnonymousClass7TF.A0l("'}", A0q);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A00, 1, i, false);
        C301145yd.A0E(parcel, this.A02, 2, false);
        Pxf.A1A(parcel, this.A01, A032, false);
    }
}
