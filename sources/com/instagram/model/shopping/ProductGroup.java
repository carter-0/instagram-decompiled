package com.instagram.model.shopping;

import X.2PP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C14502TxO;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ProductGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(84);
    public HashMap A00;
    public List A01;
    public List A02;

    public class VariantKey implements Parcelable {
        public static final Parcelable.Creator CREATOR = C71269Ogb.A00(85);
        public String A00;
        public String A01;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                VariantKey variantKey = (VariantKey) obj;
                if (!2PP.A00(this.A00, variantKey.A00) || !2PP.A00(this.A01, variantKey.A01)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.A00, this.A01});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00);
            parcel.writeString(this.A01);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final List A00() {
        return Collections.unmodifiableList(C14502TxO.A02(this.A01));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, com.instagram.model.shopping.ProductGroup$VariantKey] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.instagram.model.shopping.ProductGroup$VariantKey] */
    public final List A01(ProductVariantDimension productVariantDimension, String str) {
        String str2 = productVariantDimension.A02;
        ? obj = new Object();
        obj.A00 = str2;
        obj.A01 = str;
        if (this.A00 == null) {
            this.A00 = new HashMap();
            for (Product product : C14502TxO.A02(this.A01)) {
                List<ProductVariantPossibleValueDictIntf> list = product.A0O;
                if (list != null) {
                    for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                        String id = productVariantPossibleValueDictIntf.getId();
                        String value = productVariantPossibleValueDictIntf.getValue();
                        ? obj2 = new Object();
                        obj2.A00 = id;
                        obj2.A01 = value;
                        List list2 = (List) this.A00.get(obj2);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            this.A00.put(obj2, list2);
                        }
                        list2.add(product);
                    }
                }
            }
        }
        List list3 = (List) this.A00.get(obj);
        if (list3 == null) {
            return Collections.emptyList();
        }
        return list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeList(this.A02);
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(this.A00);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            parcel.writeParcelable((Parcelable) A1J.getKey(), i);
            parcel.writeList((List) A1J.getValue());
        }
    }
}
