package com.instagram.model.shopping.incentives.igfunded;

import X.0Yt;
import X.17P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;

public final class ImmutablePandoIgFundedIncentiveDetail extends 17P implements IgFundedIncentiveDetail {
    public static final C3035269k CREATOR = CTA.A00(48);

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentiveDetail] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, getDescription());
        }
        if (getName() != null) {
            C41845B3m.A0z(getName(), A1H);
        }
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IgFundedIncentiveDetailImpl FFX() {
        return new IgFundedIncentiveDetailImpl(A0h(-1724546052), A0Q());
    }

    public final String getDescription() {
        return A0h(-1724546052);
    }

    public final String getName() {
        return A0Q();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentiveDetail] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
