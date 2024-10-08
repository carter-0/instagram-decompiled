package com.google.android.gms.internal.mlkit_vision_text_common;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class zznv extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(33);
    public final Rect A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public zznv(Rect rect, String str, String str2, List list, List list2) {
        this.A01 = str;
        this.A00 = rect;
        this.A03 = list;
        this.A02 = str2;
        this.A04 = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, this.A01);
        C301145yd.A0A(parcel, this.A00, 2, i, A1S);
        C301145yd.A0E(parcel, this.A03, 3, A1S);
        C301145yd.A0C(parcel, this.A02, 4, A1S);
        C301145yd.A0E(parcel, this.A04, 5, A1S);
        C301145yd.A06(parcel, A032);
    }
}
