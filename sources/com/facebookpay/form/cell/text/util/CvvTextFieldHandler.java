package com.facebookpay.form.cell.text.util;

import X.0qQ;
import X.C8946RGo;
import X.SWV;
import android.os.Parcel;

public final class CvvTextFieldHandler implements TextFieldHandler {
    public static final SWV CREATOR = SWV.A00(82);
    public final C8946RGo A00;

    public final boolean CJv(String str, String str2) {
        String str3;
        if (str != null && str2 != null && str2.length() > 0 && !str.equals(str2)) {
            if (this.A00 == C8946RGo.AMERICAN_EXPRESS) {
                str3 = "••••";
            } else {
                str3 = "•••";
            }
            return !str2.equals(str3);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        C8946RGo rGo = this.A00;
        if (rGo != null) {
            str = rGo.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }

    public CvvTextFieldHandler(C8946RGo rGo) {
        this.A00 = rGo;
    }
}
