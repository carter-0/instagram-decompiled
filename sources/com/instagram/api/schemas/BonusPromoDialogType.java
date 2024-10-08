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

public enum BonusPromoDialogType implements Parcelable {
    UNRECOGNIZED("BonusPromoDialogType_unspecified"),
    SELF_PROFILE_REELS("self_profile_reels"),
    AFTER_REELS_CREATION("after_reels_creation");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BonusPromoDialogType[] bonusPromoDialogTypeArr;
        A02 = 0oU.A00(bonusPromoDialogTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BonusPromoDialogType bonusPromoDialogType : values()) {
            A0x.put(bonusPromoDialogType.A00, bonusPromoDialogType);
        }
        A01 = A0x;
        CREATOR = new SWT(63);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BonusPromoDialogType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
