package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.C3735896d;
import X.Pxf;
import X.Pxh;
import X.Pxi;
import X.SA1;
import X.SWX;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(62);
    public final TAO A00;
    public final TAO A01;
    public final TAO A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzai = (zzai) obj;
        if (!SA1.A01(this.A00, zzai.A00) || !SA1.A01(this.A01, zzai.A01) || !SA1.A01(this.A02, zzai.A02) || this.A03 != zzai.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxh.A0A(this.A00, this.A01, this.A02, Integer.valueOf(this.A03));
    }

    public final String toString() {
        String A002 = C3735896d.A00(Pxi.A1b(this.A00));
        String A003 = C3735896d.A00(Pxi.A1b(this.A01));
        String A004 = C3735896d.A00(Pxi.A1b(this.A02));
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HmacSecretExtension{coseKeyAgreement=");
        A1A.append(A002);
        A1A.append(", saltEnc=");
        A1A.append(A003);
        A1A.append(", saltAuth=");
        A1A.append(A004);
        A1A.append(", getPinUvAuthProtocol=");
        A1A.append(this.A03);
        return AnonymousClass7TF.A0l("}", A1A);
    }

    public zzai(TAO tao, TAO tao2, TAO tao3, int i) {
        this.A00 = tao;
        this.A01 = tao2;
        this.A02 = tao3;
        this.A03 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0F(parcel, Pxi.A1b(this.A00), 1, false);
        C301145yd.A0F(parcel, Pxi.A1b(this.A01), 2, false);
        C301145yd.A0F(parcel, Pxi.A1b(this.A02), 3, false);
        Pxi.A12(parcel, this.A03, A032);
    }
}
