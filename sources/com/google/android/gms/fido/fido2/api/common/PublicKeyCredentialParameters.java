package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.AnonymousClass3Qk;
import X.C301145yd;
import X.C8972RJn;
import X.C8974RJp;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(67);
    public final COSEAlgorithmIdentifier A00;
    public final PublicKeyCredentialType A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        if (this.A01.equals(publicKeyCredentialParameters.A01)) {
            return Pxi.A1W(this.A00, publicKeyCredentialParameters.A00);
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A01, this.A00);
    }

    public final String toString() {
        return 002.A11("PublicKeyCredentialParameters{\n type=", String.valueOf(this.A01), ", \n algorithm=", String.valueOf(this.A00), "\n }");
    }

    public PublicKeyCredentialParameters(String str, int i) {
        AnonymousClass3Qk.A02(str);
        try {
            this.A01 = PublicKeyCredentialType.A00(str);
            AnonymousClass3Qk.A02(Integer.valueOf(i));
            try {
                this.A00 = COSEAlgorithmIdentifier.A00(i);
            } catch (C8972RJn e) {
                throw new IllegalArgumentException(e);
            }
        } catch (C8974RJp e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A01.toString());
        int Aaf = this.A00.A00.Aaf();
        if (Integer.valueOf(Aaf) != null) {
            parcel.writeInt(262147);
            parcel.writeInt(Aaf);
        }
        C301145yd.A06(parcel, A03);
    }
}
