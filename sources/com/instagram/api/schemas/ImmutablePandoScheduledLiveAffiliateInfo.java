package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoScheduledLiveAffiliateInfo extends 17P implements ScheduledLiveAffiliateInfo {
    public static final C3035269k CREATOR = CTB.A00(72);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ScheduledLiveAffiliateInfoImpl F8p() {
        return new ScheduledLiveAffiliateInfoImpl(A0i(267098696));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoScheduledLiveAffiliateInfo, X.17P] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (A0i(267098696) != null) {
            A0t.put("disclosure_tag", A0i(267098696));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoScheduledLiveAffiliateInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
