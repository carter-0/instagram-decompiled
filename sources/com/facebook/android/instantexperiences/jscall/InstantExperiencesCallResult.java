package com.facebook.android.instantexperiences.jscall;

import X.0KC;
import X.AnonymousClass5He;
import X.AnonymousClass7TE;
import X.C8910RFd;
import X.DbS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class InstantExperiencesCallResult implements Parcelable {
    public String A00;
    public String A01;
    public final C8910RFd A02;
    public final List A03;

    public final int describeContents() {
        if (this instanceof PaymentsCheckoutJSBridgeCallResult) {
            return 0;
        }
        boolean z = this instanceof CanShowPaymentModuleJSBridgeCallResult;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ArrayList A1D;
        List list = this.A03;
        if (list == null) {
            A1D = null;
        } else {
            A1D = AnonymousClass7TE.A1D(list);
        }
        parcel.writeSerializable(A1D);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeSerializable(this.A02);
    }

    public InstantExperiencesCallResult(C8910RFd rFd, String str) {
        this.A03 = AnonymousClass7TE.A1C();
        JSONObject A11 = DbS.A11();
        try {
            A11.put("errorCode", Integer.toString(rFd.A00));
            if (!AnonymousClass5He.A00(str)) {
                A11.put("errorMessage", str);
            }
        } catch (JSONException e) {
            0KC.A05(InstantExperiencesCallResult.class, "Failed to create error", e);
        }
        this.A03.add(A11.toString());
        this.A02 = rFd;
    }

    public InstantExperiencesCallResult(Parcel parcel) {
        this.A03 = (ArrayList) parcel.readSerializable();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = (C8910RFd) parcel.readSerializable();
    }

    public InstantExperiencesCallResult(List list) {
        this.A03 = list;
        this.A02 = null;
    }
}
