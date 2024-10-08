package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum UrpIndexAction implements Parcelable {
    UNRECOGNIZED("UrpIndexAction_unspecified"),
    APPEND("APPEND"),
    INSERT("INSERT"),
    PREPEND("PREPEND"),
    REPLACE("REPLACE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        UrpIndexAction[] urpIndexActionArr;
        A02 = 0oU.A00(urpIndexActionArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (UrpIndexAction urpIndexAction : values()) {
            A0x.put(urpIndexAction.A00, urpIndexAction);
        }
        A01 = A0x;
        CREATOR = FK6.A00(54);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    UrpIndexAction(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
