package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C48361EdI;
import X.CTA;
import X.G38;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoUserBannerInlineOtherProfileDict extends 17P implements UserBannerInlineOtherProfileDict {
    public static final C3035269k CREATOR = new CTA(14);

    public final IgUserRelatedAccountTypeEnum AXx() {
        return (IgUserRelatedAccountTypeEnum) A0N(1091441164, G38.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoUserBannerInlineOtherProfileDict, com.instagram.api.schemas.UserBannerInlineOtherProfileDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48361EdI.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AXs() {
        return A0j(-803333011);
    }

    public final String AXw() {
        return A0i(-525534778);
    }

    public final UserBannerInlineOtherProfileDictImpl FD5() {
        return new UserBannerInlineOtherProfileDictImpl(AXx(), A0j(-803333011), A0i(-525534778));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoUserBannerInlineOtherProfileDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
