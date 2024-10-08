package com.instagram.schools.management.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16638Uya;
import X.DbS;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class BadgeVisibilitySettingItem extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(22);
    public final C16638Uya A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BadgeVisibilitySettingItem) {
                BadgeVisibilitySettingItem badgeVisibilitySettingItem = (BadgeVisibilitySettingItem) obj;
                if (!(this.A00 == badgeVisibilitySettingItem.A00 && 0qQ.A0K(this.A01, badgeVisibilitySettingItem.A01) && this.A02 == badgeVisibilitySettingItem.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public BadgeVisibilitySettingItem(C16638Uya uya, String str, boolean z) {
        AnonymousClass7TG.A1O(uya, str);
        this.A00 = uya;
        this.A01 = str;
        this.A02 = z;
    }
}
