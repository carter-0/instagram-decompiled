package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BonusPromoDialogAudienceType implements Parcelable {
    UNRECOGNIZED("BonusPromoDialogAudienceType_unspecified"),
    FIRST_TIME_ONBOARDER("first_time_onboarder"),
    RENEWAL("renewal");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BonusPromoDialogAudienceType[] bonusPromoDialogAudienceTypeArr;
        A02 = 0oU.A00(bonusPromoDialogAudienceTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BonusPromoDialogAudienceType bonusPromoDialogAudienceType : values()) {
            A0x.put(bonusPromoDialogAudienceType.A00, bonusPromoDialogAudienceType);
        }
        A01 = A0x;
        CREATOR = new SWT(62);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BonusPromoDialogAudienceType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
