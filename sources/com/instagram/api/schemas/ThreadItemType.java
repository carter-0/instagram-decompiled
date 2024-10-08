package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ThreadItemType implements Parcelable {
    UNRECOGNIZED("ThreadItemType_unspecified"),
    COLLAPSED("collapsed"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ThreadItemType[] threadItemTypeArr;
        A02 = 0oU.A00(threadItemTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ThreadItemType threadItemType : values()) {
            A0x.put(threadItemType.A00, threadItemType);
        }
        A01 = A0x;
        CREATOR = new FK6(45);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ThreadItemType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
