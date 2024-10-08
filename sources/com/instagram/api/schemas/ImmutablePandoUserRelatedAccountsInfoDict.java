package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C48363EdK;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoUserRelatedAccountsInfoDict extends 17P implements UserRelatedAccountsInfoDict {
    public static final C3035269k CREATOR = new CTA(15);

    public final UserBannerInlineOtherProfileDict AfD() {
        return (UserBannerInlineOtherProfileDict) A05(1859265415, ImmutablePandoUserBannerInlineOtherProfileDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.UserRelatedAccountsInfoDict, com.instagram.api.schemas.ImmutablePandoUserRelatedAccountsInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48363EdK.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AfF() {
        return A0i(-684896309);
    }

    public final UserRelatedAccountsInfoDictImpl FDA() {
        UserBannerInlineOtherProfileDictImpl userBannerInlineOtherProfileDictImpl;
        UserBannerInlineOtherProfileDict AfD = AfD();
        if (AfD != null) {
            userBannerInlineOtherProfileDictImpl = AfD.FD5();
        } else {
            userBannerInlineOtherProfileDictImpl = null;
        }
        return new UserRelatedAccountsInfoDictImpl(userBannerInlineOtherProfileDictImpl, A0i(-684896309));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoUserRelatedAccountsInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
