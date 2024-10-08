package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CXM;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoEntity extends 17P implements Entity {
    public static final C3035269k CREATOR = CTC.A00(62);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoEntity, com.facebook.pando.TreeJNI, com.instagram.api.schemas.Entity] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CXM.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String CAs() {
        return A0h(-675554107);
    }

    public final EntityImpl F2k() {
        return new EntityImpl(A0e(), A0h(-675554107), A0V());
    }

    public final String getId() {
        return A0e();
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoEntity, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
