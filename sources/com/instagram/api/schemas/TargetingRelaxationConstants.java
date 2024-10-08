package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TargetingRelaxationConstants implements Parcelable {
    UNRECOGNIZED("TargetingRelaxationConstants_unspecified"),
    EXPANSION("EXPANSION"),
    A05(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TargetingRelaxationConstants[] targetingRelaxationConstantsArr;
        A02 = 0oU.A00(targetingRelaxationConstantsArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (TargetingRelaxationConstants targetingRelaxationConstants : values()) {
            linkedHashMap.put(targetingRelaxationConstants.A00, targetingRelaxationConstants);
        }
        A01 = linkedHashMap;
        CREATOR = new FK6(19);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TargetingRelaxationConstants(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
