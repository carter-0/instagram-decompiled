package com.instagram.location.surface.api.model.operationhours;

import X.1XP;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class LocationPageInfoPageOperationHour extends 1XP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(3);
    public String A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
        }
        this.A01 = list;
        parcel.writeStringList(list);
    }
}
