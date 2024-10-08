package com.google.android.gms.fido.u2f.api.common;

import X.C10988S4a;
import X.C301145yd;
import X.C51968G9o;
import X.C8978RJu;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.S01;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = SWR.A00(7);
    public final String A00;
    public final byte[] A01;
    public final ProtocolVersion A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        if (!SA1.A01(this.A02, registerResponseData.A02) || !Arrays.equals(this.A01, registerResponseData.A01)) {
            return false;
        }
        return SA1.A00(this.A00, registerResponseData.A00);
    }

    public final int hashCode() {
        return Pxf.A0B(this.A02, Integer.valueOf(Arrays.hashCode(this.A01)), this.A00);
    }

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.A01 = bArr;
        try {
            this.A02 = ProtocolVersion.A00(str);
            this.A00 = str2;
        } catch (C8978RJu e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final String toString() {
        C10988S4a s4a = new C10988S4a(C51968G9o.A16(this));
        s4a.A00(this.A02, "protocolVersion");
        S01 s01 = S01.A00;
        byte[] bArr = this.A01;
        s4a.A00(s01.A00(bArr, bArr.length), "registerData");
        String str = this.A00;
        if (str != null) {
            s4a.A00(str, "clientDataString");
        }
        return s4a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        boolean A1W = Pxg.A1W(parcel, this.A01);
        C301145yd.A0C(parcel, this.A02.toString(), 3, A1W);
        Pxi.A14(parcel, this.A00, A03, A1W);
    }
}
