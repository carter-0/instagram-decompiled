package com.instagram.api.schemas;

import X.0oU;
import X.DbS;
import X.DbY;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MultiAuthorStoryType implements Parcelable {
    ;
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MultiAuthorStoryType[] multiAuthorStoryTypeArr;
        A02 = 0oU.A00(multiAuthorStoryTypeArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r4));
        for (MultiAuthorStoryType multiAuthorStoryType : values()) {
            A0x.put(multiAuthorStoryType.A00, multiAuthorStoryType);
        }
        A01 = A0x;
        CREATOR = FK5.A00(84);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MultiAuthorStoryType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
