package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.1aC;
import X.AnonymousClass7TH;
import X.B4T;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.CTA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.List;

public final class ImmutablePandoUserTagInfoDict extends 17P implements UserTagInfoDictIntf {
    public static final C3035269k CREATOR = CTA.A00(16);
    public User A00;

    public final User CCd() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoUserTagInfoDict, com.facebook.pando.TreeJNI, com.instagram.api.schemas.UserTagInfoDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4T.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoUserTagInfoDict, com.facebook.pando.TreeJNI] */
    public final List AmF() {
        return getOptionalStringListByHashCode(1296516636);
    }

    public final Float AzK() {
        return A0K(1243902634);
    }

    public final List Bdo() {
        return A0l(747804969);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoUserTagInfoDict, com.facebook.pando.TreeJNI] */
    public final Boolean Bv9() {
        return getOptionalBooleanValueByHashCode(-1400935436);
    }

    public final Float Byq() {
        return A0K(-959763040);
    }

    public final UserTagInfoDictIntf E9V(1E9 r2) {
        this.A00 = C41847B3o.A0y(r2, this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.api.schemas.ImmutablePandoUserTagInfoDict, com.facebook.pando.TreeJNI, X.17P] */
    public final UserTagInfoDict FDC(1E9 r8) {
        User user;
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(1296516636);
        Float A0K = A0K(1243902634);
        List A0l = A0l(747804969);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1400935436);
        Float A0K2 = A0K(-959763040);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = 1aC.A01(r8, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) r8.A00.E5d(r8, A01);
                return new UserTagInfoDict(user, optionalBooleanValueByHashCode, A0K, A0K2, optionalStringListByHashCode, A0l);
            }
        }
        user = null;
        return new UserTagInfoDict(user, optionalBooleanValueByHashCode, A0K, A0K2, optionalStringListByHashCode, A0l);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoUserTagInfoDict, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
