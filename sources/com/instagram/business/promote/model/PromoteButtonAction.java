package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class PromoteButtonAction implements Parcelable {
    public static final W6D CREATOR = new W6D(34);
    public PromoteButtonActionType A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        String str2 = this.A01;
        if (str2 != null) {
            parcel.writeString(str2);
            String str3 = this.A02;
            if (str3 != null) {
                parcel.writeString(str3);
                PromoteButtonActionType promoteButtonActionType = this.A00;
                if (promoteButtonActionType != null) {
                    parcel.writeParcelable(promoteButtonActionType, i);
                    return;
                }
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
            } else {
                str = "link";
            }
        } else {
            str = "displayText";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
