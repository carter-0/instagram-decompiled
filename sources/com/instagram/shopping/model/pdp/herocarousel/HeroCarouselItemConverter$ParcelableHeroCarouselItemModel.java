package com.instagram.shopping.model.pdp.herocarousel;

import X.0qQ;
import X.1Xj;
import X.AnonymousClass05K;
import X.C16271UrY;
import X.C16272UrZ;
import X.C16273Ura;
import X.C16274Urb;
import X.C16276Urd;
import X.C18269Voj;
import X.C41847B3o;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductArEffectMetadata;

public class HeroCarouselItemConverter$ParcelableHeroCarouselItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(52);
    public final ImageInfo A00;
    public final ProductArEffectMetadata A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(C18269Voj.A00(this.A02));
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A00.FEa(), i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(Parcel parcel) {
        Integer num;
        this.A05 = parcel.readString();
        String readString = parcel.readString();
        Integer[] A002 = AnonymousClass05K.A00(7);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = null;
                break;
            }
            num = A002[i];
            if (0qQ.A0K(C18269Voj.A00(num), readString)) {
                break;
            }
            i++;
        }
        this.A02 = num;
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A00 = (ImageInfo) C41847B3o.A03(parcel, ImageInfo.class);
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = (ProductArEffectMetadata) C41847B3o.A03(parcel, ProductArEffectMetadata.class);
        this.A07 = parcel.readString();
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C16276Urd urd) {
        this.A05 = urd.A02;
        this.A02 = urd.A02;
        this.A09 = null;
        this.A08 = null;
        this.A00 = urd.A00;
        this.A06 = urd.A03;
        this.A04 = urd.A06;
        this.A03 = urd.A05;
        this.A01 = urd.A01;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C16273Ura ura) {
        this.A05 = ura.A01;
        this.A02 = ura.A02;
        this.A09 = null;
        this.A08 = null;
        this.A00 = ura.A00;
        this.A06 = ura.A02;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C16274Urb urb) {
        this.A05 = urb.A02;
        this.A02 = urb.A02;
        1Xj r1 = urb.A00;
        this.A09 = r1.getId();
        this.A08 = r1.getId();
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = urb.A01.getId();
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C16272UrZ urZ) {
        this.A05 = urZ.A02;
        this.A02 = urZ.A02;
        this.A09 = urZ.A01.getId();
        this.A08 = urZ.A00.getId();
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C16271UrY urY) {
        this.A05 = urY.A01;
        this.A02 = urY.A02;
        this.A09 = urY.A00.getId();
        this.A08 = null;
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }
}
