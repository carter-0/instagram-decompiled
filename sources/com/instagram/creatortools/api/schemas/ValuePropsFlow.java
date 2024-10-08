package com.instagram.creatortools.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ValuePropsFlow implements Parcelable {
    UNRECOGNIZED("ValuePropsFlow_unspecified"),
    PRODUCTS("products"),
    INSIGHTS("insights"),
    ACCOUNTS("accounts"),
    INSPIRATION("inspiration"),
    BONUSES("incentive_platform"),
    SUBSCRIPTION("fan_club_creator"),
    BADGES("badges_incentives"),
    CREATOR_MARKETPLACE("branded_content_deal_creator");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ValuePropsFlow[] valuePropsFlowArr;
        A02 = 0oU.A00(valuePropsFlowArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ValuePropsFlow valuePropsFlow : values()) {
            A0x.put(valuePropsFlow.A00, valuePropsFlow);
        }
        A01 = A0x;
        CREATOR = new LVP(59);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ValuePropsFlow(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
