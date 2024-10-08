package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41847B3o;
import X.CTB;
import android.os.Parcel;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoProductTileContextMetadata extends 17P implements ProductTileContextMetadata {
    public static final C3035269k CREATOR = CTB.A00(51);

    public final ProductTileContextMetadataImpl F7z(1E9 r5) {
        List A0o = A0o(111578632, ImmutablePandoUserDict.class);
        ArrayList A0p = AnonymousClass7TF.A0p(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r5, A0p, it);
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
        Iterator it2 = A0p.iterator();
        while (it2.hasNext()) {
            C41847B3o.A1Q(r5, A0p2, it2);
        }
        return new ProductTileContextMetadataImpl(A0p2);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileContextMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
