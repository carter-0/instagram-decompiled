package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ProductTileMetadataDecorationsImpl extends AnonymousClass0T0 implements Parcelable, ProductTileMetadataDecorations {
    public static final Parcelable.Creator CREATOR = DE6.A00(39);
    public final ProductTileContext A00;
    public final Boolean A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public ProductTileMetadataDecorationsImpl(ProductTileContext productTileContext, Boolean bool, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        0qQ.A0B(list, 1);
        this.A02 = list;
        this.A00 = productTileContext;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = bool;
        this.A05 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A08 = z6;
        this.A09 = z7;
    }

    public final ProductTileMetadataDecorationsImpl F83(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileMetadataDecorationsImpl) {
                ProductTileMetadataDecorationsImpl productTileMetadataDecorationsImpl = (ProductTileMetadataDecorationsImpl) obj;
                if (!(0qQ.A0K(this.A02, productTileMetadataDecorationsImpl.A02) && 0qQ.A0K(this.A00, productTileMetadataDecorationsImpl.A00) && this.A03 == productTileMetadataDecorationsImpl.A03 && this.A04 == productTileMetadataDecorationsImpl.A04 && 0qQ.A0K(this.A01, productTileMetadataDecorationsImpl.A01) && this.A05 == productTileMetadataDecorationsImpl.A05 && this.A06 == productTileMetadataDecorationsImpl.A06 && this.A07 == productTileMetadataDecorationsImpl.A07 && this.A08 == productTileMetadataDecorationsImpl.A08 && this.A09 == productTileMetadataDecorationsImpl.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A01) ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
    }

    public final List AfJ() {
        return this.A02;
    }

    public final boolean BC0() {
        return this.A03;
    }

    public final boolean BvH() {
        return this.A05;
    }

    public final boolean Bvo() {
        return this.A07;
    }

    public final boolean Bvp() {
        return this.A08;
    }

    public final boolean Bvt() {
        return this.A09;
    }

    public final ProductTileContext CHg() {
        return this.A00;
    }

    public final Boolean CdM() {
        return this.A01;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A03, (AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A00)) * 31);
        int A093 = AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, (AnonymousClass7TF.A09(this.A04, A092) + AnonymousClass7TE.A0L(this.A01)) * 31))));
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        return A093 + i;
    }
}
