package com.instagram.model.shopping.reels;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44937CnX;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.Iterator;
import java.util.List;

public final class ProductSticker extends AnonymousClass0T0 implements ProductStickerIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(30);
    public final DropsEventPageNavigationMetadata A00;
    public final TextReviewStatus A01;
    public final DropsLaunchAnimation A02;
    public final ProductDetailsProductItemDict A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    public final ProductSticker FFm(1E9 r1) {
        return this;
    }

    public final ProductSticker FFn(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductSticker) {
                ProductSticker productSticker = (ProductSticker) obj;
                if (!0qQ.A0K(this.A07, productSticker.A07) || !0qQ.A0K(this.A02, productSticker.A02) || !0qQ.A0K(this.A00, productSticker.A00) || !0qQ.A0K(this.A08, productSticker.A08) || !0qQ.A0K(this.A04, productSticker.A04) || !0qQ.A0K(this.A05, productSticker.A05) || !0qQ.A0K(this.A09, productSticker.A09) || !0qQ.A0K(this.A03, productSticker.A03) || !0qQ.A0K(this.A0E, productSticker.A0E) || !0qQ.A0K(this.A0A, productSticker.A0A) || !0qQ.A0K(this.A0B, productSticker.A0B) || this.A01 != productSticker.A01 || !0qQ.A0K(this.A0C, productSticker.A0C) || !0qQ.A0K(this.A0D, productSticker.A0D) || !0qQ.A0K(this.A06, productSticker.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
        C41848B3p.A1I(parcel, this.A04);
        C41848B3p.A1I(parcel, this.A05);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A03, i);
        List list = this.A0E;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        C41848B3p.A1I(parcel, this.A06);
    }

    public final String AsH() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ DropsLaunchAnimationIntf AzD() {
        return this.A02;
    }

    public final DropsEventPageNavigationMetadata B2L() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BgJ() {
        return this.A03;
    }

    public final List Bzq() {
        return this.A0E;
    }

    public final String C5C() {
        return this.A0B;
    }

    public final TextReviewStatus C5a() {
        return this.A01;
    }

    public final String CDo() {
        return this.A0D;
    }

    public final Boolean CG8() {
        return this.A06;
    }

    public final Boolean CYe() {
        return this.A04;
    }

    public final Boolean Cbh() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryProductItemTappableData", C44937CnX.A00(this));
    }

    public final String getId() {
        return this.A08;
    }

    public final String getMediaId() {
        return this.A09;
    }

    public final String getText() {
        return this.A0A;
    }

    public final String getUserId() {
        return this.A0C;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((AnonymousClass7TG.A0E(this.A07) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public ProductSticker(DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata, TextReviewStatus textReviewStatus, DropsLaunchAnimation dropsLaunchAnimation, ProductDetailsProductItemDict productDetailsProductItemDict, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A07 = str;
        this.A02 = dropsLaunchAnimation;
        this.A00 = dropsEventPageNavigationMetadata;
        this.A08 = str2;
        this.A04 = bool;
        this.A05 = bool2;
        this.A09 = str3;
        this.A03 = productDetailsProductItemDict;
        this.A0E = list;
        this.A0A = str4;
        this.A0B = str5;
        this.A01 = textReviewStatus;
        this.A0C = str6;
        this.A0D = str7;
        this.A06 = bool3;
    }

    public final ProductStickerIntf EAB(1E9 r1) {
        return this;
    }
}
