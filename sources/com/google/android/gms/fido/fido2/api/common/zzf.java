package com.google.android.gms.fido.fido2.api.common;

import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWX;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(84);
    public final TAO A00;
    public final TAO A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzf = (zzf) obj;
        if (SA1.A01(this.A00, zzf.A00)) {
            return SA1.A00(this.A01, zzf.A01);
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] A03;
        TAO tao = this.A00;
        int A032 = Pxf.A03(parcel);
        byte[] bArr = null;
        if (tao == null) {
            A03 = null;
        } else {
            A03 = tao.A03();
        }
        C301145yd.A0F(parcel, A03, 1, false);
        TAO tao2 = this.A01;
        if (tao2 != null) {
            bArr = tao2.A03();
        }
        C301145yd.A0F(parcel, bArr, 2, false);
        C301145yd.A06(parcel, A032);
    }

    public zzf(TAO tao, TAO tao2) {
        this.A00 = tao;
        this.A01 = tao2;
    }
}
