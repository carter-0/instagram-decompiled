package com.facebook.browser.lite.ipc;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class IABExtensionStatesHandlerPayload implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(25);
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A03);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
