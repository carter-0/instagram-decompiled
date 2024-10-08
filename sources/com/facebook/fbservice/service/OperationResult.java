package com.facebook.fbservice.service;

import X.0Jc;
import X.AnonymousClass05K;
import X.RVF;
import X.SWS;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.Serializable;

public class OperationResult implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = SWS.A00(86);
    public Bundle A00 = null;
    public Integer A01 = AnonymousClass05K.A00;
    public String A02 = null;
    public String A03 = null;
    public Throwable A04 = null;
    public boolean A05 = true;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String obj;
        String A002;
        Boolean valueOf = Boolean.valueOf(this.A05);
        String str = this.A03;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Bundle bundle = this.A00;
        if (bundle == null) {
            obj = str2;
        } else {
            obj = bundle.toString();
        }
        Integer num = this.A01;
        if (num == null) {
            A002 = str2;
        } else {
            A002 = RVF.A00(num);
        }
        String str3 = this.A02;
        if (str3 == null) {
            str3 = str2;
        }
        Throwable th = this.A04;
        if (th != null) {
            str2 = 0Jc.A00(th);
        }
        return StringFormatUtil.formatStrLocaleSafe("OperationResult success=%s, resultDataString=%s, resultDataBundle=%s, errorCode=%s, errorDescription=%s, exception=%s", new Object[]{valueOf, str, obj, A002, str3, str2});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeBundle(this.A00);
        parcel.writeString(RVF.A00(this.A01));
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A04);
    }
}
