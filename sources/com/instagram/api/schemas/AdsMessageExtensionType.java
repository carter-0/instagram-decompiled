package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdsMessageExtensionType implements Parcelable {
    UNRECOGNIZED("AdsMessageExtensionType_unspecified"),
    INSTAGRAM_MESSAGE("INSTAGRAM_MESSAGE"),
    MESSENGER("MESSENGER"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    WHATSAPP("WHATSAPP");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdsMessageExtensionType[] adsMessageExtensionTypeArr;
        A02 = 0oU.A00(adsMessageExtensionTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (AdsMessageExtensionType adsMessageExtensionType : values()) {
            linkedHashMap.put(adsMessageExtensionType.A00, adsMessageExtensionType);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(32);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdsMessageExtensionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
