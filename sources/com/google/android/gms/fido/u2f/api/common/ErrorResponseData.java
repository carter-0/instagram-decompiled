package com.google.android.gms.fido.u2f.api.common;

import X.C10988S4a;
import X.C301145yd;
import X.C51968G9o;
import X.Pxf;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = SWR.A00(2);
    public final ErrorCode A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (SA1.A01(this.A00, errorResponseData.A00)) {
            return SA1.A00(this.A01, errorResponseData.A01);
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public ErrorResponseData(int i, String str) {
        ErrorCode errorCode;
        ErrorCode[] values = ErrorCode.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                errorCode = ErrorCode.OTHER_ERROR;
                break;
            }
            errorCode = values[i2];
            if (i == errorCode.A00) {
                break;
            }
            i2++;
        }
        this.A00 = errorCode;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Rv0, java.lang.Object] */
    public final String toString() {
        C10988S4a s4a = new C10988S4a(C51968G9o.A16(this));
        String valueOf = String.valueOf(this.A00.A00);
        ? obj = new Object();
        s4a.A00.A00 = obj;
        s4a.A00 = obj;
        obj.A01 = valueOf;
        obj.A02 = "errorCode";
        String str = this.A01;
        if (str != null) {
            s4a.A00(str, "errorMessage");
        }
        return s4a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A00.A00);
        C301145yd.A0C(parcel, this.A01, 3, false);
        C301145yd.A06(parcel, A03);
    }
}
