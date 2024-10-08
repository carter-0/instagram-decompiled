package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C48363EdK;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class UserRelatedAccountsInfoDictImpl extends AnonymousClass0T0 implements Parcelable, UserRelatedAccountsInfoDict {
    public static final Parcelable.Creator CREATOR = FK6.A00(58);
    public final UserBannerInlineOtherProfileDict A00;
    public final String A01;

    public final UserRelatedAccountsInfoDictImpl FDA() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserRelatedAccountsInfoDictImpl) {
                UserRelatedAccountsInfoDictImpl userRelatedAccountsInfoDictImpl = (UserRelatedAccountsInfoDictImpl) obj;
                if (!0qQ.A0K(this.A00, userRelatedAccountsInfoDictImpl.A00) || !0qQ.A0K(this.A01, userRelatedAccountsInfoDictImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final UserBannerInlineOtherProfileDict AfD() {
        return this.A00;
    }

    public final String AfF() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserRelatedAccountsInfoDict", C48363EdK.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public UserRelatedAccountsInfoDictImpl(UserBannerInlineOtherProfileDict userBannerInlineOtherProfileDict, String str) {
        this.A00 = userBannerInlineOtherProfileDict;
        this.A01 = str;
    }
}
