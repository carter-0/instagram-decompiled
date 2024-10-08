package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass3Qk;
import X.C10988S4a;
import X.C301145yd;
import X.C51968G9o;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.S01;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = SWR.A00(10);
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        if (!Arrays.equals(this.A01, signResponseData.A01) || !SA1.A01(this.A00, signResponseData.A00) || !Arrays.equals(this.A02, signResponseData.A02) || !Arrays.equals(this.A03, signResponseData.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxh.A0A(Integer.valueOf(Arrays.hashCode(this.A01)), this.A00, Integer.valueOf(Arrays.hashCode(this.A02)), Integer.valueOf(Arrays.hashCode(this.A03)));
    }

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AnonymousClass3Qk.A02(bArr);
        this.A01 = bArr;
        AnonymousClass3Qk.A02(str);
        this.A00 = str;
        AnonymousClass3Qk.A02(bArr2);
        this.A02 = bArr2;
        AnonymousClass3Qk.A02(bArr3);
        this.A03 = bArr3;
    }

    public final String toString() {
        C10988S4a s4a = new C10988S4a(C51968G9o.A16(this));
        S01 s01 = S01.A00;
        byte[] bArr = this.A01;
        s4a.A00(s01.A00(bArr, bArr.length), "keyHandle");
        s4a.A00(this.A00, "clientDataString");
        byte[] bArr2 = this.A02;
        s4a.A00(s01.A00(bArr2, bArr2.length), "signatureData");
        byte[] bArr3 = this.A03;
        s4a.A00(s01.A00(bArr3, bArr3.length), "application");
        return s4a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1W = Pxg.A1W(parcel, this.A01);
        C301145yd.A0C(parcel, this.A00, 3, A1W);
        C301145yd.A0F(parcel, this.A02, 4, A1W);
        C301145yd.A0F(parcel, this.A03, 5, A1W);
        C301145yd.A06(parcel, A032);
    }
}
