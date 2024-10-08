package com.instagram.api.schemas;

import X.0oU;
import X.0se;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SubmittedSubPostManageType implements Parcelable {
    UNRECOGNIZED("SubmittedSubPostManageType_unspecified"),
    ACCEPT("accept"),
    DELETE("delete"),
    DELETE_ALL_FROM_VIEWER("delete_all_from_viewer"),
    BULK_DELETE_FROM_AUTHOR("bulk_delete_from_author"),
    BULK_ACCEPT("bulk_accept");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        SubmittedSubPostManageType[] submittedSubPostManageTypeArr;
        A02 = 0oU.A00(submittedSubPostManageTypeArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L);
        for (SubmittedSubPostManageType submittedSubPostManageType : values()) {
            A0x.put(submittedSubPostManageType.A00, submittedSubPostManageType);
        }
        A01 = A0x;
        CREATOR = new FK6(16);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SubmittedSubPostManageType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
