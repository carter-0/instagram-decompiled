package com.google.android.gms.internal.mlkit_vision_text_common;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(36);
    public final String A00;

    public zzp(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A06(parcel, A03);
    }

    public zzp() {
        this.A00 = null;
    }
}
