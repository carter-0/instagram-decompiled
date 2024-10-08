package com.instagram.model.shopping.productcollection;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductCollectionTagInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(11);
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionTagInfo) {
                ProductCollectionTagInfo productCollectionTagInfo = (ProductCollectionTagInfo) obj;
                if (!0qQ.A0K(this.A01, productCollectionTagInfo.A01) || !0qQ.A0K(this.A02, productCollectionTagInfo.A02) || !0qQ.A0K(this.A03, productCollectionTagInfo.A03) || !0qQ.A0K(this.A04, productCollectionTagInfo.A04) || !0qQ.A0K(this.A00, productCollectionTagInfo.A00)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A00) ? 1 : 0);
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public ProductCollectionTagInfo(Boolean bool, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = bool;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProductCollectionTagInfo(collectionId=");
        A1A.append(this.A01);
        A1A.append(", collectionType=");
        A1A.append(this.A02);
        A1A.append(", untaggedCollectionId=");
        A1A.append(this.A03);
        A1A.append(", untaggedCollectionType=");
        A1A.append(this.A04);
        A1A.append(", isAutoTagged=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public ProductCollectionTagInfo() {
        this(AnonymousClass7TE.A0u(), (String) null, (String) null, (String) null, (String) null);
    }
}
