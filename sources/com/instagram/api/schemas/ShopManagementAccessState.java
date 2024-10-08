package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShopManagementAccessState implements Parcelable {
    UNRECOGNIZED("ShopManagementAccessState_unspecified"),
    ADD("add"),
    ADD_HIDE("add_hide"),
    ADD_HIDE_UNIFIED_INVENTORY("add_hide_unified_inventory"),
    A07(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ShopManagementAccessState[] shopManagementAccessStateArr;
        A02 = 0oU.A00(shopManagementAccessStateArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ShopManagementAccessState shopManagementAccessState : values()) {
            linkedHashMap.put(shopManagementAccessState.A00, shopManagementAccessState);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(23);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShopManagementAccessState(String str) {
        this.A00 = str;
    }
}
