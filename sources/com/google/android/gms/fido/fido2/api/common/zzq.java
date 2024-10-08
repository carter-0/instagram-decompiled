package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.C8467QvC;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.Pxi;
import X.SA1;
import X.SWX;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(93);
    public final long A00;
    public final TAO A01;
    public final TAO A02;
    public final TAO A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzq = (zzq) obj;
        if (this.A00 != zzq.A00 || !SA1.A01(this.A01, zzq.A01) || !SA1.A01(this.A02, zzq.A02)) {
            return false;
        }
        return SA1.A00(this.A03, zzq.A03);
    }

    public final int hashCode() {
        return Pxh.A0A(Long.valueOf(this.A00), this.A01, this.A02, this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A032 = Pxf.A03(parcel);
        C301145yd.A08(parcel, 1, j);
        boolean A1W = Pxg.A1W(parcel, this.A01.A03());
        C301145yd.A0F(parcel, this.A02.A03(), 3, A1W);
        C301145yd.A0F(parcel, this.A03.A03(), 4, A1W);
        C301145yd.A06(parcel, A032);
    }

    public zzq(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        C8467QvC A0O = Pxi.A0O(bArr);
        C8467QvC A0O2 = Pxi.A0O(bArr2);
        C8467QvC A0O3 = Pxi.A0O(bArr3);
        this.A00 = j;
        AnonymousClass3Qk.A02(A0O);
        this.A01 = A0O;
        AnonymousClass3Qk.A02(A0O2);
        this.A02 = A0O2;
        AnonymousClass3Qk.A02(A0O3);
        this.A03 = A0O3;
    }
}
