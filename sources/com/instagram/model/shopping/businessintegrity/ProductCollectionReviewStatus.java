package com.instagram.model.shopping.businessintegrity;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductCollectionReviewStatus implements Parcelable {
    UNRECOGNIZED("ProductCollectionReviewStatus_unspecified"),
    APPROVED("approved"),
    NO_REVIEW(""),
    OUTDATED("outdated"),
    PENDING("pending");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductCollectionReviewStatus[] productCollectionReviewStatusArr;
        A02 = 0oU.A00(productCollectionReviewStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ProductCollectionReviewStatus productCollectionReviewStatus : values()) {
            A0x.put(productCollectionReviewStatus.A00, productCollectionReviewStatus);
        }
        A01 = A0x;
        CREATOR = new C71269Ogb(93);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductCollectionReviewStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
