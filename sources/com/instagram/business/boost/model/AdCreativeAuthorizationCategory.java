package com.instagram.business.boost.model;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdCreativeAuthorizationCategory implements Parcelable {
    A04(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    POLITICAL("POLITICAL");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdCreativeAuthorizationCategory[] adCreativeAuthorizationCategoryArr;
        A02 = 0oU.A00(adCreativeAuthorizationCategoryArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (AdCreativeAuthorizationCategory adCreativeAuthorizationCategory : values()) {
            linkedHashMap.put(adCreativeAuthorizationCategory.A00, adCreativeAuthorizationCategory);
        }
        A01 = linkedHashMap;
        CREATOR = new FK6(99);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdCreativeAuthorizationCategory(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
