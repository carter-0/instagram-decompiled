package com.instagram.shopping.model.taggingfeed;

import X.0Yt;
import X.0qQ;
import X.0sm;
import X.0sn;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.DbS;
import X.JTS;
import X.JTT;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class TaggingFeedMultiSelectState extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(62);
    public ProductCollectionFeedTaggingMeta A00;
    public List A01;
    public Map A02;
    public Map A03;
    public Map A04;

    public TaggingFeedMultiSelectState(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, ProductCollection productCollection, List list, 0sm r14) {
        this((ProductCollectionFeedTaggingMeta) null, 0sn.A00, 0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E());
        LinkedHashMap linkedHashMap;
        if (productCollection != null) {
            String Aoi = productCollection.Aoi();
            this.A02 = AnonymousClass7TF.A0w(Aoi == null ? "" : Aoi, productCollection);
            return;
        }
        if (list != null) {
            linkedHashMap = DbS.A0x(JTT.A08(list));
            for (Object next : list) {
                linkedHashMap.put(((Product) next).A0H, next);
            }
        } else {
            linkedHashMap = 0Yt.A0E();
        }
        this.A04 = linkedHashMap;
        this.A03 = r14 == null ? 0Yt.A0E() : r14;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaggingFeedMultiSelectState) {
                TaggingFeedMultiSelectState taggingFeedMultiSelectState = (TaggingFeedMultiSelectState) obj;
                if (!0qQ.A0K(this.A04, taggingFeedMultiSelectState.A04) || !0qQ.A0K(this.A03, taggingFeedMultiSelectState.A03) || !0qQ.A0K(this.A02, taggingFeedMultiSelectState.A02) || !0qQ.A0K(this.A01, taggingFeedMultiSelectState.A01) || !0qQ.A0K(this.A00, taggingFeedMultiSelectState.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Map map = this.A04;
        parcel.writeInt(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            parcel.writeParcelable((Parcelable) JTS.A0f(parcel, A0u), i);
        }
        Map map2 = this.A03;
        parcel.writeInt(map2.size());
        Iterator A0u2 = AnonymousClass7TF.A0u(map2);
        while (A0u2.hasNext()) {
            ((ProductCollectionFeedTaggingMeta) JTS.A0f(parcel, A0u2)).writeToParcel(parcel, i);
        }
        Map map3 = this.A02;
        parcel.writeInt(map3.size());
        Iterator A0u3 = AnonymousClass7TF.A0u(map3);
        while (A0u3.hasNext()) {
            parcel.writeParcelable((Parcelable) JTS.A0f(parcel, A0u3), i);
        }
        parcel.writeStringList(this.A01);
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = this.A00;
        if (productCollectionFeedTaggingMeta == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        productCollectionFeedTaggingMeta.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A04)))) + AnonymousClass7TG.A0C(this.A00);
    }

    public static final TaggingFeedMultiSelectState A00(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, List list, Map map, Map map2, Map map3) {
        C51974G9v.A1O(map, map2, map3, list);
        return new TaggingFeedMultiSelectState(productCollectionFeedTaggingMeta, list, map, map2, map3);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TaggingFeedMultiSelectState(selectedProductIdToProductsMap=");
        A1A.append(this.A04);
        A1A.append(", selectedProductIdToCollectionMetaMap=");
        A1A.append(this.A03);
        A1A.append(", selectedCollectionIdToCollectionsMap=");
        A1A.append(this.A02);
        A1A.append(", productOrVariantSelectionIds=");
        A1A.append(this.A01);
        A1A.append(", selectedCollectionInformationMetadata=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public TaggingFeedMultiSelectState(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, List list, Map map, Map map2, Map map3) {
        C51974G9v.A1M(map2, map3, list);
        this.A04 = map;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = list;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public TaggingFeedMultiSelectState() {
        this((ProductCollectionFeedTaggingMeta) null, 0sn.A00, 0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E());
    }
}
