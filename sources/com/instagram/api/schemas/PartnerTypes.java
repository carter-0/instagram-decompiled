package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PartnerTypes implements Parcelable {
    UNRECOGNIZED("PartnerTypes_unspecified"),
    AMAZON("AMAZON"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    SHOPEE_TH("SHOPEE_TH");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PartnerTypes[] partnerTypesArr;
        A02 = 0oU.A00(partnerTypesArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (PartnerTypes partnerTypes : values()) {
            A0x.put(partnerTypes.A00, partnerTypes);
        }
        A01 = A0x;
        CREATOR = new DE6(8);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    PartnerTypes(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
