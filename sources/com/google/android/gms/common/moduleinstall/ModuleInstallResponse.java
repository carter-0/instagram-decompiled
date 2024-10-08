package com.google.android.gms.common.moduleinstall;

import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(39);
    public final int A00;
    public final boolean A01;

    public ModuleInstallResponse(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A09(parcel, 2, this.A01);
        C301145yd.A06(parcel, A03);
    }
}
