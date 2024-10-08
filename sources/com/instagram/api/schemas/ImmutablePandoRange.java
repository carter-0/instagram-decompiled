package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44299Cch;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoRange extends 17P implements RangeIntf {
    public static final C3035269k CREATOR = CTB.A00(67);

    public final Entity B1q() {
        return (Entity) A05(-1298275357, ImmutablePandoEntity.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.RangeIntf, com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRange] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44299Cch.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRange] */
    public final Integer BMP() {
        return getOptionalIntValueByHashCode(-1106363674);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRange] */
    public final Integer BXp() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRange] */
    public final Range F8U() {
        EntityImpl entityImpl;
        Entity B1q = B1q();
        if (B1q != null) {
            entityImpl = B1q.F2k();
        } else {
            entityImpl = null;
        }
        return new Range(entityImpl, getOptionalIntValueByHashCode(-1106363674), getOptionalIntValueByHashCode(-1019779949));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRange] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
