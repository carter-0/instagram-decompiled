package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;

public final class ImmutablePandoProfilePicture extends 17P implements ProfilePicture {
    public static final C3035269k CREATOR = CTB.A00(64);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ImageUrl CCI() {
        return A0A(116076);
    }

    public final ProfilePictureImpl F8C() {
        return new ProfilePictureImpl(A0A(116076));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfilePicture, com.instagram.api.schemas.ProfilePicture] */
    public final TreeUpdaterJNI FHC() {
        String str;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (CCI() != null) {
            ImageUrl CCI = CCI();
            if (CCI != null) {
                str = CCI.getUrl();
            } else {
                str = null;
            }
            A0t.put("uri", str);
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfilePicture] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
