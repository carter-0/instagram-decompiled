package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum UserRoleOnFundraiser implements Parcelable {
    UNRECOGNIZED("UserRoleOnFundraiser_unspecified"),
    COHOST("COHOST"),
    A05(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    OWNER("OWNER");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        UserRoleOnFundraiser[] userRoleOnFundraiserArr;
        A02 = 0oU.A00(userRoleOnFundraiserArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (UserRoleOnFundraiser userRoleOnFundraiser : values()) {
            A0x.put(userRoleOnFundraiser.A00, userRoleOnFundraiser);
        }
        A01 = A0x;
        CREATOR = FK6.A00(59);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    UserRoleOnFundraiser(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
