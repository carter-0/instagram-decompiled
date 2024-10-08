package com.instagram.business.promote.model;

import X.0oU;
import X.0qQ;
import X.DbT;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public enum PromoteWhatsAppAccountType implements Parcelable {
    CONSUMER,
    SMB;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PromoteWhatsAppAccountType[] promoteWhatsAppAccountTypeArr;
        A00 = 0oU.A00(promoteWhatsAppAccountTypeArr);
        CREATOR = new W6D(51);
    }

    public final String toString() {
        String name = name();
        Locale locale = Locale.ROOT;
        0qQ.A08(locale);
        return DbT.A12(locale, name);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
