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

public enum AdproRegulatedCategory implements Parcelable {
    UNRECOGNIZED("AdproRegulatedCategory_unspecified"),
    CREDIT("CREDIT"),
    EDUCATION("EDUCATION"),
    ELECTIONS_POLITICS("ELECTIONS_POLITICS"),
    EMPLOYMENT("EMPLOYMENT"),
    FINANCIAL_PRODUCTS_SERVICES("FINANCIAL_PRODUCTS_SERVICES"),
    HOUSING("HOUSING"),
    ISSUES_ELECTIONS_POLITICS("ISSUES_ELECTIONS_POLITICS"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    ONLINE_GAMBLING_AND_GAMING("ONLINE_GAMBLING_AND_GAMING");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AdproRegulatedCategory[] adproRegulatedCategoryArr;
        A02 = 0oU.A00(adproRegulatedCategoryArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (AdproRegulatedCategory adproRegulatedCategory : values()) {
            linkedHashMap.put(adproRegulatedCategory.A00, adproRegulatedCategory);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(30);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdproRegulatedCategory(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
