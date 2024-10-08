package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C48361EdI;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class UserBannerInlineOtherProfileDictImpl extends AnonymousClass0T0 implements Parcelable, UserBannerInlineOtherProfileDict {
    public static final Parcelable.Creator CREATOR = FK6.A00(56);
    public final IgUserRelatedAccountTypeEnum A00;
    public final String A01;
    public final String A02;

    public final UserBannerInlineOtherProfileDictImpl FD5() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserBannerInlineOtherProfileDictImpl) {
                UserBannerInlineOtherProfileDictImpl userBannerInlineOtherProfileDictImpl = (UserBannerInlineOtherProfileDictImpl) obj;
                if (!0qQ.A0K(this.A01, userBannerInlineOtherProfileDictImpl.A01) || !0qQ.A0K(this.A02, userBannerInlineOtherProfileDictImpl.A02) || this.A00 != userBannerInlineOtherProfileDictImpl.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public final String AXs() {
        return this.A01;
    }

    public final String AXw() {
        return this.A02;
    }

    public final IgUserRelatedAccountTypeEnum AXx() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserBannerInlineOtherProfileDict", C48361EdI.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public UserBannerInlineOtherProfileDictImpl(IgUserRelatedAccountTypeEnum igUserRelatedAccountTypeEnum, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = igUserRelatedAccountTypeEnum;
    }
}
