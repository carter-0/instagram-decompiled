package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTC;
import X.V7B;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoElectionAddYoursInfoDict extends 17P implements ElectionAddYoursInfoDictIntf {
    public static final C3035269k CREATOR = new CTC(61);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ElectionAddYoursInfoDictIntf, com.instagram.api.schemas.ImmutablePandoElectionAddYoursInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V7B.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoElectionAddYoursInfoDict] */
    public final Boolean AxP() {
        return getOptionalBooleanValueByHashCode(809963074);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoElectionAddYoursInfoDict] */
    public final List C7v() {
        return getOptionalStringListByHashCode(-2098301001);
    }

    public final String C9m() {
        return A0i(-1114294257);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoElectionAddYoursInfoDict] */
    public final ElectionAddYoursInfoDict F2j() {
        return new ElectionAddYoursInfoDict(getOptionalBooleanValueByHashCode(809963074), A0i(-1114294257), getOptionalStringListByHashCode(-2098301001));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoElectionAddYoursInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
