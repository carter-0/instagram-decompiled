package com.google.android.gms.signin.internal;

import X.AnonymousClass63X;
import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class zag extends AbstractSafeParcelable implements AnonymousClass63X {
    public static final Parcelable.Creator CREATOR = SWR.A00(75);
    public final String A00;
    public final List A01;

    public final Status BzI() {
        if (this.A00 != null) {
            return Status.A08;
        }
        return Status.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A01;
        int A03 = Pxf.A03(parcel);
        C301145yd.A0D(parcel, list, 1);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A06(parcel, A03);
    }

    public zag(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
