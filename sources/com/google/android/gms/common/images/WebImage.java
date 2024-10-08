package com.google.android.gms.common.images;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(27);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof WebImage)) {
                WebImage webImage = (WebImage) obj;
                if (!(SA1.A01(this.A03, webImage.A03) && this.A01 == webImage.A01 && this.A02 == webImage.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0B(this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A03.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = Pxi.A06(parcel, this.A00);
        C301145yd.A0A(parcel, this.A03, 2, i, false);
        C301145yd.A07(parcel, 3, this.A01);
        Pxi.A12(parcel, this.A02, A06);
    }

    public WebImage(Uri uri, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = uri;
        this.A01 = i2;
        this.A02 = i3;
    }
}
