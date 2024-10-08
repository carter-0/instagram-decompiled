package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoDropsEventPageNavigationMetadata extends 17P implements DropsEventPageNavigationMetadata {
    public static final C3035269k CREATOR = CTC.A00(59);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final DropsEventPageNavigationMetadataImpl F2h() {
        return new DropsEventPageNavigationMetadataImpl(A0j(1273555107));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata, X.17P] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (A0j(1273555107) != null) {
            A0t.put("upcoming_event_id", A0j(1273555107));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
