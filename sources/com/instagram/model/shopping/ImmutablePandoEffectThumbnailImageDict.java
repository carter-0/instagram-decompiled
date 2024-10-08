package com.instagram.model.shopping;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;

public final class ImmutablePandoEffectThumbnailImageDict extends 17P implements EffectThumbnailImageDictIntf {
    public static final C3035269k CREATOR = CTA.A00(38);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ImageUrl CCI() {
        return A0A(116076);
    }

    public final EffectThumbnailImageDict FFI() {
        return new EffectThumbnailImageDict(A0A(116076));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoEffectThumbnailImageDict, com.instagram.model.shopping.EffectThumbnailImageDictIntf] */
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

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoEffectThumbnailImageDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
