package com.instagram.shopping.model.destination.home;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum DestinationSignalType implements Parcelable {
    UNRECOGNIZED("DestinationSignalType_unspecified"),
    ADD_TO_CART("add_to_cart"),
    CLICKED("clicked"),
    LIKED("liked"),
    OTHER("other"),
    SAVED("saved");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        DestinationSignalType[] destinationSignalTypeArr;
        A02 = 0oU.A00(destinationSignalTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (DestinationSignalType destinationSignalType : values()) {
            linkedHashMap.put(destinationSignalType.A00, destinationSignalType);
        }
        A01 = linkedHashMap;
        CREATOR = new W6F(51);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    DestinationSignalType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
