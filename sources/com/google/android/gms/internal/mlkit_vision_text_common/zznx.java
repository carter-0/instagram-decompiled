package com.google.android.gms.internal.mlkit_vision_text_common;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class zznx extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(34);
    public final String A00;
    public final List A01;

    public zznx(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0E(parcel, this.A01, 2, Pxf.A1S(parcel, this.A00));
        C301145yd.A06(parcel, A03);
    }
}
