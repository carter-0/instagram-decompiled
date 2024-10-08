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

public final class ImmutablePandoDirectAudioFallbackUrl extends 17P implements DirectAudioFallbackUrl {
    public static final C3035269k CREATOR = CTC.A00(57);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Adp() {
        return A0h(188526075);
    }

    public final DirectAudioFallbackUrlImpl F2e() {
        return new DirectAudioFallbackUrlImpl(A0h(188526075));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoDirectAudioFallbackUrl, X.17P] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        A0h(188526075);
        A0t.put("audio_src", A0h(188526075));
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoDirectAudioFallbackUrl] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
