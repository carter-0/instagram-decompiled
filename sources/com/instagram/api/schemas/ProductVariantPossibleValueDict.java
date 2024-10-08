package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44275CcJ;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;

public final class ProductVariantPossibleValueDict extends AnonymousClass0T0 implements ProductVariantPossibleValueDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = DE6.A00(48);
    public final ProductVariantVisualStyle A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final ProductVariantPossibleValueDict F86() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductVariantPossibleValueDict) {
                ProductVariantPossibleValueDict productVariantPossibleValueDict = (ProductVariantPossibleValueDict) obj;
                if (!0qQ.A0K(this.A01, productVariantPossibleValueDict.A01) || this.A05 != productVariantPossibleValueDict.A05 || !0qQ.A0K(this.A02, productVariantPossibleValueDict.A02) || !0qQ.A0K(this.A03, productVariantPossibleValueDict.A03) || !0qQ.A0K(this.A04, productVariantPossibleValueDict.A04) || this.A00 != productVariantPossibleValueDict.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }

    public final ProductVariantVisualStyle CFr() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductVariantPossibleValueDict", C44275CcJ.A00(this));
    }

    public final String getId() {
        return this.A01;
    }

    public final String getName() {
        return this.A02;
    }

    public final String getNormalizedValue() {
        return this.A03;
    }

    public final String getValue() {
        return this.A04;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TE.A0O(this.A01));
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A04, (AnonymousClass7TF.A08(this.A02, A09) + AnonymousClass7TG.A0E(this.A03)) * 31));
    }

    public final boolean isPreselected() {
        return this.A05;
    }

    public ProductVariantPossibleValueDict(ProductVariantVisualStyle productVariantVisualStyle, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A1P(str, str2);
        0qQ.A0B(str4, 5);
        0qQ.A0B(productVariantVisualStyle, 6);
        this.A01 = str;
        this.A05 = z;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = productVariantVisualStyle;
    }
}
