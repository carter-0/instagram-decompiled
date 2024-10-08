package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel;

import X.0oU;
import X.0qQ;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.android.R;

public enum GalleryGridFormat implements Parcelable {
    COLLAGE(0, R.id.gallery_grid_format_collage, 2131962916, R.drawable.instagram_collections_pano_outline_24),
    LAYOUT(1, R.id.gallery_grid_format_layout, 2131962921, R.drawable.instagram_layout_pano_outline_24),
    SEPARATE(2, R.id.gallery_grid_format_separate, 2131962926, R.drawable.instagram_story_pano_outline_24);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(name());
    }

    /* access modifiers changed from: public */
    static {
        GalleryGridFormat[] galleryGridFormatArr;
        A04 = 0oU.A00(galleryGridFormatArr);
        CREATOR = new C376419Hx(84);
    }

    /* access modifiers changed from: public */
    GalleryGridFormat(int i, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A03 = r2;
    }
}
