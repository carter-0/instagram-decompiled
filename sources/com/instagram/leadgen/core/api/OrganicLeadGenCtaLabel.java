package com.instagram.leadgen.core.api;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum OrganicLeadGenCtaLabel implements Parcelable {
    UNRECOGNIZED("OrganicLeadGenCtaLabel_unspecified"),
    A07(NetInfoModule.CONNECTION_TYPE_NONE),
    GET_QUOTE("get_quote"),
    APPLY_NOW("apply_now"),
    LEARN_MORE("learn_more"),
    SIGN_UP("sign_up");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        OrganicLeadGenCtaLabel[] organicLeadGenCtaLabelArr;
        A02 = 0oU.A00(organicLeadGenCtaLabelArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (OrganicLeadGenCtaLabel organicLeadGenCtaLabel : values()) {
            linkedHashMap.put(organicLeadGenCtaLabel.A00, organicLeadGenCtaLabel);
        }
        A01 = linkedHashMap;
        CREATOR = new W6E(85);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    OrganicLeadGenCtaLabel(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
