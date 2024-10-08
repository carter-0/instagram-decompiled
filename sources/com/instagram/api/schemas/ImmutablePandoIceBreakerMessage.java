package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C16821V7c;
import X.C17480VXh;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIceBreakerMessage extends 17P implements IceBreakerMessageIntf {
    public static final C3035269k CREATOR = new CTB(4);

    public final /* synthetic */ C17480VXh AKF() {
        return new C17480VXh(this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIceBreakerMessage, com.instagram.api.schemas.IceBreakerMessageIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C16821V7c.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BSH() {
        return A0i(-1690741544);
    }

    public final IceBreakerMessage F58() {
        return new IceBreakerMessage(A0i(198286169), A0i(954925063), A0i(-1690741544));
    }

    public final String getActionUrl() {
        return A0i(198286169);
    }

    public final String getMessage() {
        return A0i(954925063);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIceBreakerMessage] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
