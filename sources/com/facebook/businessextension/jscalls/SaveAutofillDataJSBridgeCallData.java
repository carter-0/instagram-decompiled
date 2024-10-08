package com.facebook.businessextension.jscalls;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

public class SaveAutofillDataJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(33);
    public final ImmutableMap A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public SaveAutofillDataJSBridgeCallData(Parcel parcel) {
        this.A00 = ImmutableMap.copyOf(parcel.readHashMap(SaveAutofillDataJSBridgeCallData.class.getClassLoader()));
    }

    public SaveAutofillDataJSBridgeCallData(ImmutableMap immutableMap) {
        this.A00 = immutableMap;
    }
}
