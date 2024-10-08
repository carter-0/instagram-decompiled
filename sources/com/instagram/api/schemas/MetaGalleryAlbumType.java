package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MetaGalleryAlbumType implements Parcelable {
    UNRECOGNIZED("MetaGalleryAlbumType_unspecified"),
    AR_WRIST("AR_WRIST"),
    HORIZON("HORIZON"),
    MWA_TOP_CAPTURES("MWA_TOP_CAPTURES"),
    OCULUS("OCULUS");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MetaGalleryAlbumType[] metaGalleryAlbumTypeArr;
        A02 = 0oU.A00(metaGalleryAlbumTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MetaGalleryAlbumType metaGalleryAlbumType : values()) {
            A0x.put(metaGalleryAlbumType.A00, metaGalleryAlbumType);
        }
        A01 = A0x;
        CREATOR = new FK5(73);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MetaGalleryAlbumType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
