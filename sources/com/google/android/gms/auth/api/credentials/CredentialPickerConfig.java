package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxf;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(86);
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public CredentialPickerConfig(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        if (i < 2) {
            this.A01 = true == z3 ? 3 : 1;
        } else {
            this.A01 = i2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, this.A02);
        C301145yd.A09(parcel, 2, this.A03);
        int i2 = this.A01;
        C301145yd.A09(parcel, 3, AnonymousClass7TF.A1S(i2, 3));
        C301145yd.A07(parcel, 4, i2);
        Pxf.A17(parcel, this.A00, A032);
    }
}
