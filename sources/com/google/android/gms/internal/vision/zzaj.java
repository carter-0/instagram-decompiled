package com.google.android.gms.internal.vision;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(40);
    public final Rect A00;

    public zzaj(Rect rect) {
        this.A00 = rect;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A00, 2, i, false);
        C301145yd.A06(parcel, A03);
    }

    public zzaj() {
        this.A00 = AnonymousClass7TE.A0W();
    }
}
