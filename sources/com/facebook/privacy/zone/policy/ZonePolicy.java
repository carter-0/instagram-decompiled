package com.facebook.privacy.zone.policy;

import X.0oU;
import X.C8898REq;
import X.N4G;
import X.Pxg;
import X.SBN;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public enum ZonePolicy implements Parcelable {
    A05("ALLOW_ALL_POLICY", 0),
    A04("ACCESS_TOKEN_POLICY", 1),
    A06("DEFAULT_PURPOSES_OPERATIONAL_POLICY", 2),
    A07("DEFAULT_PURPOSES_OPERATIONAL_STRICT_POLICY", 3),
    A08("FAMILY_DEVICE_ID_POLICY", 4),
    A09("INFRASTRUCTURE_ANALYTICS_POLICY", 5),
    A0B("MESSAGING_ARMADILLO_METADATA", 6),
    A0D("MESSAGING_CONTENT_E2EE_POLICY", 7),
    A0F("MESSAGING_CONTENT_OPEN_POLICY", 8),
    A0C("MESSAGING_CONTENT_DEBUGGING_POLICY", 9),
    A0A("MESSAGE_CONTENT_DATA_TYPE", 10),
    A0E("MESSAGING_CONTENT_E2EE_STRICT_POLICY", 11),
    A0G("MESSAGING_CONTENT_OPEN_STRICT_POLICY", 12),
    A0H("MESSAGING_TRAFFIC_METADATA", 13),
    A0I("SENSITIVE_DATA_NO_ADS", 14);
    
    public static final Parcelable.Creator CREATOR = null;
    public final Integer A00;
    public final C8898REq A01;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        ZonePolicy[] zonePolicyArr;
        A02 = 0oU.A00(zonePolicyArr);
        CREATOR = SWZ.A01(42);
    }

    public final String A00() {
        String str;
        N4G n4g = (N4G) SBN.A00.get(this.A01);
        if (n4g == null || (str = n4g.A01) == null) {
            return "";
        }
        return str;
    }

    public final String A01() {
        Integer num;
        N4G n4g = (N4G) SBN.A00.get(this.A01);
        if (n4g != null) {
            num = Integer.valueOf(n4g.A00);
        } else {
            num = null;
        }
        return String.valueOf(num);
    }

    /* access modifiers changed from: public */
    ZonePolicy(String str, int i) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
