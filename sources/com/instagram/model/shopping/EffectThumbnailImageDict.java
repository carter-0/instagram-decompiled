package com.instagram.model.shopping;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;

public final class EffectThumbnailImageDict extends AnonymousClass0T0 implements Parcelable, EffectThumbnailImageDictIntf {
    public static final Parcelable.Creator CREATOR = new C376399Hv(46);
    public final ImageUrl A00;

    public final EffectThumbnailImageDict FFI() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EffectThumbnailImageDict) && 0qQ.A0K(this.A00, ((EffectThumbnailImageDict) obj).A00));
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            return 0;
        }
        return imageUrl.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final ImageUrl CCI() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        String str;
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (CCI() != null) {
            ImageUrl CCI = CCI();
            if (CCI != null) {
                str = CCI.getUrl();
            } else {
                str = null;
            }
            linkedHashMap.put("uri", str);
        }
        return new TreeUpdaterJNI("XDTEffectThumbnailImageDict", 0Yt.A0B(linkedHashMap));
    }

    public EffectThumbnailImageDict(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
