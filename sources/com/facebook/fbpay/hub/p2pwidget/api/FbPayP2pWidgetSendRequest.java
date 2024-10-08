package com.facebook.fbpay.hub.p2pwidget.api;

import X.0qQ;
import X.C11367SPk;
import X.C249803kO;
import X.C51971G9r;
import X.Pxf;
import X.Pxi;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class FbPayP2pWidgetSendRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(85);
    public final ImmutableList A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pWidgetSendRequest) {
                FbPayP2pWidgetSendRequest fbPayP2pWidgetSendRequest = (FbPayP2pWidgetSendRequest) obj;
                if (!0qQ.A0K(this.A00, fbPayP2pWidgetSendRequest.A00) || !0qQ.A0K(this.A01, fbPayP2pWidgetSendRequest.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C249803kO A0P = Pxi.A0P(parcel, this.A00);
        while (A0P.hasNext()) {
            parcel.writeParcelable((FbPayP2pFriend) A0P.next(), i);
        }
        String str = this.A01;
        if (str == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(str);
    }

    public FbPayP2pWidgetSendRequest(Parcel parcel) {
        String readString;
        ClassLoader A0W = Pxf.A0W(this);
        int readInt = parcel.readInt();
        Object[] objArr = new FbPayP2pFriend[readInt];
        for (int i = 0; i < readInt; i++) {
            objArr[i] = parcel.readParcelable(A0W);
        }
        this.A00 = ImmutableList.copyOf(objArr);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A01 = readString;
    }
}
