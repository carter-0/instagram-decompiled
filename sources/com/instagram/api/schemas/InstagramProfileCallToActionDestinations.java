package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.LinkedHashMap;
import java.util.Map;

public enum InstagramProfileCallToActionDestinations implements Parcelable {
    UNRECOGNIZED("InstagramProfileCallToActionDestinations_unspecified"),
    DIRECT_MESSAGE("DIRECT_MESSAGE"),
    A05(PaymentDetailChangeTypes$Companion.EMAIL),
    GEO_ADDRESS("GEO_ADDRESS"),
    PHONE_CALL("PHONE_CALL"),
    PHONE_TEXT("PHONE_TEXT"),
    WEBSITE("WEBSITE"),
    WHATSAPP_MESSAGE("WHATSAPP_MESSAGE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        InstagramProfileCallToActionDestinations[] instagramProfileCallToActionDestinationsArr;
        A02 = 0oU.A00(instagramProfileCallToActionDestinationsArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations : values()) {
            linkedHashMap.put(instagramProfileCallToActionDestinations.A00, instagramProfileCallToActionDestinations);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(42);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    InstagramProfileCallToActionDestinations(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
