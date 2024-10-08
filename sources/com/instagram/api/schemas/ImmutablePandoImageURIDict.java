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

public final class ImmutablePandoImageURIDict extends 17P implements ImageURIDict {
    public static final C3035269k CREATOR = CTB.A00(5);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ImageURIDictImpl F5B() {
        return new ImageURIDictImpl(A0h(116076));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoImageURIDict] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        A0h(116076);
        A0t.put("uri", A0h(116076));
        return C41846B3n.A0P(this, A0t);
    }

    public final String getUri() {
        return A0h(116076);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoImageURIDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
