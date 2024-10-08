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

public enum ThreadHeaderStyle implements Parcelable {
    UNRECOGNIZED("ThreadHeaderStyle_unspecified"),
    BOLD("bold");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ThreadHeaderStyle[] threadHeaderStyleArr;
        A02 = 0oU.A00(threadHeaderStyleArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ThreadHeaderStyle threadHeaderStyle : values()) {
            A0x.put(threadHeaderStyle.A00, threadHeaderStyle);
        }
        A01 = A0x;
        CREATOR = new FK6(44);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ThreadHeaderStyle(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
