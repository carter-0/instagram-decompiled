package com.instagram.api.schemas;

import X.0oU;
import X.DE7;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ContainerEffectEnum implements Parcelable {
    UNRECOGNIZED("ContainerEffectEnum_unspecified"),
    AR_DATA("AR_DATA"),
    BAG("BAG"),
    EXPERIMENTAL_BAG("EXPERIMENTAL_BAG"),
    EXPERIMENTAL_FURNITURE("EXPERIMENTAL_FURNITURE"),
    EXPERIMENTAL_GLASSES("EXPERIMENTAL_GLASSES"),
    EXPERIMENTAL_MAKEUP("EXPERIMENTAL_MAKEUP"),
    FURNITURE("FURNITURE"),
    GENERIC("GENERIC"),
    GLASSES("GLASSES"),
    MAKEUP("MAKEUP"),
    A0E(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    STAGING_BAG("STAGING_BAG"),
    STAGING_FURNITURE("STAGING_FURNITURE"),
    STAGING_GLASSES("STAGING_GLASSES");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ContainerEffectEnum[] containerEffectEnumArr;
        A02 = 0oU.A00(containerEffectEnumArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (ContainerEffectEnum containerEffectEnum : values()) {
            linkedHashMap.put(containerEffectEnum.A00, containerEffectEnum);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(19);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ContainerEffectEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
