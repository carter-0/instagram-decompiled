package com.instagram.model.shopping.productcollection;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C44925CnI;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ProductCollectionDropsMetadataImpl extends AnonymousClass0T0 implements Parcelable, ProductCollectionDropsMetadata {
    public static final Parcelable.Creator CREATOR = new LVO(10);
    public final long A00;
    public final Integer A01;
    public final boolean A02;

    public final ProductCollectionDropsMetadataImpl FFb() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionDropsMetadataImpl) {
                ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl = (ProductCollectionDropsMetadataImpl) obj;
                if (!(this.A02 == productCollectionDropsMetadataImpl.A02 && this.A00 == productCollectionDropsMetadataImpl.A00 && 0qQ.A0K(this.A01, productCollectionDropsMetadataImpl.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeInt(C41847B3o.A00(parcel, this.A01));
    }

    public final boolean Aoq() {
        return this.A02;
    }

    public final long BLf() {
        return this.A00;
    }

    public final Integer BXB() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTDropsCollectionMetadata", C44925CnI.A00(this));
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AnonymousClass7TF.A01(this.A00, i * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public ProductCollectionDropsMetadataImpl(Integer num, long j, boolean z) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = num;
    }
}
