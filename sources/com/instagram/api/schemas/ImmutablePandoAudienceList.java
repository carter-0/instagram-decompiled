package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44060CUd;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAudienceList extends 17P implements AudienceListIntf {
    public static final C3035269k CREATOR = CTC.A00(8);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.AudienceListIntf, com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudienceList] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44060CUd.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BN7() {
        return A0k(181965916);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudienceList] */
    public final boolean CRG() {
        return getBooleanValueByHashCode(-1249853396);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudienceList] */
    public final boolean CWL() {
        return getBooleanValueByHashCode(254374641);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudienceList] */
    public final boolean CWM() {
        return getBooleanValueByHashCode(-1287076211);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudienceList, X.17P] */
    public final AudienceList F0b() {
        return new AudienceList(A0k(181965916), A0Q(), getBooleanValueByHashCode(-1249853396), getBooleanValueByHashCode(254374641), getBooleanValueByHashCode(-1287076211));
    }

    public final String getName() {
        return A0Q();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudienceList] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
