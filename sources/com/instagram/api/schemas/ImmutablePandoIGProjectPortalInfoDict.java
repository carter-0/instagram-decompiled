package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import X.CZF;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGProjectPortalInfoDict extends 17P implements IGProjectPortalInfoDict {
    public static final C3035269k CREATOR = CTB.A00(0);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.IGProjectPortalInfoDict, com.instagram.api.schemas.ImmutablePandoIGProjectPortalInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CZF.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AhG() {
        return A0i(-634959880);
    }

    public final String AlO() {
        return A0i(-350008305);
    }

    public final String AlP() {
        return A0i(1617667727);
    }

    public final String AlT() {
        return A0i(-1102650083);
    }

    public final String C4Z() {
        return A0i(1304010549);
    }

    public final String C8N() {
        return A0i(-992015602);
    }

    public final IGProjectPortalInfoDictImpl F4w() {
        return new IGProjectPortalInfoDictImpl(A0i(-634959880), A0i(-350008305), A0i(1617667727), A0i(-1102650083), A0i(1304010549), A0i(-992015602));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGProjectPortalInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
