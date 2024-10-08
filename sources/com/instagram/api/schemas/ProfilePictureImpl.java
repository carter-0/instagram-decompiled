package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;

public final class ProfilePictureImpl extends AnonymousClass0T0 implements Parcelable, ProfilePicture {
    public static final Parcelable.Creator CREATOR = new C376419Hx(6);
    public final ImageUrl A00;

    public final ProfilePictureImpl F8C() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProfilePictureImpl) && 0qQ.A0K(this.A00, ((ProfilePictureImpl) obj).A00));
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
        return new TreeUpdaterJNI("XDTProfilePicture", 0Yt.A0B(linkedHashMap));
    }

    public ProfilePictureImpl(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
